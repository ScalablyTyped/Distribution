package typings
package awsDashSdkLib.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashPackage extends js.Object {
  var Encryption: js.UndefOr[DashEncryption] = js.undefined
  /**
    * Determines the position of some tags in the Media Presentation Description (MPD).  When set to FULL, elements like SegmentTemplate and ContentProtection are included in each Representation.  When set to COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
    */
  var ManifestLayout: js.UndefOr[ManifestLayout] = js.undefined
  /**
    * Time window (in seconds) contained in each manifest.
    */
  var ManifestWindowSeconds: js.UndefOr[__integer] = js.undefined
  /**
    * Minimum duration (in seconds) that a player will buffer media before starting the presentation.
    */
  var MinBufferTimeSeconds: js.UndefOr[__integer] = js.undefined
  /**
    * Minimum duration (in seconds) between potential changes to the Dynamic Adaptive Streaming over HTTP (DASH) Media Presentation Description (MPD).
    */
  var MinUpdatePeriodSeconds: js.UndefOr[__integer] = js.undefined
  /**
    * A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH)
  Media Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not
  be partitioned into more than one period. If the list contains "ADS", new periods will be created where
  the Channel source contains SCTE-35 ad markers.
    */
  var PeriodTriggers: js.UndefOr[__listOf__PeriodTriggersElement] = js.undefined
  /**
    * The Dynamic Adaptive Streaming over HTTP (DASH) profile type.  When set to "HBBTV_1_5", HbbTV 1.5 compliant output is enabled.
    */
  var Profile: js.UndefOr[Profile] = js.undefined
  /**
    * Duration (in seconds) of each segment. Actual segments will be
  rounded to the nearest multiple of the source segment duration.
    */
  var SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined
  /**
    * Determines the type of SegmentTemplate included in the Media Presentation Description (MPD).  When set to NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs.  When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
    */
  var SegmentTemplateFormat: js.UndefOr[SegmentTemplateFormat] = js.undefined
  var StreamSelection: js.UndefOr[StreamSelection] = js.undefined
  /**
    * Duration (in seconds) to delay live content before presentation.
    */
  var SuggestedPresentationDelaySeconds: js.UndefOr[__integer] = js.undefined
}

object DashPackage {
  @scala.inline
  def apply(
    Encryption: DashEncryption = null,
    ManifestLayout: ManifestLayout = null,
    ManifestWindowSeconds: js.UndefOr[__integer] = js.undefined,
    MinBufferTimeSeconds: js.UndefOr[__integer] = js.undefined,
    MinUpdatePeriodSeconds: js.UndefOr[__integer] = js.undefined,
    PeriodTriggers: __listOf__PeriodTriggersElement = null,
    Profile: Profile = null,
    SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined,
    SegmentTemplateFormat: SegmentTemplateFormat = null,
    StreamSelection: StreamSelection = null,
    SuggestedPresentationDelaySeconds: js.UndefOr[__integer] = js.undefined
  ): DashPackage = {
    val __obj = js.Dynamic.literal()
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    if (ManifestLayout != null) __obj.updateDynamic("ManifestLayout")(ManifestLayout.asInstanceOf[js.Any])
    if (!js.isUndefined(ManifestWindowSeconds)) __obj.updateDynamic("ManifestWindowSeconds")(ManifestWindowSeconds)
    if (!js.isUndefined(MinBufferTimeSeconds)) __obj.updateDynamic("MinBufferTimeSeconds")(MinBufferTimeSeconds)
    if (!js.isUndefined(MinUpdatePeriodSeconds)) __obj.updateDynamic("MinUpdatePeriodSeconds")(MinUpdatePeriodSeconds)
    if (PeriodTriggers != null) __obj.updateDynamic("PeriodTriggers")(PeriodTriggers)
    if (Profile != null) __obj.updateDynamic("Profile")(Profile.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentDurationSeconds)) __obj.updateDynamic("SegmentDurationSeconds")(SegmentDurationSeconds)
    if (SegmentTemplateFormat != null) __obj.updateDynamic("SegmentTemplateFormat")(SegmentTemplateFormat.asInstanceOf[js.Any])
    if (StreamSelection != null) __obj.updateDynamic("StreamSelection")(StreamSelection)
    if (!js.isUndefined(SuggestedPresentationDelaySeconds)) __obj.updateDynamic("SuggestedPresentationDelaySeconds")(SuggestedPresentationDelaySeconds)
    __obj.asInstanceOf[DashPackage]
  }
}

