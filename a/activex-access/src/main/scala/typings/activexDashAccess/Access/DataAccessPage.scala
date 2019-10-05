package typings.activexDashAccess.Access

import typings.activexDashOffice.Office.MsoEnvelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.DataAccessPage")
@js.native
class DataAccessPage protected () extends js.Object {
  var `Access.DataAccessPage_typekey`: DataAccessPage = js.native
  val Application: typings.activexDashAccess.Access.Application = js.native
  var ConnectionString: String = js.native
  val CurrentSelection: js.Any = js.native
  val CurrentView: Double = js.native
  val Document: js.Any = js.native
  val FieldListConnection: js.Any = js.native
  val MSODSC: js.Any = js.native
  val MailEnvelope: MsoEnvelope = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  var RemovePersonalInformation: Boolean = js.native
  var Tag: String = js.native
  var Visible: Boolean = js.native
  val WebOptions: typings.activexDashAccess.Access.WebOptions = js.native
  val WindowHeight: Double = js.native
  val WindowWidth: Double = js.native
  val _Name: String = js.native
  def ApplyTheme(ThemeName: String): Unit = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
}

