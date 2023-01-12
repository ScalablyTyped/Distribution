package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketsAggregationType extends StObject {
  
  /**
    * Performs an aggregation that will return a list of buckets. The list of buckets is a ranked list of the number of occurrences of an aggregation field value.
    */
  var termsAggregation: js.UndefOr[TermsAggregation] = js.undefined
}
object BucketsAggregationType {
  
  inline def apply(): BucketsAggregationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketsAggregationType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BucketsAggregationType] (val x: Self) extends AnyVal {
    
    inline def setTermsAggregation(value: TermsAggregation): Self = StObject.set(x, "termsAggregation", value.asInstanceOf[js.Any])
    
    inline def setTermsAggregationUndefined: Self = StObject.set(x, "termsAggregation", js.undefined)
  }
}
