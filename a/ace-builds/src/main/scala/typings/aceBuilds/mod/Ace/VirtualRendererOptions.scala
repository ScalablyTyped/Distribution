package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualRendererOptions extends js.Object {
  var animatedScroll: Boolean
  var displayIndentGuides: Boolean
  var fadeFoldWidgets: Boolean
  var fixedWidthGutter: Boolean
  var fontFamily: String
  var fontSize: Double
  var hScrollBarAlwaysVisible: Boolean
  var hasCssTransforms: Boolean
  var highlightGutterLine: Boolean
  var maxLines: Double
  var maxPixelHeight: Double
  var minLines: Double
  var printMargin: Boolean | Double
  var printMarginColumn: Double
  var scrollPastEnd: Boolean
  var showFoldWidgets: Boolean
  var showGutter: Boolean
  var showInvisibles: Boolean
  var showLineNumbers: Boolean
  var showPrintMargin: Boolean
  var theme: String
  var vScrollBarAlwaysVisible: Boolean
}

object VirtualRendererOptions {
  @scala.inline
  def apply(
    animatedScroll: Boolean,
    displayIndentGuides: Boolean,
    fadeFoldWidgets: Boolean,
    fixedWidthGutter: Boolean,
    fontFamily: String,
    fontSize: Double,
    hScrollBarAlwaysVisible: Boolean,
    hasCssTransforms: Boolean,
    highlightGutterLine: Boolean,
    maxLines: Double,
    maxPixelHeight: Double,
    minLines: Double,
    printMargin: Boolean | Double,
    printMarginColumn: Double,
    scrollPastEnd: Boolean,
    showFoldWidgets: Boolean,
    showGutter: Boolean,
    showInvisibles: Boolean,
    showLineNumbers: Boolean,
    showPrintMargin: Boolean,
    theme: String,
    vScrollBarAlwaysVisible: Boolean
  ): VirtualRendererOptions = {
    val __obj = js.Dynamic.literal(animatedScroll = animatedScroll.asInstanceOf[js.Any], displayIndentGuides = displayIndentGuides.asInstanceOf[js.Any], fadeFoldWidgets = fadeFoldWidgets.asInstanceOf[js.Any], fixedWidthGutter = fixedWidthGutter.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], hScrollBarAlwaysVisible = hScrollBarAlwaysVisible.asInstanceOf[js.Any], hasCssTransforms = hasCssTransforms.asInstanceOf[js.Any], highlightGutterLine = highlightGutterLine.asInstanceOf[js.Any], maxLines = maxLines.asInstanceOf[js.Any], maxPixelHeight = maxPixelHeight.asInstanceOf[js.Any], minLines = minLines.asInstanceOf[js.Any], printMargin = printMargin.asInstanceOf[js.Any], printMarginColumn = printMarginColumn.asInstanceOf[js.Any], scrollPastEnd = scrollPastEnd.asInstanceOf[js.Any], showFoldWidgets = showFoldWidgets.asInstanceOf[js.Any], showGutter = showGutter.asInstanceOf[js.Any], showInvisibles = showInvisibles.asInstanceOf[js.Any], showLineNumbers = showLineNumbers.asInstanceOf[js.Any], showPrintMargin = showPrintMargin.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], vScrollBarAlwaysVisible = vScrollBarAlwaysVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRendererOptions]
  }
}

