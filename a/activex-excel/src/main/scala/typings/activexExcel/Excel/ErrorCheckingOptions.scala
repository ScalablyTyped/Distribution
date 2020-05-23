package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorCheckingOptions extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  var BackgroundChecking: Boolean
  val Creator: XlCreator
  var EmptyCellReferences: Boolean
  var EvaluateToError: Boolean
  @JSName("Excel.ErrorCheckingOptions_typekey")
  var ExcelDotErrorCheckingOptions_typekey: ErrorCheckingOptions
  var InconsistentFormula: Boolean
  var InconsistentTableFormula: Boolean
  var IndicatorColorIndex: XlColorIndex
  var ListDataValidation: Boolean
  var NumberAsText: Boolean
  var OmittedCells: Boolean
  val Parent: js.Any
  var TextDate: Boolean
  var UnlockedFormulaCells: Boolean
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
}

