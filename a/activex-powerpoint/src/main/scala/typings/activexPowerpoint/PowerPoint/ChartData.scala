package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartData extends StObject {
  
  def Activate(): Unit = js.native
  
  def BreakLink(): Unit = js.native
  
  val IsLinked: Boolean = js.native
  
  @JSName("PowerPoint.ChartData_typekey")
  var PowerPointDotChartData_typekey: ChartData = js.native
  
  val Workbook: js.Any = js.native
}
object ChartData {
  
  @scala.inline
  def apply(
    Activate: () => Unit,
    BreakLink: () => Unit,
    IsLinked: Boolean,
    PowerPointDotChartData_typekey: ChartData,
    Workbook: js.Any
  ): ChartData = {
    val __obj = js.Dynamic.literal(Activate = js.Any.fromFunction0(Activate), BreakLink = js.Any.fromFunction0(BreakLink), IsLinked = IsLinked.asInstanceOf[js.Any], Workbook = Workbook.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ChartData_typekey")(PowerPointDotChartData_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartData]
  }
  
  @scala.inline
  implicit class ChartDataMutableBuilder[Self <: ChartData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: () => Unit): Self = StObject.set(x, "Activate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBreakLink(value: () => Unit): Self = StObject.set(x, "BreakLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLinked(value: Boolean): Self = StObject.set(x, "IsLinked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotChartData_typekey(value: ChartData): Self = StObject.set(x, "PowerPoint.ChartData_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkbook(value: js.Any): Self = StObject.set(x, "Workbook", value.asInstanceOf[js.Any])
  }
}
