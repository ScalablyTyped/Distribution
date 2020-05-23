package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frameset extends js.Object {
  val Application: typings.activexWord.Word.Application
  val ChildFramesetCount: Double
  val Creator: Double
  var FrameDefaultURL: String
  var FrameDisplayBorders: Boolean
  var FrameLinkToFile: Boolean
  var FrameName: String
  var FrameResizable: Boolean
  var FrameScrollbarType: WdScrollbarType
  var FramesetBorderColor: WdColor
  var FramesetBorderWidth: Double
  var Height: Double
  var HeightType: WdFramesetSizeType
  val Parent: js.Any
  val ParentFrameset: Frameset
  val Type: WdFramesetType
  var Width: Double
  var WidthType: WdFramesetSizeType
  @JSName("Word.Frameset_typekey")
  var WordDotFrameset_typekey: Frameset
  def AddNewFrame(Where: WdFramesetNewFrameLocation): Frameset
  def ChildFramesetItem(Index: Double): Frameset
  def Delete(): Unit
}

object Frameset {
  @scala.inline
  def apply(
    AddNewFrame: WdFramesetNewFrameLocation => Frameset,
    Application: Application,
    ChildFramesetCount: Double,
    ChildFramesetItem: Double => Frameset,
    Creator: Double,
    Delete: () => Unit,
    FrameDefaultURL: String,
    FrameDisplayBorders: Boolean,
    FrameLinkToFile: Boolean,
    FrameName: String,
    FrameResizable: Boolean,
    FrameScrollbarType: WdScrollbarType,
    FramesetBorderColor: WdColor,
    FramesetBorderWidth: Double,
    Height: Double,
    HeightType: WdFramesetSizeType,
    Parent: js.Any,
    ParentFrameset: Frameset,
    Type: WdFramesetType,
    Width: Double,
    WidthType: WdFramesetSizeType,
    WordDotFrameset_typekey: Frameset
  ): Frameset = {
    val __obj = js.Dynamic.literal(AddNewFrame = js.Any.fromFunction1(AddNewFrame), Application = Application.asInstanceOf[js.Any], ChildFramesetCount = ChildFramesetCount.asInstanceOf[js.Any], ChildFramesetItem = js.Any.fromFunction1(ChildFramesetItem), Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), FrameDefaultURL = FrameDefaultURL.asInstanceOf[js.Any], FrameDisplayBorders = FrameDisplayBorders.asInstanceOf[js.Any], FrameLinkToFile = FrameLinkToFile.asInstanceOf[js.Any], FrameName = FrameName.asInstanceOf[js.Any], FrameResizable = FrameResizable.asInstanceOf[js.Any], FrameScrollbarType = FrameScrollbarType.asInstanceOf[js.Any], FramesetBorderColor = FramesetBorderColor.asInstanceOf[js.Any], FramesetBorderWidth = FramesetBorderWidth.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HeightType = HeightType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ParentFrameset = ParentFrameset.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WidthType = WidthType.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Frameset_typekey")(WordDotFrameset_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frameset]
  }
}

