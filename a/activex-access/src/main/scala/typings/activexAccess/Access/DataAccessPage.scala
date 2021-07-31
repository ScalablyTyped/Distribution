package typings.activexAccess.Access

import typings.activexOffice.Office.MsoEnvelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataAccessPage extends StObject {
  
  @JSName("Access.DataAccessPage_typekey")
  var AccessDotDataAccessPage_typekey: DataAccessPage
  
  val Application: typings.activexAccess.Access.Application
  
  def ApplyTheme(ThemeName: String): Unit
  
  var ConnectionString: String
  
  val CurrentSelection: js.Any
  
  val CurrentView: Double
  
  val Document: js.Any
  
  val FieldListConnection: js.Any
  
  def IsMemberSafe(dispid: Double): Boolean
  
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
  implicit class DataAccessPageMutableBuilder[Self <: DataAccessPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessDotDataAccessPage_typekey(value: DataAccessPage): Self = StObject.set(x, "Access.DataAccessPage_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyTheme(value: String => Unit): Self = StObject.set(x, "ApplyTheme", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConnectionString(value: String): Self = StObject.set(x, "ConnectionString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentSelection(value: js.Any): Self = StObject.set(x, "CurrentSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentView(value: Double): Self = StObject.set(x, "CurrentView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument(value: js.Any): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldListConnection(value: js.Any): Self = StObject.set(x, "FieldListConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMSODSC(value: js.Any): Self = StObject.set(x, "MSODSC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailEnvelope(value: MsoEnvelope): Self = StObject.set(x, "MailEnvelope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovePersonalInformation(value: Boolean): Self = StObject.set(x, "RemovePersonalInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebOptions(value: WebOptions): Self = StObject.set(x, "WebOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowHeight(value: Double): Self = StObject.set(x, "WindowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowWidth(value: Double): Self = StObject.set(x, "WindowWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_Name(value: String): Self = StObject.set(x, "_Name", value.asInstanceOf[js.Any])
  }
}
