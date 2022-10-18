package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsByAssessment extends StObject {
  
  /**
    * The number of assessment controls that collected non-compliant evidence on the lastUpdated date. 
    */
  var assessmentControlsCountByNoncompliantEvidence: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The number of compliance check evidence that Audit Manager classified as compliant. This includes evidence that was collected from Security Hub with a Pass ruling, or collected from Config with a Compliant ruling. 
    */
  var compliantEvidenceCount: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The amount of evidence without a compliance check ruling. Evidence is inconclusive if the associated control uses Security Hub or Config as a data source and you didn't enable those services. This is also the case if a control uses a data source that doesn’t support compliance checks (for example, manual evidence, API calls, or CloudTrail).   If evidence has a compliance check status of not applicable, it's classified as inconclusive in InsightsByAssessment data. 
    */
  var inconclusiveEvidenceCount: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The time when the assessment insights were last updated.
    */
  var lastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of compliance check evidence that Audit Manager classified as non-compliant. This includes evidence that was collected from Security Hub with a Fail ruling, or collected from Config with a Non-compliant ruling. 
    */
  var noncompliantEvidenceCount: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The total number of controls in the assessment. 
    */
  var totalAssessmentControlsCount: js.UndefOr[NullableInteger] = js.undefined
}
object InsightsByAssessment {
  
  inline def apply(): InsightsByAssessment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsightsByAssessment]
  }
  
  extension [Self <: InsightsByAssessment](x: Self) {
    
    inline def setAssessmentControlsCountByNoncompliantEvidence(value: NullableInteger): Self = StObject.set(x, "assessmentControlsCountByNoncompliantEvidence", value.asInstanceOf[js.Any])
    
    inline def setAssessmentControlsCountByNoncompliantEvidenceUndefined: Self = StObject.set(x, "assessmentControlsCountByNoncompliantEvidence", js.undefined)
    
    inline def setCompliantEvidenceCount(value: NullableInteger): Self = StObject.set(x, "compliantEvidenceCount", value.asInstanceOf[js.Any])
    
    inline def setCompliantEvidenceCountUndefined: Self = StObject.set(x, "compliantEvidenceCount", js.undefined)
    
    inline def setInconclusiveEvidenceCount(value: NullableInteger): Self = StObject.set(x, "inconclusiveEvidenceCount", value.asInstanceOf[js.Any])
    
    inline def setInconclusiveEvidenceCountUndefined: Self = StObject.set(x, "inconclusiveEvidenceCount", js.undefined)
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    inline def setNoncompliantEvidenceCount(value: NullableInteger): Self = StObject.set(x, "noncompliantEvidenceCount", value.asInstanceOf[js.Any])
    
    inline def setNoncompliantEvidenceCountUndefined: Self = StObject.set(x, "noncompliantEvidenceCount", js.undefined)
    
    inline def setTotalAssessmentControlsCount(value: NullableInteger): Self = StObject.set(x, "totalAssessmentControlsCount", value.asInstanceOf[js.Any])
    
    inline def setTotalAssessmentControlsCountUndefined: Self = StObject.set(x, "totalAssessmentControlsCount", js.undefined)
  }
}
