package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateStandardsControlAssociationsRequest extends StObject {
  
  /**
    *  Updates the enablement status of a security control in a specified standard. 
    */
  var StandardsControlAssociationUpdates: typings.awsSdk.clientsSecurityhubMod.StandardsControlAssociationUpdates
}
object BatchUpdateStandardsControlAssociationsRequest {
  
  inline def apply(StandardsControlAssociationUpdates: StandardsControlAssociationUpdates): BatchUpdateStandardsControlAssociationsRequest = {
    val __obj = js.Dynamic.literal(StandardsControlAssociationUpdates = StandardsControlAssociationUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateStandardsControlAssociationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchUpdateStandardsControlAssociationsRequest] (val x: Self) extends AnyVal {
    
    inline def setStandardsControlAssociationUpdates(value: StandardsControlAssociationUpdates): Self = StObject.set(x, "StandardsControlAssociationUpdates", value.asInstanceOf[js.Any])
    
    inline def setStandardsControlAssociationUpdatesVarargs(value: StandardsControlAssociationUpdate*): Self = StObject.set(x, "StandardsControlAssociationUpdates", js.Array(value*))
  }
}
