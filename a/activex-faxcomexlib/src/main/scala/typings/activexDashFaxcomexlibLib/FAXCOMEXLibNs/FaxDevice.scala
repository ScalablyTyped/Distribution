package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxDevice Class */
@JSGlobal("FAXCOMEXLib.FaxDevice")
@js.native
class FaxDevice protected () extends js.Object {
  /** Device's Called Station ID */
  var CSID: java.lang.String = js.native
  /** Description of the device */
  var Description: java.lang.String = js.native
  /** Device name */
  val DeviceName: java.lang.String = js.native
  var `FAXCOMEXLib.FaxDevice_typekey`: FaxDevice = js.native
  /** Unique device ID */
  val Id: scala.Double = js.native
  /** Is the device is turned off */
  val PoweredOff: scala.Boolean = js.native
  /** Device provider */
  val ProviderUniqueName: java.lang.String = js.native
  /** The receive mode of the device */
  var ReceiveMode: FAX_DEVICE_RECEIVE_MODE_ENUM = js.native
  /** Is the device receiving now */
  val ReceivingNow: scala.Boolean = js.native
  /** Is the device ringing now */
  val RingingNow: scala.Boolean = js.native
  /** Number of rings before the device answers */
  var RingsBeforeAnswer: scala.Double = js.native
  /** Is the device is enabled to send */
  var SendEnabled: scala.Boolean = js.native
  /** Is the device sending now */
  val SendingNow: scala.Boolean = js.native
  /** Device's Transmitting Station ID */
  var TSID: java.lang.String = js.native
  /** Array of routing methods GUIDs */
  val UsedRoutingMethods: activexDashInteropLib.SafeArray[java.lang.String] = js.native
  /** Answer the call */
  def AnswerCall(): scala.Unit = js.native
  /** Get the device level extention property */
  def GetExtensionProperty(bstrGUID: java.lang.String): activexDashInteropLib.SafeArray[_] = js.native
  /** Refresh the object */
  def Refresh(): scala.Unit = js.native
  /** Save the object */
  def Save(): scala.Unit = js.native
  /** Set the device level extention property */
  def SetExtensionProperty(bstrGUID: java.lang.String, vProperty: activexDashInteropLib.SafeArray[_]): scala.Unit = js.native
  /** Adds or removes routing method */
  def UseRoutingMethod(bstrMethodGUID: java.lang.String, bUse: scala.Boolean): scala.Unit = js.native
}

