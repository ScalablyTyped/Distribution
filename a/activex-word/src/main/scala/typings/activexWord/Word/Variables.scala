package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Variables")
@js.native
class Variables protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.Variables_typekey")
  var WordDotVariables_typekey: Variables = js.native
  def Add(Name: String): Variable = js.native
  def Add(Name: String, Value: js.Any): Variable = js.native
  def Item(Index: String): Variable = js.native
  def Item(Index: Double): Variable = js.native
}

