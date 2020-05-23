package typings.activexWord.global.Word

import typings.activexWord.Word.WdColor
import typings.activexWord.Word.WdFramesetNewFrameLocation
import typings.activexWord.Word.WdFramesetSizeType
import typings.activexWord.Word.WdFramesetType
import typings.activexWord.Word.WdScrollbarType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Frameset")
@js.native
class Frameset protected ()
  extends typings.activexWord.Word.Frameset {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val ChildFramesetCount: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var FrameDefaultURL: String = js.native
  /* CompleteClass */
  override var FrameDisplayBorders: Boolean = js.native
  /* CompleteClass */
  override var FrameLinkToFile: Boolean = js.native
  /* CompleteClass */
  override var FrameName: String = js.native
  /* CompleteClass */
  override var FrameResizable: Boolean = js.native
  /* CompleteClass */
  override var FrameScrollbarType: WdScrollbarType = js.native
  /* CompleteClass */
  override var FramesetBorderColor: WdColor = js.native
  /* CompleteClass */
  override var FramesetBorderWidth: Double = js.native
  /* CompleteClass */
  override var Height: Double = js.native
  /* CompleteClass */
  override var HeightType: WdFramesetSizeType = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val ParentFrameset: typings.activexWord.Word.Frameset = js.native
  /* CompleteClass */
  override val Type: WdFramesetType = js.native
  /* CompleteClass */
  override var Width: Double = js.native
  /* CompleteClass */
  override var WidthType: WdFramesetSizeType = js.native
  /* CompleteClass */
  @JSName("Word.Frameset_typekey")
  override var WordDotFrameset_typekey: typings.activexWord.Word.Frameset = js.native
  /* CompleteClass */
  override def AddNewFrame(Where: WdFramesetNewFrameLocation): typings.activexWord.Word.Frameset = js.native
  /* CompleteClass */
  override def ChildFramesetItem(Index: Double): typings.activexWord.Word.Frameset = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
}

