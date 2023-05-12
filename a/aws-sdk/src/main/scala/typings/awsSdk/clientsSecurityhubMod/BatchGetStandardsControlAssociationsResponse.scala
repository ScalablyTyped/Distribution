package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetStandardsControlAssociationsResponse extends StObject {
  
  /**
    * Provides the enablement status of a security control in a specified standard and other details for the control in relation to the specified standard. 
    */
  var StandardsControlAssociationDetails: typings.awsSdk.clientsSecurityhubMod.StandardsControlAssociationDetails
  
  /**
    *  A security control (identified with SecurityControlId, SecurityControlArn, or a mix of both parameters) whose enablement status in a specified standard cannot be returned. 
    */
  var UnprocessedAssociations: js.UndefOr[UnprocessedStandardsControlAssociations] = js.undefined
}
object BatchGetStandardsControlAssociationsResponse {
  
  inline def apply(StandardsControlAssociationDetails: StandardsControlAssociationDetails): BatchGetStandardsControlAssociationsResponse = {
    val __obj = js.Dynamic.literal(StandardsControlAssociationDetails = StandardsControlAssociationDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetStandardsControlAssociationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetStandardsControlAssociationsResponse] (val x: Self) extends AnyVal {
    
    inline def setStandardsControlAssociationDetails(value: StandardsControlAssociationDetails): Self = StObject.set(x, "StandardsControlAssociationDetails", value.asInstanceOf[js.Any])
    
    inline def setStandardsControlAssociationDetailsVarargs(value: StandardsControlAssociationDetail*): Self = StObject.set(x, "StandardsControlAssociationDetails", js.Array(value*))
    
    inline def setUnprocessedAssociations(value: UnprocessedStandardsControlAssociations): Self = StObject.set(x, "UnprocessedAssociations", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedAssociationsUndefined: Self = StObject.set(x, "UnprocessedAssociations", js.undefined)
    
    inline def setUnprocessedAssociationsVarargs(value: UnprocessedStandardsControlAssociation*): Self = StObject.set(x, "UnprocessedAssociations", js.Array(value*))
  }
}
