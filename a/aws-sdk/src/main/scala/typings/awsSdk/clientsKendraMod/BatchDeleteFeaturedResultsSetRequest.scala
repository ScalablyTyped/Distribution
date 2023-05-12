package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteFeaturedResultsSetRequest extends StObject {
  
  /**
    * The identifiers of the featured results sets that you want to delete.
    */
  var FeaturedResultsSetIds: FeaturedResultsSetIdList
  
  /**
    * The identifier of the index used for featuring results.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
}
object BatchDeleteFeaturedResultsSetRequest {
  
  inline def apply(FeaturedResultsSetIds: FeaturedResultsSetIdList, IndexId: IndexId): BatchDeleteFeaturedResultsSetRequest = {
    val __obj = js.Dynamic.literal(FeaturedResultsSetIds = FeaturedResultsSetIds.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteFeaturedResultsSetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDeleteFeaturedResultsSetRequest] (val x: Self) extends AnyVal {
    
    inline def setFeaturedResultsSetIds(value: FeaturedResultsSetIdList): Self = StObject.set(x, "FeaturedResultsSetIds", value.asInstanceOf[js.Any])
    
    inline def setFeaturedResultsSetIdsVarargs(value: FeaturedResultsSetId*): Self = StObject.set(x, "FeaturedResultsSetIds", js.Array(value*))
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
  }
}
