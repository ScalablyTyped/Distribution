package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomLabel extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val DotMatrix: Boolean = js.native
  var Height: Double = js.native
  var HorizontalPitch: Double = js.native
  val Index: Double = js.native
  var Name: String = js.native
  var NumberAcross: Double = js.native
  var NumberDown: Double = js.native
  var PageSize: WdCustomLabelPageSize = js.native
  val Parent: js.Any = js.native
  var SideMargin: Double = js.native
  var TopMargin: Double = js.native
  val Valid: Boolean = js.native
  var VerticalPitch: Double = js.native
  var Width: Double = js.native
  @JSName("Word.CustomLabel_typekey")
  var WordDotCustomLabel_typekey: CustomLabel = js.native
  def Delete(): Unit = js.native
}

object CustomLabel {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    DotMatrix: Boolean,
    Height: Double,
    HorizontalPitch: Double,
    Index: Double,
    Name: String,
    NumberAcross: Double,
    NumberDown: Double,
    PageSize: WdCustomLabelPageSize,
    Parent: js.Any,
    SideMargin: Double,
    TopMargin: Double,
    Valid: Boolean,
    VerticalPitch: Double,
    Width: Double,
    WordDotCustomLabel_typekey: CustomLabel
  ): CustomLabel = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DotMatrix = DotMatrix.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HorizontalPitch = HorizontalPitch.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberAcross = NumberAcross.asInstanceOf[js.Any], NumberDown = NumberDown.asInstanceOf[js.Any], PageSize = PageSize.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SideMargin = SideMargin.asInstanceOf[js.Any], TopMargin = TopMargin.asInstanceOf[js.Any], Valid = Valid.asInstanceOf[js.Any], VerticalPitch = VerticalPitch.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CustomLabel_typekey")(WordDotCustomLabel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLabel]
  }
  @scala.inline
  implicit class CustomLabelOps[Self <: CustomLabel] (val x: Self) extends AnyVal {
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setDotMatrix(value: Boolean): Self = this.set("DotMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("Height", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontalPitch(value: Double): Self = this.set("HorizontalPitch", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberAcross(value: Double): Self = this.set("NumberAcross", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberDown(value: Double): Self = this.set("NumberDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageSize(value: WdCustomLabelPageSize): Self = this.set("PageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSideMargin(value: Double): Self = this.set("SideMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopMargin(value: Double): Self = this.set("TopMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setValid(value: Boolean): Self = this.set("Valid", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalPitch(value: Double): Self = this.set("VerticalPitch", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotCustomLabel_typekey(value: CustomLabel): Self = this.set("Word.CustomLabel_typekey", value.asInstanceOf[js.Any])
  }
  
}

