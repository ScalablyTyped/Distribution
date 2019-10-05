package typings.activexDashFaxcomexlib.FAXCOMEXLib

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxDevice Class */
@JSGlobal("FAXCOMEXLib.FaxDevice")
@js.native
class FaxDevice protected () extends js.Object {
  /** Device's Called Station ID */
  var CSID: String = js.native
  /** Description of the device */
  var Description: String = js.native
  /** Device name */
  val DeviceName: String = js.native
  var `FAXCOMEXLib.FaxDevice_typekey`: FaxDevice = js.native
  /** Unique device ID */
  val Id: Double = js.native
  /** Is the device is turned off */
  val PoweredOff: Boolean = js.native
  /** Device provider */
  val ProviderUniqueName: String = js.native
  /** The receive mode of the device */
  var ReceiveMode: FAX_DEVICE_RECEIVE_MODE_ENUM = js.native
  /** Is the device receiving now */
  val ReceivingNow: Boolean = js.native
  /** Is the device ringing now */
  val RingingNow: Boolean = js.native
  /** Number of rings before the device answers */
  var RingsBeforeAnswer: Double = js.native
  /** Is the device is enabled to send */
  var SendEnabled: Boolean = js.native
  /** Is the device sending now */
  val SendingNow: Boolean = js.native
  /** Device's Transmitting Station ID */
  var TSID: String = js.native
  /** Array of routing methods GUIDs */
  val UsedRoutingMethods: SafeArray[String] = js.native
  /** Answer the call */
  def AnswerCall(): Unit = js.native
  /** Get the device level extention property */
  def GetExtensionProperty(bstrGUID: String): SafeArray[_] = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Save the object */
  def Save(): Unit = js.native
  /** Set the device level extention property */
  def SetExtensionProperty(bstrGUID: String, vProperty: SafeArray[_]): Unit = js.native
  /** Adds or removes routing method */
  def UseRoutingMethod(bstrMethodGUID: String, bUse: Boolean): Unit = js.native
}

