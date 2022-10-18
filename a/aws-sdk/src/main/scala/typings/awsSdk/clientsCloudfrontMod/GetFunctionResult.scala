package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFunctionResult extends StObject {
  
  /**
    * The content type (media type) of the response.
    */
  var ContentType: js.UndefOr[String] = js.undefined
  
  /**
    * The version identifier for the current version of the CloudFront function.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * The function code of a CloudFront function.
    */
  var FunctionCode: js.UndefOr[FunctionBlob] = js.undefined
}
object GetFunctionResult {
  
  inline def apply(): GetFunctionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFunctionResult]
  }
  
  extension [Self <: GetFunctionResult](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setFunctionCode(value: FunctionBlob): Self = StObject.set(x, "FunctionCode", value.asInstanceOf[js.Any])
    
    inline def setFunctionCodeUndefined: Self = StObject.set(x, "FunctionCode", js.undefined)
  }
}
