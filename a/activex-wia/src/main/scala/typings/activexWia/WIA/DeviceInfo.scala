package typings.activexWia.WIA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The DeviceInfo object is a container that describes the unchanging (static) properties of an imaging device that is currently connected to the
  * computer.
  */
trait DeviceInfo extends StObject {
  
  /** Establish a connection with this device and return a Device object */
  def Connect(): Device
  
  /** Returns the DeviceID for this Device */
  val DeviceID: String
  
  def Properties(Index: String): Property
  /** Returns the specified item in the collection either by position or name. */
  /** A collection of all properties for this imaging device that are applicable when the device is not connected */
  def Properties(Index: Double): Property
  /** A collection of all properties for this imaging device that are applicable when the device is not connected */
  @JSName("Properties")
  val Properties_Original: Properties
  
  /** Returns the Type of Device */
  val Type: WiaDeviceType
  
  /* private */ @JSName("WIA.DeviceInfo_typekey")
  var WIADotDeviceInfo_typekey: DeviceInfo
}
object DeviceInfo {
  
  inline def apply(
    Connect: () => Device,
    DeviceID: String,
    Properties: Properties,
    Type: WiaDeviceType,
    WIADotDeviceInfo_typekey: DeviceInfo
  ): DeviceInfo = {
    val __obj = js.Dynamic.literal(Connect = js.Any.fromFunction0(Connect), DeviceID = DeviceID.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("WIA.DeviceInfo_typekey")(WIADotDeviceInfo_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceInfo]
  }
  
  extension [Self <: DeviceInfo](x: Self) {
    
    inline def setConnect(value: () => Device): Self = StObject.set(x, "Connect", js.Any.fromFunction0(value))
    
    inline def setDeviceID(value: String): Self = StObject.set(x, "DeviceID", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Properties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setType(value: WiaDeviceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setWIADotDeviceInfo_typekey(value: DeviceInfo): Self = StObject.set(x, "WIA.DeviceInfo_typekey", value.asInstanceOf[js.Any])
  }
}
