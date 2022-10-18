package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationTaskAssessmentResult extends StObject {
  
  /**
    *  The task assessment results in JSON format.  The response object only contains this field if you provide DescribeReplicationTaskAssessmentResultsMessage$ReplicationTaskArn in the request.
    */
  var AssessmentResults: js.UndefOr[String] = js.undefined
  
  /**
    *  The file containing the results of the task assessment. 
    */
  var AssessmentResultsFile: js.UndefOr[String] = js.undefined
  
  /**
    *  The status of the task assessment. 
    */
  var AssessmentStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the replication task. 
    */
  var ReplicationTaskArn: js.UndefOr[String] = js.undefined
  
  /**
    *  The replication task identifier of the task on which the task assessment was run. 
    */
  var ReplicationTaskIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The date the task assessment was completed. 
    */
  var ReplicationTaskLastAssessmentDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The URL of the S3 object containing the task assessment results.  The response object only contains this field if you provide DescribeReplicationTaskAssessmentResultsMessage$ReplicationTaskArn in the request.
    */
  var S3ObjectUrl: js.UndefOr[String] = js.undefined
}
object ReplicationTaskAssessmentResult {
  
  inline def apply(): ReplicationTaskAssessmentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationTaskAssessmentResult]
  }
  
  extension [Self <: ReplicationTaskAssessmentResult](x: Self) {
    
    inline def setAssessmentResults(value: String): Self = StObject.set(x, "AssessmentResults", value.asInstanceOf[js.Any])
    
    inline def setAssessmentResultsFile(value: String): Self = StObject.set(x, "AssessmentResultsFile", value.asInstanceOf[js.Any])
    
    inline def setAssessmentResultsFileUndefined: Self = StObject.set(x, "AssessmentResultsFile", js.undefined)
    
    inline def setAssessmentResultsUndefined: Self = StObject.set(x, "AssessmentResults", js.undefined)
    
    inline def setAssessmentStatus(value: String): Self = StObject.set(x, "AssessmentStatus", value.asInstanceOf[js.Any])
    
    inline def setAssessmentStatusUndefined: Self = StObject.set(x, "AssessmentStatus", js.undefined)
    
    inline def setReplicationTaskArn(value: String): Self = StObject.set(x, "ReplicationTaskArn", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskArnUndefined: Self = StObject.set(x, "ReplicationTaskArn", js.undefined)
    
    inline def setReplicationTaskIdentifier(value: String): Self = StObject.set(x, "ReplicationTaskIdentifier", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskIdentifierUndefined: Self = StObject.set(x, "ReplicationTaskIdentifier", js.undefined)
    
    inline def setReplicationTaskLastAssessmentDate(value: js.Date): Self = StObject.set(x, "ReplicationTaskLastAssessmentDate", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskLastAssessmentDateUndefined: Self = StObject.set(x, "ReplicationTaskLastAssessmentDate", js.undefined)
    
    inline def setS3ObjectUrl(value: String): Self = StObject.set(x, "S3ObjectUrl", value.asInstanceOf[js.Any])
    
    inline def setS3ObjectUrlUndefined: Self = StObject.set(x, "S3ObjectUrl", js.undefined)
  }
}
