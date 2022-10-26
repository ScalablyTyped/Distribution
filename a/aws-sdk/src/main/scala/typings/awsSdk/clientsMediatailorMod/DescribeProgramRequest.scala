package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProgramRequest extends StObject {
  
  /**
    * The name of the channel associated with this Program.
    */
  var ChannelName: string
  
  /**
    * The name of the program.
    */
  var ProgramName: string
}
object DescribeProgramRequest {
  
  inline def apply(ChannelName: string, ProgramName: string): DescribeProgramRequest = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any], ProgramName = ProgramName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProgramRequest]
  }
  
  extension [Self <: DescribeProgramRequest](x: Self) {
    
    inline def setChannelName(value: string): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    inline def setProgramName(value: string): Self = StObject.set(x, "ProgramName", value.asInstanceOf[js.Any])
  }
}
