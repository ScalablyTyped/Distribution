package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopProcessingJobRequest extends StObject {
  
  /**
    * The name of the processing job to stop.
    */
  var ProcessingJobName: typings.awsSdk.clientsSagemakerMod.ProcessingJobName
}
object StopProcessingJobRequest {
  
  inline def apply(ProcessingJobName: ProcessingJobName): StopProcessingJobRequest = {
    val __obj = js.Dynamic.literal(ProcessingJobName = ProcessingJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopProcessingJobRequest]
  }
  
  extension [Self <: StopProcessingJobRequest](x: Self) {
    
    inline def setProcessingJobName(value: ProcessingJobName): Self = StObject.set(x, "ProcessingJobName", value.asInstanceOf[js.Any])
  }
}
