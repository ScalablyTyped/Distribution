package typings.awsLambda.anon

import typings.awsLambda.commonCloudfrontMod.CloudFrontFunctionsCookies
import typings.awsLambda.commonCloudfrontMod.CloudFrontFunctionsHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headers extends StObject {
  
  /**
    * An object that represents the cookies in the response (`Set-Cookie` headers).
    * The `cookies` object contains one field for each cookie in the response. Cookie names are converted to lowercase.
    */
  var cookies: CloudFrontFunctionsCookies
  
  /**
    * An object that represents the HTTP headers in the response. If the response contains any `Set-Cookie` headers,
    * those `headers` are not part of the headers object. Cookies are represented separately in the `cookies` object.
    *
    * The `headers` object contains one field for each header in the response. Header names are converted to lowercase.
    */
  var headers: CloudFrontFunctionsHeaders
  
  /**
    * The HTTP status code of the response. This value is an integer, not a string.
    *
    * If the function is associated with a _viewer response_ event type, your function code cannot change
    * the `statusCode` that it received. If the function is associated with a _viewer request_ event type
    * and [generates an HTTP response](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/writing-function-code.html#function-code-generate-response),
    * your function code can set the `statusCode`.
    */
  var statusCode: Double
  
  /** The HTTP status description of the response. If your function code generates a response, this field is optional. */
  var statusDescription: js.UndefOr[String] = js.undefined
}
object Headers {
  
  inline def apply(cookies: CloudFrontFunctionsCookies, headers: CloudFrontFunctionsHeaders, statusCode: Double): Headers = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
    
    inline def setCookies(value: CloudFrontFunctionsCookies): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: CloudFrontFunctionsHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusDescription(value: String): Self = StObject.set(x, "statusDescription", value.asInstanceOf[js.Any])
    
    inline def setStatusDescriptionUndefined: Self = StObject.set(x, "statusDescription", js.undefined)
  }
}
