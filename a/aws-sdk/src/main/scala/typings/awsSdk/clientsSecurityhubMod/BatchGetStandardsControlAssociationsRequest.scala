package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetStandardsControlAssociationsRequest extends StObject {
  
  /**
    *  An array with one or more objects that includes a security control (identified with SecurityControlId, SecurityControlArn, or a mix of both parameters) and the Amazon Resource Name (ARN) of a standard. This field is used to query the enablement status of a control in a specified standard. The security control ID or ARN is the same across standards. 
    */
  var StandardsControlAssociationIds: typings.awsSdk.clientsSecurityhubMod.StandardsControlAssociationIds
}
object BatchGetStandardsControlAssociationsRequest {
  
  inline def apply(StandardsControlAssociationIds: StandardsControlAssociationIds): BatchGetStandardsControlAssociationsRequest = {
    val __obj = js.Dynamic.literal(StandardsControlAssociationIds = StandardsControlAssociationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetStandardsControlAssociationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetStandardsControlAssociationsRequest] (val x: Self) extends AnyVal {
    
    inline def setStandardsControlAssociationIds(value: StandardsControlAssociationIds): Self = StObject.set(x, "StandardsControlAssociationIds", value.asInstanceOf[js.Any])
    
    inline def setStandardsControlAssociationIdsVarargs(value: StandardsControlAssociationId*): Self = StObject.set(x, "StandardsControlAssociationIds", js.Array(value*))
  }
}
