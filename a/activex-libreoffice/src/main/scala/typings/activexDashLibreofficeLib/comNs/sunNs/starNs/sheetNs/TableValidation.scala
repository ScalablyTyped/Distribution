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

