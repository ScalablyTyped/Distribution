package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents the data validation settings for a cell or cell range. */
trait TableValidation
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
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
  var ErrorMessage: java.lang.String
  /**
    * specifies the title of the window showing the error message.
    *
    * This is only used if {@link TableValidation.ShowErrorMessage} is set to `TRUE` .
    */
  var ErrorTitle: java.lang.String
  /** specifies if blank cells should be allowed. */
  var IgnoreBlankCells: scala.Boolean
  /**
    * specifies the text of the input message.
    *
    * This is only used if {@link TableValidation.ShowInputMessage} is set to `TRUE` .
    */
  var InputMessage: java.lang.String
  /**
    * specifies the title of the window showing the input message.
    *
    * This is only used if {@link TableValidation.ShowInputMessage} is set to `TRUE` .
    */
  var InputTitle: java.lang.String
  /** specifies if an error message is displayed when invalid data is entered. */
  var ShowErrorMessage: scala.Boolean
  /** specifies if an input message is shown when the cursor is in a cell with these validation settings. */
  var ShowInputMessage: scala.Boolean
  /**
    * specifies if the list of possible values should be shown on the cell and how.
    *
    * See also {@link TableValidationVisibility}
    */
  var ShowList: scala.Double
  /** specifies the type of validation. */
  var Type: ValidationType
}

object TableValidation {
  @scala.inline
  def apply(
    ErrorAlertStyle: ValidationAlertStyle,
    ErrorMessage: java.lang.String,
    ErrorTitle: java.lang.String,
    Formula1: java.lang.String,
    Formula2: java.lang.String,
    IgnoreBlankCells: scala.Boolean,
    InputMessage: java.lang.String,
    InputTitle: java.lang.String,
    Operator: ConditionOperator,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    ShowErrorMessage: scala.Boolean,
    ShowInputMessage: scala.Boolean,
    ShowList: scala.Double,
    SourcePosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    Type: ValidationType,
    acquire: () => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    getFormula1: () => java.lang.String,
    getFormula2: () => java.lang.String,
    getOperator: () => ConditionOperator,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getSourcePosition: () => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setFormula1: java.lang.String => scala.Unit,
    setFormula2: java.lang.String => scala.Unit,
    setOperator: ConditionOperator => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit,
    setSourcePosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress => scala.Unit
  ): TableValidation = {
    val __obj = js.Dynamic.literal(ErrorAlertStyle = ErrorAlertStyle, ErrorMessage = ErrorMessage, ErrorTitle = ErrorTitle, Formula1 = Formula1, Formula2 = Formula2, IgnoreBlankCells = IgnoreBlankCells, InputMessage = InputMessage, InputTitle = InputTitle, Operator = Operator, PropertySetInfo = PropertySetInfo, ShowErrorMessage = ShowErrorMessage, ShowInputMessage = ShowInputMessage, ShowList = ShowList, SourcePosition = SourcePosition, Type = Type, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getFormula1 = js.Any.fromFunction0(getFormula1), getFormula2 = js.Any.fromFunction0(getFormula2), getOperator = js.Any.fromFunction0(getOperator), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSourcePosition = js.Any.fromFunction0(getSourcePosition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setFormula1 = js.Any.fromFunction1(setFormula1), setFormula2 = js.Any.fromFunction1(setFormula2), setOperator = js.Any.fromFunction1(setOperator), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSourcePosition = js.Any.fromFunction1(setSourcePosition))
  
    __obj.asInstanceOf[TableValidation]
  }
}

