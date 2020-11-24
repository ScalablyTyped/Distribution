package typings.aceBuilds.anon

import typings.aceBuilds.aceBuildsBooleans.`false`
import typings.aceBuilds.aceBuildsBooleans.`true`
import typings.aceBuilds.aceBuildsStrings.ace
import typings.aceBuilds.aceBuildsStrings.always
import typings.aceBuilds.aceBuildsStrings.auto
import typings.aceBuilds.aceBuildsStrings.code
import typings.aceBuilds.aceBuildsStrings.free
import typings.aceBuilds.aceBuildsStrings.manual
import typings.aceBuilds.aceBuildsStrings.markbegin
import typings.aceBuilds.aceBuildsStrings.markbeginend
import typings.aceBuilds.aceBuildsStrings.off
import typings.aceBuilds.aceBuildsStrings.printmargin_
import typings.aceBuilds.aceBuildsStrings.slim
import typings.aceBuilds.aceBuildsStrings.smooth
import typings.aceBuilds.aceBuildsStrings.text
import typings.aceBuilds.aceBuildsStrings.wide
import typings.aceBuilds.mod.Ace.EditSession
import typings.aceBuilds.mod.Ace.NewLineMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ace-builds.ace-builds.Ace.EditorOptions> */
@js.native
trait PartialEditorOptions extends js.Object {
  
  var animatedScroll: js.UndefOr[Boolean] = js.native
  
  var autoScrollEditorIntoView: js.UndefOr[Boolean] = js.native
  
  var behavioursEnabled: js.UndefOr[Boolean] = js.native
  
  var copyWithEmptySelection: js.UndefOr[Boolean] = js.native
  
  var cursorStyle: js.UndefOr[ace | slim | smooth | wide] = js.native
  
  var displayIndentGuides: js.UndefOr[Boolean] = js.native
  
  var dragDelay: js.UndefOr[Double] = js.native
  
  var dragEnabled: js.UndefOr[Boolean] = js.native
  
  var enableAutoIndent: js.UndefOr[Boolean] = js.native
  
  var fadeFoldWidgets: js.UndefOr[Boolean] = js.native
  
  var firstLineNumber: js.UndefOr[Double] = js.native
  
  var fixedWidthGutter: js.UndefOr[Boolean] = js.native
  
  var focusTimeout: js.UndefOr[Double] = js.native
  
  var foldStyle: js.UndefOr[markbegin | markbeginend | manual] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var hScrollBarAlwaysVisible: js.UndefOr[Boolean] = js.native
  
  var hasCssTransforms: js.UndefOr[Boolean] = js.native
  
  var highlightActiveLine: js.UndefOr[Boolean] = js.native
  
  var highlightGutterLine: js.UndefOr[Boolean] = js.native
  
  var highlightSelectedWord: js.UndefOr[Boolean] = js.native
  
  var indentedSoftWrap: js.UndefOr[Boolean] = js.native
  
  var keyboardHandler: js.UndefOr[String] = js.native
  
  var maxLines: js.UndefOr[Double] = js.native
  
  var maxPixelHeight: js.UndefOr[Double] = js.native
  
  var mergeUndoDeltas: js.UndefOr[`true` | `false` | always] = js.native
  
  var minLines: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[String] = js.native
  
  var navigateWithinSoftTabs: js.UndefOr[Boolean] = js.native
  
  var newLineMode: js.UndefOr[NewLineMode] = js.native
  
  var overwrite: js.UndefOr[Boolean] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var printMargin: js.UndefOr[Boolean | Double] = js.native
  
  var printMarginColumn: js.UndefOr[Double] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var scrollPastEnd: js.UndefOr[Boolean] = js.native
  
  var scrollSpeed: js.UndefOr[Double] = js.native
  
  var selectionStyle: js.UndefOr[String] = js.native
  
  var session: js.UndefOr[EditSession] = js.native
  
  var showFoldWidgets: js.UndefOr[Boolean] = js.native
  
  var showGutter: js.UndefOr[Boolean] = js.native
  
  var showInvisibles: js.UndefOr[Boolean] = js.native
  
  var showLineNumbers: js.UndefOr[Boolean] = js.native
  
  var showPrintMargin: js.UndefOr[Boolean] = js.native
  
  var tabSize: js.UndefOr[Double] = js.native
  
  var theme: js.UndefOr[String] = js.native
  
