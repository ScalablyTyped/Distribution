package typings.awsLambda.anon

import typings.awsLambda.commonCloudfrontMod.CloudFrontFunctionsCookies
import typings.awsLambda.commonCloudfrontMod.CloudFrontFunctionsHeaders
import typings.awsLambda.commonCloudfrontMod.CloudFrontFunctionsQuerystring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cookies extends StObject {
  
  /**
    * An object that represents the cookies in the request (`Cookie` headers).
    *
    * The `cookies` object contains one field for each cookie in the request. Cookie names are converted to lowercase.
    */
  var cookies: CloudFrontFunctionsCookies
  
  /**
    * An object that represents the HTTP headers in the request. If the request contains any `Cookie` headers,
    * those headers are not part of the `headers` object. Cookies are represented separately in the `cookies` object.
    *
    * The `headers` object contains one field for each header in the request. Header names are converted to lowercase.
    */
  var headers: CloudFrontFunctionsHeaders
  
  /** The HTTP method of the request. If your function code returns a `request`, it cannot modify this field. This is the only read-only field in the `request` object. */
  var method: String
  
  /**
    * An object that represents the query string in the request. If the request doesn’t include a query string,
    * the `request` object still includes an empty `querystring` object.
    *
    * The `querystring` object contains one field for each query string parameter in the request.
    * Query string parameter names are converted to lowercase.
    */
  var querystring: CloudFrontFunctionsQuerystring
  
  /**
    * The relative path of the requested object. If your function modifies the `uri value, note the following:
    * - The new `uri` value must begin with a forward slash (`/`)`.
    * - When a function changes the `uri` value, it changes the object that the viewer is requesting.
    * - When a function changes the `uri` value, it doesn’t change the cache behavior for the request or the origin that an origin request is sent to.
    */
  var uri: String
}
object Cookies {
  
  inline def apply(
    cookies: CloudFrontFunctionsCookies,
    headers: CloudFrontFunctionsHeaders,
    method: String,
    querystring: CloudFrontFunctionsQuerystring,
    uri: String
  ): Cookies = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], querystring = querystring.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookies]
  }
  
  extension [Self <: Cookies](x: Self) {
    
    inline def setCookies(value: CloudFrontFunctionsCookies): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: CloudFrontFunctionsHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setQuerystring(value: CloudFrontFunctionsQuerystring): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
