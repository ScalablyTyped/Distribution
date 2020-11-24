package typings.appletvjs.AppleTVJS

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Player extends js.Object {
  
  /** The currently selected media item in the playlist. */
  var currentMediaItem: MediaItem = js.native
  
  /**
    * An event notifying the listener that the player is about to change media items.
    *
    * Valid values are:
    * errorDidOccur
    * fastForwardedToEndOfMediaItem
    * mannuallyChanged
    * newPlaylist
    * playerInvalidated
    * playedToEndOfMediaItem
    * */
  def mediaItemDidChange(reason: String): Unit = js.native
  
  /** The next media item in the playlist. */
  var nextMediaItem: MediaItem = js.native
  
  /** The annotations for a video created by placing a DOM document over the video. */
  var overlayDocument: Document = js.native
  
  /** Pauses the currently playing media item. */
  def pause(): Unit = js.native
  
  /** Plays the currently selected media item. */
  def play(): Unit = js.native
  
  /**
    * The current state of the player.
    *
    * This property can contain the following valid values:
    * begin
    * end
    * loading
    * playing
    * paused
    * scanning
    * */
  var playbackState: String = js.native
  
  /** The play list for a player. */
  var playlist: Playlist = js.native
  
  /** Shows the player UI if it is not currently visible. */
  def present(): Unit = js.native
  
  /** The previous MediaItem object in the playlist. */
  var previousMediaItem: MediaItem = js.native
  
  /**
    * An event that indicates if a seek to time request was accomplished.
    *
    * The values for this attribute can be one of the following:
    * true — The seek performed as requested.
    * false or null— The seek was not performed.
    * An integer value — The seek will be performed to the stated value and not the initial requested value.
    * */
  def requestSeekToTime(): Unit = js.native
  def requestSeekToTime(result: js.Any): Unit = js.native
  
  /** Sets the playback point to a specified time. */
  def seekToTime(time: Double): Unit = js.native
  
  /** Sets the playback speed. */
  def setPlaybackRate(playbackRate: Double): Unit = js.native
  
  /** An event that indicates a state change request has occurred. */
  def shouldHandleStateChange(result: Boolean): Unit = js.native
  
  /** An event that indicates the state has changed. */
  def stateDidChange(): Unit = js.native
  
  /** An event that indicates the state is about to change. */
  def stateWillChange(): Unit = js.native
  
  /** Stops the currently playing item and dismisses the player UI. */
  def stop(): Unit = js.native
  
  /** An event that indicates a particular playback time has been crossed. */
  def timeBoundaryDidCross(): Unit = js.native
  
  /** An event that happens at a specified interval. */
  def timeDidChange(): Unit = js.native
  
  /** An event that happens whenever a specified piece of metadata occurs. */
  def timedMetadata(): Unit = js.native
}
