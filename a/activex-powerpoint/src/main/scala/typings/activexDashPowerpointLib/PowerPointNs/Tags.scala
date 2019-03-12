package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Tags")
@js.native
class Tags protected () extends js.Object {
  val Application: activexDashPowerpointLib.PowerPointNs.Application = js.native
  val Count: scala.Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Tags_typekey`: Tags = js.native
  def Add(Name: java.lang.String, Value: java.lang.String): scala.Unit = js.native
  def AddBinary(Name: java.lang.String, FilePath: java.lang.String): scala.Unit = js.native
  def BinaryValue(Name: java.lang.String): scala.Double = js.native
  def Delete(Name: java.lang.String): scala.Unit = js.native
  def Item(Name: java.lang.String): java.lang.String = js.native
  def Name(Index: scala.Double): java.lang.String = js.native
  def Value(Index: scala.Double): java.lang.String = js.native
}

