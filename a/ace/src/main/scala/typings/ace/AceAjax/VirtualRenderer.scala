package typings.ace.AceAjax

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualRenderer extends OptionProvider {
  var characterWidth: Double = js.native
  var lineHeight: Double = js.native
  var scroller: js.Any = js.native
  /**
    * Deprecated; (moved to [[EditSession]])
    **/
  def addGutterDecoration(): Unit = js.native
  /**
    * Adjusts the wrap limit, which is the number of characters that can fit within the width of the edit area on screen.
    **/
  def adjustWrapLimit(): Unit = js.native
  /**
    * Destroys the text and cursor layers for this renderer.
    **/
  def destroy(): Unit = js.native
  /**
    * Returns whether an animated scroll happens or not.
    **/
  def getAnimatedScroll(): Boolean = js.native
  /**
    * Returns the root element containing this renderer.
    **/
  def getContainerElement(): HTMLElement = js.native
  /**
    * Returns the index of the first fully visible row. "Fully" here means that the characters in the row are not truncated; that the top and the bottom of the row are on the screen.
    **/
  def getFirstFullyVisibleRow(): Double = js.native
  /**
    * [Returns the index of the first visible row.]{: #VirtualRenderer.getFirstVisibleRow}
    **/
  def getFirstVisibleRow(): Double = js.native
  /**
    * Returns whether the horizontal scrollbar is set to be always visible.
    **/
  def getHScrollBarAlwaysVisible(): Boolean = js.native
  /**
    * Returns the index of the last fully visible row. "Fully" here means that the characters in the row are not truncated; that the top and the bottom of the row are on the screen.
    **/
  def getLastFullyVisibleRow(): Double = js.native
  /**
    * [Returns the index of the last visible row.]{: #VirtualRenderer.getLastVisibleRow}
    **/
  def getLastVisibleRow(): Double = js.native
  /**
    * Returns the element that the mouse events are attached to
    **/
  def getMouseEventTarget(): HTMLElement = js.native
  /**
    * Returns whether the print margin column is being shown or not.
    **/
  def getPrintMarginColumn(): Boolean = js.native
  /**
    * Returns the last visible row, regardless of whether it's fully visible or not.
    **/
  def getScrollBottomRow(): Double = js.native
  /**
    * {:EditSession.getScrollLeft}
    **/
  def getScrollLeft(): Double = js.native
  /**
    * {:EditSession.getScrollTop}
    **/
  def getScrollTop(): Double = js.native
  /**
    * Returns the first visible row, regardless of whether it's fully visible or not.
    **/
  def getScrollTopRow(): Double = js.native
  /**
    * Returns `true` if the gutter is being shown.
    **/
  def getShowGutter(): Boolean = js.native
  /**
    * Returns whether invisible characters are being shown or not.
    **/
  def getShowInvisibles(): Boolean = js.native
  /**
    * Returns whether the print margin is being shown or not.
    **/
  def getShowPrintMargin(): Boolean = js.native
  /**
    * Returns the element to which the hidden text area is added.
    **/
  def getTextAreaContainer(): HTMLElement = js.native
  /**
    * [Returns the path of the current theme.]{: #VirtualRenderer.getTheme}
    **/
  def getTheme(): String = js.native
  /**
    * Hides the current composition.
    **/
  def hideComposition(): Unit = js.native
  /**
    * Hides the cursor icon.
    **/
  def hideCursor(): Unit = js.native
  /**
    * Returns `true` if you can still scroll by either parameter; in other words, you haven't reached the end of the file or line.
    * @param deltaX The x value to scroll by
    * @param deltaY The y value to scroll by
    **/
  def isScrollableBy(deltaX: Double, deltaY: Double): Boolean = js.native
  /**
    * [Triggers a resize of the editor.]{: #VirtualRenderer.onResize}
    * @param force If `true`, recomputes the size, even if the height and width haven't changed
    * @param gutterWidth The width of the gutter in pixels
    * @param width The width of the editor in pixels
    * @param height The hiehgt of the editor, in pixels
    **/
  def onResize(force: Boolean, gutterWidth: Double, width: Double, height: Double): Unit = js.native
  /**
    * Deprecated; (moved to [[EditSession]])
    **/
  def removeGutterDecoration(): Unit = js.native
  def screenToTextCoordinates(left: Double, top: Double): Unit = js.native
  /**
    * Scrolls the editor across both x- and y-axes.
    * @param deltaX The x value to scroll by
    * @param deltaY The y value to scroll by
    **/
  def scrollBy(deltaX: Double, deltaY: Double): Unit = js.native
  /**
    * Scrolls the cursor into the first visibile area of the editor
    **/
  def scrollCursorIntoView(): Unit = js.native
  /**
    * Gracefully scrolls the editor to the row indicated.
    * @param line A line number
    * @param center If `true`, centers the editor the to indicated line
    * @param animate If `true` animates scrolling
    * @param callback Function to be called after the animation has finished
    **/
  def scrollToLine(line: Double, center: Boolean, animate: Boolean, callback: js.Function): Unit = js.native
  /**
    * Gracefully scrolls from the top of the editor to the row indicated.
    * @param row A row id
    **/
  def scrollToRow(row: Double): Unit = js.native
  /**
    * Scrolls the editor across the x-axis to the pixel indicated.
    * @param scrollLeft The position to scroll to
    **/
  def scrollToX(scrollLeft: Double): Double = js.native
  /**
    * Scrolls the editor to the y pixel indicated.
    * @param scrollTop The position to scroll to
    **/
  def scrollToY(scrollTop: Double): Double = js.native
  /**
    * Identifies whether you want to have an animated scroll or not.
    * @param shouldAnimate Set to `true` to show animated scrolls
    **/
  def setAnimatedScroll(shouldAnimate: Boolean): Unit = js.native
  /**
    * Sets annotations for the gutter.
    * @param annotations An array containing annotations
    **/
  def setAnnotations(annotations: js.Array[_]): Unit = js.native
  /**
    * Sets the inner text of the current composition to `text`.
    * @param text A string of text to use
    **/
  def setCompositionText(text: String): Unit = js.native
  /**
    * Identifies whether you want to show the horizontal scrollbar or not.
    * @param alwaysVisible Set to `true` to make the horizontal scroll bar visible
    **/
  def setHScrollBarAlwaysVisible(alwaysVisible: Boolean): Unit = js.native
  /**
    * Sets the padding for all the layers.
    * @param padding A new padding value (in pixels)
    **/
  def setPadding(padding: Double): Unit = js.native
  /**
    * Identifies whether you want to show the print margin column or not.
    * @param showPrintMargin Set to `true` to show the print margin column
    **/
  def setPrintMarginColumn(showPrintMargin: Boolean): Unit = js.native
  def setScrollMargin(top: Double, bottom: Double, left: Double, right: Double): Unit = js.native
  /**
    * Associates the renderer with an [[EditSession `EditSession`]].
    **/
  def setSession(session: IEditSession): Unit = js.native
  /**
    * Identifies whether you want to show the gutter or not.
    * @param show Set to `true` to show the gutter
    **/
  def setShowGutter(show: Boolean): Unit = js.native
  /**
    * Identifies whether you want to show invisible characters or not.
    * @param showInvisibles Set to `true` to show invisibles
    **/
  def setShowInvisibles(showInvisibles: Boolean): Unit = js.native
  /**
    * Identifies whether you want to show the print margin or not.
    * @param showPrintMargin Set to `true` to show the print margin
    **/
  def setShowPrintMargin(showPrintMargin: Boolean): Unit = js.native
  /**
    * [Adds a new class, `style`, to the editor.]{: #VirtualRenderer.setStyle}
    * @param style A class name
    **/
  def setStyle(style: String): Unit = js.native
  /**
    * [Sets a new theme for the editor. `theme` should exist, and be a directory path, like `ace/theme/textmate`.]{: #VirtualRenderer.setTheme}
    * @param theme The path to a theme
    **/
  def setTheme(theme: String): Unit = js.native
  /**
    * undefined
    * @param position
    **/
  def showComposition(position: Double): Unit = js.native
  /**
    * Shows the cursor icon.
    **/
  def showCursor(): Unit = js.native
  /**
    * Returns an object containing the `pageX` and `pageY` coordinates of the document position.
    * @param row The document row position
    * @param column The document column position
    **/
  def textToScreenCoordinates(row: Double, column: Double): js.Any = js.native
  /**
    * [Removes the class `style` from the editor.]{: #VirtualRenderer.unsetStyle}
    * @param style A class name
    **/
  def unsetStyle(style: String): Unit = js.native
  /**
    * Schedules an update to all the back markers in the document.
    **/
  def updateBackMarkers(): Unit = js.native
  /**
    * Redraw breakpoints.
    **/
  def updateBreakpoints(): Unit = js.native
  /**
    * Updates the cursor icon.
    **/
  def updateCursor(): Unit = js.native
  /**
    * Updates the font size.
    **/
  def updateFontSize(): Unit = js.native
  /**
    * Schedules an update to all the front markers in the document.
    **/
  def updateFrontMarkers(): Unit = js.native
  /**
    * Triggers a full update of all the layers, for all the rows.
    * @param force If `true`, forces the changes through
    **/
  def updateFull(force: Boolean): Unit = js.native
  /**
    * Triggers a partial update of the text, from the range given by the two parameters.
    * @param firstRow The first row to update
    * @param lastRow The last row to update
    **/
  def updateLines(firstRow: Double, lastRow: Double): Unit = js.native
  /**
    * Triggers a full update of the text, for all the rows.
    **/
  def updateText(): Unit = js.native
  /**
    * Blurs the current container.
    **/
  def visualizeBlur(): Unit = js.native
  /**
    * Focuses the current container.
    **/
  def visualizeFocus(): Unit = js.native
}

