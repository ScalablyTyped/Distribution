package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.AnimationBehaviors")
@js.native
class AnimationBehaviors protected () extends js.Object {
  val Application: activexDashPowerpointLib.PowerPointNs.Application = js.native
  val Count: scala.Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.AnimationBehaviors_typekey`: AnimationBehaviors = js.native
  /** @param number [Index=-1] */
  def Add(Type: MsoAnimType): AnimationBehavior = js.native
  def Add(Type: MsoAnimType, Index: scala.Double): AnimationBehavior = js.native
  def Item(Index: scala.Double): AnimationBehavior = js.native
}

