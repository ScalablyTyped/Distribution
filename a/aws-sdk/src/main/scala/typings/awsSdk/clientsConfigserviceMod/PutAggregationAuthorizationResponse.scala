package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAggregationAuthorizationResponse extends StObject {
  
  /**
    * Returns an AggregationAuthorization object. 
    */
  var AggregationAuthorization: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.AggregationAuthorization] = js.undefined
}
object PutAggregationAuthorizationResponse {
  
  inline def apply(): PutAggregationAuthorizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAggregationAuthorizationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutAggregationAuthorizationResponse] (val x: Self) extends AnyVal {
    
    inline def setAggregationAuthorization(value: AggregationAuthorization): Self = StObject.set(x, "AggregationAuthorization", value.asInstanceOf[js.Any])
    
    inline def setAggregationAuthorizationUndefined: Self = StObject.set(x, "AggregationAuthorization", js.undefined)
  }
}
