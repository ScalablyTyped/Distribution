package typings.awsDashSdk.clientsMediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CdnConfiguration extends js.Object {
  /**
    * A non-default content delivery network (CDN) to serve ad segments. By default, AWS Elemental MediaTailor uses Amazon CloudFront with default cache settings as its CDN for ad segments. To set up an alternate CDN, create a rule in your CDN for the following origin: ads.mediatailor.&lt;region>.amazonaws.com. Then specify the rule's name in this AdSegmentUrlPrefix. When AWS Elemental MediaTailor serves a manifest, it reports your CDN as the source for ad segments.
    */
  var AdSegmentUrlPrefix: js.UndefOr[__string] = js.undefined
  /**
    * A content delivery network (CDN) to cache content segments, so that content requests don’t always have to go to the origin server. First, create a rule in your CDN for the content segment origin server. Then specify the rule's name in this ContentSegmentUrlPrefix. When AWS Elemental MediaTailor serves a manifest, it reports your CDN as the source for content segments.
    */
  var ContentSegmentUrlPrefix: js.UndefOr[__string] = js.undefined
}

object CdnConfiguration {
  @scala.inline
  def apply(AdSegmentUrlPrefix: __string = null, ContentSegmentUrlPrefix: __string = null): CdnConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AdSegmentUrlPrefix != null) __obj.updateDynamic("AdSegmentUrlPrefix")(AdSegmentUrlPrefix)
    if (ContentSegmentUrlPrefix != null) __obj.updateDynamic("ContentSegmentUrlPrefix")(ContentSegmentUrlPrefix)
    __obj.asInstanceOf[CdnConfiguration]
  }
}

