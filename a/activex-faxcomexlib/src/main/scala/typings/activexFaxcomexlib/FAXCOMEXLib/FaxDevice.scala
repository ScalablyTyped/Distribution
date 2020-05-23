package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxDevice Class */
trait FaxDevice extends js.Object {
  /** Device's Called Station ID */
  var CSID: String
  /** Description of the device */
  var Description: String
  /** Device name */
  val DeviceName: String
  @JSName("FAXCOMEXLib.FaxDevice_typekey")
  var FAXCOMEXLibDotFaxDevice_typekey: FaxDevice
  /** Unique device ID */
  val Id: Double
  /** Is the device is turned off */
  val PoweredOff: Boolean
  /** Device provider */
  val ProviderUniqueName: String
  /** The receive mode of the device */
  var ReceiveMode: FAX_DEVICE_RECEIVE_MODE_ENUM
  /** Is the device receiving now */
  val ReceivingNow: Boolean
  /** Is the device ringing now */
  val RingingNow: Boolean
  /** Number of rings before the device answers */
  var RingsBeforeAnswer: Double
  /** Is the device is enabled to send */
  var SendEnabled: Boolean
  /** Is the device sending now */
  val SendingNow: Boolean
  /** Device's Transmitting Station ID */
  var TSID: String
  /** Array of routing methods GUIDs */
  val UsedRoutingMethods: SafeArray[String]
  /** Answer the call */
  def AnswerCall(): Unit
  /** Get the device level extention property */
  def GetExtensionProperty(bstrGUID: String): SafeArray[_]
  /** Refresh the object */
  def Refresh(): Unit
  /** Save the object */
  def Save(): Unit
  /** Set the device level extention property */
  def SetExtensionProperty(bstrGUID: String, vProperty: SafeArray[_]): Unit
  /** Adds or removes routing method */
  def UseRoutingMethod(bstrMethodGUID: String, bUse: Boolean): Unit
}

object FaxDevice {
  @scala.inline
  def apply(
    AnswerCall: () => Unit,
    CSID: String,
    Description: String,
    DeviceName: String,
    FAXCOMEXLibDotFaxDevice_typekey: FaxDevice,
    GetExtensionProperty: String => SafeArray[_],
    Id: Double,
    PoweredOff: Boolean,
    ProviderUniqueName: String,
    ReceiveMode: FAX_DEVICE_RECEIVE_MODE_ENUM,
    ReceivingNow: Boolean,
    Refresh: () => Unit,
    RingingNow: Boolean,
    RingsBeforeAnswer: Double,
    Save: () => Unit,
    SendEnabled: Boolean,
    SendingNow: Boolean,
    SetExtensionProperty: (String, SafeArray[_]) => Unit,
    TSID: String,
    UseRoutingMethod: (String, Boolean) => Unit,
    UsedRoutingMethods: SafeArray[String]
  ): FaxDevice = {
    val __obj = js.Dynamic.literal(AnswerCall = js.Any.fromFunction0(AnswerCall), CSID = CSID.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DeviceName = DeviceName.asInstanceOf[js.Any], GetExtensionProperty = js.Any.fromFunction1(GetExtensionProperty), Id = Id.asInstanceOf[js.Any], PoweredOff = PoweredOff.asInstanceOf[js.Any], ProviderUniqueName = ProviderUniqueName.asInstanceOf[js.Any], ReceiveMode = ReceiveMode.asInstanceOf[js.Any], ReceivingNow = ReceivingNow.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), RingingNow = RingingNow.asInstanceOf[js.Any], RingsBeforeAnswer = RingsBeforeAnswer.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), SendEnabled = SendEnabled.asInstanceOf[js.Any], SendingNow = SendingNow.asInstanceOf[js.Any], SetExtensionProperty = js.Any.fromFunction2(SetExtensionProperty), TSID = TSID.asInstanceOf[js.Any], UseRoutingMethod = js.Any.fromFunction2(UseRoutingMethod), UsedRoutingMethods = UsedRoutingMethods.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxDevice_typekey")(FAXCOMEXLibDotFaxDevice_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxDevice]
  }
}

