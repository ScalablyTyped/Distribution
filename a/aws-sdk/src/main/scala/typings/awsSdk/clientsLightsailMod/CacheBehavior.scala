package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheBehavior extends StObject {
  
  /**
    * The cache behavior of the distribution. The following cache behaviors can be specified:     cache  - This option is best for static sites. When specified, your distribution caches and serves your entire website as static content. This behavior is ideal for websites with static content that doesn't change depending on who views it, or for websites that don't use cookies, headers, or query strings to personalize content.     dont-cache  - This option is best for sites that serve a mix of static and dynamic content. When specified, your distribution caches and serve only the content that is specified in the distribution's CacheBehaviorPerPath parameter. This behavior is ideal for websites or web applications that use cookies, headers, and query strings to personalize content for individual users.  
    */
  var behavior: js.UndefOr[BehaviorEnum] = js.undefined
}
object CacheBehavior {
  
  inline def apply(): CacheBehavior = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheBehavior]
  }
  
  extension [Self <: CacheBehavior](x: Self) {
    
    inline def setBehavior(value: BehaviorEnum): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
  }
}
