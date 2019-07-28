package typings.activexDashPowerpoint.PowerPointNs

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Comment")
@js.native
class Comment protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPointNs.Application = js.native
  val Author: String = js.native
  val AuthorIndex: Double = js.native
  val AuthorInitials: String = js.native
  val DateTime: VarDate = js.native
  val Left: Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Comment_typekey`: Comment = js.native
  val Text: String = js.native
  val Top: Double = js.native
  def Delete(): Unit = js.native
}

