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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ErrorAlertStyle")(ErrorAlertStyle)
    __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    __obj.updateDynamic("ErrorTitle")(ErrorTitle)
    __obj.updateDynamic("Formula1")(Formula1)
    __obj.updateDynamic("Formula2")(Formula2)
    __obj.updateDynamic("IgnoreBlankCells")(IgnoreBlankCells)
    __obj.updateDynamic("InputMessage")(InputMessage)
    __obj.updateDynamic("InputTitle")(InputTitle)
    __obj.updateDynamic("Operator")(Operator)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("ShowErrorMessage")(ShowErrorMessage)
    __obj.updateDynamic("ShowInputMessage")(ShowInputMessage)
    __obj.updateDynamic("ShowList")(ShowList)
    __obj.updateDynamic("SourcePosition")(SourcePosition)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("getFormula1")(getFormula1)
    __obj.updateDynamic("getFormula2")(getFormula2)
    __obj.updateDynamic("getOperator")(getOperator)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getSourcePosition")(getSourcePosition)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setFormula1")(setFormula1)
    __obj.updateDynamic("setFormula2")(setFormula2)
    __obj.updateDynamic("setOperator")(setOperator)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("setSourcePosition")(setSourcePosition)
    __obj.asInstanceOf[TableValidation]
  }
}

