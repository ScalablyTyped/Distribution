package typings.appletvjs.AppleTVJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AppleTVJS.Playlist")
@js.native
class Playlist () extends js.Object {
  /** The number of items in the playlist. */
  var length: Double = js.native
  /** Returns the MediaItem located in the indicated array index. */
  def item(index: Double): MediaItem = js.native
  /** Removes a media item from the end of a playlist. */
  def pop(): MediaItem = js.native
  /** Adds a media item to the end of a playlist. */
  def push(`object`: MediaItem): Unit = js.native
  /** Deletes the indicated array elements and replaces them with the specified elements. */
  def splice(index: Double, howManu: Double, `object`: MediaItem): js.Array[MediaItem] = js.native
}

