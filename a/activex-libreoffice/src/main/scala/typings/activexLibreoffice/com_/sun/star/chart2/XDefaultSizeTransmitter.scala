package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows to set a default size. This size will be used in case no further information si available. */
trait XDefaultSizeTransmitter
  extends StObject
     with XInterface {
  
  /**
    * set a default size
    * @param aSize100ThMm specifies a size in hundredth mm.
    */
  def setDefaultSize(aSize100ThMm: Size): Unit
}
object XDefaultSizeTransmitter {
  
  inline def apply(
    acquire: () => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    setDefaultSize: Size => Unit
  ): XDefaultSizeTransmitter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDefaultSize = js.Any.fromFunction1(setDefaultSize))
    __obj.asInstanceOf[XDefaultSizeTransmitter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDefaultSizeTransmitter] (val x: Self) extends AnyVal {
    
    inline def setSetDefaultSize(value: Size => Unit): Self = StObject.set(x, "setDefaultSize", js.Any.fromFunction1(value))
  }
}
