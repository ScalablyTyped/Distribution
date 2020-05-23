package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLevel extends js.Object {
  var Alignment: WdListLevelAlignment
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  var Font: typings.activexWord.Word.Font
  val Index: Double
  var LinkedStyle: String
  var NumberFormat: String
  var NumberPosition: Double
  var NumberStyle: WdListNumberStyle
  val Parent: js.Any
  val PictureBullet: InlineShape
  var ResetOnHigher: Double
  var ResetOnHigherOld: Boolean
  var StartAt: Double
  var TabPosition: Double
  var TextPosition: Double
  var TrailingCharacter: WdTrailingCharacter
  @JSName("Word.ListLevel_typekey")
  var WordDotListLevel_typekey: ListLevel
  def ApplyPictureBullet(FileName: String): InlineShape
}

object ListLevel {
  @scala.inline
  def apply(
    Alignment: WdListLevelAlignment,
    Application: Application,
    ApplyPictureBullet: String => InlineShape,
    Creator: Double,
    Font: Font,
    Index: Double,
    LinkedStyle: String,
    NumberFormat: String,
    NumberPosition: Double,
    NumberStyle: WdListNumberStyle,
    Parent: js.Any,
    PictureBullet: InlineShape,
    ResetOnHigher: Double,
    ResetOnHigherOld: Boolean,
    StartAt: Double,
    TabPosition: Double,
    TextPosition: Double,
    TrailingCharacter: WdTrailingCharacter,
    WordDotListLevel_typekey: ListLevel
  ): ListLevel = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], ApplyPictureBullet = js.Any.fromFunction1(ApplyPictureBullet), Creator = Creator.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], LinkedStyle = LinkedStyle.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], NumberPosition = NumberPosition.asInstanceOf[js.Any], NumberStyle = NumberStyle.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PictureBullet = PictureBullet.asInstanceOf[js.Any], ResetOnHigher = ResetOnHigher.asInstanceOf[js.Any], ResetOnHigherOld = ResetOnHigherOld.asInstanceOf[js.Any], StartAt = StartAt.asInstanceOf[js.Any], TabPosition = TabPosition.asInstanceOf[js.Any], TextPosition = TextPosition.asInstanceOf[js.Any], TrailingCharacter = TrailingCharacter.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ListLevel_typekey")(WordDotListLevel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLevel]
  }
}

