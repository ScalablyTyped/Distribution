package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.AnimationPoints")
@js.native
class AnimationPoints protected () extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.AnimationPoints_typekey`: AnimationPoints = js.native
  var Smooth: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  /** @param number [Index=-1] */
  def Add(): AnimationPoint = js.native
  def Add(Index: scala.Double): AnimationPoint = js.native
  def Item(Index: scala.Double): AnimationPoint = js.native
}

