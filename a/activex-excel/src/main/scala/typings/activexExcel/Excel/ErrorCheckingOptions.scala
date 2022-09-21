package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorCheckingOptions extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  var BackgroundChecking: Boolean
  
  val Creator: XlCreator
  
  var EmptyCellReferences: Boolean
  
  var EvaluateToError: Boolean
  
  /* private */ @JSName("Excel.ErrorCheckingOptions_typekey")
  var ExcelDotErrorCheckingOptions_typekey: ErrorCheckingOptions
  
  var InconsistentFormula: Boolean
  
  var InconsistentTableFormula: Boolean
  
  var IndicatorColorIndex: XlColorIndex
  
  var ListDataValidation: Boolean
  
  var NumberAsText: Boolean
  
  var OmittedCells: Boolean
  
  val Parent: Any
  
  var TextDate: Boolean
  
  var UnlockedFormulaCells: Boolean
}
object ErrorCheckingOptions {
  
  inline def apply(
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
    Parent: Any,
    TextDate: Boolean,
    UnlockedFormulaCells: Boolean
  ): ErrorCheckingOptions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BackgroundChecking = BackgroundChecking.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], EmptyCellReferences = EmptyCellReferences.asInstanceOf[js.Any], EvaluateToError = EvaluateToError.asInstanceOf[js.Any], InconsistentFormula = InconsistentFormula.asInstanceOf[js.Any], InconsistentTableFormula = InconsistentTableFormula.asInstanceOf[js.Any], IndicatorColorIndex = IndicatorColorIndex.asInstanceOf[js.Any], ListDataValidation = ListDataValidation.asInstanceOf[js.Any], NumberAsText = NumberAsText.asInstanceOf[js.Any], OmittedCells = OmittedCells.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], TextDate = TextDate.asInstanceOf[js.Any], UnlockedFormulaCells = UnlockedFormulaCells.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ErrorCheckingOptions_typekey")(ExcelDotErrorCheckingOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCheckingOptions]
  }
  
  extension [Self <: ErrorCheckingOptions](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBackgroundChecking(value: Boolean): Self = StObject.set(x, "BackgroundChecking", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setEmptyCellReferences(value: Boolean): Self = StObject.set(x, "EmptyCellReferences", value.asInstanceOf[js.Any])
    
    inline def setEvaluateToError(value: Boolean): Self = StObject.set(x, "EvaluateToError", value.asInstanceOf[js.Any])
    
    inline def setExcelDotErrorCheckingOptions_typekey(value: ErrorCheckingOptions): Self = StObject.set(x, "Excel.ErrorCheckingOptions_typekey", value.asInstanceOf[js.Any])
    
    inline def setInconsistentFormula(value: Boolean): Self = StObject.set(x, "InconsistentFormula", value.asInstanceOf[js.Any])
    
    inline def setInconsistentTableFormula(value: Boolean): Self = StObject.set(x, "InconsistentTableFormula", value.asInstanceOf[js.Any])
    
    inline def setIndicatorColorIndex(value: XlColorIndex): Self = StObject.set(x, "IndicatorColorIndex", value.asInstanceOf[js.Any])
    
    inline def setListDataValidation(value: Boolean): Self = StObject.set(x, "ListDataValidation", value.asInstanceOf[js.Any])
    
    inline def setNumberAsText(value: Boolean): Self = StObject.set(x, "NumberAsText", value.asInstanceOf[js.Any])
    
    inline def setOmittedCells(value: Boolean): Self = StObject.set(x, "OmittedCells", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setTextDate(value: Boolean): Self = StObject.set(x, "TextDate", value.asInstanceOf[js.Any])
    
    inline def setUnlockedFormulaCells(value: Boolean): Self = StObject.set(x, "UnlockedFormulaCells", value.asInstanceOf[js.Any])
  }
}
