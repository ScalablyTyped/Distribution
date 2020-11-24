package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartData extends js.Object {
  
  def Activate(): Unit = js.native
  
  def BreakLink(): Unit = js.native
  
  val IsLinked: Boolean = js.native
  
  @JSName("Word.ChartData_typekey")
  var WordDotChartData_typekey: ChartData = js.native
  
  val Workbook: js.Any = js.native
}
object ChartData {
  
  @scala.inline
  def apply(
    Activate: () => Unit,
    BreakLink: () => Unit,
    IsLinked: Boolean,
    WordDotChartData_typekey: ChartData,
    Workbook: js.Any
  ): ChartData = {
    val __obj = js.Dynamic.literal(Activate = js.Any.fromFunction0(Activate), BreakLink = js.Any.fromFunction0(BreakLink), IsLinked = IsLinked.asInstanceOf[js.Any], Workbook = Workbook.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ChartData_typekey")(WordDotChartData_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartData]
  }
  
  @scala.inline
  implicit class ChartDataOps[Self <: ChartData] (val x: Self) extends AnyVal {
    
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
    def setActivate(value: () => Unit): Self = this.set("Activate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBreakLink(value: () => Unit): Self = this.set("BreakLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLinked(value: Boolean): Self = this.set("IsLinked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotChartData_typekey(value: ChartData): Self = this.set("Word.ChartData_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkbook(value: js.Any): Self = this.set("Workbook", value.asInstanceOf[js.Any])
  }
}
