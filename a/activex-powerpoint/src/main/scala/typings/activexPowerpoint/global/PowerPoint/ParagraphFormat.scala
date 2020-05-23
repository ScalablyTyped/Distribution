package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.PpBaselineAlignment
import typings.activexPowerpoint.PowerPoint.PpDirection
import typings.activexPowerpoint.PowerPoint.PpParagraphAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.ParagraphFormat")
@js.native
class ParagraphFormat protected ()
  extends typings.activexPowerpoint.PowerPoint.ParagraphFormat {
  /* CompleteClass */
  override var Alignment: PpParagraphAlignment = js.native
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override var BaseLineAlignment: PpBaselineAlignment = js.native
  /* CompleteClass */
  override val Bullet: typings.activexPowerpoint.PowerPoint.BulletFormat = js.native
  /* CompleteClass */
  override var FarEastLineBreakControl: MsoTriState = js.native
  /* CompleteClass */
  override var HangingPunctuation: MsoTriState = js.native
  /* CompleteClass */
  override var LineRuleAfter: MsoTriState = js.native
  /* CompleteClass */
  override var LineRuleBefore: MsoTriState = js.native
  /* CompleteClass */
  override var LineRuleWithin: MsoTriState = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.ParagraphFormat_typekey")
  override var PowerPointDotParagraphFormat_typekey: typings.activexPowerpoint.PowerPoint.ParagraphFormat = js.native
  /* CompleteClass */
  override var SpaceAfter: Double = js.native
  /* CompleteClass */
  override var SpaceBefore: Double = js.native
  /* CompleteClass */
  override var SpaceWithin: Double = js.native
  /* CompleteClass */
  override var TextDirection: PpDirection = js.native
  /* CompleteClass */
  override var WordWrap: MsoTriState = js.native
}

