package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoSelectorProgramId extends StObject {
  
  /**
    * Selects a specific program from within a multi-program transport stream. If the program doesn't exist, the first program within the transport stream will be selected by default.
    */
  var ProgramId: js.UndefOr[integerMin0Max65536] = js.undefined
}
object VideoSelectorProgramId {
  
  inline def apply(): VideoSelectorProgramId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSelectorProgramId]
  }
  
  extension [Self <: VideoSelectorProgramId](x: Self) {
    
    inline def setProgramId(value: integerMin0Max65536): Self = StObject.set(x, "ProgramId", value.asInstanceOf[js.Any])
    
    inline def setProgramIdUndefined: Self = StObject.set(x, "ProgramId", js.undefined)
  }
}
