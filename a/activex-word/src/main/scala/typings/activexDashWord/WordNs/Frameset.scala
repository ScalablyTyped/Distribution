package typings.activexDashWord.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Frameset")
@js.native
class Frameset protected () extends js.Object {
  val Application: typings.activexDashWord.WordNs.Application = js.native
  val ChildFramesetCount: Double = js.native
  val Creator: Double = js.native
  var FrameDefaultURL: String = js.native
  var FrameDisplayBorders: Boolean = js.native
  var FrameLinkToFile: Boolean = js.native
  var FrameName: String = js.native
  var FrameResizable: Boolean = js.native
  var FrameScrollbarType: WdScrollbarType = js.native
  var FramesetBorderColor: WdColor = js.native
  var FramesetBorderWidth: Double = js.native
  var Height: Double = js.native
  var HeightType: WdFramesetSizeType = js.native
  val Parent: js.Any = js.native
  val ParentFrameset: Frameset = js.native
  val Type: WdFramesetType = js.native
  var Width: Double = js.native
  var WidthType: WdFramesetSizeType = js.native
  var `Word.Frameset_typekey`: Frameset = js.native
  def AddNewFrame(Where: WdFramesetNewFrameLocation): Frameset = js.native
  def ChildFramesetItem(Index: Double): Frameset = js.native
  def Delete(): Unit = js.native
}

