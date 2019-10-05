package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabStops2 extends js.Object {
  val Application: js.Any = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  var DefaultSpacing: Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: Double): TabStop2 = js.native
  def Add(Type: MsoTabStopType, Position: Double): TabStop2 = js.native
  def Item(Index: Double): TabStop2 = js.native
}

