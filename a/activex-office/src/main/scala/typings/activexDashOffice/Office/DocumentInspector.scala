package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.DocumentInspector")
@js.native
class DocumentInspector protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  val Description: String = js.native
  val Name: String = js.native
  @JSName("Office.DocumentInspector_typekey")
  var OfficeDotDocumentInspector_typekey: DocumentInspector = js.native
  val Parent: js.Any = js.native
  def Fix(Status: MsoDocInspectorStatus, Results: String): Unit = js.native
  def Inspect(Status: MsoDocInspectorStatus, Results: String): Unit = js.native
}

