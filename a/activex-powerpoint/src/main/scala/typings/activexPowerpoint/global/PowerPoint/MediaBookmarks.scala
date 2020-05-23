package typings.activexPowerpoint.global.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.MediaBookmarks")
@js.native
class MediaBookmarks protected ()
  extends typings.activexPowerpoint.PowerPoint.MediaBookmarks {
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  @JSName("PowerPoint.MediaBookmarks_typekey")
  override var PowerPointDotMediaBookmarks_typekey: typings.activexPowerpoint.PowerPoint.MediaBookmarks = js.native
  /* CompleteClass */
  override def Add(Position: Double, Name: String): typings.activexPowerpoint.PowerPoint.MediaBookmark = js.native
  /* CompleteClass */
  override def Item(Index: Double): typings.activexPowerpoint.PowerPoint.MediaBookmark = js.native
}

