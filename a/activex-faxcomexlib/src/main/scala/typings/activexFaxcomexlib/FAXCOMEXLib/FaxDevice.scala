package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxDevice Class */
@js.native
trait FaxDevice extends StObject {
  
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
  implicit class FaxDeviceMutableBuilder[Self <: FaxDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnswerCall(value: () => Unit): Self = StObject.set(x, "AnswerCall", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCSID(value: String): Self = StObject.set(x, "CSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFAXCOMEXLibDotFaxDevice_typekey(value: FaxDevice): Self = StObject.set(x, "FAXCOMEXLib.FaxDevice_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetExtensionProperty(value: String => SafeArray[_]): Self = StObject.set(x, "GetExtensionProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoweredOff(value: Boolean): Self = StObject.set(x, "PoweredOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUniqueName(value: String): Self = StObject.set(x, "ProviderUniqueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiveMode(value: FAX_DEVICE_RECEIVE_MODE_ENUM): Self = StObject.set(x, "ReceiveMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivingNow(value: Boolean): Self = StObject.set(x, "ReceivingNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = StObject.set(x, "Refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRingingNow(value: Boolean): Self = StObject.set(x, "RingingNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRingsBeforeAnswer(value: Double): Self = StObject.set(x, "RingsBeforeAnswer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSendEnabled(value: Boolean): Self = StObject.set(x, "SendEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendingNow(value: Boolean): Self = StObject.set(x, "SendingNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetExtensionProperty(value: (String, SafeArray[_]) => Unit): Self = StObject.set(x, "SetExtensionProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTSID(value: String): Self = StObject.set(x, "TSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseRoutingMethod(value: (String, Boolean) => Unit): Self = StObject.set(x, "UseRoutingMethod", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUsedRoutingMethods(value: SafeArray[String]): Self = StObject.set(x, "UsedRoutingMethods", value.asInstanceOf[js.Any])
  }
}
