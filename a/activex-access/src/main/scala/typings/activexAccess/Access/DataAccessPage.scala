package typings.activexAccess.Access

import typings.activexOffice.Office.MsoEnvelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataAccessPage extends js.Object {
  
  @JSName("Access.DataAccessPage_typekey")
  var AccessDotDataAccessPage_typekey: DataAccessPage = js.native
  
  val Application: typings.activexAccess.Access.Application = js.native
  
  def ApplyTheme(ThemeName: String): Unit = js.native
  
  var ConnectionString: String = js.native
  
  val CurrentSelection: js.Any = js.native
  
  val CurrentView: Double = js.native
  
  val Document: js.Any = js.native
  
  val FieldListConnection: js.Any = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
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
  
  @scala.inline
  implicit class DataAccessPageOps[Self <: DataAccessPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessDotDataAccessPage_typekey(value: DataAccessPage): Self = this.set("Access.DataAccessPage_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyTheme(value: String => Unit): Self = this.set("ApplyTheme", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConnectionString(value: String): Self = this.set("ConnectionString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentSelection(value: js.Any): Self = this.set("CurrentSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentView(value: Double): Self = this.set("CurrentView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument(value: js.Any): Self = this.set("Document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldListConnection(value: js.Any): Self = this.set("FieldListConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = this.set("IsMemberSafe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMSODSC(value: js.Any): Self = this.set("MSODSC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailEnvelope(value: MsoEnvelope): Self = this.set("MailEnvelope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovePersonalInformation(value: Boolean): Self = this.set("RemovePersonalInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("Visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebOptions(value: WebOptions): Self = this.set("WebOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowHeight(value: Double): Self = this.set("WindowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowWidth(value: Double): Self = this.set("WindowWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_Name(value: String): Self = this.set("_Name", value.asInstanceOf[js.Any])
  }
}
