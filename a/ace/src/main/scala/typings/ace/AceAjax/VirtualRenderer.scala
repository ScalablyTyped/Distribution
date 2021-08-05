package typings.ace.AceAjax

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualRenderer
  extends StObject
     with OptionProvider {
  
  /**
    * Deprecated; (moved to [[EditSession]])
    **/
  def addGutterDecoration(): Unit
  
  /**
    * Adjusts the wrap limit, which is the number of characters that can fit within the width of the edit area on screen.
    **/
  def adjustWrapLimit(): Unit
  
  var characterWidth: Double
  
  /**
    * Destroys the text and cursor layers for this renderer.
    **/
  def destroy(): Unit
  
  /**
    * Returns whether an animated scroll happens or not.
    **/
  def getAnimatedScroll(): Boolean
  
  /**
    * Returns the root element containing this renderer.
    **/
  def getContainerElement(): HTMLElement
  
  /**
    * Returns the index of the first fully visible row. "Fully" here means that the characters in the row are not truncated; that the top and the bottom of the row are on the screen.
    **/
  def getFirstFullyVisibleRow(): Double
  
  /**
    * [Returns the index of the first visible row.]{: #VirtualRenderer.getFirstVisibleRow}
    **/
  def getFirstVisibleRow(): Double
  
  /**
    * Returns whether the horizontal scrollbar is set to be always visible.
    **/
  def getHScrollBarAlwaysVisible(): Boolean
  
  /**
    * Returns the index of the last fully visible row. "Fully" here means that the characters in the row are not truncated; that the top and the bottom of the row are on the screen.
    **/
  def getLastFullyVisibleRow(): Double
  
  /**
    * [Returns the index of the last visible row.]{: #VirtualRenderer.getLastVisibleRow}
    **/
  def getLastVisibleRow(): Double
  
  /**
    * Returns the element that the mouse events are attached to
    **/
  def getMouseEventTarget(): HTMLElement
  
  /**
    * Returns whether the print margin column is being shown or not.
    **/
  def getPrintMarginColumn(): Boolean
  
  /**
    * Returns the last visible row, regardless of whether it's fully visible or not.
    **/
  def getScrollBottomRow(): Double
  
  /**
    * {:EditSession.getScrollLeft}
    **/
  def getScrollLeft(): Double
  
  /**
    * {:EditSession.getScrollTop}
    **/
  def getScrollTop(): Double
  
  /**
    * Returns the first visible row, regardless of whether it's fully visible or not.
    **/
  def getScrollTopRow(): Double
  
  /**
    * Returns `true` if the gutter is being shown.
    **/
  def getShowGutter(): Boolean
  
  /**
    * Returns whether invisible characters are being shown or not.
    **/
  def getShowInvisibles(): Boolean
  
  /**
    * Returns whether the print margin is being shown or not.
    **/
  def getShowPrintMargin(): Boolean
  
  /**
    * Returns the element to which the hidden text area is added.
    **/
  def getTextAreaContainer(): HTMLElement
  
  /**
    * [Returns the path of the current theme.]{: #VirtualRenderer.getTheme}
    **/
  def getTheme(): String
  
  /**
    * Hides the current composition.
    **/
  def hideComposition(): Unit
  
  /**
    * Hides the cursor icon.
    **/
  def hideCursor(): Unit
  
  /**
    * Returns `true` if you can still scroll by either parameter; in other words, you haven't reached the end of the file or line.
    * @param deltaX The x value to scroll by
    * @param deltaY The y value to scroll by
    **/
  def isScrollableBy(deltaX: Double, deltaY: Double): Boolean
  
  var lineHeight: Double
  
  /**
    * [Triggers a resize of the editor.]{: #VirtualRenderer.onResize}
    * @param force If `true`, recomputes the size, even if the height and width haven't changed
    * @param gutterWidth The width of the gutter in pixels
    * @param width The width of the editor in pixels
    * @param height The hiehgt of the editor, in pixels
    **/
  def onResize(force: Boolean, gutterWidth: Double, width: Double, height: Double): Unit
  
  /**
    * Deprecated; (moved to [[EditSession]])
    **/
  def removeGutterDecoration(): Unit
  
  def screenToTextCoordinates(left: Double, top: Double): Unit
  
  /**
    * Scrolls the editor across both x- and y-axes.
    * @param deltaX The x value to scroll by
    * @param deltaY The y value to scroll by
    **/
  def scrollBy(deltaX: Double, deltaY: Double): Unit
  
  /**
    * Scrolls the cursor into the first visibile area of the editor
    **/
  def scrollCursorIntoView(): Unit
  
  /**
    * Gracefully scrolls the editor to the row indicated.
    * @param line A line number
    * @param center If `true`, centers the editor the to indicated line
    * @param animate If `true` animates scrolling
    * @param callback Function to be called after the animation has finished
    **/
  def scrollToLine(line: Double, center: Boolean, animate: Boolean, callback: js.Function): Unit
  
  /**
    * Gracefully scrolls from the top of the editor to the row indicated.
    * @param row A row id
    **/
  def scrollToRow(row: Double): Unit
  
  /**
    * Scrolls the editor across the x-axis to the pixel indicated.
    * @param scrollLeft The position to scroll to
    **/
  def scrollToX(scrollLeft: Double): Double
  
  /**
    * Scrolls the editor to the y pixel indicated.
    * @param scrollTop The position to scroll to
    **/
  def scrollToY(scrollTop: Double): Double
  
  var scroller: js.Any
  
  /**
    * Identifies whether you want to have an animated scroll or not.
    * @param shouldAnimate Set to `true` to show animated scrolls
    **/
  def setAnimatedScroll(shouldAnimate: Boolean): Unit
  
  /**
    * Sets annotations for the gutter.
    * @param annotations An array containing annotations
    **/
  def setAnnotations(annotations: js.Array[js.Any]): Unit
  
  /**
    * Sets the inner text of the current composition to `text`.
    * @param text A string of text to use
    **/
  def setCompositionText(text: String): Unit
  
  /**
    * Identifies whether you want to show the horizontal scrollbar or not.
    * @param alwaysVisible Set to `true` to make the horizontal scroll bar visible
    **/
  def setHScrollBarAlwaysVisible(alwaysVisible: Boolean): Unit
  
  /**
    * Sets the padding for all the layers.
    * @param padding A new padding value (in pixels)
    **/
  def setPadding(padding: Double): Unit
  
  /**
    * Identifies whether you want to show the print margin column or not.
    * @param showPrintMargin Set to `true` to show the print margin column
    **/
  def setPrintMarginColumn(showPrintMargin: Boolean): Unit
  
  def setScrollMargin(top: Double, bottom: Double, left: Double, right: Double): Unit
  
  /**
    * Associates the renderer with an [[EditSession `EditSession`]].
    **/
  def setSession(session: IEditSession): Unit
  
  /**
    * Identifies whether you want to show the gutter or not.
    * @param show Set to `true` to show the gutter
    **/
  def setShowGutter(show: Boolean): Unit
  
  /**
    * Identifies whether you want to show invisible characters or not.
    * @param showInvisibles Set to `true` to show invisibles
    **/
  def setShowInvisibles(showInvisibles: Boolean): Unit
  
  /**
    * Identifies whether you want to show the print margin or not.
    * @param showPrintMargin Set to `true` to show the print margin
    **/
  def setShowPrintMargin(showPrintMargin: Boolean): Unit
  
  /**
    * [Adds a new class, `style`, to the editor.]{: #VirtualRenderer.setStyle}
    * @param style A class name
    **/
  def setStyle(style: String): Unit
  
  /**
    * [Sets a new theme for the editor. `theme` should exist, and be a directory path, like `ace/theme/textmate`.]{: #VirtualRenderer.setTheme}
    * @param theme The path to a theme
    **/
  def setTheme(theme: String): Unit
  
  /**
    * undefined
    * @param position
    **/
  def showComposition(position: Double): Unit
  
  /**
    * Shows the cursor icon.
    **/
  def showCursor(): Unit
  
  /**
    * Returns an object containing the `pageX` and `pageY` coordinates of the document position.
    * @param row The document row position
    * @param column The document column position
    **/
  def textToScreenCoordinates(row: Double, column: Double): js.Any
  
  /**
    * [Removes the class `style` from the editor.]{: #VirtualRenderer.unsetStyle}
    * @param style A class name
    **/
  def unsetStyle(style: String): Unit
  
  /**
    * Schedules an update to all the back markers in the document.
    **/
  def updateBackMarkers(): Unit
  
  /**
    * Redraw breakpoints.
    **/
  def updateBreakpoints(): Unit
  
  /**
    * Updates the cursor icon.
    **/
  def updateCursor(): Unit
  
  /**
    * Updates the font size.
    **/
  def updateFontSize(): Unit
  
  /**
    * Schedules an update to all the front markers in the document.
    **/
  def updateFrontMarkers(): Unit
  
  /**
    * Triggers a full update of all the layers, for all the rows.
    * @param force If `true`, forces the changes through
    **/
  def updateFull(force: Boolean): Unit
  
  /**
    * Triggers a partial update of the text, from the range given by the two parameters.
    * @param firstRow The first row to update
    * @param lastRow The last row to update
    **/
  def updateLines(firstRow: Double, lastRow: Double): Unit
  
  /**
    * Triggers a full update of the text, for all the rows.
    **/
  def updateText(): Unit
  
  /**
    * Blurs the current container.
    **/
  def visualizeBlur(): Unit
  
  /**
    * Focuses the current container.
    **/
  def visualizeFocus(): Unit
}
object VirtualRenderer {
  
