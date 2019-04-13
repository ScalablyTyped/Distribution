package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CmafGroupSettings extends js.Object {
  /**
    * A partial URI prefix that will be put in the manifest file at the top level BaseURL element. Can be used if streams are delivered from a different URL than the manifest file.
    */
  var BaseUrl: js.UndefOr[__string] = js.undefined
  /**
    * When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents client from saving media segments for later replay.
    */
  var ClientCache: js.UndefOr[CmafClientCache] = js.undefined
  /**
    * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
    */
  var CodecSpecification: js.UndefOr[CmafCodecSpecification] = js.undefined
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
  var Encryption: js.UndefOr[CmafEncryptionSettings] = js.undefined
  /**
    * Length of fragments to generate (in seconds). Fragment length must be compatible with GOP size and Framerate. Note that fragments will end on the next keyframe after this number of seconds, so actual fragment length may be longer. When Emit Single File is checked, the fragmentation is internal to a single output file and it does not cause the creation of many output files as in other output types.
    */
  var FragmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined
  /**
    * When set to GZIP, compresses HLS playlist.
    */
  var ManifestCompression: js.UndefOr[CmafManifestCompression] = js.undefined
  /**
    * Indicates whether the output manifest should use floating point values for segment duration.
    */
  var ManifestDurationFormat: js.UndefOr[CmafManifestDurationFormat] = js.undefined
  /**
    * Minimum time of initially buffered media that is needed to ensure smooth playout.
    */
  var MinBufferTime: js.UndefOr[__integerMin0Max2147483647] = js.undefined
  /**
    * Keep this setting at the default value of 0, unless you are troubleshooting a problem with how devices play back the end of your video asset. If you know that player devices are hanging on the final segment of your video because the length of your final segment is too short, use this setting to specify a minimum final segment length, in seconds. Choose a value that is greater than or equal to 1 and less than your segment length. When you specify a value for this setting, the encoder will combine any final segment that is shorter than the length that you specify with the previous segment. For example, your segment length is 3 seconds and your final segment is .5 seconds without a minimum final segment length; when you set the minimum final segment length to 1, your final segment is 3.5 seconds.
    */
  var MinFinalSegmentLength: js.UndefOr[__doubleMin0Max2147483647] = js.undefined
  /**
    * When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
    */
  var SegmentControl: js.UndefOr[CmafSegmentControl] = js.undefined
  /**
    * Use this setting to specify the length, in seconds, of each individual CMAF segment. This value applies to the whole package; that is, to every output in the output group. Note that segments end on the first keyframe after this number of seconds, so the actual segment length might be slightly longer. If you set Segment control (CmafSegmentControl) to single file, the service puts the content of each output in a single file that has metadata that marks these segments. If you set it to segmented files, the service creates multiple files for each output, each with the content of one segment.
    */
  var SegmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined
  /**
    * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
    */
  var StreamInfResolution: js.UndefOr[CmafStreamInfResolution] = js.undefined
  /**
    * When set to ENABLED, a DASH MPD manifest will be generated for this output.
    */
  var WriteDashManifest: js.UndefOr[CmafWriteDASHManifest] = js.undefined
  /**
    * When set to ENABLED, an Apple HLS manifest will be generated for this output.
    */
  var WriteHlsManifest: js.UndefOr[CmafWriteHLSManifest] = js.undefined
}

object CmafGroupSettings {
  @scala.inline
  def apply(
    BaseUrl: __string = null,
    ClientCache: CmafClientCache = null,
    CodecSpecification: CmafCodecSpecification = null,
    Destination: __stringPatternS3 = null,
    DestinationSettings: DestinationSettings = null,
    Encryption: CmafEncryptionSettings = null,
    FragmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
    ManifestCompression: CmafManifestCompression = null,
    ManifestDurationFormat: CmafManifestDurationFormat = null,
    MinBufferTime: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
    MinFinalSegmentLength: js.UndefOr[__doubleMin0Max2147483647] = js.undefined,
    SegmentControl: CmafSegmentControl = null,
    SegmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
    StreamInfResolution: CmafStreamInfResolution = null,
    WriteDashManifest: CmafWriteDASHManifest = null,
    WriteHlsManifest: CmafWriteHLSManifest = null
  ): CmafGroupSettings = {
    val __obj = js.Dynamic.literal()
    if (BaseUrl != null) __obj.updateDynamic("BaseUrl")(BaseUrl)
    if (ClientCache != null) __obj.updateDynamic("ClientCache")(ClientCache.asInstanceOf[js.Any])
    if (CodecSpecification != null) __obj.updateDynamic("CodecSpecification")(CodecSpecification.asInstanceOf[js.Any])
    if (Destination != null) __obj.updateDynamic("Destination")(Destination)
    if (DestinationSettings != null) __obj.updateDynamic("DestinationSettings")(DestinationSettings)
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    if (!js.isUndefined(FragmentLength)) __obj.updateDynamic("FragmentLength")(FragmentLength)
    if (ManifestCompression != null) __obj.updateDynamic("ManifestCompression")(ManifestCompression.asInstanceOf[js.Any])
    if (ManifestDurationFormat != null) __obj.updateDynamic("ManifestDurationFormat")(ManifestDurationFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(MinBufferTime)) __obj.updateDynamic("MinBufferTime")(MinBufferTime)
    if (!js.isUndefined(MinFinalSegmentLength)) __obj.updateDynamic("MinFinalSegmentLength")(MinFinalSegmentLength)
    if (SegmentControl != null) __obj.updateDynamic("SegmentControl")(SegmentControl.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentLength)) __obj.updateDynamic("SegmentLength")(SegmentLength)
    if (StreamInfResolution != null) __obj.updateDynamic("StreamInfResolution")(StreamInfResolution.asInstanceOf[js.Any])
    if (WriteDashManifest != null) __obj.updateDynamic("WriteDashManifest")(WriteDashManifest.asInstanceOf[js.Any])
    if (WriteHlsManifest != null) __obj.updateDynamic("WriteHlsManifest")(WriteHlsManifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmafGroupSettings]
  }
}

