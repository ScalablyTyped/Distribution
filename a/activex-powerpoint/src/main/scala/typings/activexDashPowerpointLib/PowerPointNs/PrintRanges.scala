package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.PrintRanges")
@js.native
class PrintRanges protected () extends js.Object {
  val Application: activexDashPowerpointLib.PowerPointNs.Application = js.native
  val Count: scala.Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.PrintRanges_typekey`: PrintRanges = js.native
  def Add(Start: scala.Double, End: scala.Double): PrintRange = js.native
  def ClearAll(): scala.Unit = js.native
  def Item(Index: scala.Double): PrintRange = js.native
}

