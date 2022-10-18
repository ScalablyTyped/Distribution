package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePipelineResponse extends StObject {
  
  /**
    * A Pipeline object that contains information about the pipeline.
    */
  var pipeline: js.UndefOr[Pipeline] = js.undefined
}
object DescribePipelineResponse {
  
  inline def apply(): DescribePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePipelineResponse]
  }
  
  extension [Self <: DescribePipelineResponse](x: Self) {
    
    inline def setPipeline(value: Pipeline): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
  }
}
