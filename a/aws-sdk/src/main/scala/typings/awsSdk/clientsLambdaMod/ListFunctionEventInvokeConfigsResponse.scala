package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFunctionEventInvokeConfigsResponse extends StObject {
  
  /**
    * A list of configurations.
    */
  var FunctionEventInvokeConfigs: js.UndefOr[FunctionEventInvokeConfigList] = js.undefined
  
  /**
    * The pagination token that's included if more results are available.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
}
object ListFunctionEventInvokeConfigsResponse {
  
  inline def apply(): ListFunctionEventInvokeConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFunctionEventInvokeConfigsResponse]
  }
  
  extension [Self <: ListFunctionEventInvokeConfigsResponse](x: Self) {
    
    inline def setFunctionEventInvokeConfigs(value: FunctionEventInvokeConfigList): Self = StObject.set(x, "FunctionEventInvokeConfigs", value.asInstanceOf[js.Any])
    
    inline def setFunctionEventInvokeConfigsUndefined: Self = StObject.set(x, "FunctionEventInvokeConfigs", js.undefined)
    
    inline def setFunctionEventInvokeConfigsVarargs(value: FunctionEventInvokeConfig*): Self = StObject.set(x, "FunctionEventInvokeConfigs", js.Array(value*))
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