object VirtualRenderer {
  @scala.inline
  def apply(
    addGutterDecoration: () => Unit,
    adjustWrapLimit: () => Unit,
    characterWidth: Double,
    destroy: () => Unit,
    getAnimatedScroll: () => Boolean,
    getContainerElement: () => HTMLElement,
    getFirstFullyVisibleRow: () => Double,
    getFirstVisibleRow: () => Double,
    getHScrollBarAlwaysVisible: () => Boolean,
    getLastFullyVisibleRow: () => Double,
    getLastVisibleRow: () => Double,
    getMouseEventTarget: () => HTMLElement,
    getOption: String => js.Any,
    getOptions: () => js.Any,
    getPrintMarginColumn: () => Boolean,
    getScrollBottomRow: () => Double,
    getScrollLeft: () => Double,
    getScrollTop: () => Double,
    getScrollTopRow: () => Double,
    getShowGutter: () => Boolean,
    getShowInvisibles: () => Boolean,
    getShowPrintMargin: () => Boolean,
    getTextAreaContainer: () => HTMLElement,
    getTheme: () => String,
    hideComposition: () => Unit,
    hideCursor: () => Unit,
    isScrollableBy: (Double, Double) => Boolean,
    lineHeight: Double,
    onResize: (Boolean, Double, Double, Double) => Unit,
    removeGutterDecoration: () => Unit,
    screenToTextCoordinates: (Double, Double) => Unit,
    scrollBy: (Double, Double) => Unit,
    scrollCursorIntoView: () => Unit,
    scrollToLine: (Double, Boolean, Boolean, js.Function) => Unit,
    scrollToRow: Double => Unit,
    scrollToX: Double => Double,
    scrollToY: Double => Double,
    scroller: js.Any,
    setAnimatedScroll: Boolean => Unit,
    setAnnotations: js.Array[_] => Unit,
    setCompositionText: String => Unit,
    setHScrollBarAlwaysVisible: Boolean => Unit,
    setOption: (String, js.Any) => Unit,
    setOptions: js.Any => Unit,
    setPadding: Double => Unit,
    setPrintMarginColumn: Boolean => Unit,
    setScrollMargin: (Double, Double, Double, Double) => Unit,
    setSession: IEditSession => Unit,
    setShowGutter: Boolean => Unit,
    setShowInvisibles: Boolean => Unit,
    setShowPrintMargin: Boolean => Unit,
    setStyle: String => Unit,
    setTheme: String => Unit,
    showComposition: Double => Unit,
    showCursor: () => Unit,
    textToScreenCoordinates: (Double, Double) => js.Any,
    unsetStyle: String => Unit,
    updateBackMarkers: () => Unit,
    updateBreakpoints: () => Unit,
    updateCursor: () => Unit,
    updateFontSize: () => Unit,
    updateFrontMarkers: () => Unit,
    updateFull: Boolean => Unit,
    updateLines: (Double, Double) => Unit,
    updateText: () => Unit,
    visualizeBlur: () => Unit,
    visualizeFocus: () => Unit
  ): VirtualRenderer = {
    val __obj = js.Dynamic.literal(addGutterDecoration = js.Any.fromFunction0(addGutterDecoration), adjustWrapLimit = js.Any.fromFunction0(adjustWrapLimit), characterWidth = characterWidth.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getAnimatedScroll = js.Any.fromFunction0(getAnimatedScroll), getContainerElement = js.Any.fromFunction0(getContainerElement), getFirstFullyVisibleRow = js.Any.fromFunction0(getFirstFullyVisibleRow), getFirstVisibleRow = js.Any.fromFunction0(getFirstVisibleRow), getHScrollBarAlwaysVisible = js.Any.fromFunction0(getHScrollBarAlwaysVisible), getLastFullyVisibleRow = js.Any.fromFunction0(getLastFullyVisibleRow), getLastVisibleRow = js.Any.fromFunction0(getLastVisibleRow), getMouseEventTarget = js.Any.fromFunction0(getMouseEventTarget), getOption = js.Any.fromFunction1(getOption), getOptions = js.Any.fromFunction0(getOptions), getPrintMarginColumn = js.Any.fromFunction0(getPrintMarginColumn), getScrollBottomRow = js.Any.fromFunction0(getScrollBottomRow), getScrollLeft = js.Any.fromFunction0(getScrollLeft), getScrollTop = js.Any.fromFunction0(getScrollTop), getScrollTopRow = js.Any.fromFunction0(getScrollTopRow), getShowGutter = js.Any.fromFunction0(getShowGutter), getShowInvisibles = js.Any.fromFunction0(getShowInvisibles), getShowPrintMargin = js.Any.fromFunction0(getShowPrintMargin), getTextAreaContainer = js.Any.fromFunction0(getTextAreaContainer), getTheme = js.Any.fromFunction0(getTheme), hideComposition = js.Any.fromFunction0(hideComposition), hideCursor = js.Any.fromFunction0(hideCursor), isScrollableBy = js.Any.fromFunction2(isScrollableBy), lineHeight = lineHeight.asInstanceOf[js.Any], onResize = js.Any.fromFunction4(onResize), removeGutterDecoration = js.Any.fromFunction0(removeGutterDecoration), screenToTextCoordinates = js.Any.fromFunction2(screenToTextCoordinates), scrollBy = js.Any.fromFunction2(scrollBy), scrollCursorIntoView = js.Any.fromFunction0(scrollCursorIntoView), scrollToLine = js.Any.fromFunction4(scrollToLine), scrollToRow = js.Any.fromFunction1(scrollToRow), scrollToX = js.Any.fromFunction1(scrollToX), scrollToY = js.Any.fromFunction1(scrollToY), scroller = scroller.asInstanceOf[js.Any], setAnimatedScroll = js.Any.fromFunction1(setAnimatedScroll), setAnnotations = js.Any.fromFunction1(setAnnotations), setCompositionText = js.Any.fromFunction1(setCompositionText), setHScrollBarAlwaysVisible = js.Any.fromFunction1(setHScrollBarAlwaysVisible), setOption = js.Any.fromFunction2(setOption), setOptions = js.Any.fromFunction1(setOptions), setPadding = js.Any.fromFunction1(setPadding), setPrintMarginColumn = js.Any.fromFunction1(setPrintMarginColumn), setScrollMargin = js.Any.fromFunction4(setScrollMargin), setSession = js.Any.fromFunction1(setSession), setShowGutter = js.Any.fromFunction1(setShowGutter), setShowInvisibles = js.Any.fromFunction1(setShowInvisibles), setShowPrintMargin = js.Any.fromFunction1(setShowPrintMargin), setStyle = js.Any.fromFunction1(setStyle), setTheme = js.Any.fromFunction1(setTheme), showComposition = js.Any.fromFunction1(showComposition), showCursor = js.Any.fromFunction0(showCursor), textToScreenCoordinates = js.Any.fromFunction2(textToScreenCoordinates), unsetStyle = js.Any.fromFunction1(unsetStyle), updateBackMarkers = js.Any.fromFunction0(updateBackMarkers), updateBreakpoints = js.Any.fromFunction0(updateBreakpoints), updateCursor = js.Any.fromFunction0(updateCursor), updateFontSize = js.Any.fromFunction0(updateFontSize), updateFrontMarkers = js.Any.fromFunction0(updateFrontMarkers), updateFull = js.Any.fromFunction1(updateFull), updateLines = js.Any.fromFunction2(updateLines), updateText = js.Any.fromFunction0(updateText), visualizeBlur = js.Any.fromFunction0(visualizeBlur), visualizeFocus = js.Any.fromFunction0(visualizeFocus))
    __obj.asInstanceOf[VirtualRenderer]
  }
  @scala.inline
  implicit class VirtualRendererOps[Self <: VirtualRenderer] (val x: Self) extends AnyVal {
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
    def setAddGutterDecoration(value: () => Unit): Self = this.set("addGutterDecoration", js.Any.fromFunction0(value))
    @scala.inline
    def setAdjustWrapLimit(value: () => Unit): Self = this.set("adjustWrapLimit", js.Any.fromFunction0(value))
    @scala.inline
    def setCharacterWidth(value: Double): Self = this.set("characterWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAnimatedScroll(value: () => Boolean): Self = this.set("getAnimatedScroll", js.Any.fromFunction0(value))
    @scala.inline
    def setGetContainerElement(value: () => HTMLElement): Self = this.set("getContainerElement", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFirstFullyVisibleRow(value: () => Double): Self = this.set("getFirstFullyVisibleRow", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFirstVisibleRow(value: () => Double): Self = this.set("getFirstVisibleRow", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHScrollBarAlwaysVisible(value: () => Boolean): Self = this.set("getHScrollBarAlwaysVisible", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLastFullyVisibleRow(value: () => Double): Self = this.set("getLastFullyVisibleRow", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLastVisibleRow(value: () => Double): Self = this.set("getLastVisibleRow", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMouseEventTarget(value: () => HTMLElement): Self = this.set("getMouseEventTarget", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPrintMarginColumn(value: () => Boolean): Self = this.set("getPrintMarginColumn", js.Any.fromFunction0(value))
    @scala.inline
    def setGetScrollBottomRow(value: () => Double): Self = this.set("getScrollBottomRow", js.Any.fromFunction0(value))
    @scala.inline
    def setGetScrollLeft(value: () => Double): Self = this.set("getScrollLeft", js.Any.fromFunction0(value))
    @scala.inline
    def setGetScrollTop(value: () => Double): Self = this.set("getScrollTop", js.Any.fromFunction0(value))
    @scala.inline
    def setGetScrollTopRow(value: () => Double): Self = this.set("getScrollTopRow", js.Any.fromFunction0(value))
    @scala.inline
    def setGetShowGutter(value: () => Boolean): Self = this.set("getShowGutter", js.Any.fromFunction0(value))
    @scala.inline
    def setGetShowInvisibles(value: () => Boolean): Self = this.set("getShowInvisibles", js.Any.fromFunction0(value))
    @scala.inline
    def setGetShowPrintMargin(value: () => Boolean): Self = this.set("getShowPrintMargin", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTextAreaContainer(value: () => HTMLElement): Self = this.set("getTextAreaContainer", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTheme(value: () => String): Self = this.set("getTheme", js.Any.fromFunction0(value))
    @scala.inline
    def setHideComposition(value: () => Unit): Self = this.set("hideComposition", js.Any.fromFunction0(value))
    @scala.inline
    def setHideCursor(value: () => Unit): Self = this.set("hideCursor", js.Any.fromFunction0(value))
    @scala.inline
    def setIsScrollableBy(value: (Double, Double) => Boolean): Self = this.set("isScrollableBy", js.Any.fromFunction2(value))
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnResize(value: (Boolean, Double, Double, Double) => Unit): Self = this.set("onResize", js.Any.fromFunction4(value))
    @scala.inline
    def setRemoveGutterDecoration(value: () => Unit): Self = this.set("removeGutterDecoration", js.Any.fromFunction0(value))
    @scala.inline
    def setScreenToTextCoordinates(value: (Double, Double) => Unit): Self = this.set("screenToTextCoordinates", js.Any.fromFunction2(value))
    @scala.inline
    def setScrollBy(value: (Double, Double) => Unit): Self = this.set("scrollBy", js.Any.fromFunction2(value))
    @scala.inline
    def setScrollCursorIntoView(value: () => Unit): Self = this.set("scrollCursorIntoView", js.Any.fromFunction0(value))
    @scala.inline
    def setScrollToLine(value: (Double, Boolean, Boolean, js.Function) => Unit): Self = this.set("scrollToLine", js.Any.fromFunction4(value))
    @scala.inline
    def setScrollToRow(value: Double => Unit): Self = this.set("scrollToRow", js.Any.fromFunction1(value))
    @scala.inline
    def setScrollToX(value: Double => Double): Self = this.set("scrollToX", js.Any.fromFunction1(value))
    @scala.inline
    def setScrollToY(value: Double => Double): Self = this.set("scrollToY", js.Any.fromFunction1(value))
    @scala.inline
    def setScroller(value: js.Any): Self = this.set("scroller", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetAnimatedScroll(value: Boolean => Unit): Self = this.set("setAnimatedScroll", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAnnotations(value: js.Array[_] => Unit): Self = this.set("setAnnotations", js.Any.fromFunction1(value))
    @scala.inline
    def setSetCompositionText(value: String => Unit): Self = this.set("setCompositionText", js.Any.fromFunction1(value))
    @scala.inline
    def setSetHScrollBarAlwaysVisible(value: Boolean => Unit): Self = this.set("setHScrollBarAlwaysVisible", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPadding(value: Double => Unit): Self = this.set("setPadding", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPrintMarginColumn(value: Boolean => Unit): Self = this.set("setPrintMarginColumn", js.Any.fromFunction1(value))
    @scala.inline
    def setSetScrollMargin(value: (Double, Double, Double, Double) => Unit): Self = this.set("setScrollMargin", js.Any.fromFunction4(value))
    @scala.inline
    def setSetSession(value: IEditSession => Unit): Self = this.set("setSession", js.Any.fromFunction1(value))
    @scala.inline
    def setSetShowGutter(value: Boolean => Unit): Self = this.set("setShowGutter", js.Any.fromFunction1(value))
    @scala.inline
    def setSetShowInvisibles(value: Boolean => Unit): Self = this.set("setShowInvisibles", js.Any.fromFunction1(value))
    @scala.inline
    def setSetShowPrintMargin(value: Boolean => Unit): Self = this.set("setShowPrintMargin", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStyle(value: String => Unit): Self = this.set("setStyle", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTheme(value: String => Unit): Self = this.set("setTheme", js.Any.fromFunction1(value))
    @scala.inline
    def setShowComposition(value: Double => Unit): Self = this.set("showComposition", js.Any.fromFunction1(value))
    @scala.inline
    def setShowCursor(value: () => Unit): Self = this.set("showCursor", js.Any.fromFunction0(value))
    @scala.inline
    def setTextToScreenCoordinates(value: (Double, Double) => js.Any): Self = this.set("textToScreenCoordinates", js.Any.fromFunction2(value))
    @scala.inline
    def setUnsetStyle(value: String => Unit): Self = this.set("unsetStyle", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateBackMarkers(value: () => Unit): Self = this.set("updateBackMarkers", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdateBreakpoints(value: () => Unit): Self = this.set("updateBreakpoints", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdateCursor(value: () => Unit): Self = this.set("updateCursor", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdateFontSize(value: () => Unit): Self = this.set("updateFontSize", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdateFrontMarkers(value: () => Unit): Self = this.set("updateFrontMarkers", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdateFull(value: Boolean => Unit): Self = this.set("updateFull", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateLines(value: (Double, Double) => Unit): Self = this.set("updateLines", js.Any.fromFunction2(value))
    @scala.inline
    def setUpdateText(value: () => Unit): Self = this.set("updateText", js.Any.fromFunction0(value))
    @scala.inline
    def setVisualizeBlur(value: () => Unit): Self = this.set("visualizeBlur", js.Any.fromFunction0(value))
    @scala.inline
    def setVisualizeFocus(value: () => Unit): Self = this.set("visualizeFocus", js.Any.fromFunction0(value))
  }
  
}

