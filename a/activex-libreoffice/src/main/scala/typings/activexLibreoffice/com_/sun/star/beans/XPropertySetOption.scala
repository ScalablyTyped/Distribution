package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XPropertySetOption
  extends StObject
     with XInterface {
  
  /** Turn on or off notifying change listeners on property value change. This option is turned on by default. */
  def enableChangeListenerNotification(bEnable: Boolean): Unit
}
object XPropertySetOption {
  
  inline def apply(
    acquire: () => Unit,
    enableChangeListenerNotification: Boolean => Unit,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XPropertySetOption = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), enableChangeListenerNotification = js.Any.fromFunction1(enableChangeListenerNotification), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPropertySetOption]
  }
  
  extension [Self <: XPropertySetOption](x: Self) {
    
    inline def setEnableChangeListenerNotification(value: Boolean => Unit): Self = StObject.set(x, "enableChangeListenerNotification", js.Any.fromFunction1(value))
  }
}
