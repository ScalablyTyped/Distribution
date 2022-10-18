package typings.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadPipelineResponse extends StObject {
  
  /**
    * A section of the response body that provides information about the pipeline.
    */
  var Pipeline: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.Pipeline] = js.undefined
  
  /**
    * Elastic Transcoder returns a warning if the resources used by your pipeline are not in the same region as the pipeline. Using resources in the same region, such as your Amazon S3 buckets, Amazon SNS notification topics, and AWS KMS key, reduces processing time and prevents cross-regional charges.
    */
  var Warnings: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.Warnings] = js.undefined
}
object ReadPipelineResponse {
  
  inline def apply(): ReadPipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadPipelineResponse]
  }
  
  extension [Self <: ReadPipelineResponse](x: Self) {
    
    inline def setPipeline(value: Pipeline): Self = StObject.set(x, "Pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "Pipeline", js.undefined)
    
    inline def setWarnings(value: Warnings): Self = StObject.set(x, "Warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "Warnings", js.undefined)
    
    inline def setWarningsVarargs(value: Warning*): Self = StObject.set(x, "Warnings", js.Array(value*))
  }
}
