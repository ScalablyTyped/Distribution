package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProgramRequest extends StObject {
  
  /**
    * The name of the channel.
    */
  var ChannelName: _String
  
  /**
    * The name of the program.
    */
  var ProgramName: _String
}
object DeleteProgramRequest {
  
  inline def apply(ChannelName: _String, ProgramName: _String): DeleteProgramRequest = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any], ProgramName = ProgramName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProgramRequest]
  }
  
  extension [Self <: DeleteProgramRequest](x: Self) {
    
    inline def setChannelName(value: _String): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    inline def setProgramName(value: _String): Self = StObject.set(x, "ProgramName", value.asInstanceOf[js.Any])
  }
}
