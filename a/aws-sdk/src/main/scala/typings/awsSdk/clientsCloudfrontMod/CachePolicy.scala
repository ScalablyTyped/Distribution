package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CachePolicy extends StObject {
  
  /**
    * The cache policy configuration.
    */
  var CachePolicyConfig: typings.awsSdk.clientsCloudfrontMod.CachePolicyConfig
  
  /**
    * The unique identifier for the cache policy.
    */
  var Id: String
  
  /**
    * The date and time when the cache policy was last modified.
    */
  var LastModifiedTime: js.Date
}
object CachePolicy {
  
  inline def apply(CachePolicyConfig: CachePolicyConfig, Id: String, LastModifiedTime: js.Date): CachePolicy = {
    val __obj = js.Dynamic.literal(CachePolicyConfig = CachePolicyConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachePolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CachePolicy] (val x: Self) extends AnyVal {
    
    inline def setCachePolicyConfig(value: CachePolicyConfig): Self = StObject.set(x, "CachePolicyConfig", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
  }
}
