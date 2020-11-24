package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxDevice Class */
@js.native
trait FaxDevice extends js.Object {
  
  /** Answer the call */
  def AnswerCall(): Unit = js.native
  
  /** Device's Called Station ID */
  var CSID: String = js.native
  
  /** Description of the device */
  var Description: String = js.native
  
  /** Device name */
  val DeviceName: String = js.native
  
  @JSName("FAXCOMEXLib.FaxDevice_typekey")
  var FAXCOMEXLibDotFaxDevice_typekey: FaxDevice = js.native
  
  /** Get the device level extention property */
  def GetExtensionProperty(bstrGUID: String): SafeArray[_] = js.native
  
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
  
  /** Refresh the object */
  def Refresh(): Unit = js.native
  
  /** Is the device ringing now */
  val RingingNow: Boolean = js.native
  
  /** Number of rings before the device answers */
  var RingsBeforeAnswer: Double = js.native
  
  /** Save the object */
  def Save(): Unit = js.native
  
  /** Is the device is enabled to send */
  var SendEnabled: Boolean = js.native
  
  /** Is the device sending now */
  val SendingNow: Boolean = js.native
  
  /** Set the device level extention property */
  def SetExtensionProperty(bstrGUID: String, vProperty: SafeArray[_]): Unit = js.native
  
  /** Device's Transmitting Station ID */
  var TSID: String = js.native
  
  /** Adds or removes routing method */
  def UseRoutingMethod(bstrMethodGUID: String, bUse: Boolean): Unit = js.native
  
  /** Array of routing methods GUIDs */
  val UsedRoutingMethods: SafeArray[String] = js.native
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
  
  @scala.inline
  implicit class FaxDeviceOps[Self <: FaxDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnswerCall(value: () => Unit): Self = this.set("AnswerCall", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCSID(value: String): Self = this.set("CSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceName(value: String): Self = this.set("DeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFAXCOMEXLibDotFaxDevice_typekey(value: FaxDevice): Self = this.set("FAXCOMEXLib.FaxDevice_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetExtensionProperty(value: String => SafeArray[_]): Self = this.set("GetExtensionProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setId(value: Double): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoweredOff(value: Boolean): Self = this.set("PoweredOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUniqueName(value: String): Self = this.set("ProviderUniqueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiveMode(value: FAX_DEVICE_RECEIVE_MODE_ENUM): Self = this.set("ReceiveMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivingNow(value: Boolean): Self = this.set("ReceivingNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("Refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRingingNow(value: Boolean): Self = this.set("RingingNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRingsBeforeAnswer(value: Double): Self = this.set("RingsBeforeAnswer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSave(value: () => Unit): Self = this.set("Save", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSendEnabled(value: Boolean): Self = this.set("SendEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendingNow(value: Boolean): Self = this.set("SendingNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetExtensionProperty(value: (String, SafeArray[_]) => Unit): Self = this.set("SetExtensionProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTSID(value: String): Self = this.set("TSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseRoutingMethod(value: (String, Boolean) => Unit): Self = this.set("UseRoutingMethod", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUsedRoutingMethods(value: SafeArray[String]): Self = this.set("UsedRoutingMethods", value.asInstanceOf[js.Any])
  }
}
