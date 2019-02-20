package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to query for controls and control properties supported by the implementing instance.
  * @since OOo 1.1.2
  */
trait XControlInformation
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Query for the supported controls of a service instance.
    * @returns a sequence with the names of the supported controls.
    */
  val SupportedControls: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Returns a sequence with properties supported by the specified control.
    * @param aControlName The name of the control. Common control names are for instance "OkButton" or "CancelButton".
    * @returns a sequence of control properties supported by the specified control.
    * @throws com::sun::star::lang::IllegalArgumentException when the specified control is not supported.
    */
  def getSupportedControlProperties(aControlName: java.lang.String): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Query for the supported controls of a service instance.
    * @returns a sequence with the names of the supported controls.
    */
  def getSupportedControls(): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Returns whether control property is supported by a control.
    * @param aControlName The name of the control.
    * @param aControlProperty The control property to query for.
    * @returns `TRUE` if the specified control action is supported. `FALSE` if the specified control action is not supported.
    * @throws com::sun::star::lang::IllegalArgumentException when the specified control is not supported.
    */
  def isControlPropertySupported(aControlName: java.lang.String, aControlProperty: java.lang.String): scala.Boolean
  /**
    * Returns whether the specified control is supported or not.
    * @param aControlName The name of the control. Common control names are for instance "OkButton" or "CancelButton".
    * @returns `TRUE` if the specified control is supported. `FALSE` if the specified control is not supported.
    */
  def isControlSupported(aControlName: java.lang.String): scala.Boolean
}

