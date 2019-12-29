package typings.activexDashWord.Word

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Version")
@js.native
class Version protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Comment: String = js.native
  val Creator: Double = js.native
  val Date: VarDate = js.native
  val Index: Double = js.native
  val Parent: js.Any = js.native
  val SavedBy: String = js.native
  @JSName("Word.Version_typekey")
  var WordDotVersion_typekey: Version = js.native
  def Delete(): Unit = js.native
  def Open(): Document = js.native
  def OpenOld(): Unit = js.native
}

