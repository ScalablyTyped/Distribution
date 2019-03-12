package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Columns")
@js.native
class Columns protected () extends js.Object {
  val Application: activexDashPowerpointLib.PowerPointNs.Application = js.native
  val Count: scala.Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Columns_typekey`: Columns = js.native
  /** @param number [BeforeColumn=-1] */
  def Add(): Column = js.native
  def Add(BeforeColumn: scala.Double): Column = js.native
  def Item(Index: scala.Double): Column = js.native
}

