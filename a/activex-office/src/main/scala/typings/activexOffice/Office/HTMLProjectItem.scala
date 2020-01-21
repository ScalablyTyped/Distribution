package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.HTMLProjectItem")
@js.native
class HTMLProjectItem protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  val IsOpen: Boolean = js.native
  val Name: String = js.native
  @JSName("Office.HTMLProjectItem_typekey")
  var OfficeDotHTMLProjectItem_typekey: HTMLProjectItem = js.native
  val Parent: js.Any = js.native
  var Text: String = js.native
  def LoadFromFile(FileName: String): Unit = js.native
  /** @param OpenKind [OpenKind=0] */
  def Open(): Unit = js.native
  def Open(OpenKind: MsoHTMLProjectOpen): Unit = js.native
  def SaveCopyAs(FileName: String): Unit = js.native
}

