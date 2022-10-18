package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassificationDetails extends StObject {
  
  /**
    * The path to the folder or file (in Amazon S3) that contains the corresponding sensitive data discovery result for the finding. If a finding applies to a large archive or compressed file, this value is the path to a folder. Otherwise, this value is the path to a file.
    */
  var detailedResultsLocation: js.UndefOr[string] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the classification job that produced the finding.
    */
  var jobArn: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the classification job that produced the finding.
    */
  var jobId: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies how Amazon Macie found the sensitive data that produced the finding: SENSITIVE_DATA_DISCOVERY_JOB, for a classification job.
    */
  var originType: js.UndefOr[OriginType] = js.undefined
  
  /**
    * The status and other details of the finding.
    */
  var result: js.UndefOr[ClassificationResult] = js.undefined
}
object ClassificationDetails {
  
  inline def apply(): ClassificationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassificationDetails]
  }
  
  extension [Self <: ClassificationDetails](x: Self) {
    
    inline def setDetailedResultsLocation(value: string): Self = StObject.set(x, "detailedResultsLocation", value.asInstanceOf[js.Any])
    
    inline def setDetailedResultsLocationUndefined: Self = StObject.set(x, "detailedResultsLocation", js.undefined)
    
    inline def setJobArn(value: string): Self = StObject.set(x, "jobArn", value.asInstanceOf[js.Any])
    
    inline def setJobArnUndefined: Self = StObject.set(x, "jobArn", js.undefined)
    
    inline def setJobId(value: string): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setOriginType(value: OriginType): Self = StObject.set(x, "originType", value.asInstanceOf[js.Any])
    
    inline def setOriginTypeUndefined: Self = StObject.set(x, "originType", js.undefined)
    
    inline def setResult(value: ClassificationResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
