package typings.activexDashPowerpoint.PowerPoint

import typings.activexDashOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.ParagraphFormat")
@js.native
class ParagraphFormat protected () extends js.Object {
  var Alignment: PpParagraphAlignment = js.native
  val Application: typings.activexDashPowerpoint.PowerPoint.Application = js.native
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