  inline def apply(
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
    setAnnotations: js.Array[js.Any] => Unit,
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
  
  extension [Self <: VirtualRenderer](x: Self) {
    
    inline def setAddGutterDecoration(value: () => Unit): Self = StObject.set(x, "addGutterDecoration", js.Any.fromFunction0(value))
    
    inline def setAdjustWrapLimit(value: () => Unit): Self = StObject.set(x, "adjustWrapLimit", js.Any.fromFunction0(value))
    
    inline def setCharacterWidth(value: Double): Self = StObject.set(x, "characterWidth", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setGetAnimatedScroll(value: () => Boolean): Self = StObject.set(x, "getAnimatedScroll", js.Any.fromFunction0(value))
    
    inline def setGetContainerElement(value: () => HTMLElement): Self = StObject.set(x, "getContainerElement", js.Any.fromFunction0(value))
    
    inline def setGetFirstFullyVisibleRow(value: () => Double): Self = StObject.set(x, "getFirstFullyVisibleRow", js.Any.fromFunction0(value))
    
    inline def setGetFirstVisibleRow(value: () => Double): Self = StObject.set(x, "getFirstVisibleRow", js.Any.fromFunction0(value))
    
    inline def setGetHScrollBarAlwaysVisible(value: () => Boolean): Self = StObject.set(x, "getHScrollBarAlwaysVisible", js.Any.fromFunction0(value))
    
    inline def setGetLastFullyVisibleRow(value: () => Double): Self = StObject.set(x, "getLastFullyVisibleRow", js.Any.fromFunction0(value))
    
    inline def setGetLastVisibleRow(value: () => Double): Self = StObject.set(x, "getLastVisibleRow", js.Any.fromFunction0(value))
    
    inline def setGetMouseEventTarget(value: () => HTMLElement): Self = StObject.set(x, "getMouseEventTarget", js.Any.fromFunction0(value))
    
    inline def setGetPrintMarginColumn(value: () => Boolean): Self = StObject.set(x, "getPrintMarginColumn", js.Any.fromFunction0(value))
    
    inline def setGetScrollBottomRow(value: () => Double): Self = StObject.set(x, "getScrollBottomRow", js.Any.fromFunction0(value))
    
    inline def setGetScrollLeft(value: () => Double): Self = StObject.set(x, "getScrollLeft", js.Any.fromFunction0(value))
    
    inline def setGetScrollTop(value: () => Double): Self = StObject.set(x, "getScrollTop", js.Any.fromFunction0(value))
    
    inline def setGetScrollTopRow(value: () => Double): Self = StObject.set(x, "getScrollTopRow", js.Any.fromFunction0(value))
    
    inline def setGetShowGutter(value: () => Boolean): Self = StObject.set(x, "getShowGutter", js.Any.fromFunction0(value))
    
    inline def setGetShowInvisibles(value: () => Boolean): Self = StObject.set(x, "getShowInvisibles", js.Any.fromFunction0(value))
    
    inline def setGetShowPrintMargin(value: () => Boolean): Self = StObject.set(x, "getShowPrintMargin", js.Any.fromFunction0(value))
    
    inline def setGetTextAreaContainer(value: () => HTMLElement): Self = StObject.set(x, "getTextAreaContainer", js.Any.fromFunction0(value))
    
    inline def setGetTheme(value: () => String): Self = StObject.set(x, "getTheme", js.Any.fromFunction0(value))
    
    inline def setHideComposition(value: () => Unit): Self = StObject.set(x, "hideComposition", js.Any.fromFunction0(value))
    
    inline def setHideCursor(value: () => Unit): Self = StObject.set(x, "hideCursor", js.Any.fromFunction0(value))
    
    inline def setIsScrollableBy(value: (Double, Double) => Boolean): Self = StObject.set(x, "isScrollableBy", js.Any.fromFunction2(value))
    
    inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setOnResize(value: (Boolean, Double, Double, Double) => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction4(value))
    
    inline def setRemoveGutterDecoration(value: () => Unit): Self = StObject.set(x, "removeGutterDecoration", js.Any.fromFunction0(value))
    
    inline def setScreenToTextCoordinates(value: (Double, Double) => Unit): Self = StObject.set(x, "screenToTextCoordinates", js.Any.fromFunction2(value))
    
    inline def setScrollBy(value: (Double, Double) => Unit): Self = StObject.set(x, "scrollBy", js.Any.fromFunction2(value))
    
    inline def setScrollCursorIntoView(value: () => Unit): Self = StObject.set(x, "scrollCursorIntoView", js.Any.fromFunction0(value))
    
    inline def setScrollToLine(value: (Double, Boolean, Boolean, js.Function) => Unit): Self = StObject.set(x, "scrollToLine", js.Any.fromFunction4(value))
    
    inline def setScrollToRow(value: Double => Unit): Self = StObject.set(x, "scrollToRow", js.Any.fromFunction1(value))
    
    inline def setScrollToX(value: Double => Double): Self = StObject.set(x, "scrollToX", js.Any.fromFunction1(value))
    
    inline def setScrollToY(value: Double => Double): Self = StObject.set(x, "scrollToY", js.Any.fromFunction1(value))
    
    inline def setScroller(value: js.Any): Self = StObject.set(x, "scroller", value.asInstanceOf[js.Any])
    
    inline def setSetAnimatedScroll(value: Boolean => Unit): Self = StObject.set(x, "setAnimatedScroll", js.Any.fromFunction1(value))
    
    inline def setSetAnnotations(value: js.Array[js.Any] => Unit): Self = StObject.set(x, "setAnnotations", js.Any.fromFunction1(value))
    
    inline def setSetCompositionText(value: String => Unit): Self = StObject.set(x, "setCompositionText", js.Any.fromFunction1(value))
    
    inline def setSetHScrollBarAlwaysVisible(value: Boolean => Unit): Self = StObject.set(x, "setHScrollBarAlwaysVisible", js.Any.fromFunction1(value))
    
    inline def setSetPadding(value: Double => Unit): Self = StObject.set(x, "setPadding", js.Any.fromFunction1(value))
    
    inline def setSetPrintMarginColumn(value: Boolean => Unit): Self = StObject.set(x, "setPrintMarginColumn", js.Any.fromFunction1(value))
    
    inline def setSetScrollMargin(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "setScrollMargin", js.Any.fromFunction4(value))
    
    inline def setSetSession(value: IEditSession => Unit): Self = StObject.set(x, "setSession", js.Any.fromFunction1(value))
    
    inline def setSetShowGutter(value: Boolean => Unit): Self = StObject.set(x, "setShowGutter", js.Any.fromFunction1(value))
    
    inline def setSetShowInvisibles(value: Boolean => Unit): Self = StObject.set(x, "setShowInvisibles", js.Any.fromFunction1(value))
    
    inline def setSetShowPrintMargin(value: Boolean => Unit): Self = StObject.set(x, "setShowPrintMargin", js.Any.fromFunction1(value))
    
    inline def setSetStyle(value: String => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction1(value))
    
    inline def setSetTheme(value: String => Unit): Self = StObject.set(x, "setTheme", js.Any.fromFunction1(value))
    
    inline def setShowComposition(value: Double => Unit): Self = StObject.set(x, "showComposition", js.Any.fromFunction1(value))
    
    inline def setShowCursor(value: () => Unit): Self = StObject.set(x, "showCursor", js.Any.fromFunction0(value))
    
    inline def setTextToScreenCoordinates(value: (Double, Double) => js.Any): Self = StObject.set(x, "textToScreenCoordinates", js.Any.fromFunction2(value))
    
    inline def setUnsetStyle(value: String => Unit): Self = StObject.set(x, "unsetStyle", js.Any.fromFunction1(value))
    
    inline def setUpdateBackMarkers(value: () => Unit): Self = StObject.set(x, "updateBackMarkers", js.Any.fromFunction0(value))
    
    inline def setUpdateBreakpoints(value: () => Unit): Self = StObject.set(x, "updateBreakpoints", js.Any.fromFunction0(value))
    
    inline def setUpdateCursor(value: () => Unit): Self = StObject.set(x, "updateCursor", js.Any.fromFunction0(value))
    
    inline def setUpdateFontSize(value: () => Unit): Self = StObject.set(x, "updateFontSize", js.Any.fromFunction0(value))
    
    inline def setUpdateFrontMarkers(value: () => Unit): Self = StObject.set(x, "updateFrontMarkers", js.Any.fromFunction0(value))
    
    inline def setUpdateFull(value: Boolean => Unit): Self = StObject.set(x, "updateFull", js.Any.fromFunction1(value))
    
    inline def setUpdateLines(value: (Double, Double) => Unit): Self = StObject.set(x, "updateLines", js.Any.fromFunction2(value))
    
    inline def setUpdateText(value: () => Unit): Self = StObject.set(x, "updateText", js.Any.fromFunction0(value))
    
    inline def setVisualizeBlur(value: () => Unit): Self = StObject.set(x, "visualizeBlur", js.Any.fromFunction0(value))
    
    inline def setVisualizeFocus(value: () => Unit): Self = StObject.set(x, "visualizeFocus", js.Any.fromFunction0(value))
  }
}
