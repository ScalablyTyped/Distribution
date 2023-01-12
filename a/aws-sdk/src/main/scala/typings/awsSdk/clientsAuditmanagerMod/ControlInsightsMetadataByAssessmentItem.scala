package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlInsightsMetadataByAssessmentItem extends StObject {
  
  /**
    * The name of the control set that the assessment control belongs to. 
    */
  var controlSetName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A breakdown of the compliance check status for the evidence that’s associated with the assessment control. 
    */
  var evidenceInsights: js.UndefOr[EvidenceInsights] = js.undefined
  
  /**
    * The unique identifier for the assessment control. 
    */
  var id: js.UndefOr[UUID] = js.undefined
  
  /**
    * The time when the assessment control insights were last updated. 
    */
  var lastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the assessment control. 
    */
  var name: js.UndefOr[NonEmptyString] = js.undefined
}
object ControlInsightsMetadataByAssessmentItem {
  
  inline def apply(): ControlInsightsMetadataByAssessmentItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlInsightsMetadataByAssessmentItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControlInsightsMetadataByAssessmentItem] (val x: Self) extends AnyVal {
    
    inline def setControlSetName(value: NonEmptyString): Self = StObject.set(x, "controlSetName", value.asInstanceOf[js.Any])
    
    inline def setControlSetNameUndefined: Self = StObject.set(x, "controlSetName", js.undefined)
    
    inline def setEvidenceInsights(value: EvidenceInsights): Self = StObject.set(x, "evidenceInsights", value.asInstanceOf[js.Any])
    
    inline def setEvidenceInsightsUndefined: Self = StObject.set(x, "evidenceInsights", js.undefined)
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
