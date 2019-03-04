package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Query for a control property.
    * @param aControlName The name of the control. Common control names are for instance "OkButton" or "CancelButton".
    * @param aControlProperty The requested control property. Common control properties are for instance "Label" or "State".
    * @returns the requested value.
    * @throws com::sun::star::lang::IllegalArgumentException when the control is not supported or the control property is invalid.
    */
  def getControlProperty(aControlName: java.lang.String, aControlProperty: java.lang.String): js.Any
  /**
    * Change a control property.
    * @param aControlName The name of the control. Common control names are for instance "OkButton" or "CancelButton".
    * @param aControlProperty The control property to manipulate. Common control properties are for instance "Label" or "State".
    * @param aValue A value appropriated for the property.
    * @throws com::sun::star::lang::IllegalArgumentException when the control is not supported, the control property is invalid or the value fits not the contr
    */
  def setControlProperty(aControlName: java.lang.String, aControlProperty: java.lang.String, aValue: js.Any): scala.Unit
}

object XControlAccess {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getControlProperty: js.Function2[java.lang.String, java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setControlProperty: js.Function3[java.lang.String, java.lang.String, js.Any, scala.Unit]
  ): XControlAccess = {
    val __obj = js.Dynamic.literal(acquire = acquire, getControlProperty = getControlProperty, queryInterface = queryInterface, release = release, setControlProperty = setControlProperty)
  
    __obj.asInstanceOf[XControlAccess]
  }
}

