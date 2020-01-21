package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.NewFile")
@js.native
class NewFile protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  @JSName("Office.NewFile_typekey")
  var OfficeDotNewFile_typekey: NewFile = js.native
  def Add(FileName: String): Boolean = js.native
  def Add(FileName: String, Section: MsoFileNewSection): Boolean = js.native
  def Add(FileName: String, Section: MsoFileNewSection, DisplayName: String): Boolean = js.native
  def Add(FileName: String, Section: MsoFileNewSection, DisplayName: String, Action: MsoFileNewAction): Boolean = js.native
  def Remove(FileName: String): Boolean = js.native
  def Remove(FileName: String, Section: MsoFileNewSection): Boolean = js.native
  def Remove(FileName: String, Section: MsoFileNewSection, DisplayName: String): Boolean = js.native
  def Remove(FileName: String, Section: MsoFileNewSection, DisplayName: String, Action: MsoFileNewAction): Boolean = js.native
}

