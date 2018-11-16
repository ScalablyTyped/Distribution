package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Rows")
@js.native
class Rows protected () extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Rows_typekey`: Rows = js.native
  /** @param number [BeforeRow=-1] */
  def Add(): Row = js.native
  /** @param number [BeforeRow=-1] */
  def Add(BeforeRow: scala.Double): Row = js.native
  def Item(Index: scala.Double): Row = js.native
}

