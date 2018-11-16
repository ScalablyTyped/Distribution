package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.ParagraphFormat2")
@js.native
class ParagraphFormat2 protected () extends js.Object {
  var Alignment: MsoParagraphAlignment = js.native
  val Application: js.Any = js.native
  var BaselineAlignment: MsoBaselineAlignment = js.native
  val Bullet: BulletFormat2 = js.native
  val Creator: scala.Double = js.native
  var FarEastLineBreakLevel: MsoTriState = js.native
  var FirstLineIndent: scala.Double = js.native
  var HangingPunctuation: MsoTriState = js.native
  var IndentLevel: scala.Double = js.native
  var LeftIndent: scala.Double = js.native
  var LineRuleAfter: MsoTriState = js.native
  var LineRuleBefore: MsoTriState = js.native
  var LineRuleWithin: MsoTriState = js.native
  var `Office.ParagraphFormat2_typekey`: ParagraphFormat2 = js.native
  val Parent: js.Any = js.native
  var RightIndent: scala.Double = js.native
  var SpaceAfter: scala.Double = js.native
  var SpaceBefore: scala.Double = js.native
  var SpaceWithin: scala.Double = js.native
  @JSName("TabStops")
  val TabStops_Original: TabStops2 = js.native
  var TextDirection: MsoTextDirection = js.native
  var WordWrap: MsoTriState = js.native
  def TabStops(Index: scala.Double): TabStop2 = js.native
}

