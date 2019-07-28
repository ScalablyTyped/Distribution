package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents the data validation settings for a cell or cell range. */
trait TableValidation
  extends XPropertySet
     with XSheetCondition {
  /**
    * specifies the style of the error message.
    *
    * This is used only if {@link TableValidation.ShowErrorMessage} is set to `TRUE` .
    */
  var ErrorAlertStyle: ValidationAlertStyle
  /**
    * specifies the text of the error message.
    *
    * This is only used if {@link TableValidation.ShowErrorMessage} is set to `TRUE` .
    */
  var ErrorMessage: String
  /**
    * specifies the title of the window showing the error message.
    *
    * This is only used if {@link TableValidation.ShowErrorMessage} is set to `TRUE` .
    */
  var ErrorTitle: String
  /** specifies if blank cells should be allowed. */
  var IgnoreBlankCells: Boolean
  /**
    * specifies the text of the input message.
    *
    * This is only used if {@link TableValidation.ShowInputMessage} is set to `TRUE` .
    */
  var InputMessage: String
  /**
    * specifies the title of the window showing the input message.
    *
    * This is only used if {@link TableValidation.ShowInputMessage} is set to `TRUE` .
    */
  var InputTitle: String
  /** specifies if an error message is displayed when invalid data is entered. */
  var ShowErrorMessage: Boolean
  /** specifies if an input message is shown when the cursor is in a cell with these validation settings. */
  var ShowInputMessage: Boolean
  /**
    * specifies if the list of possible values should be shown on the cell and how.
    *
    * See also {@link TableValidationVisibility}
    */
  var ShowList: Double
  /** specifies the type of validation. */
  var Type: ValidationType
}

object TableValidation {
  @scala.inline
  def apply(
    ErrorAlertStyle: ValidationAlertStyle,
    ErrorMessage: String,
    ErrorTitle: String,
    Formula1: String,
    Formula2: String,
    IgnoreBlankCells: Boolean,
    InputMessage: String,
    InputTitle: String,
    Operator: ConditionOperator,
    PropertySetInfo: XPropertySetInfo,
    ShowErrorMessage: Boolean,
    ShowInputMessage: Boolean,
    ShowList: Double,
    SourcePosition: CellAddress,
    Type: ValidationType,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getFormula1: () => String,
    getFormula2: () => String,
    getOperator: () => ConditionOperator,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getSourcePosition: () => CellAddress,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setFormula1: String => Unit,
    setFormula2: String => Unit,
    setOperator: ConditionOperator => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setSourcePosition: CellAddress => Unit
  ): TableValidation = {
    val __obj = js.Dynamic.literal(ErrorAlertStyle = ErrorAlertStyle, ErrorMessage = ErrorMessage, ErrorTitle = ErrorTitle, Formula1 = Formula1, Formula2 = Formula2, IgnoreBlankCells = IgnoreBlankCells, InputMessage = InputMessage, InputTitle = InputTitle, Operator = Operator, PropertySetInfo = PropertySetInfo, ShowErrorMessage = ShowErrorMessage, ShowInputMessage = ShowInputMessage, ShowList = ShowList, SourcePosition = SourcePosition, Type = Type, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getFormula1 = js.Any.fromFunction0(getFormula1), getFormula2 = js.Any.fromFunction0(getFormula2), getOperator = js.Any.fromFunction0(getOperator), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSourcePosition = js.Any.fromFunction0(getSourcePosition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setFormula1 = js.Any.fromFunction1(setFormula1), setFormula2 = js.Any.fromFunction1(setFormula2), setOperator = js.Any.fromFunction1(setOperator), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSourcePosition = js.Any.fromFunction1(setSourcePosition))
  
    __obj.asInstanceOf[TableValidation]
  }
}

