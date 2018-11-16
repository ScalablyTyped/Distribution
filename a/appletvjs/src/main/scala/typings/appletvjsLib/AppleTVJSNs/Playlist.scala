package typings
package appletvjsLib.AppleTVJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AppleTVJS.Playlist")
@js.native
class Playlist () extends js.Object {
  /** The number of items in the playlist. */
  var length: scala.Double = js.native
  /** Returns the MediaItem located in the indicated array index. */
  def item(index: scala.Double): MediaItem = js.native
  /** Removes a media item from the end of a playlist. */
  def pop(): MediaItem = js.native
  /** Adds a media item to the end of a playlist. */
  def push(`object`: MediaItem): scala.Unit = js.native
  /** Deletes the indicated array elements and replaces them with the specified elements. */
  def splice(index: scala.Double, howManu: scala.Double, `object`: MediaItem): js.Array[MediaItem] = js.native
}

