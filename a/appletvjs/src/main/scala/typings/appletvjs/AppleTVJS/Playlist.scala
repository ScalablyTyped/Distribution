package typings.appletvjs.AppleTVJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Playlist extends js.Object {
  /** The number of items in the playlist. */
  var length: Double
  /** Returns the MediaItem located in the indicated array index. */
  def item(index: Double): MediaItem
  /** Removes a media item from the end of a playlist. */
  def pop(): MediaItem
  /** Adds a media item to the end of a playlist. */
  def push(`object`: MediaItem): Unit
  /** Deletes the indicated array elements and replaces them with the specified elements. */
  def splice(index: Double, howManu: Double, `object`: MediaItem): js.Array[MediaItem]
}

object Playlist {
  @scala.inline
  def apply(
    item: Double => MediaItem,
    length: Double,
    pop: () => MediaItem,
    push: MediaItem => Unit,
    splice: (Double, Double, MediaItem) => js.Array[MediaItem]
  ): Playlist = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any], pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), splice = js.Any.fromFunction3(splice))
    __obj.asInstanceOf[Playlist]
  }
}

