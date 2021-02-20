package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deprecated interface. Do not use anymore.
  * @deprecated Deprecated
  */
@js.native
trait XIdlClassProvider extends XInterface {
  
  val IdlClasses: SafeArray[XIdlClass[_]] = js.native
  
  def getIdlClasses(): SafeArray[XIdlClass[_]] = js.native
}
object XIdlClassProvider {
  
  @scala.inline
  def apply(
    IdlClasses: SafeArray[XIdlClass[_]],
    acquire: () => Unit,
    getIdlClasses: () => SafeArray[XIdlClass[_]],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XIdlClassProvider = {
    val __obj = js.Dynamic.literal(IdlClasses = IdlClasses.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getIdlClasses = js.Any.fromFunction0(getIdlClasses), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XIdlClassProvider]
  }
  
  @scala.inline
  implicit class XIdlClassProviderMutableBuilder[Self <: XIdlClassProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetIdlClasses(value: () => SafeArray[XIdlClass[_]]): Self = StObject.set(x, "getIdlClasses", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIdlClasses(value: SafeArray[XIdlClass[_]]): Self = StObject.set(x, "IdlClasses", value.asInstanceOf[js.Any])
  }
}
