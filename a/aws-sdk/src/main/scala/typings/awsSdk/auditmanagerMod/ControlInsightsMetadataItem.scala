package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlInsightsMetadataItem extends StObject {
  
  /**
    * A breakdown of the compliance check status for the evidence that’s associated with the control. 
    */
  var evidenceInsights: js.UndefOr[EvidenceInsights] = js.undefined
  
  /**
    * The unique identifier for the control. 
    */
  var id: js.UndefOr[UUID] = js.undefined
  
  /**
    * The time when the control insights were last updated. 
    */
  var lastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the control. 
    */
  var name: js.UndefOr[NonEmptyString] = js.undefined
}
object ControlInsightsMetadataItem {
  
  inline def apply(): ControlInsightsMetadataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlInsightsMetadataItem]
  }
  
  extension [Self <: ControlInsightsMetadataItem](x: Self) {
    
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
