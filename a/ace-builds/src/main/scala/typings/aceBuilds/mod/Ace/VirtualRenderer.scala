package typings.aceBuilds.mod.Ace

import typings.aceBuilds.aceBuildsStrings.animatedScroll
import typings.aceBuilds.aceBuildsStrings.displayIndentGuides
import typings.aceBuilds.aceBuildsStrings.fadeFoldWidgets
import typings.aceBuilds.aceBuildsStrings.fixedWidthGutter
import typings.aceBuilds.aceBuildsStrings.fontFamily
import typings.aceBuilds.aceBuildsStrings.fontSize
import typings.aceBuilds.aceBuildsStrings.hScrollBarAlwaysVisible
import typings.aceBuilds.aceBuildsStrings.hasCssTransforms
import typings.aceBuilds.aceBuildsStrings.highlightGutterLine
import typings.aceBuilds.aceBuildsStrings.maxLines
import typings.aceBuilds.aceBuildsStrings.maxPixelHeight
import typings.aceBuilds.aceBuildsStrings.minLines
import typings.aceBuilds.aceBuildsStrings.printMargin
import typings.aceBuilds.aceBuildsStrings.printMarginColumn
import typings.aceBuilds.aceBuildsStrings.scrollPastEnd
import typings.aceBuilds.aceBuildsStrings.showFoldWidgets
import typings.aceBuilds.aceBuildsStrings.showGutter
import typings.aceBuilds.aceBuildsStrings.showInvisibles
import typings.aceBuilds.aceBuildsStrings.showLineNumbers
import typings.aceBuilds.aceBuildsStrings.showPrintMargin
import typings.aceBuilds.aceBuildsStrings.theme
import typings.aceBuilds.aceBuildsStrings.vScrollBarAlwaysVisible
import typings.aceBuilds.anon.PageX
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualRenderer
  extends OptionsProvider
     with EventEmitter {
  var container: HTMLElement = js.native
  def adjustWrapLimit(): Boolean = js.native
  def alignCursor(cursor: Double, alignment: Double): Double = js.native
  def alignCursor(cursor: Point, alignment: Double): Double = js.native
  def animateScrolling(fromValue: Double, callback: js.Function0[Unit]): Unit = js.native
  def attachToShadowRoot(): Unit = js.native
  def destroy(): Unit = js.native
  def freeze(): Unit = js.native
  def getAnimatedScroll(): Boolean = js.native
  def getContainerElement(): HTMLElement = js.native
  def getDisplayIndentGuides(): Boolean = js.native
  def getFadeFoldWidgets(): Boolean = js.native
  def getFirstFullyVisibleRow(): Double = js.native
  def getFirstVisibleRow(): Double = js.native
  def getHScrollBarAlwaysVisible(): Boolean = js.native
  def getHighlightGutterLine(): Boolean = js.native
  def getLastFullyVisibleRow(): Double = js.native
  def getLastVisibleRow(): Double = js.native
  def getMouseEventTarget(): HTMLElement = js.native
  @JSName("getOption")
  def getOption_animatedScroll(name: animatedScroll): Boolean = js.native
  @JSName("getOption")
  def getOption_displayIndentGuides(name: displayIndentGuides): Boolean = js.native
  @JSName("getOption")
  def getOption_fadeFoldWidgets(name: fadeFoldWidgets): Boolean = js.native
  @JSName("getOption")
  def getOption_fixedWidthGutter(name: fixedWidthGutter): Boolean = js.native
  @JSName("getOption")
  def getOption_fontFamily(name: fontFamily): String = js.native
  @JSName("getOption")
  def getOption_fontSize(name: fontSize): Double = js.native
  @JSName("getOption")
  def getOption_hScrollBarAlwaysVisible(name: hScrollBarAlwaysVisible): Boolean = js.native
  @JSName("getOption")
  def getOption_hasCssTransforms(name: hasCssTransforms): Boolean = js.native
  @JSName("getOption")
  def getOption_highlightGutterLine(name: highlightGutterLine): Boolean = js.native
  @JSName("getOption")
  def getOption_maxLines(name: maxLines): Double = js.native
  @JSName("getOption")
  def getOption_maxPixelHeight(name: maxPixelHeight): Double = js.native
  @JSName("getOption")
  def getOption_minLines(name: minLines): Double = js.native
  @JSName("getOption")
  def getOption_printMargin(name: printMargin): Boolean | Double = js.native
  @JSName("getOption")
  def getOption_printMarginColumn(name: printMarginColumn): Double = js.native
  @JSName("getOption")
  def getOption_scrollPastEnd(name: scrollPastEnd): Boolean = js.native
  @JSName("getOption")
  def getOption_showFoldWidgets(name: showFoldWidgets): Boolean = js.native
  @JSName("getOption")
  def getOption_showGutter(name: showGutter): Boolean = js.native
  @JSName("getOption")
  def getOption_showInvisibles(name: showInvisibles): Boolean = js.native
  @JSName("getOption")
  def getOption_showLineNumbers(name: showLineNumbers): Boolean = js.native
  @JSName("getOption")
  def getOption_showPrintMargin(name: showPrintMargin): Boolean = js.native
  @JSName("getOption")
  def getOption_theme(name: theme): String = js.native
  @JSName("getOption")
  def getOption_vScrollBarAlwaysVisible(name: vScrollBarAlwaysVisible): Boolean = js.native
  def getPrintMarginColumn(): Boolean = js.native
  def getScrollBottomRow(): Double = js.native
  def getScrollLeft(): Double = js.native
  def getScrollTop(): Double = js.native
  def getScrollTopRow(): Double = js.native
  def getShowGutter(): Boolean = js.native
  def getShowInvisibles(): Boolean = js.native
  def getShowPrintMargin(): Boolean = js.native
  def getTextAreaContainer(): HTMLElement = js.native
  def getTheme(): String = js.native
  def getVScrollBarAlwaysVisible(): Boolean = js.native
  def hideComposition(): Unit = js.native
  def hideCursor(): Unit = js.native
  def isScrollableBy(deltaX: Double, deltaY: Double): Boolean = js.native
  def scrollBy(deltaX: Double, deltaY: Double): Unit = js.native
  def scrollCursorIntoView(cursor: Point): Unit = js.native
  def scrollCursorIntoView(cursor: Point, offset: Double): Unit = js.native
  def scrollSelectionIntoView(anchor: Point, lead: Point): Unit = js.native
  def scrollSelectionIntoView(anchor: Point, lead: Point, offset: Double): Unit = js.native
  def scrollTo(x: Double, y: Double): Unit = js.native
  def scrollToLine(line: Double, center: Boolean, animate: Boolean, callback: js.Function0[Unit]): Unit = js.native
  def scrollToRow(row: Double): Unit = js.native
  def scrollToX(scrollLeft: Double): Unit = js.native
  def scrollToY(scrollTop: Double): Unit = js.native
  def setAnimatedScroll(shouldAnimate: Boolean): Unit = js.native
  def setAnnotations(annotations: js.Array[Annotation]): Unit = js.native
  def setCompositionText(text: String): Unit = js.native
  def setCursorStyle(style: String): Unit = js.native
  def setDisplayIndentGuides(display: Boolean): Unit = js.native
  def setFadeFoldWidgets(show: Boolean): Unit = js.native
  def setHScrollBarAlwaysVisible(alwaysVisible: Boolean): Unit = js.native
  def setHighlightGutterLine(shouldHighlight: Boolean): Unit = js.native
  def setMouseCursor(cursorStyle: String): Unit = js.native
  @JSName("setOption")
  def setOption_animatedScroll(name: animatedScroll, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_displayIndentGuides(name: displayIndentGuides, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_fadeFoldWidgets(name: fadeFoldWidgets, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_fixedWidthGutter(name: fixedWidthGutter, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_fontFamily(name: fontFamily, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_fontSize(name: fontSize, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_hScrollBarAlwaysVisible(name: hScrollBarAlwaysVisible, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_hasCssTransforms(name: hasCssTransforms, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_highlightGutterLine(name: highlightGutterLine, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_maxLines(name: maxLines, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_maxPixelHeight(name: maxPixelHeight, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_minLines(name: minLines, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_printMargin(name: printMargin, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_printMargin(name: printMargin, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_printMarginColumn(name: printMarginColumn, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_scrollPastEnd(name: scrollPastEnd, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_showFoldWidgets(name: showFoldWidgets, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_showGutter(name: showGutter, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_showInvisibles(name: showInvisibles, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_showLineNumbers(name: showLineNumbers, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_showPrintMargin(name: showPrintMargin, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_theme(name: theme, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_vScrollBarAlwaysVisible(name: vScrollBarAlwaysVisible, value: Boolean): Unit = js.native
  def setPadding(padding: Double): Unit = js.native
  def setPrintMarginColumn(showPrintMargin: Boolean): Unit = js.native
  def setScrollMargin(top: Double, bottom: Double, left: Double, right: Double): Unit = js.native
  def setSession(session: EditSession): Unit = js.native
  def setShowGutter(show: Boolean): Unit = js.native
  def setShowInvisibles(showInvisibles: Boolean): Unit = js.native
  def setShowPrintMargin(showPrintMargin: Boolean): Unit = js.native
  def setStyle(style: String): Unit = js.native
  def setStyle(style: String, include: Boolean): Unit = js.native
  def setTheme(theme: String): Unit = js.native
  def setTheme(theme: String, callback: js.Function0[Unit]): Unit = js.native
  def setVScrollBarAlwaysVisible(alwaysVisible: Boolean): Unit = js.native
  def showComposition(position: Double): Unit = js.native
  def showCursor(): Unit = js.native
  def textToScreenCoordinates(row: Double, column: Double): PageX = js.native
  def unfreeze(): Unit = js.native
  def unsetStyle(style: String): Unit = js.native
  def updateBackMarkers(): Unit = js.native
  def updateBreakpoints(): Unit = js.native
  def updateCursor(): Unit = js.native
  def updateFontSize(): Unit = js.native
  def updateFrontMarkers(): Unit = js.native
  def updateFull(): Unit = js.native
  def updateFull(force: Boolean): Unit = js.native
  def updateLines(firstRow: Double, lastRow: Double): Unit = js.native
  def updateLines(firstRow: Double, lastRow: Double, force: Boolean): Unit = js.native
  def updateText(): Unit = js.native
  def visualizeBlur(): Unit = js.native
  def visualizeFocus(): Unit = js.native
}

