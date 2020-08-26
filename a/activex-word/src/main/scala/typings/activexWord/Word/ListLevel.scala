package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLevel extends js.Object {
  var Alignment: WdListLevelAlignment = js.native
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var Font: typings.activexWord.Word.Font = js.native
  val Index: Double = js.native
  var LinkedStyle: String = js.native
  var NumberFormat: String = js.native
  var NumberPosition: Double = js.native
  var NumberStyle: WdListNumberStyle = js.native
  val Parent: js.Any = js.native
  val PictureBullet: InlineShape = js.native
  var ResetOnHigher: Double = js.native
  var ResetOnHigherOld: Boolean = js.native
  var StartAt: Double = js.native
  var TabPosition: Double = js.native
  var TextPosition: Double = js.native
  var TrailingCharacter: WdTrailingCharacter = js.native
  @JSName("Word.ListLevel_typekey")
  var WordDotListLevel_typekey: ListLevel = js.native
  def ApplyPictureBullet(FileName: String): InlineShape = js.native
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
  @scala.inline
  implicit class ListLevelOps[Self <: ListLevel] (val x: Self) extends AnyVal {
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
    def setAlignment(value: WdListLevelAlignment): Self = this.set("Alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplyPictureBullet(value: String => InlineShape): Self = this.set("ApplyPictureBullet", js.Any.fromFunction1(value))
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setFont(value: Font): Self = this.set("Font", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkedStyle(value: String): Self = this.set("LinkedStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberFormat(value: String): Self = this.set("NumberFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberPosition(value: Double): Self = this.set("NumberPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberStyle(value: WdListNumberStyle): Self = this.set("NumberStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPictureBullet(value: InlineShape): Self = this.set("PictureBullet", value.asInstanceOf[js.Any])
    @scala.inline
    def setResetOnHigher(value: Double): Self = this.set("ResetOnHigher", value.asInstanceOf[js.Any])
    @scala.inline
    def setResetOnHigherOld(value: Boolean): Self = this.set("ResetOnHigherOld", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartAt(value: Double): Self = this.set("StartAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabPosition(value: Double): Self = this.set("TabPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextPosition(value: Double): Self = this.set("TextPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrailingCharacter(value: WdTrailingCharacter): Self = this.set("TrailingCharacter", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotListLevel_typekey(value: ListLevel): Self = this.set("Word.ListLevel_typekey", value.asInstanceOf[js.Any])
  }
  
}

