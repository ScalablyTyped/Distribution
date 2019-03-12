package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Comments")
@js.native
class Comments protected () extends js.Object {
  val Application: activexDashPowerpointLib.PowerPointNs.Application = js.native
  val Count: scala.Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Comments_typekey`: Comments = js.native
  def Add(
    Left: scala.Double,
    Top: scala.Double,
    Author: java.lang.String,
    AuthorInitials: java.lang.String,
    Text: java.lang.String
  ): Comment = js.native
  def Item(Index: scala.Double): Comment = js.native
}

