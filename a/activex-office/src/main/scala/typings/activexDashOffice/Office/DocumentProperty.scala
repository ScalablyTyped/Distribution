package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.DocumentProperty")
@js.native
class DocumentProperty[TApplication] protected () extends js.Object {
  var Application: TApplication = js.native
  var Creator: Double = js.native
  var LinkSource: String = js.native
  var LinkToContent: Boolean = js.native
  var Name: String = js.native
  @JSName("Office.DocumentProperty_typekey")
  var OfficeDotDocumentProperty_typekey: DocumentProperty[TApplication] = js.native
  var Parent: js.Any = js.native
  var Type: MsoDocProperties = js.native
  var Value: js.Any = js.native
  def Delete(): Unit = js.native
}

