package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationBehaviors extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.AnimationBehaviors_typekey")
  var PowerPointDotAnimationBehaviors_typekey: AnimationBehaviors = js.native
  /** @param number [Index=-1] */
  def Add(Type: MsoAnimType): AnimationBehavior = js.native
  def Add(Type: MsoAnimType, Index: Double): AnimationBehavior = js.native
  def Item(Index: Double): AnimationBehavior = js.native
}

