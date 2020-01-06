package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobPlaylist extends js.Object {
  /**
    * The format of the output playlist. Valid formats include HLSv3, HLSv4, and Smooth.
    */
  var Format: js.UndefOr[PlaylistFormat] = js.native
  /**
    * The HLS content protection settings, if any, that you want Elastic Transcoder to apply to the output files associated with this playlist.
    */
  var HlsContentProtection: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.HlsContentProtection] = js.native
  /**
    * The name that you want Elastic Transcoder to assign to the master playlist, for example, nyc-vacation.m3u8. If the name includes a / character, the section of the name before the last / must be identical for all Name objects. If you create more than one master playlist, the values of all Name objects must be unique.   Elastic Transcoder automatically appends the relevant file extension to the file name (.m3u8 for HLSv3 and HLSv4 playlists, and .ism and .ismc for Smooth playlists). If you include a file extension in Name, the file name will have two extensions. 
    */
  var Name: js.UndefOr[Filename] = js.native
  /**
    * For each output in this job that you want to include in a master playlist, the value of the Outputs:Key object.    If your output is not HLS or does not have a segment duration set, the name of the output file is a concatenation of OutputKeyPrefix and Outputs:Key: OutputKeyPrefixOutputs:Key    If your output is HLSv3 and has a segment duration set, or is not included in a playlist, Elastic Transcoder creates an output playlist file with a file extension of .m3u8, and a series of .ts files that include a five-digit sequential counter beginning with 00000: OutputKeyPrefixOutputs:Key.m3u8 OutputKeyPrefixOutputs:Key00000.ts   If your output is HLSv4, has a segment duration set, and is included in an HLSv4 playlist, Elastic Transcoder creates an output playlist file with a file extension of _v4.m3u8. If the output is video, Elastic Transcoder also creates an output file with an extension of _iframe.m3u8: OutputKeyPrefixOutputs:Key_v4.m3u8 OutputKeyPrefixOutputs:Key_iframe.m3u8 OutputKeyPrefixOutputs:Key.ts   Elastic Transcoder automatically appends the relevant file extension to the file name. If you include a file extension in Output Key, the file name will have two extensions. If you include more than one output in a playlist, any segment duration settings, clip settings, or caption settings must be the same for all outputs in the playlist. For Smooth playlists, the Audio:Profile, Video:Profile, and Video:FrameRate to Video:KeyframesMaxDist ratio must be the same for all outputs.
    */
  var OutputKeys: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.OutputKeys] = js.native
  /**
    * The DRM settings, if any, that you want Elastic Transcoder to apply to the output files associated with this playlist.
    */
  var PlayReadyDrm: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.PlayReadyDrm] = js.native
}

object CreateJobPlaylist {
  @scala.inline
  def apply(
    Format: PlaylistFormat = null,
    HlsContentProtection: HlsContentProtection = null,
    Name: Filename = null,
    OutputKeys: OutputKeys = null,
    PlayReadyDrm: PlayReadyDrm = null
  ): CreateJobPlaylist = {
    val __obj = js.Dynamic.literal()
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    if (HlsContentProtection != null) __obj.updateDynamic("HlsContentProtection")(HlsContentProtection.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OutputKeys != null) __obj.updateDynamic("OutputKeys")(OutputKeys.asInstanceOf[js.Any])
    if (PlayReadyDrm != null) __obj.updateDynamic("PlayReadyDrm")(PlayReadyDrm.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobPlaylist]
  }
}

