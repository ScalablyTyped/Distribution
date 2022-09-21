package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Insights extends StObject {
  
  /**
    * The number of active assessments in Audit Manager. 
    */
  var activeAssessmentsCount: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The number of assessment controls that collected non-compliant evidence on the lastUpdated date. 
    */
  var assessmentControlsCountByNoncompliantEvidence: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The number of compliance check evidence that Audit Manager classified as compliant on the lastUpdated date. This includes evidence that was collected from Security Hub with a Pass ruling, or collected from Config with a Compliant ruling. 
    */
  var compliantEvidenceCount: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The number of evidence without a compliance check ruling. Evidence is inconclusive when the associated control uses Security Hub or Config as a data source but you didn't enable those services. This is also the case when a control uses a data source that doesn’t support compliance checks (for example: manual evidence, API calls, or CloudTrail).   If evidence has a compliance check status of not applicable, it's classed as inconclusive in Insights data. 
    */
  var inconclusiveEvidenceCount: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The time when the cross-assessment insights were last updated. 
    */
  var lastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of compliance check evidence that Audit Manager classified as non-compliant on the lastUpdated date. This includes evidence that was collected from Security Hub with a Fail ruling, or collected from Config with a Non-compliant ruling. 
    */
  var noncompliantEvidenceCount: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The total number of controls across all active assessments. 
    */
  var totalAssessmentControlsCount: js.UndefOr[NullableInteger] = js.undefined
}
object Insights {
  
  inline def apply(): Insights = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Insights]
  }
  
  extension [Self <: Insights](x: Self) {
    
    inline def setActiveAssessmentsCount(value: NullableInteger): Self = StObject.set(x, "activeAssessmentsCount", value.asInstanceOf[js.Any])
    
    inline def setActiveAssessmentsCountUndefined: Self = StObject.set(x, "activeAssessmentsCount", js.undefined)
    
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
