package typings
package aceLib.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualRenderer extends OptionProvider {
  var characterWidth: scala.Double
  var lineHeight: scala.Double
  var scroller: js.Any
  /**
    * Deprecated; (moved to [[EditSession]])
    **/
  def addGutterDecoration(): scala.Unit
  /**
    * Adjusts the wrap limit, which is the number of characters that can fit within the width of the edit area on screen.
    **/
  def adjustWrapLimit(): scala.Unit
  /**
    * Destroys the text and cursor layers for this renderer.
    **/
  def destroy(): scala.Unit
  /**
    * Returns whether an animated scroll happens or not.
    **/
  def getAnimatedScroll(): scala.Boolean
  /**
    * Returns the root element containing this renderer.
    **/
  def getContainerElement(): stdLib.HTMLElement
  /**
    * Returns the index of the first fully visible row. "Fully" here means that the characters in the row are not truncated; that the top and the bottom of the row are on the screen.
    **/
  def getFirstFullyVisibleRow(): scala.Double
  /**
    * [Returns the index of the first visible row.]{: #VirtualRenderer.getFirstVisibleRow}
    **/
  def getFirstVisibleRow(): scala.Double
  /**
    * Returns whether the horizontal scrollbar is set to be always visible.
    **/
  def getHScrollBarAlwaysVisible(): scala.Boolean
  /**
    * Returns the index of the last fully visible row. "Fully" here means that the characters in the row are not truncated; that the top and the bottom of the row are on the screen.
    **/
  def getLastFullyVisibleRow(): scala.Double
  /**
    * [Returns the index of the last visible row.]{: #VirtualRenderer.getLastVisibleRow}
    **/
  def getLastVisibleRow(): scala.Double
  /**
    * Returns the element that the mouse events are attached to
    **/
  def getMouseEventTarget(): stdLib.HTMLElement
  /**
    * Returns whether the print margin column is being shown or not.
    **/
  def getPrintMarginColumn(): scala.Boolean
  /**
    * Returns the last visible row, regardless of whether it's fully visible or not.
    **/
  def getScrollBottomRow(): scala.Double
  /**
    * {:EditSession.getScrollLeft}
    **/
  def getScrollLeft(): scala.Double
  /**
    * {:EditSession.getScrollTop}
    **/
  def getScrollTop(): scala.Double
  /**
    * Returns the first visible row, regardless of whether it's fully visible or not.
    **/
  def getScrollTopRow(): scala.Double
  /**
    * Returns `true` if the gutter is being shown.
    **/
  def getShowGutter(): scala.Boolean
  /**
    * Returns whether invisible characters are being shown or not.
    **/
  def getShowInvisibles(): scala.Boolean
  /**
    * Returns whether the print margin is being shown or not.
    **/
  def getShowPrintMargin(): scala.Boolean
  /**
    * Returns the element to which the hidden text area is added.
    **/
  def getTextAreaContainer(): stdLib.HTMLElement
  /**
    * [Returns the path of the current theme.]{: #VirtualRenderer.getTheme}
    **/
  def getTheme(): java.lang.String
  /**
    * Hides the current composition.
    **/
  def hideComposition(): scala.Unit
  /**
    * Hides the cursor icon.
    **/
  def hideCursor(): scala.Unit
  /**
    * Returns `true` if you can still scroll by either parameter; in other words, you haven't reached the end of the file or line.
    * @param deltaX The x value to scroll by
    * @param deltaY The y value to scroll by
    **/
  def isScrollableBy(deltaX: scala.Double, deltaY: scala.Double): scala.Boolean
  /**
    * [Triggers a resize of the editor.]{: #VirtualRenderer.onResize}
    * @param force If `true`, recomputes the size, even if the height and width haven't changed
    * @param gutterWidth The width of the gutter in pixels
    * @param width The width of the editor in pixels
    * @param height The hiehgt of the editor, in pixels
    **/
  def onResize(force: scala.Boolean, gutterWidth: scala.Double, width: scala.Double, height: scala.Double): scala.Unit
  /**
    * Deprecated; (moved to [[EditSession]])
    **/
  def removeGutterDecoration(): scala.Unit
  def screenToTextCoordinates(left: scala.Double, top: scala.Double): scala.Unit
  /**
    * Scrolls the editor across both x- and y-axes.
    * @param deltaX The x value to scroll by
    * @param deltaY The y value to scroll by
    **/
  def scrollBy(deltaX: scala.Double, deltaY: scala.Double): scala.Unit
  /**
    * Scrolls the cursor into the first visibile area of the editor
    **/
  def scrollCursorIntoView(): scala.Unit
  /**
    * Gracefully scrolls the editor to the row indicated.
    * @param line A line number
    * @param center If `true`, centers the editor the to indicated line
    * @param animate If `true` animates scrolling
    * @param callback Function to be called after the animation has finished
    **/
  def scrollToLine(line: scala.Double, center: scala.Boolean, animate: scala.Boolean, callback: js.Function): scala.Unit
  /**
    * Gracefully scrolls from the top of the editor to the row indicated.
    * @param row A row id
    **/
  def scrollToRow(row: scala.Double): scala.Unit
  /**
    * Scrolls the editor across the x-axis to the pixel indicated.
    * @param scrollLeft The position to scroll to
    **/
  def scrollToX(scrollLeft: scala.Double): scala.Double
  /**
    * Scrolls the editor to the y pixel indicated.
    * @param scrollTop The position to scroll to
    **/
  def scrollToY(scrollTop: scala.Double): scala.Double
  /**
    * Identifies whether you want to have an animated scroll or not.
    * @param shouldAnimate Set to `true` to show animated scrolls
    **/
  def setAnimatedScroll(shouldAnimate: scala.Boolean): scala.Unit
  /**
    * Sets annotations for the gutter.
    * @param annotations An array containing annotations
    **/
  def setAnnotations(annotations: js.Array[_]): scala.Unit
  /**
    * Sets the inner text of the current composition to `text`.
    * @param text A string of text to use
    **/
  def setCompositionText(text: java.lang.String): scala.Unit
  /**
    * Identifies whether you want to show the horizontal scrollbar or not.
    * @param alwaysVisible Set to `true` to make the horizontal scroll bar visible
    **/
  def setHScrollBarAlwaysVisible(alwaysVisible: scala.Boolean): scala.Unit
  /**
    * Sets the padding for all the layers.
    * @param padding A new padding value (in pixels)
    **/
  def setPadding(padding: scala.Double): scala.Unit
  /**
    * Identifies whether you want to show the print margin column or not.
    * @param showPrintMargin Set to `true` to show the print margin column
    **/
  def setPrintMarginColumn(showPrintMargin: scala.Boolean): scala.Unit
  def setScrollMargin(top: scala.Double, bottom: scala.Double, left: scala.Double, right: scala.Double): scala.Unit
  /**
    * Associates the renderer with an [[EditSession `EditSession`]].
    **/
  def setSession(session: IEditSession): scala.Unit
  /**
    * Identifies whether you want to show the gutter or not.
    * @param show Set to `true` to show the gutter
    **/
  def setShowGutter(show: scala.Boolean): scala.Unit
  /**
    * Identifies whether you want to show invisible characters or not.
    * @param showInvisibles Set to `true` to show invisibles
    **/
  def setShowInvisibles(showInvisibles: scala.Boolean): scala.Unit
  /**
    * Identifies whether you want to show the print margin or not.
    * @param showPrintMargin Set to `true` to show the print margin
    **/
  def setShowPrintMargin(showPrintMargin: scala.Boolean): scala.Unit
  /**
    * [Adds a new class, `style`, to the editor.]{: #VirtualRenderer.setStyle}
    * @param style A class name
    **/
  def setStyle(style: java.lang.String): scala.Unit
  /**
    * [Sets a new theme for the editor. `theme` should exist, and be a directory path, like `ace/theme/textmate`.]{: #VirtualRenderer.setTheme}
    * @param theme The path to a theme
    **/
  def setTheme(theme: java.lang.String): scala.Unit
  /**
    * undefined
    * @param position
    **/
  def showComposition(position: scala.Double): scala.Unit
  /**
    * Shows the cursor icon.
    **/
  def showCursor(): scala.Unit
  /**
    * Returns an object containing the `pageX` and `pageY` coordinates of the document position.
    * @param row The document row position
    * @param column The document column position
    **/
  def textToScreenCoordinates(row: scala.Double, column: scala.Double): js.Any
  /**
    * [Removes the class `style` from the editor.]{: #VirtualRenderer.unsetStyle}
    * @param style A class name
    **/
  def unsetStyle(style: java.lang.String): scala.Unit
  /**
    * Schedules an update to all the back markers in the document.
    **/
  def updateBackMarkers(): scala.Unit
  /**
    * Redraw breakpoints.
    **/
  def updateBreakpoints(): scala.Unit
  /**
    * Updates the cursor icon.
    **/
  def updateCursor(): scala.Unit
  /**
    * Updates the font size.
    **/
  def updateFontSize(): scala.Unit
  /**
    * Schedules an update to all the front markers in the document.
    **/
  def updateFrontMarkers(): scala.Unit
  /**
    * Triggers a full update of all the layers, for all the rows.
    * @param force If `true`, forces the changes through
    **/
  def updateFull(force: scala.Boolean): scala.Unit
  /**
    * Triggers a partial update of the text, from the range given by the two parameters.
    * @param firstRow The first row to update
    * @param lastRow The last row to update
    **/
  def updateLines(firstRow: scala.Double, lastRow: scala.Double): scala.Unit
  /**
    * Triggers a full update of the text, for all the rows.
    **/
  def updateText(): scala.Unit
  /**
    * Blurs the current container.
    **/
  def visualizeBlur(): scala.Unit
  /**
    * Focuses the current container.
    **/
  def visualizeFocus(): scala.Unit
}

