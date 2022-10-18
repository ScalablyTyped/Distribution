package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TermsAggregation extends StObject {
  
  /**
    * The number of buckets to return in the response. Default to 10.
    */
  var maxBuckets: js.UndefOr[MaxBuckets] = js.undefined
}
object TermsAggregation {
  
  inline def apply(): TermsAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TermsAggregation]
  }
  
  extension [Self <: TermsAggregation](x: Self) {
    
    inline def setMaxBuckets(value: MaxBuckets): Self = StObject.set(x, "maxBuckets", value.asInstanceOf[js.Any])
    
    inline def setMaxBucketsUndefined: Self = StObject.set(x, "maxBuckets", js.undefined)
  }
}
