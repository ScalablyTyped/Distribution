package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashPackage extends js.Object {
  var AdTriggers: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.AdTriggers] = js.native
  var AdsOnDeliveryRestrictions: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.AdsOnDeliveryRestrictions] = js.native
  var Encryption: js.UndefOr[DashEncryption] = js.native
  /**
    * Determines the position of some tags in the Media Presentation Description (MPD).  When set to FULL, elements like SegmentTemplate and ContentProtection are included in each Representation.  When set to COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
    */
  var ManifestLayout: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.ManifestLayout] = js.native
  /**
    * Time window (in seconds) contained in each manifest.
    */
  var ManifestWindowSeconds: js.UndefOr[__integer] = js.native
  /**
    * Minimum duration (in seconds) that a player will buffer media before starting the presentation.
    */
  var MinBufferTimeSeconds: js.UndefOr[__integer] = js.native
  /**
    * Minimum duration (in seconds) between potential changes to the Dynamic Adaptive Streaming over HTTP (DASH) Media Presentation Description (MPD).
    */
  var MinUpdatePeriodSeconds: js.UndefOr[__integer] = js.native
  /**
    * A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH)
  Media Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not
  be partitioned into more than one period. If the list contains "ADS", new periods will be created where
  the Channel source contains SCTE-35 ad markers.
    */
  var PeriodTriggers: js.UndefOr[__listOf__PeriodTriggersElement] = js.native
  /**
    * The Dynamic Adaptive Streaming over HTTP (DASH) profile type.  When set to "HBBTV_1_5", HbbTV 1.5 compliant output is enabled.
    */
  var Profile: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.Profile] = js.native
  /**
    * Duration (in seconds) of each segment. Actual segments will be
  rounded to the nearest multiple of the source segment duration.
    */
  var SegmentDurationSeconds: js.UndefOr[__integer] = js.native
  /**
    * Determines the type of SegmentTemplate included in the Media Presentation Description (MPD).  When set to NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs.  When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
    */
  var SegmentTemplateFormat: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.SegmentTemplateFormat] = js.native
  var StreamSelection: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.StreamSelection] = js.native
  /**
    * Duration (in seconds) to delay live content before presentation.
    */
  var SuggestedPresentationDelaySeconds: js.UndefOr[__integer] = js.native
}

object DashPackage {
  @scala.inline
  def apply(
    AdTriggers: AdTriggers = null,
    AdsOnDeliveryRestrictions: AdsOnDeliveryRestrictions = null,
    Encryption: DashEncryption = null,
    ManifestLayout: ManifestLayout = null,
    ManifestWindowSeconds: Int | Double = null,
    MinBufferTimeSeconds: Int | Double = null,
    MinUpdatePeriodSeconds: Int | Double = null,
    PeriodTriggers: __listOf__PeriodTriggersElement = null,
    Profile: Profile = null,
    SegmentDurationSeconds: Int | Double = null,
    SegmentTemplateFormat: SegmentTemplateFormat = null,
    StreamSelection: StreamSelection = null,
    SuggestedPresentationDelaySeconds: Int | Double = null
  ): DashPackage = {
    val __obj = js.Dynamic.literal()
    if (AdTriggers != null) __obj.updateDynamic("AdTriggers")(AdTriggers.asInstanceOf[js.Any])
    if (AdsOnDeliveryRestrictions != null) __obj.updateDynamic("AdsOnDeliveryRestrictions")(AdsOnDeliveryRestrictions.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (ManifestLayout != null) __obj.updateDynamic("ManifestLayout")(ManifestLayout.asInstanceOf[js.Any])
    if (ManifestWindowSeconds != null) __obj.updateDynamic("ManifestWindowSeconds")(ManifestWindowSeconds.asInstanceOf[js.Any])
    if (MinBufferTimeSeconds != null) __obj.updateDynamic("MinBufferTimeSeconds")(MinBufferTimeSeconds.asInstanceOf[js.Any])
    if (MinUpdatePeriodSeconds != null) __obj.updateDynamic("MinUpdatePeriodSeconds")(MinUpdatePeriodSeconds.asInstanceOf[js.Any])
    if (PeriodTriggers != null) __obj.updateDynamic("PeriodTriggers")(PeriodTriggers.asInstanceOf[js.Any])
    if (Profile != null) __obj.updateDynamic("Profile")(Profile.asInstanceOf[js.Any])
    if (SegmentDurationSeconds != null) __obj.updateDynamic("SegmentDurationSeconds")(SegmentDurationSeconds.asInstanceOf[js.Any])
    if (SegmentTemplateFormat != null) __obj.updateDynamic("SegmentTemplateFormat")(SegmentTemplateFormat.asInstanceOf[js.Any])
    if (StreamSelection != null) __obj.updateDynamic("StreamSelection")(StreamSelection.asInstanceOf[js.Any])
    if (SuggestedPresentationDelaySeconds != null) __obj.updateDynamic("SuggestedPresentationDelaySeconds")(SuggestedPresentationDelaySeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashPackage]
  }
}

