package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFunctionRequest extends StObject {
  
  /**
    * The function code. For more information about writing a CloudFront function, see Writing function code for CloudFront Functions in the Amazon CloudFront Developer Guide.
    */
  var FunctionCode: FunctionBlob
  
  /**
    * Configuration information about the function.
    */
  var FunctionConfig: typings.awsSdk.clientsCloudfrontMod.FunctionConfig
  
  /**
    * The current version (ETag value) of the function that you are updating, which you can get using DescribeFunction.
    */
  var IfMatch: String
  
  /**
    * The name of the function that you are updating.
    */
  var Name: String
}
object UpdateFunctionRequest {
  
  inline def apply(FunctionCode: FunctionBlob, FunctionConfig: FunctionConfig, IfMatch: String, Name: String): UpdateFunctionRequest = {
    val __obj = js.Dynamic.literal(FunctionCode = FunctionCode.asInstanceOf[js.Any], FunctionConfig = FunctionConfig.asInstanceOf[js.Any], IfMatch = IfMatch.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFunctionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFunctionRequest] (val x: Self) extends AnyVal {
    
    inline def setFunctionCode(value: FunctionBlob): Self = StObject.set(x, "FunctionCode", value.asInstanceOf[js.Any])
    
    inline def setFunctionConfig(value: FunctionConfig): Self = StObject.set(x, "FunctionConfig", value.asInstanceOf[js.Any])
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
