package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait XGlobalSheetSettings extends js.Object {
  /** specifies whether automatic completion of text in a cell is used. */
  var DoAutoComplete: scala.Boolean
  /** specifies whether the enter key can be used to start editing a cell. */
  var EnterEdit: scala.Boolean
  /** specifies whether formula references are extended when cells are inserted below or to the right of them. */
  var ExpandReferences: scala.Boolean
  /** specifies whether cell formatting is extended when entering data. */
  var ExtendFormat: scala.Boolean
  /**
    * specifies the update mode for external linked data.
    *
    * 0 = always
    *
    * 1 = never
    *
    * 2 = on demand
    */
  var LinkUpdateMode: scala.Double
  /** specifies whether the current selection is highlighted in column and row headers. */
  var MarkHeader: scala.Boolean
  /**
    * contains the metric for all spreadsheet documents.
    * @see com.sun.star.util.MeasureUnit
    */
  var Metric: scala.Double
  /**
    * contains the direction the cursor moves after entering cells.
    * @see com.sun.star.sheet.MoveDirection
    */
  var MoveDirection: scala.Double
  /** specifies whether the cursor is moved after entering into cells. */
  var MoveSelection: scala.Boolean
  /** specifies whether all sheets or only selected sheets are printed. */
  var PrintAllSheets: scala.Boolean
  /** specifies whether empty pages are printed. */
  var PrintEmptyPages: scala.Boolean
  /** specifies whether ranges are highlighted on the sheet when editing a formula. */
  var RangeFinder: scala.Boolean
  /** specifies whether a warning is shown before replacing cells (i.e. when pasting from clipboard). */
  var ReplaceCellsWarning: scala.Boolean
  /**
    * contains the default scale for new spreadsheet documents (in percent).
    *
    * There are several special values:
    *
    * -1 = Optimal width
    *
    * -2 = Show whole page
    *
    * -3 = Page width
    */
  var Scale: scala.Double
  /**
    * contains the function that is displayed in the status bar.
    * @see com.sun.star.sheet.StatusBarFunction
    */
  var StatusBarFunction: scala.Double
  /** specifies whether printer metrics are used for display. */
  var UsePrinterMetrics: scala.Boolean
  /** specifies whether the enter key moves the cursor to the column it was in before using the tab key to change columns. */
  var UseTabCol: scala.Boolean
  /**
    * contains the string lists used for sorting and filling.
    *
    * Each string contains the members of a list, separated by commas.
    */
  var UserLists: activexDashInteropLib.SafeArray[java.lang.String]
}

object XGlobalSheetSettings {
  @scala.inline
  def apply(
    DoAutoComplete: scala.Boolean,
    EnterEdit: scala.Boolean,
    ExpandReferences: scala.Boolean,
    ExtendFormat: scala.Boolean,
    LinkUpdateMode: scala.Double,
    MarkHeader: scala.Boolean,
    Metric: scala.Double,
    MoveDirection: scala.Double,
    MoveSelection: scala.Boolean,
    PrintAllSheets: scala.Boolean,
    PrintEmptyPages: scala.Boolean,
    RangeFinder: scala.Boolean,
    ReplaceCellsWarning: scala.Boolean,
    Scale: scala.Double,
    StatusBarFunction: scala.Double,
    UsePrinterMetrics: scala.Boolean,
    UseTabCol: scala.Boolean,
    UserLists: activexDashInteropLib.SafeArray[java.lang.String]
  ): XGlobalSheetSettings = {
    val __obj = js.Dynamic.literal(DoAutoComplete = DoAutoComplete, EnterEdit = EnterEdit, ExpandReferences = ExpandReferences, ExtendFormat = ExtendFormat, LinkUpdateMode = LinkUpdateMode, MarkHeader = MarkHeader, Metric = Metric, MoveDirection = MoveDirection, MoveSelection = MoveSelection, PrintAllSheets = PrintAllSheets, PrintEmptyPages = PrintEmptyPages, RangeFinder = RangeFinder, ReplaceCellsWarning = ReplaceCellsWarning, Scale = Scale, StatusBarFunction = StatusBarFunction, UsePrinterMetrics = UsePrinterMetrics, UseTabCol = UseTabCol, UserLists = UserLists)
  
    __obj.asInstanceOf[XGlobalSheetSettings]
  }
}

