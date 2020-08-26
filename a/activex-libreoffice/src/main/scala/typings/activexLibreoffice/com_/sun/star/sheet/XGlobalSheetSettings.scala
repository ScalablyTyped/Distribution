package typings.activexLibreoffice.com_.sun.star.sheet

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
@js.native
trait XGlobalSheetSettings extends js.Object {
  /** specifies whether automatic completion of text in a cell is used. */
  var DoAutoComplete: Boolean = js.native
  /** specifies whether the enter key can be used to start editing a cell. */
  var EnterEdit: Boolean = js.native
  /** specifies whether formula references are extended when cells are inserted below or to the right of them. */
  var ExpandReferences: Boolean = js.native
  /** specifies whether cell formatting is extended when entering data. */
  var ExtendFormat: Boolean = js.native
  /**
    * specifies the update mode for external linked data.
    *
    * 0 = always
    *
    * 1 = never
    *
    * 2 = on demand
    */
  var LinkUpdateMode: Double = js.native
  /** specifies whether the current selection is highlighted in column and row headers. */
  var MarkHeader: Boolean = js.native
  /**
    * contains the metric for all spreadsheet documents.
    * @see com.sun.star.util.MeasureUnit
    */
  var Metric: Double = js.native
  /**
    * contains the direction the cursor moves after entering cells.
    * @see com.sun.star.sheet.MoveDirection
    */
  var MoveDirection: Double = js.native
  /** specifies whether the cursor is moved after entering into cells. */
  var MoveSelection: Boolean = js.native
  /** specifies whether all sheets or only selected sheets are printed. */
  var PrintAllSheets: Boolean = js.native
  /** specifies whether empty pages are printed. */
  var PrintEmptyPages: Boolean = js.native
  /** specifies whether ranges are highlighted on the sheet when editing a formula. */
  var RangeFinder: Boolean = js.native
  /** specifies whether a warning is shown before replacing cells (i.e. when pasting from clipboard). */
  var ReplaceCellsWarning: Boolean = js.native
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
  var Scale: Double = js.native
  /**
    * contains the function that is displayed in the status bar.
    * @see com.sun.star.sheet.StatusBarFunction
    */
  var StatusBarFunction: Double = js.native
  /** specifies whether printer metrics are used for display. */
  var UsePrinterMetrics: Boolean = js.native
  /** specifies whether the enter key moves the cursor to the column it was in before using the tab key to change columns. */
  var UseTabCol: Boolean = js.native
  /**
    * contains the string lists used for sorting and filling.
    *
    * Each string contains the members of a list, separated by commas.
    */
  var UserLists: SafeArray[String] = js.native
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
  @scala.inline
  implicit class XGlobalSheetSettingsOps[Self <: XGlobalSheetSettings] (val x: Self) extends AnyVal {
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
    def setDoAutoComplete(value: Boolean): Self = this.set("DoAutoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnterEdit(value: Boolean): Self = this.set("EnterEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandReferences(value: Boolean): Self = this.set("ExpandReferences", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtendFormat(value: Boolean): Self = this.set("ExtendFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkUpdateMode(value: Double): Self = this.set("LinkUpdateMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkHeader(value: Boolean): Self = this.set("MarkHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetric(value: Double): Self = this.set("Metric", value.asInstanceOf[js.Any])
    @scala.inline
    def setMoveDirection(value: Double): Self = this.set("MoveDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setMoveSelection(value: Boolean): Self = this.set("MoveSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrintAllSheets(value: Boolean): Self = this.set("PrintAllSheets", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrintEmptyPages(value: Boolean): Self = this.set("PrintEmptyPages", value.asInstanceOf[js.Any])
    @scala.inline
    def setRangeFinder(value: Boolean): Self = this.set("RangeFinder", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplaceCellsWarning(value: Boolean): Self = this.set("ReplaceCellsWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale(value: Double): Self = this.set("Scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusBarFunction(value: Double): Self = this.set("StatusBarFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsePrinterMetrics(value: Boolean): Self = this.set("UsePrinterMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseTabCol(value: Boolean): Self = this.set("UseTabCol", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserLists(value: SafeArray[String]): Self = this.set("UserLists", value.asInstanceOf[js.Any])
  }
  
}

