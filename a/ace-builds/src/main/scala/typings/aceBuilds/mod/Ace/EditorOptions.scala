package typings.aceBuilds.mod.Ace

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorOptions
  extends StObject
     with EditSessionOptions
     with MouseHandlerOptions
     with VirtualRendererOptions {
  
  var autoScrollEditorIntoView: Boolean
  
  var behavioursEnabled: Boolean
  
  var copyWithEmptySelection: Boolean
  
  var cursorStyle: ace | slim | smooth | wide
  
  var enableAutoIndent: Boolean
  
  var highlightActiveLine: Boolean
  
  var highlightSelectedWord: Boolean
  
  var keyboardHandler: String
  
  var mergeUndoDeltas: `true` | `false` | always
  
  var placeholder: String
  
  var readOnly: Boolean
  
  var selectionStyle: String
  
  var session: EditSession
  
  var value: String
  
  var wrapBehavioursEnabled: Boolean
}
object EditorOptions {
  
  @scala.inline
  def apply(
    animatedScroll: Boolean,
    autoScrollEditorIntoView: Boolean,
    behavioursEnabled: Boolean,
    copyWithEmptySelection: Boolean,
    cursorStyle: ace | slim | smooth | wide,
    displayIndentGuides: Boolean,
    dragDelay: Double,
    dragEnabled: Boolean,
    enableAutoIndent: Boolean,
    fadeFoldWidgets: Boolean,
    firstLineNumber: Double,
    fixedWidthGutter: Boolean,
    focusTimeout: Double,
    foldStyle: markbegin | markbeginend | manual,
    fontFamily: String,
    fontSize: Double,
    hScrollBarAlwaysVisible: Boolean,
    hasCssTransforms: Boolean,
    highlightActiveLine: Boolean,
    highlightGutterLine: Boolean,
    highlightSelectedWord: Boolean,
    indentedSoftWrap: Boolean,
    keyboardHandler: String,
    maxLines: Double,
    maxPixelHeight: Double,
    mergeUndoDeltas: `true` | `false` | always,
    minLines: Double,
    mode: String,
    navigateWithinSoftTabs: Boolean,
    newLineMode: NewLineMode,
    overwrite: Boolean,
    placeholder: String,
    printMargin: Boolean | Double,
    printMarginColumn: Double,
    readOnly: Boolean,
    scrollPastEnd: Boolean,
    scrollSpeed: Double,
    selectionStyle: String,
    session: EditSession,
    showFoldWidgets: Boolean,
    showGutter: Boolean,
    showInvisibles: Boolean,
    showLineNumbers: Boolean,
    showPrintMargin: Boolean,
    tabSize: Double,
    theme: String,
    tooltipFollowsMouse: Boolean,
    useSoftTabs: Boolean,
    useWorker: Boolean,
    vScrollBarAlwaysVisible: Boolean,
    value: String,
    wrap: off | free | printmargin_ | Boolean | Double,
    wrapBehavioursEnabled: Boolean,
    wrapMethod: code | text | auto
  ): EditorOptions = {
    val __obj = js.Dynamic.literal(animatedScroll = animatedScroll.asInstanceOf[js.Any], autoScrollEditorIntoView = autoScrollEditorIntoView.asInstanceOf[js.Any], behavioursEnabled = behavioursEnabled.asInstanceOf[js.Any], copyWithEmptySelection = copyWithEmptySelection.asInstanceOf[js.Any], cursorStyle = cursorStyle.asInstanceOf[js.Any], displayIndentGuides = displayIndentGuides.asInstanceOf[js.Any], dragDelay = dragDelay.asInstanceOf[js.Any], dragEnabled = dragEnabled.asInstanceOf[js.Any], enableAutoIndent = enableAutoIndent.asInstanceOf[js.Any], fadeFoldWidgets = fadeFoldWidgets.asInstanceOf[js.Any], firstLineNumber = firstLineNumber.asInstanceOf[js.Any], fixedWidthGutter = fixedWidthGutter.asInstanceOf[js.Any], focusTimeout = focusTimeout.asInstanceOf[js.Any], foldStyle = foldStyle.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], hScrollBarAlwaysVisible = hScrollBarAlwaysVisible.asInstanceOf[js.Any], hasCssTransforms = hasCssTransforms.asInstanceOf[js.Any], highlightActiveLine = highlightActiveLine.asInstanceOf[js.Any], highlightGutterLine = highlightGutterLine.asInstanceOf[js.Any], highlightSelectedWord = highlightSelectedWord.asInstanceOf[js.Any], indentedSoftWrap = indentedSoftWrap.asInstanceOf[js.Any], keyboardHandler = keyboardHandler.asInstanceOf[js.Any], maxLines = maxLines.asInstanceOf[js.Any], maxPixelHeight = maxPixelHeight.asInstanceOf[js.Any], mergeUndoDeltas = mergeUndoDeltas.asInstanceOf[js.Any], minLines = minLines.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], navigateWithinSoftTabs = navigateWithinSoftTabs.asInstanceOf[js.Any], newLineMode = newLineMode.asInstanceOf[js.Any], overwrite = overwrite.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], printMargin = printMargin.asInstanceOf[js.Any], printMarginColumn = printMarginColumn.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], scrollPastEnd = scrollPastEnd.asInstanceOf[js.Any], scrollSpeed = scrollSpeed.asInstanceOf[js.Any], selectionStyle = selectionStyle.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], showFoldWidgets = showFoldWidgets.asInstanceOf[js.Any], showGutter = showGutter.asInstanceOf[js.Any], showInvisibles = showInvisibles.asInstanceOf[js.Any], showLineNumbers = showLineNumbers.asInstanceOf[js.Any], showPrintMargin = showPrintMargin.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipFollowsMouse = tooltipFollowsMouse.asInstanceOf[js.Any], useSoftTabs = useSoftTabs.asInstanceOf[js.Any], useWorker = useWorker.asInstanceOf[js.Any], vScrollBarAlwaysVisible = vScrollBarAlwaysVisible.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any], wrapBehavioursEnabled = wrapBehavioursEnabled.asInstanceOf[js.Any], wrapMethod = wrapMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorOptions]
  }
  
  @scala.inline
  implicit class EditorOptionsMutableBuilder[Self <: EditorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScrollEditorIntoView(value: Boolean): Self = StObject.set(x, "autoScrollEditorIntoView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehavioursEnabled(value: Boolean): Self = StObject.set(x, "behavioursEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyWithEmptySelection(value: Boolean): Self = StObject.set(x, "copyWithEmptySelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorStyle(value: ace | slim | smooth | wide): Self = StObject.set(x, "cursorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAutoIndent(value: Boolean): Self = StObject.set(x, "enableAutoIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightActiveLine(value: Boolean): Self = StObject.set(x, "highlightActiveLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightSelectedWord(value: Boolean): Self = StObject.set(x, "highlightSelectedWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardHandler(value: String): Self = StObject.set(x, "keyboardHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeUndoDeltas(value: `true` | `false` | always): Self = StObject.set(x, "mergeUndoDeltas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionStyle(value: String): Self = StObject.set(x, "selectionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: EditSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapBehavioursEnabled(value: Boolean): Self = StObject.set(x, "wrapBehavioursEnabled", value.asInstanceOf[js.Any])
  }
}
