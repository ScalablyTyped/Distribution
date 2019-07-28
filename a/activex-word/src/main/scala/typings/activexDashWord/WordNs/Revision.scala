package typings.activexDashWord.WordNs

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Revision")
@js.native
class Revision protected () extends js.Object {
  val Application: typings.activexDashWord.WordNs.Application = js.native
  val Author: String = js.native
  val Cells: typings.activexDashWord.WordNs.Cells = js.native
  val Creator: Double = js.native
  val Date: VarDate = js.native
  val FormatDescription: String = js.native
  val Index: Double = js.native
  val MovedRange: typings.activexDashWord.WordNs.Range = js.native
  val Parent: js.Any = js.native
  val Range: typings.activexDashWord.WordNs.Range = js.native
  val Style: typings.activexDashWord.WordNs.Style = js.native
  val Type: WdRevisionType = js.native
  var `Word.Revision_typekey`: Revision = js.native
  def Accept(): Unit = js.native
  def Reject(): Unit = js.native
}

