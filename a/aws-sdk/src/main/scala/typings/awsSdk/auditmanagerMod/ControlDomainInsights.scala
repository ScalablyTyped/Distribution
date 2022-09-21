package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlDomainInsights extends StObject {
  
  /**
    * The number of controls in the control domain that collected non-compliant evidence on the lastUpdated date. 
    */
  var controlsCountByNoncompliantEvidence: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * A breakdown of the compliance check status for the evidence that’s associated with the control domain. 
    */
  var evidenceInsights: js.UndefOr[EvidenceInsights] = js.undefined
  
  /**
    * The unique identifier for the control domain. 
    */
  var id: js.UndefOr[UUID] = js.undefined
  
  /**
    * The time when the control domain insights were last updated. 
    */
  var lastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the control domain. 
    */
  var name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The total number of controls in the control domain. 
    */
  var totalControlsCount: js.UndefOr[NullableInteger] = js.undefined
}
object ControlDomainInsights {
  
  inline def apply(): ControlDomainInsights = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlDomainInsights]
  }
  
  extension [Self <: ControlDomainInsights](x: Self) {
    
    inline def setControlsCountByNoncompliantEvidence(value: NullableInteger): Self = StObject.set(x, "controlsCountByNoncompliantEvidence", value.asInstanceOf[js.Any])
    
    inline def setControlsCountByNoncompliantEvidenceUndefined: Self = StObject.set(x, "controlsCountByNoncompliantEvidence", js.undefined)
    
    inline def setEvidenceInsights(value: EvidenceInsights): Self = StObject.set(x, "evidenceInsights", value.asInstanceOf[js.Any])
    
    inline def setEvidenceInsightsUndefined: Self = StObject.set(x, "evidenceInsights", js.undefined)
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTotalControlsCount(value: NullableInteger): Self = StObject.set(x, "totalControlsCount", value.asInstanceOf[js.Any])
    
    inline def setTotalControlsCountUndefined: Self = StObject.set(x, "totalControlsCount", js.undefined)
  }
}
