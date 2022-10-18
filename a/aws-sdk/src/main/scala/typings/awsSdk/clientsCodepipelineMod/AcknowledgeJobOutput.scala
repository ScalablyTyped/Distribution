package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcknowledgeJobOutput extends StObject {
  
  /**
    * Whether the job worker has received the specified job.
    */
  var status: js.UndefOr[JobStatus] = js.undefined
}
object AcknowledgeJobOutput {
  
  inline def apply(): AcknowledgeJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcknowledgeJobOutput]
  }
  
  extension [Self <: AcknowledgeJobOutput](x: Self) {
    
    inline def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
