package typings
package awsDashSdkLib.clientsKinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHLSStreamingSessionURLInput extends js.Object {
  /**
    * Specifies which format should be used for packaging the media. Specifying the FRAGMENTED_MP4 container format packages the media into MP4 fragments (fMP4 or CMAF). This is the recommended packaging because there is minimal packaging overhead. The other container format option is MPEG_TS. HLS has supported MPEG TS chunks since it was released and is sometimes the only supported packaging on older HLS players. MPEG TS typically has a 5-25 percent packaging overhead. This means MPEG TS typically requires 5-25 percent more bandwidth and cost than fMP4. The default is FRAGMENTED_MP4.
    */
  var ContainerFormat: js.UndefOr[ContainerFormat] = js.undefined
  /**
    * Specifies when flags marking discontinuities between fragments will be added to the media playlists. The default is ALWAYS when HLSFragmentSelector is SERVER_TIMESTAMP, and NEVER when it is PRODUCER_TIMESTAMP. Media players typically build a timeline of media content to play, based on the timestamps of each fragment. This means that if there is any overlap between fragments (as is typical if HLSFragmentSelector is SERVER_TIMESTAMP), the media player timeline has small gaps between fragments in some places, and overwrites frames in other places. When there are discontinuity flags between fragments, the media player is expected to reset the timeline, resulting in the fragment being played immediately after the previous fragment. We recommend that you always have discontinuity flags between fragments if the fragment timestamps are not accurate or if fragments might be missing. You should not place discontinuity flags between fragments for the player timeline to accurately map to the producer timestamps.
    */
  var DiscontinuityMode: js.UndefOr[DiscontinuityMode] = js.undefined
  /**
    * Specifies when the fragment start timestamps should be included in the HLS media playlist. Typically, media players report the playhead position as a time relative to the start of the first fragment in the playback session. However, when the start timestamps are included in the HLS media playlist, some media players might report the current playhead as an absolute time based on the fragment timestamps. This can be useful for creating a playback experience that shows viewers the wall-clock time of the media. The default is NEVER. When HLSFragmentSelector is SERVER_TIMESTAMP, the timestamps will be the server start timestamps. Similarly, when HLSFragmentSelector is PRODUCER_TIMESTAMP, the timestamps will be the producer start timestamps. 
    */
  var DisplayFragmentTimestamp: js.UndefOr[DisplayFragmentTimestamp] = js.undefined
  /**
    * The time in seconds until the requested session expires. This value can be between 300 (5 minutes) and 43200 (12 hours). When a session expires, no new calls to GetHLSMasterPlaylist, GetHLSMediaPlaylist, GetMP4InitFragment, or GetMP4MediaFragment can be made for that session. The default is 300 (5 minutes).
    */
  var Expires: js.UndefOr[Expires] = js.undefined
  /**
    * The time range of the requested fragment, and the source of the timestamps. This parameter is required if PlaybackMode is ON_DEMAND. This parameter is optional if PlaybackMode is LIVE. If PlaybackMode is LIVE, the FragmentSelectorType can be set, but the TimestampRange should not be set. If PlaybackMode is ON_DEMAND, both FragmentSelectorType and TimestampRange must be set.
    */
  var HLSFragmentSelector: js.UndefOr[HLSFragmentSelector] = js.undefined
  /**
    * The maximum number of fragments that are returned in the HLS media playlists. When the PlaybackMode is LIVE, the most recent fragments are returned up to this value. When the PlaybackMode is ON_DEMAND, the oldest fragments are returned, up to this maximum number. When there are a higher number of fragments available in a live HLS media playlist, video players often buffer content before starting playback. Increasing the buffer size increases the playback latency, but it decreases the likelihood that rebuffering will occur during playback. We recommend that a live HLS media playlist have a minimum of 3 fragments and a maximum of 10 fragments. The default is 5 fragments if PlaybackMode is LIVE, and 1,000 if PlaybackMode is ON_DEMAND.  The maximum value of 1,000 fragments corresponds to more than 16 minutes of video on streams with 1-second fragments, and more than 2 1/2 hours of video on streams with 10-second fragments.
    */
  var MaxMediaPlaylistFragmentResults: js.UndefOr[PageLimit] = js.undefined
  /**
    * Whether to retrieve live or archived, on-demand data. Features of the two types of session include the following:     LIVE : For sessions of this type, the HLS media playlist is continually updated with the latest fragments as they become available. We recommend that the media player retrieve a new playlist on a one-second interval. When this type of session is played in a media player, the user interface typically displays a "live" notification, with no scrubber control for choosing the position in the playback window to display.  In LIVE mode, the newest available fragments are included in an HLS media playlist, even if there is a gap between fragments (that is, if a fragment is missing). A gap like this might cause a media player to halt or cause a jump in playback. In this mode, fragments are not added to the HLS media playlist if they are older than the newest fragment in the playlist. If the missing fragment becomes available after a subsequent fragment is added to the playlist, the older fragment is not added, and the gap is not filled.      ON_DEMAND : For sessions of this type, the HLS media playlist contains all the fragments for the session, up to the number that is specified in MaxMediaPlaylistFragmentResults. The playlist must be retrieved only once for each session. When this type of session is played in a media player, the user interface typically displays a scrubber control for choosing the position in the playback window to display.   In both playback modes, if FragmentSelectorType is PRODUCER_TIMESTAMP, and if there are multiple fragments with the same start timestamp, the fragment that has the larger fragment number (that is, the newer fragment) is included in the HLS media playlist. The other fragments are not included. Fragments that have different timestamps but have overlapping durations are still included in the HLS media playlist. This can lead to unexpected behavior in the media player. The default is LIVE.
    */
  var PlaybackMode: js.UndefOr[PlaybackMode] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the stream for which to retrieve the HLS master playlist URL. You must specify either the StreamName or the StreamARN.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  /**
    * The name of the stream for which to retrieve the HLS master playlist URL. You must specify either the StreamName or the StreamARN.
    */
  var StreamName: js.UndefOr[StreamName] = js.undefined
}

