package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOriginRequestPolicyResult extends StObject {
  
  /**
    * The current version of the origin request policy.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * The origin request policy.
    */
  var OriginRequestPolicy: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.OriginRequestPolicy] = js.undefined
}
object GetOriginRequestPolicyResult {
  
  inline def apply(): GetOriginRequestPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOriginRequestPolicyResult]
  }
  
  extension [Self <: GetOriginRequestPolicyResult](x: Self) {
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setOriginRequestPolicy(value: OriginRequestPolicy): Self = StObject.set(x, "OriginRequestPolicy", value.asInstanceOf[js.Any])
    
    inline def setOriginRequestPolicyUndefined: Self = StObject.set(x, "OriginRequestPolicy", js.undefined)
  }
}
