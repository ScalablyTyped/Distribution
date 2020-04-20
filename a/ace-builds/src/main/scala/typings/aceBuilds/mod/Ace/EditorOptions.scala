package typings.aceBuilds.mod.Ace

import typings.aceBuilds.aceBuildsBooleans.`false`
import typings.aceBuilds.aceBuildsBooleans.`true`
import typings.aceBuilds.aceBuildsStrings.ace
import typings.aceBuilds.aceBuildsStrings.always
import typings.aceBuilds.aceBuildsStrings.auto
import typings.aceBuilds.aceBuildsStrings.code
import typings.aceBuilds.aceBuildsStrings.manual
import typings.aceBuilds.aceBuildsStrings.markbegin
import typings.aceBuilds.aceBuildsStrings.markbeginend
import typings.aceBuilds.aceBuildsStrings.slim
import typings.aceBuilds.aceBuildsStrings.smooth
import typings.aceBuilds.aceBuildsStrings.text
import typings.aceBuilds.aceBuildsStrings.wide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorOptions
  extends EditSessionOptions
     with MouseHandlerOptions
     with VirtualRendererOptions {
  var autoScrollEditorIntoView: Boolean
  var behavioursEnabled: Boolean
  var copyWithEmptySelection: Boolean
  var cursorStyle: ace | slim | smooth | wide
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
    wrap: String | Double,
    wrapBehavioursEnabled: Boolean,
    wrapMethod: code | text | auto
  ): EditorOptions = {
    val __obj = js.Dynamic.literal(animatedScroll = animatedScroll.asInstanceOf[js.Any], autoScrollEditorIntoView = autoScrollEditorIntoView.asInstanceOf[js.Any], behavioursEnabled = behavioursEnabled.asInstanceOf[js.Any], copyWithEmptySelection = copyWithEmptySelection.asInstanceOf[js.Any], cursorStyle = cursorStyle.asInstanceOf[js.Any], displayIndentGuides = displayIndentGuides.asInstanceOf[js.Any], dragDelay = dragDelay.asInstanceOf[js.Any], dragEnabled = dragEnabled.asInstanceOf[js.Any], fadeFoldWidgets = fadeFoldWidgets.asInstanceOf[js.Any], firstLineNumber = firstLineNumber.asInstanceOf[js.Any], fixedWidthGutter = fixedWidthGutter.asInstanceOf[js.Any], focusTimeout = focusTimeout.asInstanceOf[js.Any], foldStyle = foldStyle.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], hScrollBarAlwaysVisible = hScrollBarAlwaysVisible.asInstanceOf[js.Any], hasCssTransforms = hasCssTransforms.asInstanceOf[js.Any], highlightActiveLine = highlightActiveLine.asInstanceOf[js.Any], highlightGutterLine = highlightGutterLine.asInstanceOf[js.Any], highlightSelectedWord = highlightSelectedWord.asInstanceOf[js.Any], indentedSoftWrap = indentedSoftWrap.asInstanceOf[js.Any], keyboardHandler = keyboardHandler.asInstanceOf[js.Any], maxLines = maxLines.asInstanceOf[js.Any], maxPixelHeight = maxPixelHeight.asInstanceOf[js.Any], mergeUndoDeltas = mergeUndoDeltas.asInstanceOf[js.Any], minLines = minLines.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], navigateWithinSoftTabs = navigateWithinSoftTabs.asInstanceOf[js.Any], newLineMode = newLineMode.asInstanceOf[js.Any], overwrite = overwrite.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], printMargin = printMargin.asInstanceOf[js.Any], printMarginColumn = printMarginColumn.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], scrollPastEnd = scrollPastEnd.asInstanceOf[js.Any], scrollSpeed = scrollSpeed.asInstanceOf[js.Any], selectionStyle = selectionStyle.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], showFoldWidgets = showFoldWidgets.asInstanceOf[js.Any], showGutter = showGutter.asInstanceOf[js.Any], showInvisibles = showInvisibles.asInstanceOf[js.Any], showLineNumbers = showLineNumbers.asInstanceOf[js.Any], showPrintMargin = showPrintMargin.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipFollowsMouse = tooltipFollowsMouse.asInstanceOf[js.Any], useSoftTabs = useSoftTabs.asInstanceOf[js.Any], useWorker = useWorker.asInstanceOf[js.Any], vScrollBarAlwaysVisible = vScrollBarAlwaysVisible.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any], wrapBehavioursEnabled = wrapBehavioursEnabled.asInstanceOf[js.Any], wrapMethod = wrapMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorOptions]
  }
}

