package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Effect extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Behaviors: AnimationBehaviors = js.native
  val DisplayName: String = js.native
  val EffectInformation: typings.activexPowerpoint.PowerPoint.EffectInformation = js.native
  val EffectParameters: typings.activexPowerpoint.PowerPoint.EffectParameters = js.native
  var EffectType: MsoAnimEffect = js.native
  var Exit: MsoTriState = js.native
  val Index: Double = js.native
  var Paragraph: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Effect_typekey")
  var PowerPointDotEffect_typekey: Effect = js.native
  var Shape: typings.activexPowerpoint.PowerPoint.Shape = js.native
  val TextRangeLength: Double = js.native
  val TextRangeStart: Double = js.native
  val Timing: typings.activexPowerpoint.PowerPoint.Timing = js.native
  def Delete(): Unit = js.native
  def MoveAfter(Effect: Effect): Unit = js.native
  def MoveBefore(Effect: Effect): Unit = js.native
  def MoveTo(toPos: Double): Unit = js.native
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
  @scala.inline
  implicit class EffectOps[Self <: Effect] (val x: Self) extends AnyVal {
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setBehaviors(value: AnimationBehaviors): Self = this.set("Behaviors", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setDisplayName(value: String): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffectInformation(value: EffectInformation): Self = this.set("EffectInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffectParameters(value: EffectParameters): Self = this.set("EffectParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffectType(value: MsoAnimEffect): Self = this.set("EffectType", value.asInstanceOf[js.Any])
    @scala.inline
    def setExit(value: MsoTriState): Self = this.set("Exit", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    @scala.inline
    def setMoveAfter(value: Effect => Unit): Self = this.set("MoveAfter", js.Any.fromFunction1(value))
    @scala.inline
    def setMoveBefore(value: Effect => Unit): Self = this.set("MoveBefore", js.Any.fromFunction1(value))
    @scala.inline
    def setMoveTo(value: Double => Unit): Self = this.set("MoveTo", js.Any.fromFunction1(value))
    @scala.inline
    def setParagraph(value: Double): Self = this.set("Paragraph", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotEffect_typekey(value: Effect): Self = this.set("PowerPoint.Effect_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setShape(value: Shape): Self = this.set("Shape", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextRangeLength(value: Double): Self = this.set("TextRangeLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextRangeStart(value: Double): Self = this.set("TextRangeStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setTiming(value: Timing): Self = this.set("Timing", value.asInstanceOf[js.Any])
  }
  
}

