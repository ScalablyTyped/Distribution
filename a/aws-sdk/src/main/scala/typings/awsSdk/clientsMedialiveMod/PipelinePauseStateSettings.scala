package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelinePauseStateSettings extends StObject {
  
  /**
    * Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1").
    */
  var PipelineId: typings.awsSdk.clientsMedialiveMod.PipelineId
}
object PipelinePauseStateSettings {
  
  inline def apply(PipelineId: PipelineId): PipelinePauseStateSettings = {
    val __obj = js.Dynamic.literal(PipelineId = PipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelinePauseStateSettings]
  }
  
  extension [Self <: PipelinePauseStateSettings](x: Self) {
    
    inline def setPipelineId(value: PipelineId): Self = StObject.set(x, "PipelineId", value.asInstanceOf[js.Any])
  }
}
