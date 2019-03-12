package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Effect")
@js.native
class Effect protected () extends js.Object {
  val Application: activexDashPowerpointLib.PowerPointNs.Application = js.native
  val Behaviors: AnimationBehaviors = js.native
  val DisplayName: java.lang.String = js.native
  val EffectInformation: activexDashPowerpointLib.PowerPointNs.EffectInformation = js.native
  val EffectParameters: activexDashPowerpointLib.PowerPointNs.EffectParameters = js.native
  var EffectType: MsoAnimEffect = js.native
  var Exit: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val Index: scala.Double = js.native
  var Paragraph: scala.Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Effect_typekey`: Effect = js.native
  var Shape: activexDashPowerpointLib.PowerPointNs.Shape = js.native
  val TextRangeLength: scala.Double = js.native
  val TextRangeStart: scala.Double = js.native
  val Timing: activexDashPowerpointLib.PowerPointNs.Timing = js.native
  def Delete(): scala.Unit = js.native
  def MoveAfter(Effect: Effect): scala.Unit = js.native
  def MoveBefore(Effect: Effect): scala.Unit = js.native
  def MoveTo(toPos: scala.Double): scala.Unit = js.native
}

