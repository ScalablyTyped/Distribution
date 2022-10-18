package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationTaskIndividualAssessment extends StObject {
  
  /**
    * Name of this individual assessment.
    */
  var IndividualAssessmentName: js.UndefOr[String] = js.undefined
  
  /**
    * ARN of the premigration assessment run that is created to run this individual assessment.
    */
  var ReplicationTaskAssessmentRunArn: js.UndefOr[String] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of this individual assessment.
    */
  var ReplicationTaskIndividualAssessmentArn: js.UndefOr[String] = js.undefined
  
  /**
    * Date when this individual assessment was started as part of running the StartReplicationTaskAssessmentRun operation.
    */
  var ReplicationTaskIndividualAssessmentStartDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Individual assessment status. This status can have one of the following values:    "cancelled"     "error"     "failed"     "passed"     "pending"     "running"   
    */
  var Status: js.UndefOr[String] = js.undefined
}
object ReplicationTaskIndividualAssessment {
  
  inline def apply(): ReplicationTaskIndividualAssessment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationTaskIndividualAssessment]
  }
  
  extension [Self <: ReplicationTaskIndividualAssessment](x: Self) {
    
    inline def setIndividualAssessmentName(value: String): Self = StObject.set(x, "IndividualAssessmentName", value.asInstanceOf[js.Any])
    
    inline def setIndividualAssessmentNameUndefined: Self = StObject.set(x, "IndividualAssessmentName", js.undefined)
    
    inline def setReplicationTaskAssessmentRunArn(value: String): Self = StObject.set(x, "ReplicationTaskAssessmentRunArn", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskAssessmentRunArnUndefined: Self = StObject.set(x, "ReplicationTaskAssessmentRunArn", js.undefined)
    
    inline def setReplicationTaskIndividualAssessmentArn(value: String): Self = StObject.set(x, "ReplicationTaskIndividualAssessmentArn", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskIndividualAssessmentArnUndefined: Self = StObject.set(x, "ReplicationTaskIndividualAssessmentArn", js.undefined)
    
    inline def setReplicationTaskIndividualAssessmentStartDate(value: js.Date): Self = StObject.set(x, "ReplicationTaskIndividualAssessmentStartDate", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskIndividualAssessmentStartDateUndefined: Self = StObject.set(x, "ReplicationTaskIndividualAssessmentStartDate", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
