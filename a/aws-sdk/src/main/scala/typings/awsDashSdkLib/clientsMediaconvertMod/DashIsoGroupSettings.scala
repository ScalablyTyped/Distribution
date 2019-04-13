package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashIsoGroupSettings extends js.Object {
  /**
    * A partial URI prefix that will be put in the manifest (.mpd) file at the top level BaseURL element. Can be used if streams are delivered from a different URL than the manifest file.
    */
  var BaseUrl: js.UndefOr[__string] = js.undefined
  /**
    * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the input file. If your job has multiple inputs, the service uses the filename of the first input file.
    */
  var Destination: js.UndefOr[__stringPatternS3] = js.undefined
  /**
    * Settings associated with the destination. Will vary based on the type of destination
    */
  var DestinationSettings: js.UndefOr[DestinationSettings] = js.undefined
  /**
    * DRM settings.
    */
  var Encryption: js.UndefOr[DashIsoEncryptionSettings] = js.undefined
  /**
    * Length of fragments to generate (in seconds). Fragment length must be compatible with GOP size and Framerate. Note that fragments will end on the next keyframe after this number of seconds, so actual fragment length may be longer. When Emit Single File is checked, the fragmentation is internal to a single output file and it does not cause the creation of many output files as in other output types.
    */
  var FragmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined
  /**
    * Supports HbbTV specification as indicated
    */
  var HbbtvCompliance: js.UndefOr[DashIsoHbbtvCompliance] = js.undefined
  /**
    * Minimum time of initially buffered media that is needed to ensure smooth playout.
    */
  var MinBufferTime: js.UndefOr[__integerMin0Max2147483647] = js.undefined
  /**
    * When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
    */
  var SegmentControl: js.UndefOr[DashIsoSegmentControl] = js.undefined
  /**
    * Length of mpd segments to create (in seconds). Note that segments will end on the next keyframe after this number of seconds, so actual segment length may be longer. When Emit Single File is checked, the segmentation is internal to a single output file and it does not cause the creation of many output files as in other output types.
    */
  var SegmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined
  /**
    * When you enable Precise segment duration in manifests (writeSegmentTimelineInRepresentation), your DASH manifest shows precise segment durations. The segment duration information appears inside the SegmentTimeline element, inside SegmentTemplate at the Representation level. When this feature isn't enabled, the segment durations in your DASH manifest are approximate. The segment duration information appears in the duration attribute of the SegmentTemplate element.
    */
  var WriteSegmentTimelineInRepresentation: js.UndefOr[DashIsoWriteSegmentTimelineInRepresentation] = js.undefined
}

object DashIsoGroupSettings {
  @scala.inline
  def apply(
    BaseUrl: __string = null,
    Destination: __stringPatternS3 = null,
    DestinationSettings: DestinationSettings = null,
    Encryption: DashIsoEncryptionSettings = null,
    FragmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
    HbbtvCompliance: DashIsoHbbtvCompliance = null,
    MinBufferTime: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
    SegmentControl: DashIsoSegmentControl = null,
    SegmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
    WriteSegmentTimelineInRepresentation: DashIsoWriteSegmentTimelineInRepresentation = null
  ): DashIsoGroupSettings = {
    val __obj = js.Dynamic.literal()
    if (BaseUrl != null) __obj.updateDynamic("BaseUrl")(BaseUrl)
    if (Destination != null) __obj.updateDynamic("Destination")(Destination)
    if (DestinationSettings != null) __obj.updateDynamic("DestinationSettings")(DestinationSettings)
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    if (!js.isUndefined(FragmentLength)) __obj.updateDynamic("FragmentLength")(FragmentLength)
    if (HbbtvCompliance != null) __obj.updateDynamic("HbbtvCompliance")(HbbtvCompliance.asInstanceOf[js.Any])
    if (!js.isUndefined(MinBufferTime)) __obj.updateDynamic("MinBufferTime")(MinBufferTime)
    if (SegmentControl != null) __obj.updateDynamic("SegmentControl")(SegmentControl.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentLength)) __obj.updateDynamic("SegmentLength")(SegmentLength)
    if (WriteSegmentTimelineInRepresentation != null) __obj.updateDynamic("WriteSegmentTimelineInRepresentation")(WriteSegmentTimelineInRepresentation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashIsoGroupSettings]
  }
}

