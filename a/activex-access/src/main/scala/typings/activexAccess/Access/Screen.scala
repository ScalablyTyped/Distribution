package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Screen extends js.Object {
  
  @JSName("Access.Screen_typekey")
  var AccessDotScreen_typekey: Screen = js.native
  
  val ActiveControl: Control = js.native
  
  val ActiveDataAccessPage: DataAccessPage = js.native
  
  val ActiveDatasheet: Form = js.native
  
  val ActiveForm: Form = js.native
  
  val ActiveReport: Report = js.native
  
  val Application: typings.activexAccess.Access.Application = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  var MousePointer: Double = js.native
  
  val Parent: js.Any = js.native
  
  val PreviousControl: Control = js.native
}
object Screen {
  
  @scala.inline
  def apply(
    AccessDotScreen_typekey: Screen,
    ActiveControl: Control,
    ActiveDataAccessPage: DataAccessPage,
    ActiveDatasheet: Form,
    ActiveForm: Form,
    ActiveReport: Report,
    Application: Application,
    IsMemberSafe: Double => Boolean,
    MousePointer: Double,
    Parent: js.Any,
    PreviousControl: Control
  ): Screen = {
    val __obj = js.Dynamic.literal(ActiveControl = ActiveControl.asInstanceOf[js.Any], ActiveDataAccessPage = ActiveDataAccessPage.asInstanceOf[js.Any], ActiveDatasheet = ActiveDatasheet.asInstanceOf[js.Any], ActiveForm = ActiveForm.asInstanceOf[js.Any], ActiveReport = ActiveReport.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), MousePointer = MousePointer.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PreviousControl = PreviousControl.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.Screen_typekey")(AccessDotScreen_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screen]
  }
  
  @scala.inline
  implicit class ScreenOps[Self <: Screen] (val x: Self) extends AnyVal {
    
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
    def setAccessDotScreen_typekey(value: Screen): Self = this.set("Access.Screen_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveControl(value: Control): Self = this.set("ActiveControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveDataAccessPage(value: DataAccessPage): Self = this.set("ActiveDataAccessPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveDatasheet(value: Form): Self = this.set("ActiveDatasheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveForm(value: Form): Self = this.set("ActiveForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveReport(value: Report): Self = this.set("ActiveReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = this.set("IsMemberSafe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMousePointer(value: Double): Self = this.set("MousePointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousControl(value: Control): Self = this.set("PreviousControl", value.asInstanceOf[js.Any])
  }
}