object VirtualRenderer {
  @scala.inline
  def apply(
    addGutterDecoration: js.Function0[scala.Unit],
    adjustWrapLimit: js.Function0[scala.Unit],
    characterWidth: scala.Double,
    destroy: js.Function0[scala.Unit],
    getAnimatedScroll: js.Function0[scala.Boolean],
    getContainerElement: js.Function0[stdLib.HTMLElement],
    getFirstFullyVisibleRow: js.Function0[scala.Double],
    getFirstVisibleRow: js.Function0[scala.Double],
    getHScrollBarAlwaysVisible: js.Function0[scala.Boolean],
    getLastFullyVisibleRow: js.Function0[scala.Double],
    getLastVisibleRow: js.Function0[scala.Double],
    getMouseEventTarget: js.Function0[stdLib.HTMLElement],
    getOption: js.Function1[java.lang.String, js.Any],
    getOptions: js.Function0[js.Any],
    getPrintMarginColumn: js.Function0[scala.Boolean],
    getScrollBottomRow: js.Function0[scala.Double],
    getScrollLeft: js.Function0[scala.Double],
    getScrollTop: js.Function0[scala.Double],
    getScrollTopRow: js.Function0[scala.Double],
    getShowGutter: js.Function0[scala.Boolean],
    getShowInvisibles: js.Function0[scala.Boolean],
    getShowPrintMargin: js.Function0[scala.Boolean],
    getTextAreaContainer: js.Function0[stdLib.HTMLElement],
    getTheme: js.Function0[java.lang.String],
    hideComposition: js.Function0[scala.Unit],
    hideCursor: js.Function0[scala.Unit],
    isScrollableBy: js.Function2[scala.Double, scala.Double, scala.Boolean],
    lineHeight: scala.Double,
    onResize: js.Function4[scala.Boolean, scala.Double, scala.Double, scala.Double, scala.Unit],
    removeGutterDecoration: js.Function0[scala.Unit],
    screenToTextCoordinates: js.Function2[scala.Double, scala.Double, scala.Unit],
    scrollBy: js.Function2[scala.Double, scala.Double, scala.Unit],
    scrollCursorIntoView: js.Function0[scala.Unit],
    scrollToLine: js.Function4[scala.Double, scala.Boolean, scala.Boolean, js.Function, scala.Unit],
    scrollToRow: js.Function1[scala.Double, scala.Unit],
    scrollToX: js.Function1[scala.Double, scala.Double],
    scrollToY: js.Function1[scala.Double, scala.Double],
    scroller: js.Any,
    setAnimatedScroll: js.Function1[scala.Boolean, scala.Unit],
    setAnnotations: js.Function1[js.Array[_], scala.Unit],
    setCompositionText: js.Function1[java.lang.String, scala.Unit],
    setHScrollBarAlwaysVisible: js.Function1[scala.Boolean, scala.Unit],
    setOption: js.Function2[java.lang.String, js.Any, scala.Unit],
    setOptions: js.Function1[js.Any, scala.Unit],
    setPadding: js.Function1[scala.Double, scala.Unit],
    setPrintMarginColumn: js.Function1[scala.Boolean, scala.Unit],
    setScrollMargin: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    setSession: js.Function1[IEditSession, scala.Unit],
    setShowGutter: js.Function1[scala.Boolean, scala.Unit],
    setShowInvisibles: js.Function1[scala.Boolean, scala.Unit],
    setShowPrintMargin: js.Function1[scala.Boolean, scala.Unit],
    setStyle: js.Function1[java.lang.String, scala.Unit],
    setTheme: js.Function1[java.lang.String, scala.Unit],
    showComposition: js.Function1[scala.Double, scala.Unit],
    showCursor: js.Function0[scala.Unit],
    textToScreenCoordinates: js.Function2[scala.Double, scala.Double, js.Any],
    unsetStyle: js.Function1[java.lang.String, scala.Unit],
    updateBackMarkers: js.Function0[scala.Unit],
    updateBreakpoints: js.Function0[scala.Unit],
    updateCursor: js.Function0[scala.Unit],
    updateFontSize: js.Function0[scala.Unit],
    updateFrontMarkers: js.Function0[scala.Unit],
    updateFull: js.Function1[scala.Boolean, scala.Unit],
    updateLines: js.Function2[scala.Double, scala.Double, scala.Unit],
    updateText: js.Function0[scala.Unit],
    visualizeBlur: js.Function0[scala.Unit],
    visualizeFocus: js.Function0[scala.Unit]
  ): VirtualRenderer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addGutterDecoration")(addGutterDecoration)
    __obj.updateDynamic("adjustWrapLimit")(adjustWrapLimit)
    __obj.updateDynamic("characterWidth")(characterWidth)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("getAnimatedScroll")(getAnimatedScroll)
    __obj.updateDynamic("getContainerElement")(getContainerElement)
    __obj.updateDynamic("getFirstFullyVisibleRow")(getFirstFullyVisibleRow)
    __obj.updateDynamic("getFirstVisibleRow")(getFirstVisibleRow)
    __obj.updateDynamic("getHScrollBarAlwaysVisible")(getHScrollBarAlwaysVisible)
    __obj.updateDynamic("getLastFullyVisibleRow")(getLastFullyVisibleRow)
    __obj.updateDynamic("getLastVisibleRow")(getLastVisibleRow)
    __obj.updateDynamic("getMouseEventTarget")(getMouseEventTarget)
    __obj.updateDynamic("getOption")(getOption)
    __obj.updateDynamic("getOptions")(getOptions)
    __obj.updateDynamic("getPrintMarginColumn")(getPrintMarginColumn)
    __obj.updateDynamic("getScrollBottomRow")(getScrollBottomRow)
    __obj.updateDynamic("getScrollLeft")(getScrollLeft)
    __obj.updateDynamic("getScrollTop")(getScrollTop)
    __obj.updateDynamic("getScrollTopRow")(getScrollTopRow)
    __obj.updateDynamic("getShowGutter")(getShowGutter)
    __obj.updateDynamic("getShowInvisibles")(getShowInvisibles)
    __obj.updateDynamic("getShowPrintMargin")(getShowPrintMargin)
    __obj.updateDynamic("getTextAreaContainer")(getTextAreaContainer)
    __obj.updateDynamic("getTheme")(getTheme)
    __obj.updateDynamic("hideComposition")(hideComposition)
    __obj.updateDynamic("hideCursor")(hideCursor)
    __obj.updateDynamic("isScrollableBy")(isScrollableBy)
    __obj.updateDynamic("lineHeight")(lineHeight)
    __obj.updateDynamic("onResize")(onResize)
    __obj.updateDynamic("removeGutterDecoration")(removeGutterDecoration)
    __obj.updateDynamic("screenToTextCoordinates")(screenToTextCoordinates)
    __obj.updateDynamic("scrollBy")(scrollBy)
    __obj.updateDynamic("scrollCursorIntoView")(scrollCursorIntoView)
    __obj.updateDynamic("scrollToLine")(scrollToLine)
    __obj.updateDynamic("scrollToRow")(scrollToRow)
    __obj.updateDynamic("scrollToX")(scrollToX)
    __obj.updateDynamic("scrollToY")(scrollToY)
    __obj.updateDynamic("scroller")(scroller)
    __obj.updateDynamic("setAnimatedScroll")(setAnimatedScroll)
    __obj.updateDynamic("setAnnotations")(setAnnotations)
    __obj.updateDynamic("setCompositionText")(setCompositionText)
    __obj.updateDynamic("setHScrollBarAlwaysVisible")(setHScrollBarAlwaysVisible)
    __obj.updateDynamic("setOption")(setOption)
    __obj.updateDynamic("setOptions")(setOptions)
    __obj.updateDynamic("setPadding")(setPadding)
    __obj.updateDynamic("setPrintMarginColumn")(setPrintMarginColumn)
    __obj.updateDynamic("setScrollMargin")(setScrollMargin)
    __obj.updateDynamic("setSession")(setSession)
    __obj.updateDynamic("setShowGutter")(setShowGutter)
    __obj.updateDynamic("setShowInvisibles")(setShowInvisibles)
    __obj.updateDynamic("setShowPrintMargin")(setShowPrintMargin)
    __obj.updateDynamic("setStyle")(setStyle)
    __obj.updateDynamic("setTheme")(setTheme)
    __obj.updateDynamic("showComposition")(showComposition)
    __obj.updateDynamic("showCursor")(showCursor)
    __obj.updateDynamic("textToScreenCoordinates")(textToScreenCoordinates)
    __obj.updateDynamic("unsetStyle")(unsetStyle)
    __obj.updateDynamic("updateBackMarkers")(updateBackMarkers)
    __obj.updateDynamic("updateBreakpoints")(updateBreakpoints)
    __obj.updateDynamic("updateCursor")(updateCursor)
    __obj.updateDynamic("updateFontSize")(updateFontSize)
    __obj.updateDynamic("updateFrontMarkers")(updateFrontMarkers)
    __obj.updateDynamic("updateFull")(updateFull)
    __obj.updateDynamic("updateLines")(updateLines)
    __obj.updateDynamic("updateText")(updateText)
    __obj.updateDynamic("visualizeBlur")(visualizeBlur)
    __obj.updateDynamic("visualizeFocus")(visualizeFocus)
    __obj.asInstanceOf[VirtualRenderer]
  }
}