object GetHLSStreamingSessionURLInput {
  @scala.inline
  def apply(
    ContainerFormat: ContainerFormat = null,
    DiscontinuityMode: DiscontinuityMode = null,
    DisplayFragmentTimestamp: DisplayFragmentTimestamp = null,
    Expires: js.UndefOr[Expires] = js.undefined,
    HLSFragmentSelector: HLSFragmentSelector = null,
    MaxMediaPlaylistFragmentResults: js.UndefOr[PageLimit] = js.undefined,
    PlaybackMode: PlaybackMode = null,
    StreamARN: ResourceARN = null,
    StreamName: StreamName = null
  ): GetHLSStreamingSessionURLInput = {
    val __obj = js.Dynamic.literal()
    if (ContainerFormat != null) __obj.updateDynamic("ContainerFormat")(ContainerFormat.asInstanceOf[js.Any])
    if (DiscontinuityMode != null) __obj.updateDynamic("DiscontinuityMode")(DiscontinuityMode.asInstanceOf[js.Any])
    if (DisplayFragmentTimestamp != null) __obj.updateDynamic("DisplayFragmentTimestamp")(DisplayFragmentTimestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(Expires)) __obj.updateDynamic("Expires")(Expires)
    if (HLSFragmentSelector != null) __obj.updateDynamic("HLSFragmentSelector")(HLSFragmentSelector)
    if (!js.isUndefined(MaxMediaPlaylistFragmentResults)) __obj.updateDynamic("MaxMediaPlaylistFragmentResults")(MaxMediaPlaylistFragmentResults)
    if (PlaybackMode != null) __obj.updateDynamic("PlaybackMode")(PlaybackMode.asInstanceOf[js.Any])
    if (StreamARN != null) __obj.updateDynamic("StreamARN")(StreamARN)
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName)
    __obj.asInstanceOf[GetHLSStreamingSessionURLInput]
  }
}

