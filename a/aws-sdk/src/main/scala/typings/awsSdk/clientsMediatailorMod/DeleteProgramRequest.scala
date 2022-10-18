package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProgramRequest extends StObject {
  
  /**
    * The identifier for the channel you are working on.
    */
  var ChannelName: string
  
  /**
    * The identifier for the program you are working on.
    */
  var ProgramName: string
}
object DeleteProgramRequest {
  
  inline def apply(ChannelName: string, ProgramName: string): DeleteProgramRequest = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any], ProgramName = ProgramName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProgramRequest]
  }
  
  extension [Self <: DeleteProgramRequest](x: Self) {
    
    inline def setChannelName(value: string): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    inline def setProgramName(value: string): Self = StObject.set(x, "ProgramName", value.asInstanceOf[js.Any])
  }
}
