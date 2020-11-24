package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorCheckingOptions extends js.Object {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  var BackgroundChecking: Boolean = js.native
  
  val Creator: XlCreator = js.native
  
  var EmptyCellReferences: Boolean = js.native
  
  var EvaluateToError: Boolean = js.native
  
  @JSName("Excel.ErrorCheckingOptions_typekey")
  var ExcelDotErrorCheckingOptions_typekey: ErrorCheckingOptions = js.native
  
  var InconsistentFormula: Boolean = js.native
  
  var InconsistentTableFormula: Boolean = js.native
  
  var IndicatorColorIndex: XlColorIndex = js.native
  
  var ListDataValidation: Boolean = js.native
  
  var NumberAsText: Boolean = js.native
  
  var OmittedCells: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  var TextDate: Boolean = js.native
  
  var UnlockedFormulaCells: Boolean = js.native
}
object ErrorCheckingOptions {
  
  @scala.inline
  def apply(
    Application: Application,
    BackgroundChecking: Boolean,
    Creator: XlCreator,
    EmptyCellReferences: Boolean,
    EvaluateToError: Boolean,
    ExcelDotErrorCheckingOptions_typekey: ErrorCheckingOptions,
    InconsistentFormula: Boolean,
    InconsistentTableFormula: Boolean,
    IndicatorColorIndex: XlColorIndex,
    ListDataValidation: Boolean,
    NumberAsText: Boolean,
    OmittedCells: Boolean,
    Parent: js.Any,
    TextDate: Boolean,
    UnlockedFormulaCells: Boolean
  ): ErrorCheckingOptions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BackgroundChecking = BackgroundChecking.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], EmptyCellReferences = EmptyCellReferences.asInstanceOf[js.Any], EvaluateToError = EvaluateToError.asInstanceOf[js.Any], InconsistentFormula = InconsistentFormula.asInstanceOf[js.Any], InconsistentTableFormula = InconsistentTableFormula.asInstanceOf[js.Any], IndicatorColorIndex = IndicatorColorIndex.asInstanceOf[js.Any], ListDataValidation = ListDataValidation.asInstanceOf[js.Any], NumberAsText = NumberAsText.asInstanceOf[js.Any], OmittedCells = OmittedCells.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], TextDate = TextDate.asInstanceOf[js.Any], UnlockedFormulaCells = UnlockedFormulaCells.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ErrorCheckingOptions_typekey")(ExcelDotErrorCheckingOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCheckingOptions]
  }
  
  @scala.inline
  implicit class ErrorCheckingOptionsOps[Self <: ErrorCheckingOptions] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundChecking(value: Boolean): Self = this.set("BackgroundChecking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyCellReferences(value: Boolean): Self = this.set("EmptyCellReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluateToError(value: Boolean): Self = this.set("EvaluateToError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotErrorCheckingOptions_typekey(value: ErrorCheckingOptions): Self = this.set("Excel.ErrorCheckingOptions_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInconsistentFormula(value: Boolean): Self = this.set("InconsistentFormula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInconsistentTableFormula(value: Boolean): Self = this.set("InconsistentTableFormula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorColorIndex(value: XlColorIndex): Self = this.set("IndicatorColorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListDataValidation(value: Boolean): Self = this.set("ListDataValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberAsText(value: Boolean): Self = this.set("NumberAsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOmittedCells(value: Boolean): Self = this.set("OmittedCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDate(value: Boolean): Self = this.set("TextDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlockedFormulaCells(value: Boolean): Self = this.set("UnlockedFormulaCells", value.asInstanceOf[js.Any])
  }
}
