package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeaturedResultsSetSummary extends StObject {
  
  /**
    * The Unix timestamp when the set of featured results was created.
    */
  var CreationTimestamp: js.UndefOr[Long] = js.undefined
  
  /**
    * The identifier of the set of featured results.
    */
  var FeaturedResultsSetId: js.UndefOr[typings.awsSdk.clientsKendraMod.FeaturedResultsSetId] = js.undefined
  
  /**
    * The name for the set of featured results.
    */
  var FeaturedResultsSetName: js.UndefOr[typings.awsSdk.clientsKendraMod.FeaturedResultsSetName] = js.undefined
  
  /**
    * The Unix timestamp when the set of featured results was last updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[Long] = js.undefined
  
  /**
    * The current status of the set of featured results. When the value is ACTIVE, featured results are ready for use. You can still configure your settings before setting the status to ACTIVE. You can set the status to ACTIVE or INACTIVE using the UpdateFeaturedResultsSet API. The queries you specify for featured results must be unique per featured results set for each index, whether the status is ACTIVE or INACTIVE.
    */
  var Status: js.UndefOr[FeaturedResultsSetStatus] = js.undefined
}
object FeaturedResultsSetSummary {
  
  inline def apply(): FeaturedResultsSetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeaturedResultsSetSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeaturedResultsSetSummary] (val x: Self) extends AnyVal {
    
    inline def setCreationTimestamp(value: Long): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    inline def setFeaturedResultsSetId(value: FeaturedResultsSetId): Self = StObject.set(x, "FeaturedResultsSetId", value.asInstanceOf[js.Any])
    
    inline def setFeaturedResultsSetIdUndefined: Self = StObject.set(x, "FeaturedResultsSetId", js.undefined)
    
    inline def setFeaturedResultsSetName(value: FeaturedResultsSetName): Self = StObject.set(x, "FeaturedResultsSetName", value.asInstanceOf[js.Any])
    
    inline def setFeaturedResultsSetNameUndefined: Self = StObject.set(x, "FeaturedResultsSetName", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: Long): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
    
    inline def setStatus(value: FeaturedResultsSetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
