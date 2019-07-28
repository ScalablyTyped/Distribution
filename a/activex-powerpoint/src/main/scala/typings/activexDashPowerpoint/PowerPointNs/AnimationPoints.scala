package typings.activexDashPowerpoint.PowerPointNs

import typings.activexDashOffice.OfficeNs.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.AnimationPoints")
@js.native
class AnimationPoints protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPointNs.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.AnimationPoints_typekey`: AnimationPoints = js.native
  var Smooth: MsoTriState = js.native
  /** @param number [Index=-1] */
  def Add(): AnimationPoint = js.native
  def Add(Index: Double): AnimationPoint = js.native
  def Item(Index: Double): AnimationPoint = js.native
}

