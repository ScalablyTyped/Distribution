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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ace-builds.ace-builds.Ace.EditorOptions> */
trait PartialEditorOptions extends StObject {
  
  var animatedScroll: js.UndefOr[Boolean] = js.undefined
  
  var autoScrollEditorIntoView: js.UndefOr[Boolean] = js.undefined
  
  var behavioursEnabled: js.UndefOr[Boolean] = js.undefined
  
  var copyWithEmptySelection: js.UndefOr[Boolean] = js.undefined
  
  var cursorStyle: js.UndefOr[ace | slim | smooth | wide] = js.undefined
  
  var displayIndentGuides: js.UndefOr[Boolean] = js.undefined
  
  var dragDelay: js.UndefOr[Double] = js.undefined
  
  var dragEnabled: js.UndefOr[Boolean] = js.undefined
  
  var enableAutoIndent: js.UndefOr[Boolean] = js.undefined
  
  var fadeFoldWidgets: js.UndefOr[Boolean] = js.undefined
  
  var firstLineNumber: js.UndefOr[Double] = js.undefined
  
  var fixedWidthGutter: js.UndefOr[Boolean] = js.undefined
  
  var focusTimeout: js.UndefOr[Double] = js.undefined
  
  var foldStyle: js.UndefOr[markbegin | markbeginend | manual] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var hScrollBarAlwaysVisible: js.UndefOr[Boolean] = js.undefined
  
  var hasCssTransforms: js.UndefOr[Boolean] = js.undefined
  
  var highlightActiveLine: js.UndefOr[Boolean] = js.undefined
  
  var highlightGutterLine: js.UndefOr[Boolean] = js.undefined
  
  var highlightSelectedWord: js.UndefOr[Boolean] = js.undefined
  
  var indentedSoftWrap: js.UndefOr[Boolean] = js.undefined
  
  var keyboardHandler: js.UndefOr[String | Null] = js.undefined
  
  var maxLines: js.UndefOr[Double] = js.undefined
  
  var maxPixelHeight: js.UndefOr[Double] = js.undefined
  
  var mergeUndoDeltas: js.UndefOr[`true` | `false` | always] = js.undefined
  
  var minLines: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var navigateWithinSoftTabs: js.UndefOr[Boolean] = js.undefined
  
  var newLineMode: js.UndefOr[NewLineMode] = js.undefined
  
  var overwrite: js.UndefOr[Boolean] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var printMargin: js.UndefOr[Boolean | Double] = js.undefined
  
  var printMarginColumn: js.UndefOr[Double] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var scrollPastEnd: js.UndefOr[Boolean] = js.undefined
  
  var scrollSpeed: js.UndefOr[Double] = js.undefined
  
  var selectionStyle: js.UndefOr[String] = js.undefined
  
  var session: js.UndefOr[EditSession] = js.undefined
  
  var showFoldWidgets: js.UndefOr[Boolean] = js.undefined
  
  var showGutter: js.UndefOr[Boolean] = js.undefined
  
  var showInvisibles: js.UndefOr[Boolean] = js.undefined
  
  var showLineNumbers: js.UndefOr[Boolean] = js.undefined
  
  var showPrintMargin: js.UndefOr[Boolean] = js.undefined
  
  var tabSize: js.UndefOr[Double] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
  
  var tooltipFollowsMouse: js.UndefOr[Boolean] = js.undefined
  
  var useSoftTabs: js.UndefOr[Boolean] = js.undefined
  
  var useWorker: js.UndefOr[Boolean] = js.undefined
  
  var vScrollBarAlwaysVisible: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
  
  var wrap: js.UndefOr[off | free | printmargin_ | Boolean | Double] = js.undefined
  
  var wrapBehavioursEnabled: js.UndefOr[Boolean] = js.undefined
  
  var wrapMethod: js.UndefOr[code | text | auto] = js.undefined
}
object PartialEditorOptions {
  
  inline def apply(): PartialEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEditorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialEditorOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimatedScroll(value: Boolean): Self = StObject.set(x, "animatedScroll", value.asInstanceOf[js.Any])
    
    inline def setAnimatedScrollUndefined: Self = StObject.set(x, "animatedScroll", js.undefined)
    
    inline def setAutoScrollEditorIntoView(value: Boolean): Self = StObject.set(x, "autoScrollEditorIntoView", value.asInstanceOf[js.Any])
    
    inline def setAutoScrollEditorIntoViewUndefined: Self = StObject.set(x, "autoScrollEditorIntoView", js.undefined)
    
    inline def setBehavioursEnabled(value: Boolean): Self = StObject.set(x, "behavioursEnabled", value.asInstanceOf[js.Any])
    
    inline def setBehavioursEnabledUndefined: Self = StObject.set(x, "behavioursEnabled", js.undefined)
    
    inline def setCopyWithEmptySelection(value: Boolean): Self = StObject.set(x, "copyWithEmptySelection", value.asInstanceOf[js.Any])
    
    inline def setCopyWithEmptySelectionUndefined: Self = StObject.set(x, "copyWithEmptySelection", js.undefined)
    
