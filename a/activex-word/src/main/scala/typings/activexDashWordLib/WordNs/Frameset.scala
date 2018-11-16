package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Frameset")
@js.native
class Frameset protected () extends js.Object {
  val Application: Application = js.native
  val ChildFramesetCount: scala.Double = js.native
  val Creator: scala.Double = js.native
  var FrameDefaultURL: java.lang.String = js.native
  var FrameDisplayBorders: scala.Boolean = js.native
  var FrameLinkToFile: scala.Boolean = js.native
  var FrameName: java.lang.String = js.native
  var FrameResizable: scala.Boolean = js.native
  var FrameScrollbarType: WdScrollbarType = js.native
  var FramesetBorderColor: WdColor = js.native
  var FramesetBorderWidth: scala.Double = js.native
  var Height: scala.Double = js.native
  var HeightType: WdFramesetSizeType = js.native
  val Parent: js.Any = js.native
  val ParentFrameset: Frameset = js.native
  val Type: WdFramesetType = js.native
  var Width: scala.Double = js.native
  var WidthType: WdFramesetSizeType = js.native
  var `Word.Frameset_typekey`: Frameset = js.native
  def AddNewFrame(Where: WdFramesetNewFrameLocation): Frameset = js.native
  def ChildFramesetItem(Index: scala.Double): Frameset = js.native
  def Delete(): scala.Unit = js.native
}

