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
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    getFormula1: js.Function0[java.lang.String],
    getFormula2: js.Function0[java.lang.String],
    getOperator: js.Function0[ConditionOperator],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getSourcePosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setFormula1: js.Function1[java.lang.String, scala.Unit],
    setFormula2: js.Function1[java.lang.String, scala.Unit],
    setOperator: js.Function1[ConditionOperator, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setSourcePosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, scala.Unit]
  ): TableValidation = {
    val __obj = js.Dynamic.literal(ErrorAlertStyle = ErrorAlertStyle, ErrorMessage = ErrorMessage, ErrorTitle = ErrorTitle, Formula1 = Formula1, Formula2 = Formula2, IgnoreBlankCells = IgnoreBlankCells, InputMessage = InputMessage, InputTitle = InputTitle, Operator = Operator, PropertySetInfo = PropertySetInfo, ShowErrorMessage = ShowErrorMessage, ShowInputMessage = ShowInputMessage, ShowList = ShowList, SourcePosition = SourcePosition, Type = Type, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getFormula1 = getFormula1, getFormula2 = getFormula2, getOperator = getOperator, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getSourcePosition = getSourcePosition, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setFormula1 = setFormula1, setFormula2 = setFormula2, setOperator = setOperator, setPropertyValue = setPropertyValue, setSourcePosition = setSourcePosition)
  
    __obj.asInstanceOf[TableValidation]
  }
}

