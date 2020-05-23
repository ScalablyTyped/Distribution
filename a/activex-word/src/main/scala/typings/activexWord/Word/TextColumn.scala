package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextColumn extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Parent: js.Any
  var SpaceAfter: Double
  var Width: Double
  @JSName("Word.TextColumn_typekey")
  var WordDotTextColumn_typekey: TextColumn
}

object TextColumn {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Parent: js.Any,
    SpaceAfter: Double,
    Width: Double,
    WordDotTextColumn_typekey: TextColumn
  ): TextColumn = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SpaceAfter = SpaceAfter.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TextColumn_typekey")(WordDotTextColumn_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextColumn]
  }
}

