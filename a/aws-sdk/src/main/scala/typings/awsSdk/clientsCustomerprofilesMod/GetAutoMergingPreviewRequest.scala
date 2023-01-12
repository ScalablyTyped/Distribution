package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAutoMergingPreviewRequest extends StObject {
  
  /**
    * How the auto-merging process should resolve conflicts between different profiles.
    */
  var ConflictResolution: typings.awsSdk.clientsCustomerprofilesMod.ConflictResolution
  
  /**
    * A list of matching attributes that represent matching criteria.
    */
  var Consolidation: typings.awsSdk.clientsCustomerprofilesMod.Consolidation
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
  
  /**
    * Minimum confidence score required for profiles within a matching group to be merged during the auto-merge process.
    */
  var MinAllowedConfidenceScoreForMerging: js.UndefOr[Double0To1] = js.undefined
}
object GetAutoMergingPreviewRequest {
  
  inline def apply(ConflictResolution: ConflictResolution, Consolidation: Consolidation, DomainName: name): GetAutoMergingPreviewRequest = {
    val __obj = js.Dynamic.literal(ConflictResolution = ConflictResolution.asInstanceOf[js.Any], Consolidation = Consolidation.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAutoMergingPreviewRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAutoMergingPreviewRequest] (val x: Self) extends AnyVal {
    
    inline def setConflictResolution(value: ConflictResolution): Self = StObject.set(x, "ConflictResolution", value.asInstanceOf[js.Any])
    
    inline def setConsolidation(value: Consolidation): Self = StObject.set(x, "Consolidation", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setMinAllowedConfidenceScoreForMerging(value: Double0To1): Self = StObject.set(x, "MinAllowedConfidenceScoreForMerging", value.asInstanceOf[js.Any])
    
    inline def setMinAllowedConfidenceScoreForMergingUndefined: Self = StObject.set(x, "MinAllowedConfidenceScoreForMerging", js.undefined)
  }
}
