package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociationOverview extends StObject {
  
  /**
    * Returns the number of targets for the association status. For example, if you created an association with two managed nodes, and one of them was successful, this would return the count of managed nodes by status.
    */
  var AssociationStatusAggregatedCount: js.UndefOr[typings.awsSdk.clientsSsmMod.AssociationStatusAggregatedCount] = js.undefined
  
  /**
    * A detailed status of the association.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.undefined
  
  /**
    * The status of the association. Status can be: Pending, Success, or Failed.
    */
  var Status: js.UndefOr[StatusName] = js.undefined
}
object AssociationOverview {
  
  inline def apply(): AssociationOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationOverview]
  }
  
  extension [Self <: AssociationOverview](x: Self) {
    
    inline def setAssociationStatusAggregatedCount(value: AssociationStatusAggregatedCount): Self = StObject.set(x, "AssociationStatusAggregatedCount", value.asInstanceOf[js.Any])
    
    inline def setAssociationStatusAggregatedCountUndefined: Self = StObject.set(x, "AssociationStatusAggregatedCount", js.undefined)
    
    inline def setDetailedStatus(value: StatusName): Self = StObject.set(x, "DetailedStatus", value.asInstanceOf[js.Any])
    
    inline def setDetailedStatusUndefined: Self = StObject.set(x, "DetailedStatus", js.undefined)
    
    inline def setStatus(value: StatusName): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
