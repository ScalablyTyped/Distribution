package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMultiplexProgramRequest extends StObject {
  
  /**
    * The ID of the multiplex that the program belongs to.
    */
  var MultiplexId: string
  
  /**
    * The name of the program.
    */
  var ProgramName: string
}
object DescribeMultiplexProgramRequest {
  
  inline def apply(MultiplexId: string, ProgramName: string): DescribeMultiplexProgramRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any], ProgramName = ProgramName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMultiplexProgramRequest]
  }
  
  extension [Self <: DescribeMultiplexProgramRequest](x: Self) {
    
    inline def setMultiplexId(value: string): Self = StObject.set(x, "MultiplexId", value.asInstanceOf[js.Any])
    
    inline def setProgramName(value: string): Self = StObject.set(x, "ProgramName", value.asInstanceOf[js.Any])
  }
}
