package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.PpBaselineAlignment
import typings.activexPowerpoint.PowerPoint.PpDirection
import typings.activexPowerpoint.PowerPoint.PpParagraphAlignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.ParagraphFormat")
@js.native
/* private */ class ParagraphFormat ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.ParagraphFormat {
  
  /* CompleteClass */
  var Alignment: PpParagraphAlignment = js.native
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  var BaseLineAlignment: PpBaselineAlignment = js.native
  
  /* CompleteClass */
  override val Bullet: typings.activexPowerpoint.PowerPoint.BulletFormat = js.native
  
  /* CompleteClass */
  var FarEastLineBreakControl: MsoTriState = js.native
  
  /* CompleteClass */
  var HangingPunctuation: MsoTriState = js.native
  
  /* CompleteClass */
  var LineRuleAfter: MsoTriState = js.native
  
  /* CompleteClass */
  var LineRuleBefore: MsoTriState = js.native
  
  /* CompleteClass */
  var LineRuleWithin: MsoTriState = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.ParagraphFormat_typekey")
  var PowerPointDotParagraphFormat_typekey: typings.activexPowerpoint.PowerPoint.ParagraphFormat = js.native
  
  /* CompleteClass */
  var SpaceAfter: Double = js.native
  
  /* CompleteClass */
  var SpaceBefore: Double = js.native
  
  /* CompleteClass */
  var SpaceWithin: Double = js.native
  
  /* CompleteClass */
  var TextDirection: PpDirection = js.native
  
  /* CompleteClass */
  var WordWrap: MsoTriState = js.native
}
