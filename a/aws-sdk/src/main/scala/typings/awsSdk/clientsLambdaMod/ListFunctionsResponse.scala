package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFunctionsResponse extends StObject {
  
  /**
    * A list of Lambda functions.
    */
  var Functions: js.UndefOr[FunctionList] = js.undefined
  
  /**
    * The pagination token that's included if more results are available.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
}
object ListFunctionsResponse {
  
  inline def apply(): ListFunctionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFunctionsResponse]
  }
  
  extension [Self <: ListFunctionsResponse](x: Self) {
    
    inline def setFunctions(value: FunctionList): Self = StObject.set(x, "Functions", value.asInstanceOf[js.Any])
    
    inline def setFunctionsUndefined: Self = StObject.set(x, "Functions", js.undefined)
    
    inline def setFunctionsVarargs(value: FunctionConfiguration*): Self = StObject.set(x, "Functions", js.Array(value*))
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
