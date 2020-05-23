package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Effect extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Behaviors: AnimationBehaviors
  val DisplayName: String
  val EffectInformation: typings.activexPowerpoint.PowerPoint.EffectInformation
  val EffectParameters: typings.activexPowerpoint.PowerPoint.EffectParameters
  var EffectType: MsoAnimEffect
  var Exit: MsoTriState
  val Index: Double
  var Paragraph: Double
  val Parent: js.Any
  @JSName("PowerPoint.Effect_typekey")
  var PowerPointDotEffect_typekey: Effect
  var Shape: typings.activexPowerpoint.PowerPoint.Shape
  val TextRangeLength: Double
  val TextRangeStart: Double
  val Timing: typings.activexPowerpoint.PowerPoint.Timing
  def Delete(): Unit
  def MoveAfter(Effect: Effect): Unit
  def MoveBefore(Effect: Effect): Unit
  def MoveTo(toPos: Double): Unit
}

object Effect {
  @scala.inline
  def apply(
    Application: Application,
    Behaviors: AnimationBehaviors,
    Delete: () => Unit,
    DisplayName: String,
    EffectInformation: EffectInformation,
    EffectParameters: EffectParameters,
    EffectType: MsoAnimEffect,
    Exit: MsoTriState,
    Index: Double,
    MoveAfter: Effect => Unit,
    MoveBefore: Effect => Unit,
    MoveTo: Double => Unit,
    Paragraph: Double,
    Parent: js.Any,
    PowerPointDotEffect_typekey: Effect,
    Shape: Shape,
    TextRangeLength: Double,
    TextRangeStart: Double,
    Timing: Timing
  ): Effect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Behaviors = Behaviors.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DisplayName = DisplayName.asInstanceOf[js.Any], EffectInformation = EffectInformation.asInstanceOf[js.Any], EffectParameters = EffectParameters.asInstanceOf[js.Any], EffectType = EffectType.asInstanceOf[js.Any], Exit = Exit.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], MoveAfter = js.Any.fromFunction1(MoveAfter), MoveBefore = js.Any.fromFunction1(MoveBefore), MoveTo = js.Any.fromFunction1(MoveTo), Paragraph = Paragraph.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any], TextRangeLength = TextRangeLength.asInstanceOf[js.Any], TextRangeStart = TextRangeStart.asInstanceOf[js.Any], Timing = Timing.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Effect_typekey")(PowerPointDotEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Effect]
  }
}

