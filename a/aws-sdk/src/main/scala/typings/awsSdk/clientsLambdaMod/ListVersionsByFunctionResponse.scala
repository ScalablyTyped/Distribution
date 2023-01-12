package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVersionsByFunctionResponse extends StObject {
  
  /**
    * The pagination token that's included if more results are available.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
  
  /**
    * A list of Lambda function versions.
    */
  var Versions: js.UndefOr[FunctionList] = js.undefined
}
object ListVersionsByFunctionResponse {
  
  inline def apply(): ListVersionsByFunctionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVersionsByFunctionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVersionsByFunctionResponse] (val x: Self) extends AnyVal {
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setVersions(value: FunctionList): Self = StObject.set(x, "Versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "Versions", js.undefined)
    
    inline def setVersionsVarargs(value: FunctionConfiguration*): Self = StObject.set(x, "Versions", js.Array(value*))
  }
}
