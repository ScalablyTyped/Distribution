package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMultiplexProgramRequest extends StObject {
  
  /**
    * The ID of the multiplex of the program to update.
    */
  var MultiplexId: string
  
  /**
    * The new settings for a multiplex program.
    */
  var MultiplexProgramSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.MultiplexProgramSettings] = js.undefined
  
  /**
    * The name of the program to update.
    */
  var ProgramName: string
}
object UpdateMultiplexProgramRequest {
  
  inline def apply(MultiplexId: string, ProgramName: string): UpdateMultiplexProgramRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any], ProgramName = ProgramName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMultiplexProgramRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateMultiplexProgramRequest] (val x: Self) extends AnyVal {
    
    inline def setMultiplexId(value: string): Self = StObject.set(x, "MultiplexId", value.asInstanceOf[js.Any])
    
    inline def setMultiplexProgramSettings(value: MultiplexProgramSettings): Self = StObject.set(x, "MultiplexProgramSettings", value.asInstanceOf[js.Any])
    
    inline def setMultiplexProgramSettingsUndefined: Self = StObject.set(x, "MultiplexProgramSettings", js.undefined)
    
    inline def setProgramName(value: string): Self = StObject.set(x, "ProgramName", value.asInstanceOf[js.Any])
  }
}
