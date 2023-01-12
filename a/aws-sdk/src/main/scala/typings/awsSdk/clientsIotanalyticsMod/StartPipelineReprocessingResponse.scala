package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartPipelineReprocessingResponse extends StObject {
  
  /**
    * The ID of the pipeline reprocessing activity that was started.
    */
  var reprocessingId: js.UndefOr[ReprocessingId] = js.undefined
}
object StartPipelineReprocessingResponse {
  
  inline def apply(): StartPipelineReprocessingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPipelineReprocessingResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartPipelineReprocessingResponse] (val x: Self) extends AnyVal {
    
    inline def setReprocessingId(value: ReprocessingId): Self = StObject.set(x, "reprocessingId", value.asInstanceOf[js.Any])
    
    inline def setReprocessingIdUndefined: Self = StObject.set(x, "reprocessingId", js.undefined)
  }
}
