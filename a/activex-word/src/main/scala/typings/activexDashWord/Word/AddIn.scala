package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.AddIn")
@js.native
class AddIn protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Autoload: Boolean = js.native
  val Compiled: Boolean = js.native
  val Creator: Double = js.native
  val Index: Double = js.native
  var Installed: Boolean = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val Path: String = js.native
  @JSName("Word.AddIn_typekey")
  var WordDotAddIn_typekey: AddIn = js.native
  def Delete(): Unit = js.native
}

