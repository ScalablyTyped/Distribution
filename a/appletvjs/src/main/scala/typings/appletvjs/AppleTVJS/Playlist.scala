package typings.appletvjs.AppleTVJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Playlist extends js.Object {
  
  /** Returns the MediaItem located in the indicated array index. */
  def item(index: Double): MediaItem = js.native
  
  /** The number of items in the playlist. */
  var length: Double = js.native
  
  /** Removes a media item from the end of a playlist. */
  def pop(): MediaItem = js.native
  
  /** Adds a media item to the end of a playlist. */
  def push(`object`: MediaItem): Unit = js.native
  
  /** Deletes the indicated array elements and replaces them with the specified elements. */
  def splice(index: Double, howManu: Double, `object`: MediaItem): js.Array[MediaItem] = js.native
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
  
  @scala.inline
  implicit class PlaylistOps[Self <: Playlist] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItem(value: Double => MediaItem): Self = this.set("item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPop(value: () => MediaItem): Self = this.set("pop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPush(value: MediaItem => Unit): Self = this.set("push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSplice(value: (Double, Double, MediaItem) => js.Array[MediaItem]): Self = this.set("splice", js.Any.fromFunction3(value))
  }
}
