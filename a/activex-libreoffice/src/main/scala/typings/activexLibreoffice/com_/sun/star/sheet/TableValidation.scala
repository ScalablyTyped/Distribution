package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents the data validation settings for a cell or cell range. */
@js.native
trait TableValidation
  extends XPropertySet
     with XSheetCondition {
  /**
    * specifies the style of the error message.
    *
    * This is used only if {@link TableValidation.ShowErrorMessage} is set to `TRUE` .
    */
  var ErrorAlertStyle: ValidationAlertStyle = js.native
  /**
    * specifies the text of the error message.
    *
    * This is only used if {@link TableValidation.ShowErrorMessage} is set to `TRUE` .
    */
  var ErrorMessage: String = js.native
  /**
    * specifies the title of the window showing the error message.
    *
    * This is only used if {@link TableValidation.ShowErrorMessage} is set to `TRUE` .
    */
  var ErrorTitle: String = js.native
  /** specifies if blank cells should be allowed. */
  var IgnoreBlankCells: Boolean = js.native
  /**
    * specifies the text of the input message.
    *
    * This is only used if {@link TableValidation.ShowInputMessage} is set to `TRUE` .
    */
  var InputMessage: String = js.native
  /**
    * specifies the title of the window showing the input message.
    *
    * This is only used if {@link TableValidation.ShowInputMessage} is set to `TRUE` .
    */
  var InputTitle: String = js.native
  /** specifies if an error message is displayed when invalid data is entered. */
  var ShowErrorMessage: Boolean = js.native
  /** specifies if an input message is shown when the cursor is in a cell with these validation settings. */
  var ShowInputMessage: Boolean = js.native
  /**
    * specifies if the list of possible values should be shown on the cell and how.
    *
    * See also {@link TableValidationVisibility}
    */
  var ShowList: Double = js.native
  /** specifies the type of validation. */
  var Type: ValidationType = js.native
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
    val __obj = js.Dynamic.literal(ErrorAlertStyle = ErrorAlertStyle.asInstanceOf[js.Any], ErrorMessage = ErrorMessage.asInstanceOf[js.Any], ErrorTitle = ErrorTitle.asInstanceOf[js.Any], Formula1 = Formula1.asInstanceOf[js.Any], Formula2 = Formula2.asInstanceOf[js.Any], IgnoreBlankCells = IgnoreBlankCells.asInstanceOf[js.Any], InputMessage = InputMessage.asInstanceOf[js.Any], InputTitle = InputTitle.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ShowErrorMessage = ShowErrorMessage.asInstanceOf[js.Any], ShowInputMessage = ShowInputMessage.asInstanceOf[js.Any], ShowList = ShowList.asInstanceOf[js.Any], SourcePosition = SourcePosition.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getFormula1 = js.Any.fromFunction0(getFormula1), getFormula2 = js.Any.fromFunction0(getFormula2), getOperator = js.Any.fromFunction0(getOperator), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSourcePosition = js.Any.fromFunction0(getSourcePosition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setFormula1 = js.Any.fromFunction1(setFormula1), setFormula2 = js.Any.fromFunction1(setFormula2), setOperator = js.Any.fromFunction1(setOperator), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSourcePosition = js.Any.fromFunction1(setSourcePosition))
    __obj.asInstanceOf[TableValidation]
  }
  @scala.inline
  implicit class TableValidationOps[Self <: TableValidation] (val x: Self) extends AnyVal {
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
    def setErrorAlertStyle(value: ValidationAlertStyle): Self = this.set("ErrorAlertStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorTitle(value: String): Self = this.set("ErrorTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreBlankCells(value: Boolean): Self = this.set("IgnoreBlankCells", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputMessage(value: String): Self = this.set("InputMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputTitle(value: String): Self = this.set("InputTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowErrorMessage(value: Boolean): Self = this.set("ShowErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowInputMessage(value: Boolean): Self = this.set("ShowInputMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowList(value: Double): Self = this.set("ShowList", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ValidationType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

