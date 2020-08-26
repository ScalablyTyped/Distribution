package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParagraphFormat extends js.Object {
  var Alignment: PpParagraphAlignment = js.native
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  var BaseLineAlignment: PpBaselineAlignment = js.native
  val Bullet: BulletFormat = js.native
  var FarEastLineBreakControl: MsoTriState = js.native
  var HangingPunctuation: MsoTriState = js.native
  var LineRuleAfter: MsoTriState = js.native
  var LineRuleBefore: MsoTriState = js.native
  var LineRuleWithin: MsoTriState = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.ParagraphFormat_typekey")
  var PowerPointDotParagraphFormat_typekey: ParagraphFormat = js.native
  var SpaceAfter: Double = js.native
  var SpaceBefore: Double = js.native
  var SpaceWithin: Double = js.native
  var TextDirection: PpDirection = js.native
  var WordWrap: MsoTriState = js.native
}

object ParagraphFormat {
  @scala.inline
  def apply(
    Alignment: PpParagraphAlignment,
    Application: Application,
    BaseLineAlignment: PpBaselineAlignment,
    Bullet: BulletFormat,
    FarEastLineBreakControl: MsoTriState,
    HangingPunctuation: MsoTriState,
    LineRuleAfter: MsoTriState,
    LineRuleBefore: MsoTriState,
    LineRuleWithin: MsoTriState,
    Parent: js.Any,
    PowerPointDotParagraphFormat_typekey: ParagraphFormat,
    SpaceAfter: Double,
    SpaceBefore: Double,
    SpaceWithin: Double,
    TextDirection: PpDirection,
    WordWrap: MsoTriState
  ): ParagraphFormat = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], BaseLineAlignment = BaseLineAlignment.asInstanceOf[js.Any], Bullet = Bullet.asInstanceOf[js.Any], FarEastLineBreakControl = FarEastLineBreakControl.asInstanceOf[js.Any], HangingPunctuation = HangingPunctuation.asInstanceOf[js.Any], LineRuleAfter = LineRuleAfter.asInstanceOf[js.Any], LineRuleBefore = LineRuleBefore.asInstanceOf[js.Any], LineRuleWithin = LineRuleWithin.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SpaceAfter = SpaceAfter.asInstanceOf[js.Any], SpaceBefore = SpaceBefore.asInstanceOf[js.Any], SpaceWithin = SpaceWithin.asInstanceOf[js.Any], TextDirection = TextDirection.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ParagraphFormat_typekey")(PowerPointDotParagraphFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphFormat]
  }
  @scala.inline
  implicit class ParagraphFormatOps[Self <: ParagraphFormat] (val x: Self) extends AnyVal {
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
    def setAlignment(value: PpParagraphAlignment): Self = this.set("Alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseLineAlignment(value: PpBaselineAlignment): Self = this.set("BaseLineAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setBullet(value: BulletFormat): Self = this.set("Bullet", value.asInstanceOf[js.Any])
    @scala.inline
    def setFarEastLineBreakControl(value: MsoTriState): Self = this.set("FarEastLineBreakControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setHangingPunctuation(value: MsoTriState): Self = this.set("HangingPunctuation", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineRuleAfter(value: MsoTriState): Self = this.set("LineRuleAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineRuleBefore(value: MsoTriState): Self = this.set("LineRuleBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineRuleWithin(value: MsoTriState): Self = this.set("LineRuleWithin", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotParagraphFormat_typekey(value: ParagraphFormat): Self = this.set("PowerPoint.ParagraphFormat_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpaceAfter(value: Double): Self = this.set("SpaceAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpaceBefore(value: Double): Self = this.set("SpaceBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpaceWithin(value: Double): Self = this.set("SpaceWithin", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextDirection(value: PpDirection): Self = this.set("TextDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordWrap(value: MsoTriState): Self = this.set("WordWrap", value.asInstanceOf[js.Any])
  }
  
}

