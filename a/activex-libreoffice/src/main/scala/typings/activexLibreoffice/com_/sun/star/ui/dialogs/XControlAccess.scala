package typings.activexLibreoffice.com_.sun.star.ui.dialogs

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generic control access interface.
  *
  * Use this interface to access user interface controls supported by the implementing service. The supported controls, control properties and the
  * appropriate values are documented in the description of the implementing service.
  * @see com.sun.star.ui.dialogs.FilePicker
  * @see com.sun.star.ui.dialogs.FilePicker
  * @since OOo 1.1.2
  */
trait XControlAccess
  extends StObject
     with XInterface {
  
  /**
    * Query for a control property.
    * @param aControlName The name of the control. Common control names are for instance "OkButton" or "CancelButton".
    * @param aControlProperty The requested control property. Common control properties are for instance "Label" or "State".
    * @returns the requested value.
    * @throws com::sun::star::lang::IllegalArgumentException when the control is not supported or the control property is invalid.
    */
  def getControlProperty(aControlName: String, aControlProperty: String): Any
  
  /**
    * Change a control property.
    * @param aControlName The name of the control. Common control names are for instance "OkButton" or "CancelButton".
    * @param aControlProperty The control property to manipulate. Common control properties are for instance "Label" or "State".
    * @param aValue A value appropriated for the property.
    * @throws com::sun::star::lang::IllegalArgumentException when the control is not supported, the control property is invalid or the value fits not the contr
    */
  def setControlProperty(aControlName: String, aControlProperty: String, aValue: Any): Unit
}
object XControlAccess {
  
  inline def apply(
    acquire: () => Unit,
    getControlProperty: (String, String) => Any,
    queryInterface: `type` => Any,
    release: () => Unit,
    setControlProperty: (String, String, Any) => Unit
  ): XControlAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getControlProperty = js.Any.fromFunction2(getControlProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setControlProperty = js.Any.fromFunction3(setControlProperty))
    __obj.asInstanceOf[XControlAccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XControlAccess] (val x: Self) extends AnyVal {
    
    inline def setGetControlProperty(value: (String, String) => Any): Self = StObject.set(x, "getControlProperty", js.Any.fromFunction2(value))
    
    inline def setSetControlProperty(value: (String, String, Any) => Unit): Self = StObject.set(x, "setControlProperty", js.Any.fromFunction3(value))
  }
}
