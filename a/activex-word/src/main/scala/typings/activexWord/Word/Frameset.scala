package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frameset extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
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
  @JSName("Word.Frameset_typekey")
  var WordDotFrameset_typekey: Frameset = js.native
  def AddNewFrame(Where: WdFramesetNewFrameLocation): Frameset = js.native
  def ChildFramesetItem(Index: Double): Frameset = js.native
  def Delete(): Unit = js.native
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
  @scala.inline
  implicit class FramesetOps[Self <: Frameset] (val x: Self) extends AnyVal {
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
    def setAddNewFrame(value: WdFramesetNewFrameLocation => Frameset): Self = this.set("AddNewFrame", js.Any.fromFunction1(value))
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildFramesetCount(value: Double): Self = this.set("ChildFramesetCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildFramesetItem(value: Double => Frameset): Self = this.set("ChildFramesetItem", js.Any.fromFunction1(value))
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setFrameDefaultURL(value: String): Self = this.set("FrameDefaultURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameDisplayBorders(value: Boolean): Self = this.set("FrameDisplayBorders", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameLinkToFile(value: Boolean): Self = this.set("FrameLinkToFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameName(value: String): Self = this.set("FrameName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameResizable(value: Boolean): Self = this.set("FrameResizable", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameScrollbarType(value: WdScrollbarType): Self = this.set("FrameScrollbarType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFramesetBorderColor(value: WdColor): Self = this.set("FramesetBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setFramesetBorderWidth(value: Double): Self = this.set("FramesetBorderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("Height", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeightType(value: WdFramesetSizeType): Self = this.set("HeightType", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentFrameset(value: Frameset): Self = this.set("ParentFrameset", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: WdFramesetType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidthType(value: WdFramesetSizeType): Self = this.set("WidthType", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotFrameset_typekey(value: Frameset): Self = this.set("Word.Frameset_typekey", value.asInstanceOf[js.Any])
  }
  
}