    inline def setCursorStyle(value: ace | slim | smooth | wide): Self = StObject.set(x, "cursorStyle", value.asInstanceOf[js.Any])
    
    inline def setCursorStyleUndefined: Self = StObject.set(x, "cursorStyle", js.undefined)
    
    inline def setDisplayIndentGuides(value: Boolean): Self = StObject.set(x, "displayIndentGuides", value.asInstanceOf[js.Any])
    
    inline def setDisplayIndentGuidesUndefined: Self = StObject.set(x, "displayIndentGuides", js.undefined)
    
    inline def setDragDelay(value: Double): Self = StObject.set(x, "dragDelay", value.asInstanceOf[js.Any])
    
    inline def setDragDelayUndefined: Self = StObject.set(x, "dragDelay", js.undefined)
    
    inline def setDragEnabled(value: Boolean): Self = StObject.set(x, "dragEnabled", value.asInstanceOf[js.Any])
    
    inline def setDragEnabledUndefined: Self = StObject.set(x, "dragEnabled", js.undefined)
    
    inline def setEnableAutoIndent(value: Boolean): Self = StObject.set(x, "enableAutoIndent", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoIndentUndefined: Self = StObject.set(x, "enableAutoIndent", js.undefined)
    
    inline def setFadeFoldWidgets(value: Boolean): Self = StObject.set(x, "fadeFoldWidgets", value.asInstanceOf[js.Any])
    
    inline def setFadeFoldWidgetsUndefined: Self = StObject.set(x, "fadeFoldWidgets", js.undefined)
    
    inline def setFirstLineNumber(value: Double): Self = StObject.set(x, "firstLineNumber", value.asInstanceOf[js.Any])
    
    inline def setFirstLineNumberUndefined: Self = StObject.set(x, "firstLineNumber", js.undefined)
    
    inline def setFixedWidthGutter(value: Boolean): Self = StObject.set(x, "fixedWidthGutter", value.asInstanceOf[js.Any])
    
    inline def setFixedWidthGutterUndefined: Self = StObject.set(x, "fixedWidthGutter", js.undefined)
    
    inline def setFocusTimeout(value: Double): Self = StObject.set(x, "focusTimeout", value.asInstanceOf[js.Any])
    
    inline def setFocusTimeoutUndefined: Self = StObject.set(x, "focusTimeout", js.undefined)
    
    inline def setFoldStyle(value: markbegin | markbeginend | manual): Self = StObject.set(x, "foldStyle", value.asInstanceOf[js.Any])
    
    inline def setFoldStyleUndefined: Self = StObject.set(x, "foldStyle", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setHScrollBarAlwaysVisible(value: Boolean): Self = StObject.set(x, "hScrollBarAlwaysVisible", value.asInstanceOf[js.Any])
    
    inline def setHScrollBarAlwaysVisibleUndefined: Self = StObject.set(x, "hScrollBarAlwaysVisible", js.undefined)
    
    inline def setHasCssTransforms(value: Boolean): Self = StObject.set(x, "hasCssTransforms", value.asInstanceOf[js.Any])
    
    inline def setHasCssTransformsUndefined: Self = StObject.set(x, "hasCssTransforms", js.undefined)
    
    inline def setHighlightActiveLine(value: Boolean): Self = StObject.set(x, "highlightActiveLine", value.asInstanceOf[js.Any])
    
    inline def setHighlightActiveLineUndefined: Self = StObject.set(x, "highlightActiveLine", js.undefined)
    
    inline def setHighlightGutterLine(value: Boolean): Self = StObject.set(x, "highlightGutterLine", value.asInstanceOf[js.Any])
    
    inline def setHighlightGutterLineUndefined: Self = StObject.set(x, "highlightGutterLine", js.undefined)
    
    inline def setHighlightSelectedWord(value: Boolean): Self = StObject.set(x, "highlightSelectedWord", value.asInstanceOf[js.Any])
    
    inline def setHighlightSelectedWordUndefined: Self = StObject.set(x, "highlightSelectedWord", js.undefined)
    
    inline def setIndentedSoftWrap(value: Boolean): Self = StObject.set(x, "indentedSoftWrap", value.asInstanceOf[js.Any])
    
    inline def setIndentedSoftWrapUndefined: Self = StObject.set(x, "indentedSoftWrap", js.undefined)
    
    inline def setKeyboardHandler(value: String): Self = StObject.set(x, "keyboardHandler", value.asInstanceOf[js.Any])
    
    inline def setKeyboardHandlerNull: Self = StObject.set(x, "keyboardHandler", null)
    
    inline def setKeyboardHandlerUndefined: Self = StObject.set(x, "keyboardHandler", js.undefined)
    
    inline def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
    
    inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
    
    inline def setMaxPixelHeight(value: Double): Self = StObject.set(x, "maxPixelHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxPixelHeightUndefined: Self = StObject.set(x, "maxPixelHeight", js.undefined)
    
    inline def setMergeUndoDeltas(value: `true` | `false` | always): Self = StObject.set(x, "mergeUndoDeltas", value.asInstanceOf[js.Any])
    
    inline def setMergeUndoDeltasUndefined: Self = StObject.set(x, "mergeUndoDeltas", js.undefined)
    
    inline def setMinLines(value: Double): Self = StObject.set(x, "minLines", value.asInstanceOf[js.Any])
    
    inline def setMinLinesUndefined: Self = StObject.set(x, "minLines", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setNavigateWithinSoftTabs(value: Boolean): Self = StObject.set(x, "navigateWithinSoftTabs", value.asInstanceOf[js.Any])
    
    inline def setNavigateWithinSoftTabsUndefined: Self = StObject.set(x, "navigateWithinSoftTabs", js.undefined)
    
    inline def setNewLineMode(value: NewLineMode): Self = StObject.set(x, "newLineMode", value.asInstanceOf[js.Any])
    
    inline def setNewLineModeUndefined: Self = StObject.set(x, "newLineMode", js.undefined)
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPrintMargin(value: Boolean | Double): Self = StObject.set(x, "printMargin", value.asInstanceOf[js.Any])
    
    inline def setPrintMarginColumn(value: Double): Self = StObject.set(x, "printMarginColumn", value.asInstanceOf[js.Any])
    
    inline def setPrintMarginColumnUndefined: Self = StObject.set(x, "printMarginColumn", js.undefined)
    
    inline def setPrintMarginUndefined: Self = StObject.set(x, "printMargin", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setScrollPastEnd(value: Boolean): Self = StObject.set(x, "scrollPastEnd", value.asInstanceOf[js.Any])
    
    inline def setScrollPastEndUndefined: Self = StObject.set(x, "scrollPastEnd", js.undefined)
    
    inline def setScrollSpeed(value: Double): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
    
    inline def setScrollSpeedUndefined: Self = StObject.set(x, "scrollSpeed", js.undefined)
    
    inline def setSelectionStyle(value: String): Self = StObject.set(x, "selectionStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectionStyleUndefined: Self = StObject.set(x, "selectionStyle", js.undefined)
    
    inline def setSession(value: EditSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setShowFoldWidgets(value: Boolean): Self = StObject.set(x, "showFoldWidgets", value.asInstanceOf[js.Any])
    
    inline def setShowFoldWidgetsUndefined: Self = StObject.set(x, "showFoldWidgets", js.undefined)
    
    inline def setShowGutter(value: Boolean): Self = StObject.set(x, "showGutter", value.asInstanceOf[js.Any])
    
    inline def setShowGutterUndefined: Self = StObject.set(x, "showGutter", js.undefined)
    
    inline def setShowInvisibles(value: Boolean): Self = StObject.set(x, "showInvisibles", value.asInstanceOf[js.Any])
    
    inline def setShowInvisiblesUndefined: Self = StObject.set(x, "showInvisibles", js.undefined)
    
    inline def setShowLineNumbers(value: Boolean): Self = StObject.set(x, "showLineNumbers", value.asInstanceOf[js.Any])
    
    inline def setShowLineNumbersUndefined: Self = StObject.set(x, "showLineNumbers", js.undefined)
    
    inline def setShowPrintMargin(value: Boolean): Self = StObject.set(x, "showPrintMargin", value.asInstanceOf[js.Any])
    
    inline def setShowPrintMarginUndefined: Self = StObject.set(x, "showPrintMargin", js.undefined)
    
    inline def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
    
    inline def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTooltipFollowsMouse(value: Boolean): Self = StObject.set(x, "tooltipFollowsMouse", value.asInstanceOf[js.Any])
    
    inline def setTooltipFollowsMouseUndefined: Self = StObject.set(x, "tooltipFollowsMouse", js.undefined)
    
    inline def setUseSoftTabs(value: Boolean): Self = StObject.set(x, "useSoftTabs", value.asInstanceOf[js.Any])
    
    inline def setUseSoftTabsUndefined: Self = StObject.set(x, "useSoftTabs", js.undefined)
    
    inline def setUseWorker(value: Boolean): Self = StObject.set(x, "useWorker", value.asInstanceOf[js.Any])
    
    inline def setUseWorkerUndefined: Self = StObject.set(x, "useWorker", js.undefined)
    
    inline def setVScrollBarAlwaysVisible(value: Boolean): Self = StObject.set(x, "vScrollBarAlwaysVisible", value.asInstanceOf[js.Any])
    
    inline def setVScrollBarAlwaysVisibleUndefined: Self = StObject.set(x, "vScrollBarAlwaysVisible", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWrap(value: off | free | printmargin_ | Boolean | Double): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapBehavioursEnabled(value: Boolean): Self = StObject.set(x, "wrapBehavioursEnabled", value.asInstanceOf[js.Any])
    
    inline def setWrapBehavioursEnabledUndefined: Self = StObject.set(x, "wrapBehavioursEnabled", js.undefined)
    
    inline def setWrapMethod(value: code | text | auto): Self = StObject.set(x, "wrapMethod", value.asInstanceOf[js.Any])
    
    inline def setWrapMethodUndefined: Self = StObject.set(x, "wrapMethod", js.undefined)
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
