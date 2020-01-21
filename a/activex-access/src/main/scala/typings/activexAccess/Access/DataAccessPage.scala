package typings.activexAccess.Access

import typings.activexOffice.Office.MsoEnvelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.DataAccessPage")
@js.native
class DataAccessPage protected () extends js.Object {
  @JSName("Access.DataAccessPage_typekey")
  var AccessDotDataAccessPage_typekey: DataAccessPage = js.native
  val Application: typings.activexAccess.Access.Application = js.native
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
  val WebOptions: typings.activexAccess.Access.WebOptions = js.native
  val WindowHeight: Double = js.native
  val WindowWidth: Double = js.native
  val _Name: String = js.native
  def ApplyTheme(ThemeName: String): Unit = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
}

