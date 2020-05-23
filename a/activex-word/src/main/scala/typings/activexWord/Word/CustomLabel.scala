package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLabel extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val DotMatrix: Boolean
  var Height: Double
  var HorizontalPitch: Double
  val Index: Double
  var Name: String
  var NumberAcross: Double
  var NumberDown: Double
  var PageSize: WdCustomLabelPageSize
  val Parent: js.Any
  var SideMargin: Double
  var TopMargin: Double
  val Valid: Boolean
  var VerticalPitch: Double
  var Width: Double
  @JSName("Word.CustomLabel_typekey")
  var WordDotCustomLabel_typekey: CustomLabel
  def Delete(): Unit
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
}

