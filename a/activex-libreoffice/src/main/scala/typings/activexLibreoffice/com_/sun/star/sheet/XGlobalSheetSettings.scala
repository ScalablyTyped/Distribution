package typings.activexLibreoffice.com_.sun.star.sheet

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait XGlobalSheetSettings extends js.Object {
  /** specifies whether automatic completion of text in a cell is used. */
  var DoAutoComplete: Boolean
  /** specifies whether the enter key can be used to start editing a cell. */
  var EnterEdit: Boolean
  /** specifies whether formula references are extended when cells are inserted below or to the right of them. */
  var ExpandReferences: Boolean
  /** specifies whether cell formatting is extended when entering data. */
  var ExtendFormat: Boolean
  /**
    * specifies the update mode for external linked data.
    *
    * 0 = always
    *
    * 1 = never
    *
    * 2 = on demand
    */
  var LinkUpdateMode: Double
  /** specifies whether the current selection is highlighted in column and row headers. */
  var MarkHeader: Boolean
  /**
    * contains the metric for all spreadsheet documents.
    * @see com.sun.star.util.MeasureUnit
    */
  var Metric: Double
  /**
    * contains the direction the cursor moves after entering cells.
    * @see com.sun.star.sheet.MoveDirection
    */
  var MoveDirection: Double
  /** specifies whether the cursor is moved after entering into cells. */
  var MoveSelection: Boolean
  /** specifies whether all sheets or only selected sheets are printed. */
  var PrintAllSheets: Boolean
  /** specifies whether empty pages are printed. */
  var PrintEmptyPages: Boolean
  /** specifies whether ranges are highlighted on the sheet when editing a formula. */
  var RangeFinder: Boolean
  /** specifies whether a warning is shown before replacing cells (i.e. when pasting from clipboard). */
  var ReplaceCellsWarning: Boolean
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
  var Scale: Double
  /**
    * contains the function that is displayed in the status bar.
    * @see com.sun.star.sheet.StatusBarFunction
    */
  var StatusBarFunction: Double
  /** specifies whether printer metrics are used for display. */
  var UsePrinterMetrics: Boolean
  /** specifies whether the enter key moves the cursor to the column it was in before using the tab key to change columns. */
  var UseTabCol: Boolean
  /**
    * contains the string lists used for sorting and filling.
    *
    * Each string contains the members of a list, separated by commas.
    */
  var UserLists: SafeArray[String]
}

object XGlobalSheetSettings {
  @scala.inline
  def apply(
    DoAutoComplete: Boolean,
    EnterEdit: Boolean,
    ExpandReferences: Boolean,
    ExtendFormat: Boolean,
    LinkUpdateMode: Double,
    MarkHeader: Boolean,
    Metric: Double,
    MoveDirection: Double,
    MoveSelection: Boolean,
    PrintAllSheets: Boolean,
    PrintEmptyPages: Boolean,
    RangeFinder: Boolean,
    ReplaceCellsWarning: Boolean,
    Scale: Double,
    StatusBarFunction: Double,
    UsePrinterMetrics: Boolean,
    UseTabCol: Boolean,
    UserLists: SafeArray[String]
  ): XGlobalSheetSettings = {
    val __obj = js.Dynamic.literal(DoAutoComplete = DoAutoComplete.asInstanceOf[js.Any], EnterEdit = EnterEdit.asInstanceOf[js.Any], ExpandReferences = ExpandReferences.asInstanceOf[js.Any], ExtendFormat = ExtendFormat.asInstanceOf[js.Any], LinkUpdateMode = LinkUpdateMode.asInstanceOf[js.Any], MarkHeader = MarkHeader.asInstanceOf[js.Any], Metric = Metric.asInstanceOf[js.Any], MoveDirection = MoveDirection.asInstanceOf[js.Any], MoveSelection = MoveSelection.asInstanceOf[js.Any], PrintAllSheets = PrintAllSheets.asInstanceOf[js.Any], PrintEmptyPages = PrintEmptyPages.asInstanceOf[js.Any], RangeFinder = RangeFinder.asInstanceOf[js.Any], ReplaceCellsWarning = ReplaceCellsWarning.asInstanceOf[js.Any], Scale = Scale.asInstanceOf[js.Any], StatusBarFunction = StatusBarFunction.asInstanceOf[js.Any], UsePrinterMetrics = UsePrinterMetrics.asInstanceOf[js.Any], UseTabCol = UseTabCol.asInstanceOf[js.Any], UserLists = UserLists.asInstanceOf[js.Any])
    __obj.asInstanceOf[XGlobalSheetSettings]
  }
}

