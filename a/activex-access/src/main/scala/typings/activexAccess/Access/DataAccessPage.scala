package typings.activexAccess.Access

import typings.activexOffice.Office.MsoEnvelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataAccessPage extends js.Object {
  @JSName("Access.DataAccessPage_typekey")
  var AccessDotDataAccessPage_typekey: DataAccessPage
  val Application: typings.activexAccess.Access.Application
  var ConnectionString: String
  val CurrentSelection: js.Any
  val CurrentView: Double
  val Document: js.Any
  val FieldListConnection: js.Any
  val MSODSC: js.Any
  val MailEnvelope: MsoEnvelope
  val Name: String
  val Parent: js.Any
  var RemovePersonalInformation: Boolean
  var Tag: String
  var Visible: Boolean
  val WebOptions: typings.activexAccess.Access.WebOptions
  val WindowHeight: Double
  val WindowWidth: Double
  val _Name: String
  def ApplyTheme(ThemeName: String): Unit
  def IsMemberSafe(dispid: Double): Boolean
}

object DataAccessPage {
  @scala.inline
  def apply(
    AccessDotDataAccessPage_typekey: DataAccessPage,
    Application: Application,
    ApplyTheme: String => Unit,
    ConnectionString: String,
    CurrentSelection: js.Any,
    CurrentView: Double,
    Document: js.Any,
    FieldListConnection: js.Any,
    IsMemberSafe: Double => Boolean,
    MSODSC: js.Any,
    MailEnvelope: MsoEnvelope,
    Name: String,
    Parent: js.Any,
    RemovePersonalInformation: Boolean,
    Tag: String,
    Visible: Boolean,
    WebOptions: WebOptions,
    WindowHeight: Double,
    WindowWidth: Double,
    _Name: String
  ): DataAccessPage = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ApplyTheme = js.Any.fromFunction1(ApplyTheme), ConnectionString = ConnectionString.asInstanceOf[js.Any], CurrentSelection = CurrentSelection.asInstanceOf[js.Any], CurrentView = CurrentView.asInstanceOf[js.Any], Document = Document.asInstanceOf[js.Any], FieldListConnection = FieldListConnection.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), MSODSC = MSODSC.asInstanceOf[js.Any], MailEnvelope = MailEnvelope.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RemovePersonalInformation = RemovePersonalInformation.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], WebOptions = WebOptions.asInstanceOf[js.Any], WindowHeight = WindowHeight.asInstanceOf[js.Any], WindowWidth = WindowWidth.asInstanceOf[js.Any], _Name = _Name.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.DataAccessPage_typekey")(AccessDotDataAccessPage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataAccessPage]
  }
}

