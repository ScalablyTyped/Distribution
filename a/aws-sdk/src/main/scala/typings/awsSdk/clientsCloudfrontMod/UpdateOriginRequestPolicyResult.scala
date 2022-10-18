package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOriginRequestPolicyResult extends StObject {
  
  /**
    * The current version of the origin request policy.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * An origin request policy.
    */
  var OriginRequestPolicy: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.OriginRequestPolicy] = js.undefined
}
object UpdateOriginRequestPolicyResult {
  
  inline def apply(): UpdateOriginRequestPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOriginRequestPolicyResult]
  }
  
  extension [Self <: UpdateOriginRequestPolicyResult](x: Self) {
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setOriginRequestPolicy(value: OriginRequestPolicy): Self = StObject.set(x, "OriginRequestPolicy", value.asInstanceOf[js.Any])
    
    inline def setOriginRequestPolicyUndefined: Self = StObject.set(x, "OriginRequestPolicy", js.undefined)
  }
}
