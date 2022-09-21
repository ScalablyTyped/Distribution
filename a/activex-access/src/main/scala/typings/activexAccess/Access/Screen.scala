package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Screen extends StObject {
  
  /* private */ @JSName("Access.Screen_typekey")
  var AccessDotScreen_typekey: Screen
  
  val ActiveControl: Control
  
  val ActiveDataAccessPage: DataAccessPage
  
  val ActiveDatasheet: Form
  
  val ActiveForm: Form
  
  val ActiveReport: Report
  
  val Application: typings.activexAccess.Access.Application
  
  def IsMemberSafe(dispid: Double): Boolean
  
  var MousePointer: Double
  
  val Parent: Any
  
  val PreviousControl: Control
}
object Screen {
  
  inline def apply(
    AccessDotScreen_typekey: Screen,
    ActiveControl: Control,
    ActiveDataAccessPage: DataAccessPage,
    ActiveDatasheet: Form,
    ActiveForm: Form,
    ActiveReport: Report,
    Application: Application,
    IsMemberSafe: Double => Boolean,
    MousePointer: Double,
    Parent: Any,
    PreviousControl: Control
  ): Screen = {
    val __obj = js.Dynamic.literal(ActiveControl = ActiveControl.asInstanceOf[js.Any], ActiveDataAccessPage = ActiveDataAccessPage.asInstanceOf[js.Any], ActiveDatasheet = ActiveDatasheet.asInstanceOf[js.Any], ActiveForm = ActiveForm.asInstanceOf[js.Any], ActiveReport = ActiveReport.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), MousePointer = MousePointer.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PreviousControl = PreviousControl.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.Screen_typekey")(AccessDotScreen_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screen]
  }
  
  extension [Self <: Screen](x: Self) {
    
    inline def setAccessDotScreen_typekey(value: Screen): Self = StObject.set(x, "Access.Screen_typekey", value.asInstanceOf[js.Any])
    
    inline def setActiveControl(value: Control): Self = StObject.set(x, "ActiveControl", value.asInstanceOf[js.Any])
    
    inline def setActiveDataAccessPage(value: DataAccessPage): Self = StObject.set(x, "ActiveDataAccessPage", value.asInstanceOf[js.Any])
    
    inline def setActiveDatasheet(value: Form): Self = StObject.set(x, "ActiveDatasheet", value.asInstanceOf[js.Any])
    
    inline def setActiveForm(value: Form): Self = StObject.set(x, "ActiveForm", value.asInstanceOf[js.Any])
    
    inline def setActiveReport(value: Report): Self = StObject.set(x, "ActiveReport", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    inline def setMousePointer(value: Double): Self = StObject.set(x, "MousePointer", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPreviousControl(value: Control): Self = StObject.set(x, "PreviousControl", value.asInstanceOf[js.Any])
  }
}
