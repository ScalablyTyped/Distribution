package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Tags")
@js.native
class Tags protected () extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Tags_typekey")
  var PowerPointDotTags_typekey: Tags = js.native
  def Add(Name: String, Value: String): Unit = js.native
  def AddBinary(Name: String, FilePath: String): Unit = js.native
  def BinaryValue(Name: String): Double = js.native
  def Delete(Name: String): Unit = js.native
  def Item(Name: String): String = js.native
  def Name(Index: Double): String = js.native
  def Value(Index: Double): String = js.native
}

