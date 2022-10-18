package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProcessingJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the processing job.
    */
  var ProcessingJobArn: typings.awsSdk.clientsSagemakerMod.ProcessingJobArn
}
object CreateProcessingJobResponse {
  
  inline def apply(ProcessingJobArn: ProcessingJobArn): CreateProcessingJobResponse = {
    val __obj = js.Dynamic.literal(ProcessingJobArn = ProcessingJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProcessingJobResponse]
  }
  
  extension [Self <: CreateProcessingJobResponse](x: Self) {
    
    inline def setProcessingJobArn(value: ProcessingJobArn): Self = StObject.set(x, "ProcessingJobArn", value.asInstanceOf[js.Any])
  }
}
