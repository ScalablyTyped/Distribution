package typings.activexWia.WIA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The DeviceCommand object describes a CommandID that can be used when calling ExecuteCommand on a Device or Item object. */
trait DeviceCommand extends StObject {
  
  /** Returns the commandID for this Command */
  val CommandID: String
  
  /** Returns the command Description */
  val Description: String
  
  /** Returns the command Name */
  val Name: String
  
  /* private */ @JSName("WIA.DeviceCommand_typekey")
  var WIADotDeviceCommand_typekey: DeviceCommand
}
object DeviceCommand {
  
  inline def apply(CommandID: String, Description: String, Name: String, WIADotDeviceCommand_typekey: DeviceCommand): DeviceCommand = {
    val __obj = js.Dynamic.literal(CommandID = CommandID.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("WIA.DeviceCommand_typekey")(WIADotDeviceCommand_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceCommand]
  }
  
  extension [Self <: DeviceCommand](x: Self) {
    
    inline def setCommandID(value: String): Self = StObject.set(x, "CommandID", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setWIADotDeviceCommand_typekey(value: DeviceCommand): Self = StObject.set(x, "WIA.DeviceCommand_typekey", value.asInstanceOf[js.Any])
  }
}
