package typings.activexLibreoffice.com_.sun.star.sheet

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 4.1 */
@js.native
trait XGlobalSheetSettings extends StObject {
  
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
  implicit class XGlobalSheetSettingsMutableBuilder[Self <: XGlobalSheetSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoAutoComplete(value: Boolean): Self = StObject.set(x, "DoAutoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterEdit(value: Boolean): Self = StObject.set(x, "EnterEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandReferences(value: Boolean): Self = StObject.set(x, "ExpandReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendFormat(value: Boolean): Self = StObject.set(x, "ExtendFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUpdateMode(value: Double): Self = StObject.set(x, "LinkUpdateMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkHeader(value: Boolean): Self = StObject.set(x, "MarkHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetric(value: Double): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveDirection(value: Double): Self = StObject.set(x, "MoveDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveSelection(value: Boolean): Self = StObject.set(x, "MoveSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintAllSheets(value: Boolean): Self = StObject.set(x, "PrintAllSheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintEmptyPages(value: Boolean): Self = StObject.set(x, "PrintEmptyPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeFinder(value: Boolean): Self = StObject.set(x, "RangeFinder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceCellsWarning(value: Boolean): Self = StObject.set(x, "ReplaceCellsWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "Scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBarFunction(value: Double): Self = StObject.set(x, "StatusBarFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePrinterMetrics(value: Boolean): Self = StObject.set(x, "UsePrinterMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTabCol(value: Boolean): Self = StObject.set(x, "UseTabCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserLists(value: SafeArray[String]): Self = StObject.set(x, "UserLists", value.asInstanceOf[js.Any])
  }
}
