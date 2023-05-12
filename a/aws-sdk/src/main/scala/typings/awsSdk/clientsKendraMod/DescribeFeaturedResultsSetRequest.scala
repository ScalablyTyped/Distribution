package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFeaturedResultsSetRequest extends StObject {
  
  /**
    * The identifier of the set of featured results that you want to get information on.
    */
  var FeaturedResultsSetId: typings.awsSdk.clientsKendraMod.FeaturedResultsSetId
  
  /**
    * The identifier of the index used for featuring results.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
}
object DescribeFeaturedResultsSetRequest {
  
  inline def apply(FeaturedResultsSetId: FeaturedResultsSetId, IndexId: IndexId): DescribeFeaturedResultsSetRequest = {
    val __obj = js.Dynamic.literal(FeaturedResultsSetId = FeaturedResultsSetId.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFeaturedResultsSetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFeaturedResultsSetRequest] (val x: Self) extends AnyVal {
    
    inline def setFeaturedResultsSetId(value: FeaturedResultsSetId): Self = StObject.set(x, "FeaturedResultsSetId", value.asInstanceOf[js.Any])
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
  }
}
