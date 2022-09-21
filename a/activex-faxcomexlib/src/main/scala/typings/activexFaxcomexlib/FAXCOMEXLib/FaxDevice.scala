package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxDevice Class */
trait FaxDevice extends StObject {
  
  /** Answer the call */
  def AnswerCall(): Unit
  
  /** Device's Called Station ID */
  var CSID: String
  
  /** Description of the device */
  var Description: String
  
  /** Device name */
  val DeviceName: String
  
  /* private */ @JSName("FAXCOMEXLib.FaxDevice_typekey")
  var FAXCOMEXLibDotFaxDevice_typekey: FaxDevice
  
  /** Get the device level extention property */
  def GetExtensionProperty(bstrGUID: String): SafeArray[Any]
  
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
  
  /** Refresh the object */
  def Refresh(): Unit
  
  /** Is the device ringing now */
  val RingingNow: Boolean
  
  /** Number of rings before the device answers */
  var RingsBeforeAnswer: Double
  
  /** Save the object */
  def Save(): Unit
  
  /** Is the device is enabled to send */
  var SendEnabled: Boolean
  
  /** Is the device sending now */
  val SendingNow: Boolean
  
  /** Set the device level extention property */
  def SetExtensionProperty(bstrGUID: String, vProperty: SafeArray[Any]): Unit
  
  /** Device's Transmitting Station ID */
  var TSID: String
  
  /** Adds or removes routing method */
  def UseRoutingMethod(bstrMethodGUID: String, bUse: Boolean): Unit
  
  /** Array of routing methods GUIDs */
  val UsedRoutingMethods: SafeArray[String]
}
object FaxDevice {
  
  inline def apply(
    AnswerCall: () => Unit,
    CSID: String,
    Description: String,
    DeviceName: String,
    FAXCOMEXLibDotFaxDevice_typekey: FaxDevice,
    GetExtensionProperty: String => SafeArray[Any],
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
    SetExtensionProperty: (String, SafeArray[Any]) => Unit,
    TSID: String,
    UseRoutingMethod: (String, Boolean) => Unit,
    UsedRoutingMethods: SafeArray[String]
  ): FaxDevice = {
    val __obj = js.Dynamic.literal(AnswerCall = js.Any.fromFunction0(AnswerCall), CSID = CSID.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DeviceName = DeviceName.asInstanceOf[js.Any], GetExtensionProperty = js.Any.fromFunction1(GetExtensionProperty), Id = Id.asInstanceOf[js.Any], PoweredOff = PoweredOff.asInstanceOf[js.Any], ProviderUniqueName = ProviderUniqueName.asInstanceOf[js.Any], ReceiveMode = ReceiveMode.asInstanceOf[js.Any], ReceivingNow = ReceivingNow.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), RingingNow = RingingNow.asInstanceOf[js.Any], RingsBeforeAnswer = RingsBeforeAnswer.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), SendEnabled = SendEnabled.asInstanceOf[js.Any], SendingNow = SendingNow.asInstanceOf[js.Any], SetExtensionProperty = js.Any.fromFunction2(SetExtensionProperty), TSID = TSID.asInstanceOf[js.Any], UseRoutingMethod = js.Any.fromFunction2(UseRoutingMethod), UsedRoutingMethods = UsedRoutingMethods.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxDevice_typekey")(FAXCOMEXLibDotFaxDevice_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxDevice]
  }
  
  extension [Self <: FaxDevice](x: Self) {
    
    inline def setAnswerCall(value: () => Unit): Self = StObject.set(x, "AnswerCall", js.Any.fromFunction0(value))
    
    inline def setCSID(value: String): Self = StObject.set(x, "CSID", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setFAXCOMEXLibDotFaxDevice_typekey(value: FaxDevice): Self = StObject.set(x, "FAXCOMEXLib.FaxDevice_typekey", value.asInstanceOf[js.Any])
    
    inline def setGetExtensionProperty(value: String => SafeArray[Any]): Self = StObject.set(x, "GetExtensionProperty", js.Any.fromFunction1(value))
    
    inline def setId(value: Double): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setPoweredOff(value: Boolean): Self = StObject.set(x, "PoweredOff", value.asInstanceOf[js.Any])
    
    inline def setProviderUniqueName(value: String): Self = StObject.set(x, "ProviderUniqueName", value.asInstanceOf[js.Any])
    
    inline def setReceiveMode(value: FAX_DEVICE_RECEIVE_MODE_ENUM): Self = StObject.set(x, "ReceiveMode", value.asInstanceOf[js.Any])
    
    inline def setReceivingNow(value: Boolean): Self = StObject.set(x, "ReceivingNow", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: () => Unit): Self = StObject.set(x, "Refresh", js.Any.fromFunction0(value))
    
    inline def setRingingNow(value: Boolean): Self = StObject.set(x, "RingingNow", value.asInstanceOf[js.Any])
    
    inline def setRingsBeforeAnswer(value: Double): Self = StObject.set(x, "RingsBeforeAnswer", value.asInstanceOf[js.Any])
    
    inline def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
    
    inline def setSendEnabled(value: Boolean): Self = StObject.set(x, "SendEnabled", value.asInstanceOf[js.Any])
    
    inline def setSendingNow(value: Boolean): Self = StObject.set(x, "SendingNow", value.asInstanceOf[js.Any])
    
    inline def setSetExtensionProperty(value: (String, SafeArray[Any]) => Unit): Self = StObject.set(x, "SetExtensionProperty", js.Any.fromFunction2(value))
    
    inline def setTSID(value: String): Self = StObject.set(x, "TSID", value.asInstanceOf[js.Any])
    
    inline def setUseRoutingMethod(value: (String, Boolean) => Unit): Self = StObject.set(x, "UseRoutingMethod", js.Any.fromFunction2(value))
    
    inline def setUsedRoutingMethods(value: SafeArray[String]): Self = StObject.set(x, "UsedRoutingMethods", value.asInstanceOf[js.Any])
  }
}
