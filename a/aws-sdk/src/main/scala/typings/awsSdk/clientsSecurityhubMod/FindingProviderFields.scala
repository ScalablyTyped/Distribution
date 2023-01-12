package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindingProviderFields extends StObject {
  
  /**
    * A finding's confidence. Confidence is defined as the likelihood that a finding accurately identifies the behavior or issue that it was intended to identify. Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100 means 100 percent confidence.
    */
  var Confidence: js.UndefOr[RatioScale] = js.undefined
  
  /**
    * The level of importance assigned to the resources associated with the finding. A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for the most critical resources.
    */
  var Criticality: js.UndefOr[RatioScale] = js.undefined
  
  /**
    * A list of findings that are related to the current finding.
    */
  var RelatedFindings: js.UndefOr[RelatedFindingList] = js.undefined
  
  /**
    * The severity of a finding.
    */
  var Severity: js.UndefOr[FindingProviderSeverity] = js.undefined
  
  /**
    * One or more finding types in the format of namespace/category/classifier that classify a finding. Valid namespace values are: Software and Configuration Checks | TTPs | Effects | Unusual Behaviors | Sensitive Data Identifications
    */
  var Types: js.UndefOr[TypeList] = js.undefined
}
object FindingProviderFields {
  
  inline def apply(): FindingProviderFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingProviderFields]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FindingProviderFields] (val x: Self) extends AnyVal {
    
    inline def setConfidence(value: RatioScale): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setCriticality(value: RatioScale): Self = StObject.set(x, "Criticality", value.asInstanceOf[js.Any])
    
    inline def setCriticalityUndefined: Self = StObject.set(x, "Criticality", js.undefined)
    
    inline def setRelatedFindings(value: RelatedFindingList): Self = StObject.set(x, "RelatedFindings", value.asInstanceOf[js.Any])
    
    inline def setRelatedFindingsUndefined: Self = StObject.set(x, "RelatedFindings", js.undefined)
    
    inline def setRelatedFindingsVarargs(value: RelatedFinding*): Self = StObject.set(x, "RelatedFindings", js.Array(value*))
    
    inline def setSeverity(value: FindingProviderSeverity): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "Severity", js.undefined)
    
    inline def setTypes(value: TypeList): Self = StObject.set(x, "Types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "Types", js.undefined)
    
    inline def setTypesVarargs(value: NonEmptyString*): Self = StObject.set(x, "Types", js.Array(value*))
  }
}
