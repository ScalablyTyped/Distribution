package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_DEVICE_RECEIVE_MODE_ENUM
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxDevice Class */
@JSGlobal("FAXCOMEXLib.FaxDevice")
@js.native
/* private */ class FaxDevice ()
  extends StObject
     with typings.activexFaxcomexlib.FAXCOMEXLib.FaxDevice {
  
  /** Answer the call */
  /* CompleteClass */
  override def AnswerCall(): Unit = js.native
  
  /** Device's Called Station ID */
  /* CompleteClass */
  var CSID: String = js.native
  
  /** Description of the device */
  /* CompleteClass */
  var Description: String = js.native
  
  /** Device name */
  /* CompleteClass */
  override val DeviceName: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxDevice_typekey")
  var FAXCOMEXLibDotFaxDevice_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxDevice = js.native
  
  /** Get the device level extention property */
  /* CompleteClass */
  override def GetExtensionProperty(bstrGUID: String): SafeArray[js.Any] = js.native
  
  /** Unique device ID */
  /* CompleteClass */
  override val Id: Double = js.native
  
  /** Is the device is turned off */
  /* CompleteClass */
  override val PoweredOff: Boolean = js.native
  
  /** Device provider */
  /* CompleteClass */
  override val ProviderUniqueName: String = js.native
  
  /** The receive mode of the device */
  /* CompleteClass */
  var ReceiveMode: FAX_DEVICE_RECEIVE_MODE_ENUM = js.native
  
  /** Is the device receiving now */
  /* CompleteClass */
  override val ReceivingNow: Boolean = js.native
  
  /** Refresh the object */
  /* CompleteClass */
  override def Refresh(): Unit = js.native
  
  /** Is the device ringing now */
  /* CompleteClass */
  override val RingingNow: Boolean = js.native
  
  /** Number of rings before the device answers */
  /* CompleteClass */
  var RingsBeforeAnswer: Double = js.native
  
  /** Save the object */
  /* CompleteClass */
  override def Save(): Unit = js.native
  
  /** Is the device is enabled to send */
  /* CompleteClass */
  var SendEnabled: Boolean = js.native
  
  /** Is the device sending now */
  /* CompleteClass */
  override val SendingNow: Boolean = js.native
  
  /** Set the device level extention property */
  /* CompleteClass */
  override def SetExtensionProperty(bstrGUID: String, vProperty: SafeArray[js.Any]): Unit = js.native
  
  /** Device's Transmitting Station ID */
  /* CompleteClass */
  var TSID: String = js.native
  
  /** Adds or removes routing method */
  /* CompleteClass */
  override def UseRoutingMethod(bstrMethodGUID: String, bUse: Boolean): Unit = js.native
  
  /** Array of routing methods GUIDs */
  /* CompleteClass */
  override val UsedRoutingMethods: SafeArray[String] = js.native
}
