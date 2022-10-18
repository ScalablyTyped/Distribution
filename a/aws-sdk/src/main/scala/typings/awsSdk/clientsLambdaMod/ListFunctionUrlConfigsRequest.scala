package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFunctionUrlConfigsRequest extends StObject {
  
  /**
    * The name of the Lambda function.  Name formats     Function name - my-function.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsSdk.clientsLambdaMod.FunctionName
  
  /**
    * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of function URLs to return in the response. Note that ListFunctionUrlConfigs returns a maximum of 50 items in each response, even if you set the number higher.
    */
  var MaxItems: js.UndefOr[typings.awsSdk.clientsLambdaMod.MaxItems] = js.undefined
}
object ListFunctionUrlConfigsRequest {
  
  inline def apply(FunctionName: FunctionName): ListFunctionUrlConfigsRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFunctionUrlConfigsRequest]
  }
  
  extension [Self <: ListFunctionUrlConfigsRequest](x: Self) {
    
    inline def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: MaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}
