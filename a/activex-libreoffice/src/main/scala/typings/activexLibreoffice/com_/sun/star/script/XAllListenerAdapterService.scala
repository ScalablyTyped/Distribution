package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows the generation of adapters from specific interfaces to the {@link XAllListener} interface. */
@js.native
trait XAllListenerAdapterService extends XInterface {
  
  /**
    * creates a wrapper from the listener of type **xListenerType** to the {@link XAllListener} listener.
    *
    * To get the correct listener interface the returned {@link com.sun.star.uno.XInterface} has to be queried for it.
    */
  def createAllListerAdapter(xListenerType: `type`, xListener: XAllListener, aHelper: js.Any): XInterface = js.native
}
object XAllListenerAdapterService {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createAllListerAdapter: (`type`, XAllListener, js.Any) => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAllListenerAdapterService = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createAllListerAdapter = js.Any.fromFunction3(createAllListerAdapter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAllListenerAdapterService]
  }
  
  @scala.inline
  implicit class XAllListenerAdapterServiceMutableBuilder[Self <: XAllListenerAdapterService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateAllListerAdapter(value: (`type`, XAllListener, js.Any) => XInterface): Self = StObject.set(x, "createAllListerAdapter", js.Any.fromFunction3(value))
  }
}
