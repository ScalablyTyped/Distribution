package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMultiplexProgramRequest extends StObject {
  
  /**
    * The ID of the multiplex that the program belongs to.
    */
  var MultiplexId: string
  
  /**
    * The multiplex program name.
    */
  var ProgramName: string
}
object DeleteMultiplexProgramRequest {
  
  inline def apply(MultiplexId: string, ProgramName: string): DeleteMultiplexProgramRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any], ProgramName = ProgramName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMultiplexProgramRequest]
  }
  
  extension [Self <: DeleteMultiplexProgramRequest](x: Self) {
    
    inline def setMultiplexId(value: string): Self = StObject.set(x, "MultiplexId", value.asInstanceOf[js.Any])
    
    inline def setProgramName(value: string): Self = StObject.set(x, "ProgramName", value.asInstanceOf[js.Any])
  }
}
