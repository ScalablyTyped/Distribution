package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParagraphFormat extends js.Object {
  var Alignment: PpParagraphAlignment
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var BaseLineAlignment: PpBaselineAlignment
  val Bullet: BulletFormat
  var FarEastLineBreakControl: MsoTriState
  var HangingPunctuation: MsoTriState
  var LineRuleAfter: MsoTriState
  var LineRuleBefore: MsoTriState
  var LineRuleWithin: MsoTriState
  val Parent: js.Any
  @JSName("PowerPoint.ParagraphFormat_typekey")
  var PowerPointDotParagraphFormat_typekey: ParagraphFormat
  var SpaceAfter: Double
  var SpaceBefore: Double
  var SpaceWithin: Double
  var TextDirection: PpDirection
  var WordWrap: MsoTriState
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
}

