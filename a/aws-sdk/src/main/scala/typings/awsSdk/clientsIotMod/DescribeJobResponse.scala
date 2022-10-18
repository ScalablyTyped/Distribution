package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobResponse extends StObject {
  
  /**
    * An S3 link to the job document.
    */
  var documentSource: js.UndefOr[JobDocumentSource] = js.undefined
  
  /**
    * Information about the job.
    */
  var job: js.UndefOr[Job] = js.undefined
}
object DescribeJobResponse {
  
  inline def apply(): DescribeJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobResponse]
  }
  
  extension [Self <: DescribeJobResponse](x: Self) {
    
    inline def setDocumentSource(value: JobDocumentSource): Self = StObject.set(x, "documentSource", value.asInstanceOf[js.Any])
    
    inline def setDocumentSourceUndefined: Self = StObject.set(x, "documentSource", js.undefined)
    
    inline def setJob(value: Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
  }
}
