package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReservedElasticsearchInstanceOfferingsResponse extends StObject {
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEsMod.NextToken] = js.undefined
  
  /**
    * List of reserved Elasticsearch instance offerings
    */
  var ReservedElasticsearchInstanceOfferings: js.UndefOr[ReservedElasticsearchInstanceOfferingList] = js.undefined
}
object DescribeReservedElasticsearchInstanceOfferingsResponse {
  
  inline def apply(): DescribeReservedElasticsearchInstanceOfferingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedElasticsearchInstanceOfferingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeReservedElasticsearchInstanceOfferingsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReservedElasticsearchInstanceOfferings(value: ReservedElasticsearchInstanceOfferingList): Self = StObject.set(x, "ReservedElasticsearchInstanceOfferings", value.asInstanceOf[js.Any])
    
    inline def setReservedElasticsearchInstanceOfferingsUndefined: Self = StObject.set(x, "ReservedElasticsearchInstanceOfferings", js.undefined)
    
    inline def setReservedElasticsearchInstanceOfferingsVarargs(value: ReservedElasticsearchInstanceOffering*): Self = StObject.set(x, "ReservedElasticsearchInstanceOfferings", js.Array(value*))
  }
}
