package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateStandardsControlAssociationsResponse extends StObject {
  
  /**
    *  A security control (identified with SecurityControlId, SecurityControlArn, or a mix of both parameters) whose enablement status in a specified standard couldn't be updated. 
    */
  var UnprocessedAssociationUpdates: js.UndefOr[UnprocessedStandardsControlAssociationUpdates] = js.undefined
}
object BatchUpdateStandardsControlAssociationsResponse {
  
  inline def apply(): BatchUpdateStandardsControlAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateStandardsControlAssociationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchUpdateStandardsControlAssociationsResponse] (val x: Self) extends AnyVal {
    
    inline def setUnprocessedAssociationUpdates(value: UnprocessedStandardsControlAssociationUpdates): Self = StObject.set(x, "UnprocessedAssociationUpdates", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedAssociationUpdatesUndefined: Self = StObject.set(x, "UnprocessedAssociationUpdates", js.undefined)
    
    inline def setUnprocessedAssociationUpdatesVarargs(value: UnprocessedStandardsControlAssociationUpdate*): Self = StObject.set(x, "UnprocessedAssociationUpdates", js.Array(value*))
  }
}
