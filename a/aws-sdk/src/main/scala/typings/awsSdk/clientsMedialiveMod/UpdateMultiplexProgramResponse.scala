package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMultiplexProgramResponse extends StObject {
  
  /**
    * The updated multiplex program.
    */
  var MultiplexProgram: js.UndefOr[typings.awsSdk.clientsMedialiveMod.MultiplexProgram] = js.undefined
}
object UpdateMultiplexProgramResponse {
  
  inline def apply(): UpdateMultiplexProgramResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMultiplexProgramResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateMultiplexProgramResponse] (val x: Self) extends AnyVal {
    
    inline def setMultiplexProgram(value: MultiplexProgram): Self = StObject.set(x, "MultiplexProgram", value.asInstanceOf[js.Any])
    
    inline def setMultiplexProgramUndefined: Self = StObject.set(x, "MultiplexProgram", js.undefined)
  }
}
