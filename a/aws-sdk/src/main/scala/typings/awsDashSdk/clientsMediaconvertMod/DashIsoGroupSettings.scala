package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashIsoGroupSettings extends js.Object {
  /**
    * By default, the service creates one .mpd DASH manifest for each DASH ISO output group in your job. This default manifest references every output in the output group. To create additional DASH manifests that reference a subset of the outputs in the output group, specify a list of them here.
    */
  var AdditionalManifests: js.UndefOr[__listOfDashAdditionalManifest] = js.native
  /**
    * A partial URI prefix that will be put in the manifest (.mpd) file at the top level BaseURL element. Can be used if streams are delivered from a different URL than the manifest file.
    */
  var BaseUrl: js.UndefOr[__string] = js.native
  /**
    * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the input file. If your job has multiple inputs, the service uses the filename of the first input file.
    */
  var Destination: js.UndefOr[__stringPatternS3] = js.native
  /**
    * Settings associated with the destination. Will vary based on the type of destination
    */
  var DestinationSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.DestinationSettings] = js.native
  /**
    * DRM settings.
    */
  var Encryption: js.UndefOr[DashIsoEncryptionSettings] = js.native
  /**
    * Length of fragments to generate (in seconds). Fragment length must be compatible with GOP size and Framerate. Note that fragments will end on the next keyframe after this number of seconds, so actual fragment length may be longer. When Emit Single File is checked, the fragmentation is internal to a single output file and it does not cause the creation of many output files as in other output types.
    */
  var FragmentLength: js.UndefOr[__integerMin1Max2147483647] = js.native
  /**
    * Supports HbbTV specification as indicated
    */
  var HbbtvCompliance: js.UndefOr[DashIsoHbbtvCompliance] = js.native
  /**
    * Minimum time of initially buffered media that is needed to ensure smooth playout.
    */
  var MinBufferTime: js.UndefOr[__integerMin0Max2147483647] = js.native
  /**
    * Specify whether your DASH profile is on-demand or main. When you choose Main profile (MAIN_PROFILE), the service signals  urn:mpeg:dash:profile:isoff-main:2011 in your .mpd DASH manifest. When you choose On-demand (ON_DEMAND_PROFILE), the service signals urn:mpeg:dash:profile:isoff-on-demand:2011 in your .mpd. When you choose On-demand, you must also set the output group setting Segment control (SegmentControl) to Single file (SINGLE_FILE).
    */
  var MpdProfile: js.UndefOr[DashIsoMpdProfile] = js.native
  /**
    * When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
    */
  var SegmentControl: js.UndefOr[DashIsoSegmentControl] = js.native
  /**
    * Length of mpd segments to create (in seconds). Note that segments will end on the next keyframe after this number of seconds, so actual segment length may be longer. When Emit Single File is checked, the segmentation is internal to a single output file and it does not cause the creation of many output files as in other output types.
    */
  var SegmentLength: js.UndefOr[__integerMin1Max2147483647] = js.native
  /**
    * If you get an HTTP error in the 400 range when you play back your DASH output, enable this setting and run your transcoding job again. When you enable this setting, the service writes precise segment durations in the DASH manifest. The segment duration information appears inside the SegmentTimeline element, inside SegmentTemplate at the Representation level. When you don't enable this setting, the service writes approximate segment durations in your DASH manifest.
    */
  var WriteSegmentTimelineInRepresentation: js.UndefOr[DashIsoWriteSegmentTimelineInRepresentation] = js.native
}

object DashIsoGroupSettings {
  @scala.inline
  def apply(
    AdditionalManifests: __listOfDashAdditionalManifest = null,
    BaseUrl: __string = null,
    Destination: __stringPatternS3 = null,
    DestinationSettings: DestinationSettings = null,
    Encryption: DashIsoEncryptionSettings = null,
    FragmentLength: Int | Double = null,
    HbbtvCompliance: DashIsoHbbtvCompliance = null,
    MinBufferTime: Int | Double = null,
    MpdProfile: DashIsoMpdProfile = null,
    SegmentControl: DashIsoSegmentControl = null,
    SegmentLength: Int | Double = null,
    WriteSegmentTimelineInRepresentation: DashIsoWriteSegmentTimelineInRepresentation = null
  ): DashIsoGroupSettings = {
    val __obj = js.Dynamic.literal()
    if (AdditionalManifests != null) __obj.updateDynamic("AdditionalManifests")(AdditionalManifests.asInstanceOf[js.Any])
    if (BaseUrl != null) __obj.updateDynamic("BaseUrl")(BaseUrl.asInstanceOf[js.Any])
    if (Destination != null) __obj.updateDynamic("Destination")(Destination.asInstanceOf[js.Any])
    if (DestinationSettings != null) __obj.updateDynamic("DestinationSettings")(DestinationSettings.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (FragmentLength != null) __obj.updateDynamic("FragmentLength")(FragmentLength.asInstanceOf[js.Any])
    if (HbbtvCompliance != null) __obj.updateDynamic("HbbtvCompliance")(HbbtvCompliance.asInstanceOf[js.Any])
    if (MinBufferTime != null) __obj.updateDynamic("MinBufferTime")(MinBufferTime.asInstanceOf[js.Any])
    if (MpdProfile != null) __obj.updateDynamic("MpdProfile")(MpdProfile.asInstanceOf[js.Any])
    if (SegmentControl != null) __obj.updateDynamic("SegmentControl")(SegmentControl.asInstanceOf[js.Any])
    if (SegmentLength != null) __obj.updateDynamic("SegmentLength")(SegmentLength.asInstanceOf[js.Any])
    if (WriteSegmentTimelineInRepresentation != null) __obj.updateDynamic("WriteSegmentTimelineInRepresentation")(WriteSegmentTimelineInRepresentation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashIsoGroupSettings]
  }
}

