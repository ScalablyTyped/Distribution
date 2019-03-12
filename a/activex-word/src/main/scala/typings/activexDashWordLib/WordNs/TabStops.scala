package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.TabStops")
@js.native
class TabStops protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  var `Word.TabStops_typekey`: TabStops = js.native
  def Add(Position: scala.Double): TabStop = js.native
  def Add(Position: scala.Double, Alignment: js.Any): TabStop = js.native
  def Add(Position: scala.Double, Alignment: js.Any, Leader: js.Any): TabStop = js.native
  def After(Position: scala.Double): TabStop = js.native
  def Before(Position: scala.Double): TabStop = js.native
  def ClearAll(): scala.Unit = js.native
  def Item(Index: js.Any): TabStop = js.native
}

