package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginRequestPolicyQueryStringsConfig extends StObject {
  
  /**
    * Determines whether any URL query strings in viewer requests are included in requests that CloudFront sends to the origin. Valid values are:    none – No query strings in viewer requests are included in requests that CloudFront sends to the origin. Even when this field is set to none, any query strings that are listed in a CachePolicy are included in origin requests.    whitelist – Only the query strings in viewer requests that are listed in the QueryStringNames type are included in requests that CloudFront sends to the origin.    all – All query strings in viewer requests are included in requests that CloudFront sends to the origin.    allExcept – All query strings in viewer requests are included in requests that CloudFront sends to the origin,  except  for those listed in the QueryStringNames type, which are not included.  
    */
  var QueryStringBehavior: OriginRequestPolicyQueryStringBehavior
  
  /**
    * Contains the specific query strings in viewer requests that either  are  or  are not  included in requests that CloudFront sends to the origin. The behavior depends on whether the QueryStringBehavior field in the OriginRequestPolicyQueryStringsConfig type is set to whitelist (the listed query strings  are  included) or allExcept (the listed query strings  are not  included, but all other query strings are).
    */
  var QueryStrings: js.UndefOr[QueryStringNames] = js.undefined
}
object OriginRequestPolicyQueryStringsConfig {
  
  inline def apply(QueryStringBehavior: OriginRequestPolicyQueryStringBehavior): OriginRequestPolicyQueryStringsConfig = {
    val __obj = js.Dynamic.literal(QueryStringBehavior = QueryStringBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginRequestPolicyQueryStringsConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OriginRequestPolicyQueryStringsConfig] (val x: Self) extends AnyVal {
    
    inline def setQueryStringBehavior(value: OriginRequestPolicyQueryStringBehavior): Self = StObject.set(x, "QueryStringBehavior", value.asInstanceOf[js.Any])
    
    inline def setQueryStrings(value: QueryStringNames): Self = StObject.set(x, "QueryStrings", value.asInstanceOf[js.Any])
    
    inline def setQueryStringsUndefined: Self = StObject.set(x, "QueryStrings", js.undefined)
  }
}
