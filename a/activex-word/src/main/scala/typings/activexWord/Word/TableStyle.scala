package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableStyle extends js.Object {
  
  var Alignment: WdRowAlignment = js.native
  
  var AllowBreakAcrossPage: Double = js.native
  
  var AllowPageBreaks: Boolean = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var Borders: typings.activexWord.Word.Borders = js.native
  
  var BottomPadding: Double = js.native
  
  var ColumnStripe: Double = js.native
  
  def Condition(ConditionCode: WdConditionCode): ConditionalStyle = js.native
  
  val Creator: Double = js.native
  
  var LeftIndent: Double = js.native
  
  var LeftPadding: Double = js.native
  
  val Parent: js.Any = js.native
  
  var RightPadding: Double = js.native
  
  var RowStripe: Double = js.native
  
  val Shading: typings.activexWord.Word.Shading = js.native
  
  var Spacing: Double = js.native
  
  var TableDirection: WdTableDirection = js.native
  
  var TopPadding: Double = js.native
  
  @JSName("Word.TableStyle_typekey")
  var WordDotTableStyle_typekey: TableStyle = js.native
}
object TableStyle {
  
  @scala.inline
  def apply(
    Alignment: WdRowAlignment,
    AllowBreakAcrossPage: Double,
    AllowPageBreaks: Boolean,
    Application: Application,
    Borders: Borders,
    BottomPadding: Double,
    ColumnStripe: Double,
    Condition: WdConditionCode => ConditionalStyle,
    Creator: Double,
    LeftIndent: Double,
    LeftPadding: Double,
    Parent: js.Any,
    RightPadding: Double,
    RowStripe: Double,
    Shading: Shading,
    Spacing: Double,
    TableDirection: WdTableDirection,
    TopPadding: Double,
    WordDotTableStyle_typekey: TableStyle
  ): TableStyle = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], AllowBreakAcrossPage = AllowBreakAcrossPage.asInstanceOf[js.Any], AllowPageBreaks = AllowPageBreaks.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], BottomPadding = BottomPadding.asInstanceOf[js.Any], ColumnStripe = ColumnStripe.asInstanceOf[js.Any], Condition = js.Any.fromFunction1(Condition), Creator = Creator.asInstanceOf[js.Any], LeftIndent = LeftIndent.asInstanceOf[js.Any], LeftPadding = LeftPadding.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RightPadding = RightPadding.asInstanceOf[js.Any], RowStripe = RowStripe.asInstanceOf[js.Any], Shading = Shading.asInstanceOf[js.Any], Spacing = Spacing.asInstanceOf[js.Any], TableDirection = TableDirection.asInstanceOf[js.Any], TopPadding = TopPadding.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TableStyle_typekey")(WordDotTableStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableStyle]
  }
  
  @scala.inline
  implicit class TableStyleOps[Self <: TableStyle] (val x: Self) extends AnyVal {
    
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
    def setAlignment(value: WdRowAlignment): Self = this.set("Alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowBreakAcrossPage(value: Double): Self = this.set("AllowBreakAcrossPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPageBreaks(value: Boolean): Self = this.set("AllowPageBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorders(value: Borders): Self = this.set("Borders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomPadding(value: Double): Self = this.set("BottomPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnStripe(value: Double): Self = this.set("ColumnStripe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCondition(value: WdConditionCode => ConditionalStyle): Self = this.set("Condition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftIndent(value: Double): Self = this.set("LeftIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftPadding(value: Double): Self = this.set("LeftPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightPadding(value: Double): Self = this.set("RightPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowStripe(value: Double): Self = this.set("RowStripe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShading(value: Shading): Self = this.set("Shading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacing(value: Double): Self = this.set("Spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableDirection(value: WdTableDirection): Self = this.set("TableDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopPadding(value: Double): Self = this.set("TopPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotTableStyle_typekey(value: TableStyle): Self = this.set("Word.TableStyle_typekey", value.asInstanceOf[js.Any])
  }
}