  var tooltipFollowsMouse: js.UndefOr[Boolean] = js.native
  
  var useSoftTabs: js.UndefOr[Boolean] = js.native
  
  var useWorker: js.UndefOr[Boolean] = js.native
  
  var vScrollBarAlwaysVisible: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[String] = js.native
  
  var wrap: js.UndefOr[off | free | printmargin_ | Boolean | Double] = js.native
  
  var wrapBehavioursEnabled: js.UndefOr[Boolean] = js.native
  
  var wrapMethod: js.UndefOr[code | text | auto] = js.native
}
object PartialEditorOptions {
  
  @scala.inline
  def apply(): PartialEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEditorOptions]
  }
  
  @scala.inline
  implicit class PartialEditorOptionsOps[Self <: PartialEditorOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimatedScroll(value: Boolean): Self = this.set("animatedScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimatedScroll: Self = this.set("animatedScroll", js.undefined)
    
    @scala.inline
    def setAutoScrollEditorIntoView(value: Boolean): Self = this.set("autoScrollEditorIntoView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScrollEditorIntoView: Self = this.set("autoScrollEditorIntoView", js.undefined)
    
    @scala.inline
    def setBehavioursEnabled(value: Boolean): Self = this.set("behavioursEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBehavioursEnabled: Self = this.set("behavioursEnabled", js.undefined)
    
    @scala.inline
    def setCopyWithEmptySelection(value: Boolean): Self = this.set("copyWithEmptySelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyWithEmptySelection: Self = this.set("copyWithEmptySelection", js.undefined)
    
    @scala.inline
    def setCursorStyle(value: ace | slim | smooth | wide): Self = this.set("cursorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorStyle: Self = this.set("cursorStyle", js.undefined)
    
    @scala.inline
    def setDisplayIndentGuides(value: Boolean): Self = this.set("displayIndentGuides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayIndentGuides: Self = this.set("displayIndentGuides", js.undefined)
    
    @scala.inline
    def setDragDelay(value: Double): Self = this.set("dragDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragDelay: Self = this.set("dragDelay", js.undefined)
    
    @scala.inline
    def setDragEnabled(value: Boolean): Self = this.set("dragEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragEnabled: Self = this.set("dragEnabled", js.undefined)
    
    @scala.inline
    def setEnableAutoIndent(value: Boolean): Self = this.set("enableAutoIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAutoIndent: Self = this.set("enableAutoIndent", js.undefined)
    
    @scala.inline
    def setFadeFoldWidgets(value: Boolean): Self = this.set("fadeFoldWidgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFadeFoldWidgets: Self = this.set("fadeFoldWidgets", js.undefined)
    
    @scala.inline
    def setFirstLineNumber(value: Double): Self = this.set("firstLineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstLineNumber: Self = this.set("firstLineNumber", js.undefined)
    
    @scala.inline
    def setFixedWidthGutter(value: Boolean): Self = this.set("fixedWidthGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedWidthGutter: Self = this.set("fixedWidthGutter", js.undefined)
    
    @scala.inline
    def setFocusTimeout(value: Double): Self = this.set("focusTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusTimeout: Self = this.set("focusTimeout", js.undefined)
    
    @scala.inline
    def setFoldStyle(value: markbegin | markbeginend | manual): Self = this.set("foldStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFoldStyle: Self = this.set("foldStyle", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setHScrollBarAlwaysVisible(value: Boolean): Self = this.set("hScrollBarAlwaysVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHScrollBarAlwaysVisible: Self = this.set("hScrollBarAlwaysVisible", js.undefined)
    
    @scala.inline
    def setHasCssTransforms(value: Boolean): Self = this.set("hasCssTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasCssTransforms: Self = this.set("hasCssTransforms", js.undefined)
    
    @scala.inline
    def setHighlightActiveLine(value: Boolean): Self = this.set("highlightActiveLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightActiveLine: Self = this.set("highlightActiveLine", js.undefined)
    
    @scala.inline
    def setHighlightGutterLine(value: Boolean): Self = this.set("highlightGutterLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightGutterLine: Self = this.set("highlightGutterLine", js.undefined)
    
    @scala.inline
    def setHighlightSelectedWord(value: Boolean): Self = this.set("highlightSelectedWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightSelectedWord: Self = this.set("highlightSelectedWord", js.undefined)
    
    @scala.inline
    def setIndentedSoftWrap(value: Boolean): Self = this.set("indentedSoftWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentedSoftWrap: Self = this.set("indentedSoftWrap", js.undefined)
    
    @scala.inline
    def setKeyboardHandler(value: String): Self = this.set("keyboardHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardHandler: Self = this.set("keyboardHandler", js.undefined)
    
    @scala.inline
    def setMaxLines(value: Double): Self = this.set("maxLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLines: Self = this.set("maxLines", js.undefined)
    
    @scala.inline
    def setMaxPixelHeight(value: Double): Self = this.set("maxPixelHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPixelHeight: Self = this.set("maxPixelHeight", js.undefined)
    
    @scala.inline
    def setMergeUndoDeltas(value: `true` | `false` | always): Self = this.set("mergeUndoDeltas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeUndoDeltas: Self = this.set("mergeUndoDeltas", js.undefined)
    
    @scala.inline
    def setMinLines(value: Double): Self = this.set("minLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLines: Self = this.set("minLines", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setNavigateWithinSoftTabs(value: Boolean): Self = this.set("navigateWithinSoftTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigateWithinSoftTabs: Self = this.set("navigateWithinSoftTabs", js.undefined)
    
    @scala.inline
    def setNewLineMode(value: NewLineMode): Self = this.set("newLineMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewLineMode: Self = this.set("newLineMode", js.undefined)
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPrintMargin(value: Boolean | Double): Self = this.set("printMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintMargin: Self = this.set("printMargin", js.undefined)
    
    @scala.inline
    def setPrintMarginColumn(value: Double): Self = this.set("printMarginColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintMarginColumn: Self = this.set("printMarginColumn", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setScrollPastEnd(value: Boolean): Self = this.set("scrollPastEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPastEnd: Self = this.set("scrollPastEnd", js.undefined)
    
    @scala.inline
    def setScrollSpeed(value: Double): Self = this.set("scrollSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSpeed: Self = this.set("scrollSpeed", js.undefined)
    
    @scala.inline
    def setSelectionStyle(value: String): Self = this.set("selectionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionStyle: Self = this.set("selectionStyle", js.undefined)
    
    @scala.inline
    def setSession(value: EditSession): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    
    @scala.inline
    def setShowFoldWidgets(value: Boolean): Self = this.set("showFoldWidgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFoldWidgets: Self = this.set("showFoldWidgets", js.undefined)
    
    @scala.inline
    def setShowGutter(value: Boolean): Self = this.set("showGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowGutter: Self = this.set("showGutter", js.undefined)
    
    @scala.inline
    def setShowInvisibles(value: Boolean): Self = this.set("showInvisibles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowInvisibles: Self = this.set("showInvisibles", js.undefined)
    
    @scala.inline
    def setShowLineNumbers(value: Boolean): Self = this.set("showLineNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLineNumbers: Self = this.set("showLineNumbers", js.undefined)
    
    @scala.inline
    def setShowPrintMargin(value: Boolean): Self = this.set("showPrintMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPrintMargin: Self = this.set("showPrintMargin", js.undefined)
    
    @scala.inline
    def setTabSize(value: Double): Self = this.set("tabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabSize: Self = this.set("tabSize", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTooltipFollowsMouse(value: Boolean): Self = this.set("tooltipFollowsMouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipFollowsMouse: Self = this.set("tooltipFollowsMouse", js.undefined)
    
    @scala.inline
    def setUseSoftTabs(value: Boolean): Self = this.set("useSoftTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSoftTabs: Self = this.set("useSoftTabs", js.undefined)
    
    @scala.inline
    def setUseWorker(value: Boolean): Self = this.set("useWorker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseWorker: Self = this.set("useWorker", js.undefined)
    
    @scala.inline
    def setVScrollBarAlwaysVisible(value: Boolean): Self = this.set("vScrollBarAlwaysVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVScrollBarAlwaysVisible: Self = this.set("vScrollBarAlwaysVisible", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setWrap(value: off | free | printmargin_ | Boolean | Double): Self = this.set("wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
    
    @scala.inline
    def setWrapBehavioursEnabled(value: Boolean): Self = this.set("wrapBehavioursEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapBehavioursEnabled: Self = this.set("wrapBehavioursEnabled", js.undefined)
    
    @scala.inline
    def setWrapMethod(value: code | text | auto): Self = this.set("wrapMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapMethod: Self = this.set("wrapMethod", js.undefined)
  }
}
