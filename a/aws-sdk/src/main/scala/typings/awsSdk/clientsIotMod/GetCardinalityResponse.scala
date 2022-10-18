package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCardinalityResponse extends StObject {
  
  /**
    * The approximate count of unique values that match the query.
    */
  var cardinality: js.UndefOr[Count] = js.undefined
}
object GetCardinalityResponse {
  
  inline def apply(): GetCardinalityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCardinalityResponse]
  }
  
  extension [Self <: GetCardinalityResponse](x: Self) {
    
    inline def setCardinality(value: Count): Self = StObject.set(x, "cardinality", value.asInstanceOf[js.Any])
    
    inline def setCardinalityUndefined: Self = StObject.set(x, "cardinality", js.undefined)
  }
}
