package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMsoChartData extends StObject {
  
  def Activate(): Unit
  
  def ActivateChartDataWindow(): Unit
  
  def BreakLink(): Unit
  
  val IsLinked: Boolean
  
  /* private */ @JSName("Office.IMsoChartData_typekey")
  var OfficeDotIMsoChartData_typekey: IMsoChartData
  
  val Workbook: js.Any
}
object IMsoChartData {
  
  inline def apply(
    Activate: () => Unit,
    ActivateChartDataWindow: () => Unit,
    BreakLink: () => Unit,
    IsLinked: Boolean,
    OfficeDotIMsoChartData_typekey: IMsoChartData,
    Workbook: js.Any
  ): IMsoChartData = {
    val __obj = js.Dynamic.literal(Activate = js.Any.fromFunction0(Activate), ActivateChartDataWindow = js.Any.fromFunction0(ActivateChartDataWindow), BreakLink = js.Any.fromFunction0(BreakLink), IsLinked = IsLinked.asInstanceOf[js.Any], Workbook = Workbook.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoChartData_typekey")(OfficeDotIMsoChartData_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoChartData]
  }
  
  extension [Self <: IMsoChartData](x: Self) {
    
    inline def setActivate(value: () => Unit): Self = StObject.set(x, "Activate", js.Any.fromFunction0(value))
    
    inline def setActivateChartDataWindow(value: () => Unit): Self = StObject.set(x, "ActivateChartDataWindow", js.Any.fromFunction0(value))
    
    inline def setBreakLink(value: () => Unit): Self = StObject.set(x, "BreakLink", js.Any.fromFunction0(value))
    
    inline def setIsLinked(value: Boolean): Self = StObject.set(x, "IsLinked", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotIMsoChartData_typekey(value: IMsoChartData): Self = StObject.set(x, "Office.IMsoChartData_typekey", value.asInstanceOf[js.Any])
    
    inline def setWorkbook(value: js.Any): Self = StObject.set(x, "Workbook", value.asInstanceOf[js.Any])
  }
}
