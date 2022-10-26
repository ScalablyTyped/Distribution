package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CdnConfiguration extends StObject {
  
  /**
    * A non-default content delivery network (CDN) to serve ad segments. By default, AWS Elemental MediaTailor uses Amazon CloudFront with default cache settings as its CDN for ad segments. To set up an alternate CDN, create a rule in your CDN for the origin ads.mediatailor.&lt;region&gt;.amazonaws.com. Then specify the rule's name in this AdSegmentUrlPrefix. When AWS Elemental MediaTailor serves a manifest, it reports your CDN as the source for ad segments.
    */
  var AdSegmentUrlPrefix: js.UndefOr[string] = js.undefined
  
  /**
    * A content delivery network (CDN) to cache content segments, so that content requests don’t always have to go to the origin server. First, create a rule in your CDN for the content segment origin server. Then specify the rule's name in this ContentSegmentUrlPrefix. When AWS Elemental MediaTailor serves a manifest, it reports your CDN as the source for content segments.
    */
  var ContentSegmentUrlPrefix: js.UndefOr[string] = js.undefined
}
object CdnConfiguration {
  
  inline def apply(): CdnConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CdnConfiguration]
  }
  
  extension [Self <: CdnConfiguration](x: Self) {
    
    inline def setAdSegmentUrlPrefix(value: string): Self = StObject.set(x, "AdSegmentUrlPrefix", value.asInstanceOf[js.Any])
    
    inline def setAdSegmentUrlPrefixUndefined: Self = StObject.set(x, "AdSegmentUrlPrefix", js.undefined)
    
    inline def setContentSegmentUrlPrefix(value: string): Self = StObject.set(x, "ContentSegmentUrlPrefix", value.asInstanceOf[js.Any])
    
    inline def setContentSegmentUrlPrefixUndefined: Self = StObject.set(x, "ContentSegmentUrlPrefix", js.undefined)
  }
}
