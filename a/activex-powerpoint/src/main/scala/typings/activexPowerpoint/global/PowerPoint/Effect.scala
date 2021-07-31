package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.MsoAnimEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.Effect")
@js.native
class Effect protected ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.Effect {
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override val Behaviors: typings.activexPowerpoint.PowerPoint.AnimationBehaviors = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override val DisplayName: String = js.native
  
  /* CompleteClass */
  override val EffectInformation: typings.activexPowerpoint.PowerPoint.EffectInformation = js.native
  
  /* CompleteClass */
  override val EffectParameters: typings.activexPowerpoint.PowerPoint.EffectParameters = js.native
  
  /* CompleteClass */
  var EffectType: MsoAnimEffect = js.native
  
  /* CompleteClass */
  var Exit: MsoTriState = js.native
  
  /* CompleteClass */
  override val Index: Double = js.native
  
  /* CompleteClass */
  override def MoveAfter(Effect: typings.activexPowerpoint.PowerPoint.Effect): Unit = js.native
  
  /* CompleteClass */
  override def MoveBefore(Effect: typings.activexPowerpoint.PowerPoint.Effect): Unit = js.native
  
  /* CompleteClass */
  override def MoveTo(toPos: Double): Unit = js.native
  
  /* CompleteClass */
  var Paragraph: Double = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  @JSName("PowerPoint.Effect_typekey")
  var PowerPointDotEffect_typekey: typings.activexPowerpoint.PowerPoint.Effect = js.native
  
  /* CompleteClass */
  var Shape: typings.activexPowerpoint.PowerPoint.Shape = js.native
  
  /* CompleteClass */
  override val TextRangeLength: Double = js.native
  
  /* CompleteClass */
  override val TextRangeStart: Double = js.native
  
  /* CompleteClass */
  override val Timing: typings.activexPowerpoint.PowerPoint.Timing = js.native
}
