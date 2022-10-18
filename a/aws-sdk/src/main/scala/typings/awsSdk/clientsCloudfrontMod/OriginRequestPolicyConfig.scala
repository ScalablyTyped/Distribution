package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginRequestPolicyConfig extends StObject {
  
  /**
    * A comment to describe the origin request policy. The comment cannot be longer than 128 characters.
    */
  var Comment: js.UndefOr[String] = js.undefined
  
  /**
    * The cookies from viewer requests to include in origin requests.
    */
  var CookiesConfig: OriginRequestPolicyCookiesConfig
  
  /**
    * The HTTP headers to include in origin requests. These can include headers from viewer requests and additional headers added by CloudFront.
    */
  var HeadersConfig: OriginRequestPolicyHeadersConfig
  
  /**
    * A unique name to identify the origin request policy.
    */
  var Name: String
  
  /**
    * The URL query strings from viewer requests to include in origin requests.
    */
  var QueryStringsConfig: OriginRequestPolicyQueryStringsConfig
}
object OriginRequestPolicyConfig {
  
  inline def apply(
    CookiesConfig: OriginRequestPolicyCookiesConfig,
    HeadersConfig: OriginRequestPolicyHeadersConfig,
    Name: String,
    QueryStringsConfig: OriginRequestPolicyQueryStringsConfig
  ): OriginRequestPolicyConfig = {
    val __obj = js.Dynamic.literal(CookiesConfig = CookiesConfig.asInstanceOf[js.Any], HeadersConfig = HeadersConfig.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], QueryStringsConfig = QueryStringsConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginRequestPolicyConfig]
  }
  
  extension [Self <: OriginRequestPolicyConfig](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setCookiesConfig(value: OriginRequestPolicyCookiesConfig): Self = StObject.set(x, "CookiesConfig", value.asInstanceOf[js.Any])
    
    inline def setHeadersConfig(value: OriginRequestPolicyHeadersConfig): Self = StObject.set(x, "HeadersConfig", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setQueryStringsConfig(value: OriginRequestPolicyQueryStringsConfig): Self = StObject.set(x, "QueryStringsConfig", value.asInstanceOf[js.Any])
  }
}
