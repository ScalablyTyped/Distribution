package typings.aceBuilds

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
import typings.aceBuilds.mod.Ace.EditSession
import typings.aceBuilds.mod.Ace.NewLineMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ace-builds.ace-builds.Ace.EditorOptions> */
trait PartialEditorOptions extends js.Object {
  var animatedScroll: js.UndefOr[Boolean] = js.undefined
  var autoScrollEditorIntoView: js.UndefOr[Boolean] = js.undefined
  var behavioursEnabled: js.UndefOr[Boolean] = js.undefined
  var copyWithEmptySelection: js.UndefOr[Boolean] = js.undefined
  var cursorStyle: js.UndefOr[ace | slim | smooth | wide] = js.undefined
  var displayIndentGuides: js.UndefOr[Boolean] = js.undefined
  var dragDelay: js.UndefOr[Double] = js.undefined
  var dragEnabled: js.UndefOr[Boolean] = js.undefined
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
  var keyboardHandler: js.UndefOr[String] = js.undefined
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
  var wrap: js.UndefOr[String | Double] = js.undefined
  var wrapBehavioursEnabled: js.UndefOr[Boolean] = js.undefined
  var wrapMethod: js.UndefOr[code | text | auto] = js.undefined
}

object PartialEditorOptions {
  @scala.inline
  def apply(
    animatedScroll: js.UndefOr[Boolean] = js.undefined,
    autoScrollEditorIntoView: js.UndefOr[Boolean] = js.undefined,
    behavioursEnabled: js.UndefOr[Boolean] = js.undefined,
    copyWithEmptySelection: js.UndefOr[Boolean] = js.undefined,
    cursorStyle: ace | slim | smooth | wide = null,
    displayIndentGuides: js.UndefOr[Boolean] = js.undefined,
    dragDelay: Int | Double = null,
    dragEnabled: js.UndefOr[Boolean] = js.undefined,
    fadeFoldWidgets: js.UndefOr[Boolean] = js.undefined,
    firstLineNumber: Int | Double = null,
    fixedWidthGutter: js.UndefOr[Boolean] = js.undefined,
    focusTimeout: Int | Double = null,
    foldStyle: markbegin | markbeginend | manual = null,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    hScrollBarAlwaysVisible: js.UndefOr[Boolean] = js.undefined,
    hasCssTransforms: js.UndefOr[Boolean] = js.undefined,
    highlightActiveLine: js.UndefOr[Boolean] = js.undefined,
    highlightGutterLine: js.UndefOr[Boolean] = js.undefined,
    highlightSelectedWord: js.UndefOr[Boolean] = js.undefined,
    indentedSoftWrap: js.UndefOr[Boolean] = js.undefined,
    keyboardHandler: String = null,
    maxLines: Int | Double = null,
    maxPixelHeight: Int | Double = null,
    mergeUndoDeltas: `true` | `false` | always = null,
    minLines: Int | Double = null,
    mode: String = null,
    navigateWithinSoftTabs: js.UndefOr[Boolean] = js.undefined,
    newLineMode: NewLineMode = null,
    overwrite: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    printMargin: Boolean | Double = null,
    printMarginColumn: Int | Double = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    scrollPastEnd: js.UndefOr[Boolean] = js.undefined,
    scrollSpeed: Int | Double = null,
    selectionStyle: String = null,
    session: EditSession = null,
    showFoldWidgets: js.UndefOr[Boolean] = js.undefined,
    showGutter: js.UndefOr[Boolean] = js.undefined,
    showInvisibles: js.UndefOr[Boolean] = js.undefined,
    showLineNumbers: js.UndefOr[Boolean] = js.undefined,
    showPrintMargin: js.UndefOr[Boolean] = js.undefined,
    tabSize: Int | Double = null,
    theme: String = null,
    tooltipFollowsMouse: js.UndefOr[Boolean] = js.undefined,
    useSoftTabs: js.UndefOr[Boolean] = js.undefined,
    useWorker: js.UndefOr[Boolean] = js.undefined,
    vScrollBarAlwaysVisible: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    wrap: String | Double = null,
    wrapBehavioursEnabled: js.UndefOr[Boolean] = js.undefined,
    wrapMethod: code | text | auto = null
  ): PartialEditorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animatedScroll)) __obj.updateDynamic("animatedScroll")(animatedScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(autoScrollEditorIntoView)) __obj.updateDynamic("autoScrollEditorIntoView")(autoScrollEditorIntoView.asInstanceOf[js.Any])
    if (!js.isUndefined(behavioursEnabled)) __obj.updateDynamic("behavioursEnabled")(behavioursEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(copyWithEmptySelection)) __obj.updateDynamic("copyWithEmptySelection")(copyWithEmptySelection.asInstanceOf[js.Any])
    if (cursorStyle != null) __obj.updateDynamic("cursorStyle")(cursorStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(displayIndentGuides)) __obj.updateDynamic("displayIndentGuides")(displayIndentGuides.asInstanceOf[js.Any])
    if (dragDelay != null) __obj.updateDynamic("dragDelay")(dragDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(dragEnabled)) __obj.updateDynamic("dragEnabled")(dragEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeFoldWidgets)) __obj.updateDynamic("fadeFoldWidgets")(fadeFoldWidgets.asInstanceOf[js.Any])
    if (firstLineNumber != null) __obj.updateDynamic("firstLineNumber")(firstLineNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedWidthGutter)) __obj.updateDynamic("fixedWidthGutter")(fixedWidthGutter.asInstanceOf[js.Any])
    if (focusTimeout != null) __obj.updateDynamic("focusTimeout")(focusTimeout.asInstanceOf[js.Any])
    if (foldStyle != null) __obj.updateDynamic("foldStyle")(foldStyle.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(hScrollBarAlwaysVisible)) __obj.updateDynamic("hScrollBarAlwaysVisible")(hScrollBarAlwaysVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(hasCssTransforms)) __obj.updateDynamic("hasCssTransforms")(hasCssTransforms.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightActiveLine)) __obj.updateDynamic("highlightActiveLine")(highlightActiveLine.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightGutterLine)) __obj.updateDynamic("highlightGutterLine")(highlightGutterLine.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightSelectedWord)) __obj.updateDynamic("highlightSelectedWord")(highlightSelectedWord.asInstanceOf[js.Any])
    if (!js.isUndefined(indentedSoftWrap)) __obj.updateDynamic("indentedSoftWrap")(indentedSoftWrap.asInstanceOf[js.Any])
    if (keyboardHandler != null) __obj.updateDynamic("keyboardHandler")(keyboardHandler.asInstanceOf[js.Any])
    if (maxLines != null) __obj.updateDynamic("maxLines")(maxLines.asInstanceOf[js.Any])
    if (maxPixelHeight != null) __obj.updateDynamic("maxPixelHeight")(maxPixelHeight.asInstanceOf[js.Any])
    if (mergeUndoDeltas != null) __obj.updateDynamic("mergeUndoDeltas")(mergeUndoDeltas.asInstanceOf[js.Any])
    if (minLines != null) __obj.updateDynamic("minLines")(minLines.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(navigateWithinSoftTabs)) __obj.updateDynamic("navigateWithinSoftTabs")(navigateWithinSoftTabs.asInstanceOf[js.Any])
    if (newLineMode != null) __obj.updateDynamic("newLineMode")(newLineMode.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (printMargin != null) __obj.updateDynamic("printMargin")(printMargin.asInstanceOf[js.Any])
    if (printMarginColumn != null) __obj.updateDynamic("printMarginColumn")(printMarginColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollPastEnd)) __obj.updateDynamic("scrollPastEnd")(scrollPastEnd.asInstanceOf[js.Any])
    if (scrollSpeed != null) __obj.updateDynamic("scrollSpeed")(scrollSpeed.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (!js.isUndefined(showFoldWidgets)) __obj.updateDynamic("showFoldWidgets")(showFoldWidgets.asInstanceOf[js.Any])
    if (!js.isUndefined(showGutter)) __obj.updateDynamic("showGutter")(showGutter.asInstanceOf[js.Any])
    if (!js.isUndefined(showInvisibles)) __obj.updateDynamic("showInvisibles")(showInvisibles.asInstanceOf[js.Any])
    if (!js.isUndefined(showLineNumbers)) __obj.updateDynamic("showLineNumbers")(showLineNumbers.asInstanceOf[js.Any])
    if (!js.isUndefined(showPrintMargin)) __obj.updateDynamic("showPrintMargin")(showPrintMargin.asInstanceOf[js.Any])
    if (tabSize != null) __obj.updateDynamic("tabSize")(tabSize.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipFollowsMouse)) __obj.updateDynamic("tooltipFollowsMouse")(tooltipFollowsMouse.asInstanceOf[js.Any])
    if (!js.isUndefined(useSoftTabs)) __obj.updateDynamic("useSoftTabs")(useSoftTabs.asInstanceOf[js.Any])
    if (!js.isUndefined(useWorker)) __obj.updateDynamic("useWorker")(useWorker.asInstanceOf[js.Any])
    if (!js.isUndefined(vScrollBarAlwaysVisible)) __obj.updateDynamic("vScrollBarAlwaysVisible")(vScrollBarAlwaysVisible.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapBehavioursEnabled)) __obj.updateDynamic("wrapBehavioursEnabled")(wrapBehavioursEnabled.asInstanceOf[js.Any])
    if (wrapMethod != null) __obj.updateDynamic("wrapMethod")(wrapMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialEditorOptions]
  }
}

