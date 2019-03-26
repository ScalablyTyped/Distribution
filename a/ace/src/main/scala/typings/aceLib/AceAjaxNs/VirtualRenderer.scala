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

@JSGlobal("AceAjax.VirtualRenderer")
@js.native
class VirtualRendererCls protected () extends VirtualRenderer {
  /**
    * Constructs a new `VirtualRenderer` within the `container` specified, applying the given `theme`.
    * @param container The root element of the editor
    * @param theme The starting theme
    **/
  def this(container: stdLib.HTMLElement) = this()
  def this(container: stdLib.HTMLElement, theme: java.lang.String) = this()
  /* CompleteClass */
  override var characterWidth: scala.Double = js.native
  /* CompleteClass */
  override var lineHeight: scala.Double = js.native
  /* CompleteClass */
  override var scroller: js.Any = js.native
  /**
    * Deprecated; (moved to [[EditSession]])
    **/
  /* CompleteClass */
  override def addGutterDecoration(): scala.Unit = js.native
  /**
    * Adjusts the wrap limit, which is the number of characters that can fit within the width of the edit area on screen.
    **/
  /* CompleteClass */
  override def adjustWrapLimit(): scala.Unit = js.native
  /**
    * Destroys the text and cursor layers for this renderer.
    **/
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /**
    * Returns whether an animated scroll happens or not.
    **/
  /* CompleteClass */
  override def getAnimatedScroll(): scala.Boolean = js.native
  /**
    * Returns the root element containing this renderer.
    **/
  /* CompleteClass */
  override def getContainerElement(): stdLib.HTMLElement = js.native
  /**
    * Returns the index of the first fully visible row. "Fully" here means that the characters in the row are not truncated; that the top and the bottom of the row are on the screen.
    **/
  /* CompleteClass */
  override def getFirstFullyVisibleRow(): scala.Double = js.native
  /**
    * [Returns the index of the first visible row.]{: #VirtualRenderer.getFirstVisibleRow}
    **/
  /* CompleteClass */
  override def getFirstVisibleRow(): scala.Double = js.native
  /**
    * Returns whether the horizontal scrollbar is set to be always visible.
    **/
  /* CompleteClass */
  override def getHScrollBarAlwaysVisible(): scala.Boolean = js.native
  /**
    * Returns the index of the last fully visible row. "Fully" here means that the characters in the row are not truncated; that the top and the bottom of the row are on the screen.
    **/
  /* CompleteClass */
  override def getLastFullyVisibleRow(): scala.Double = js.native
  /**
    * [Returns the index of the last visible row.]{: #VirtualRenderer.getLastVisibleRow}
    **/
  /* CompleteClass */
  override def getLastVisibleRow(): scala.Double = js.native
  /**
    * Returns the element that the mouse events are attached to
    **/
  /* CompleteClass */
  override def getMouseEventTarget(): stdLib.HTMLElement = js.native
  /**
    * Get a Configuration Option
    **/
  /* CompleteClass */
  override def getOption(name: java.lang.String): js.Any = js.native
  /**
    * Get Configuration Options
    **/
  /* CompleteClass */
  override def getOptions(): js.Any = js.native
  /**
    * Returns whether the print margin column is being shown or not.
    **/
  /* CompleteClass */
  override def getPrintMarginColumn(): scala.Boolean = js.native
  /**
    * Returns the last visible row, regardless of whether it's fully visible or not.
    **/
  /* CompleteClass */
  override def getScrollBottomRow(): scala.Double = js.native
  /**
    * {:EditSession.getScrollLeft}
    **/
  /* CompleteClass */
  override def getScrollLeft(): scala.Double = js.native
  /**
    * {:EditSession.getScrollTop}
    **/
  /* CompleteClass */
  override def getScrollTop(): scala.Double = js.native
  /**
    * Returns the first visible row, regardless of whether it's fully visible or not.
    **/
  /* CompleteClass */
  override def getScrollTopRow(): scala.Double = js.native
  /**
    * Returns `true` if the gutter is being shown.
    **/
  /* CompleteClass */
  override def getShowGutter(): scala.Boolean = js.native
  /**
    * Returns whether invisible characters are being shown or not.
    **/
  /* CompleteClass */
  override def getShowInvisibles(): scala.Boolean = js.native
  /**
    * Returns whether the print margin is being shown or not.
    **/
  /* CompleteClass */
  override def getShowPrintMargin(): scala.Boolean = js.native
  /**
    * Returns the element to which the hidden text area is added.
    **/
  /* CompleteClass */
  override def getTextAreaContainer(): stdLib.HTMLElement = js.native
  /**
    * [Returns the path of the current theme.]{: #VirtualRenderer.getTheme}
    **/
  /* CompleteClass */
  override def getTheme(): java.lang.String = js.native
  /**
    * Hides the current composition.
    **/
  /* CompleteClass */
  override def hideComposition(): scala.Unit = js.native
  /**
    * Hides the cursor icon.
    **/
  /* CompleteClass */
  override def hideCursor(): scala.Unit = js.native
  /**
    * Returns `true` if you can still scroll by either parameter; in other words, you haven't reached the end of the file or line.
    * @param deltaX The x value to scroll by
    * @param deltaY The y value to scroll by
    **/
  /* CompleteClass */
  override def isScrollableBy(deltaX: scala.Double, deltaY: scala.Double): scala.Boolean = js.native
  /**
    * [Triggers a resize of the editor.]{: #VirtualRenderer.onResize}
    * @param force If `true`, recomputes the size, even if the height and width haven't changed
    * @param gutterWidth The width of the gutter in pixels
    * @param width The width of the editor in pixels
    * @param height The hiehgt of the editor, in pixels
    **/
  /* CompleteClass */
  override def onResize(force: scala.Boolean, gutterWidth: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
    * Deprecated; (moved to [[EditSession]])
    **/
  /* CompleteClass */
  override def removeGutterDecoration(): scala.Unit = js.native
  /* CompleteClass */
  override def screenToTextCoordinates(left: scala.Double, top: scala.Double): scala.Unit = js.native
  /**
    * Scrolls the editor across both x- and y-axes.
    * @param deltaX The x value to scroll by
    * @param deltaY The y value to scroll by
    **/
  /* CompleteClass */
  override def scrollBy(deltaX: scala.Double, deltaY: scala.Double): scala.Unit = js.native
  /**
    * Scrolls the cursor into the first visibile area of the editor
    **/
  /* CompleteClass */
  override def scrollCursorIntoView(): scala.Unit = js.native
  /**
    * Gracefully scrolls the editor to the row indicated.
    * @param line A line number
    * @param center If `true`, centers the editor the to indicated line
    * @param animate If `true` animates scrolling
    * @param callback Function to be called after the animation has finished
    **/
  /* CompleteClass */
  override def scrollToLine(line: scala.Double, center: scala.Boolean, animate: scala.Boolean, callback: js.Function): scala.Unit = js.native
  /**
    * Gracefully scrolls from the top of the editor to the row indicated.
    * @param row A row id
    **/
  /* CompleteClass */
  override def scrollToRow(row: scala.Double): scala.Unit = js.native
  /**
    * Scrolls the editor across the x-axis to the pixel indicated.
    * @param scrollLeft The position to scroll to
    **/
  /* CompleteClass */
  override def scrollToX(scrollLeft: scala.Double): scala.Double = js.native
  /**
    * Scrolls the editor to the y pixel indicated.
    * @param scrollTop The position to scroll to
    **/
  /* CompleteClass */
  override def scrollToY(scrollTop: scala.Double): scala.Double = js.native
  /**
    * Identifies whether you want to have an animated scroll or not.
    * @param shouldAnimate Set to `true` to show animated scrolls
    **/
  /* CompleteClass */
  override def setAnimatedScroll(shouldAnimate: scala.Boolean): scala.Unit = js.native
  /**
    * Sets annotations for the gutter.
    * @param annotations An array containing annotations
    **/
  /* CompleteClass */
  override def setAnnotations(annotations: js.Array[_]): scala.Unit = js.native
  /**
    * Sets the inner text of the current composition to `text`.
    * @param text A string of text to use
    **/
  /* CompleteClass */
  override def setCompositionText(text: java.lang.String): scala.Unit = js.native
  /**
    * Identifies whether you want to show the horizontal scrollbar or not.
    * @param alwaysVisible Set to `true` to make the horizontal scroll bar visible
    **/
  /* CompleteClass */
  override def setHScrollBarAlwaysVisible(alwaysVisible: scala.Boolean): scala.Unit = js.native
  /**
    * Sets a Configuration Option
    **/
  /* CompleteClass */
  override def setOption(optionName: java.lang.String, optionValue: js.Any): scala.Unit = js.native
  /**
    * Sets Configuration Options
    **/
  /* CompleteClass */
  override def setOptions(keyValueTuples: js.Any): scala.Unit = js.native
  /**
    * Sets the padding for all the layers.
    * @param padding A new padding value (in pixels)
    **/
  /* CompleteClass */
  override def setPadding(padding: scala.Double): scala.Unit = js.native
  /**
    * Identifies whether you want to show the print margin column or not.
    * @param showPrintMargin Set to `true` to show the print margin column
    **/
  /* CompleteClass */
  override def setPrintMarginColumn(showPrintMargin: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def setScrollMargin(top: scala.Double, bottom: scala.Double, left: scala.Double, right: scala.Double): scala.Unit = js.native
  /**
    * Associates the renderer with an [[EditSession `EditSession`]].
    **/
  /* CompleteClass */
  override def setSession(session: IEditSession): scala.Unit = js.native
  /**
    * Identifies whether you want to show the gutter or not.
    * @param show Set to `true` to show the gutter
    **/
  /* CompleteClass */
  override def setShowGutter(show: scala.Boolean): scala.Unit = js.native
  /**
    * Identifies whether you want to show invisible characters or not.
    * @param showInvisibles Set to `true` to show invisibles
    **/
  /* CompleteClass */
  override def setShowInvisibles(showInvisibles: scala.Boolean): scala.Unit = js.native
  /**
    * Identifies whether you want to show the print margin or not.
    * @param showPrintMargin Set to `true` to show the print margin
    **/
  /* CompleteClass */
  override def setShowPrintMargin(showPrintMargin: scala.Boolean): scala.Unit = js.native
  /**
    * [Adds a new class, `style`, to the editor.]{: #VirtualRenderer.setStyle}
    * @param style A class name
    **/
  /* CompleteClass */
  override def setStyle(style: java.lang.String): scala.Unit = js.native
  /**
    * [Sets a new theme for the editor. `theme` should exist, and be a directory path, like `ace/theme/textmate`.]{: #VirtualRenderer.setTheme}
    * @param theme The path to a theme
    **/
  /* CompleteClass */
  override def setTheme(theme: java.lang.String): scala.Unit = js.native
  /**
    * undefined
    * @param position
    **/
  /* CompleteClass */
  override def showComposition(position: scala.Double): scala.Unit = js.native
  /**
    * Shows the cursor icon.
    **/
  /* CompleteClass */
  override def showCursor(): scala.Unit = js.native
  /**
    * Returns an object containing the `pageX` and `pageY` coordinates of the document position.
    * @param row The document row position
    * @param column The document column position
    **/
  /* CompleteClass */
  override def textToScreenCoordinates(row: scala.Double, column: scala.Double): js.Any = js.native
  /**
    * [Removes the class `style` from the editor.]{: #VirtualRenderer.unsetStyle}
    * @param style A class name
    **/
  /* CompleteClass */
  override def unsetStyle(style: java.lang.String): scala.Unit = js.native
  /**
    * Schedules an update to all the back markers in the document.
    **/
  /* CompleteClass */
  override def updateBackMarkers(): scala.Unit = js.native
  /**
    * Redraw breakpoints.
    **/
  /* CompleteClass */
  override def updateBreakpoints(): scala.Unit = js.native
  /**
    * Updates the cursor icon.
    **/
  /* CompleteClass */
  override def updateCursor(): scala.Unit = js.native
  /**
    * Updates the font size.
    **/
  /* CompleteClass */
  override def updateFontSize(): scala.Unit = js.native
  /**
    * Schedules an update to all the front markers in the document.
    **/
  /* CompleteClass */
  override def updateFrontMarkers(): scala.Unit = js.native
  /**
    * Triggers a full update of all the layers, for all the rows.
    * @param force If `true`, forces the changes through
    **/
  /* CompleteClass */
  override def updateFull(force: scala.Boolean): scala.Unit = js.native
  /**
    * Triggers a partial update of the text, from the range given by the two parameters.
    * @param firstRow The first row to update
    * @param lastRow The last row to update
    **/
  /* CompleteClass */
  override def updateLines(firstRow: scala.Double, lastRow: scala.Double): scala.Unit = js.native
  /**
    * Triggers a full update of the text, for all the rows.
    **/
  /* CompleteClass */
  override def updateText(): scala.Unit = js.native
  /**
    * Blurs the current container.
    **/
  /* CompleteClass */
  override def visualizeBlur(): scala.Unit = js.native
  /**
    * Focuses the current container.
    **/
  /* CompleteClass */
  override def visualizeFocus(): scala.Unit = js.native
}

object VirtualRenderer {
  @scala.inline
  def apply(
    addGutterDecoration: () => scala.Unit,
    adjustWrapLimit: () => scala.Unit,
    characterWidth: scala.Double,
    destroy: () => scala.Unit,
    getAnimatedScroll: () => scala.Boolean,
    getContainerElement: () => stdLib.HTMLElement,
    getFirstFullyVisibleRow: () => scala.Double,
    getFirstVisibleRow: () => scala.Double,
    getHScrollBarAlwaysVisible: () => scala.Boolean,
    getLastFullyVisibleRow: () => scala.Double,
    getLastVisibleRow: () => scala.Double,
    getMouseEventTarget: () => stdLib.HTMLElement,
    getOption: java.lang.String => js.Any,
    getOptions: () => js.Any,
    getPrintMarginColumn: () => scala.Boolean,
    getScrollBottomRow: () => scala.Double,
    getScrollLeft: () => scala.Double,
    getScrollTop: () => scala.Double,
    getScrollTopRow: () => scala.Double,
    getShowGutter: () => scala.Boolean,
    getShowInvisibles: () => scala.Boolean,
    getShowPrintMargin: () => scala.Boolean,
    getTextAreaContainer: () => stdLib.HTMLElement,
    getTheme: () => java.lang.String,
    hideComposition: () => scala.Unit,
    hideCursor: () => scala.Unit,
    isScrollableBy: (scala.Double, scala.Double) => scala.Boolean,
    lineHeight: scala.Double,
    onResize: (scala.Boolean, scala.Double, scala.Double, scala.Double) => scala.Unit,
    removeGutterDecoration: () => scala.Unit,
    screenToTextCoordinates: (scala.Double, scala.Double) => scala.Unit,
    scrollBy: (scala.Double, scala.Double) => scala.Unit,
    scrollCursorIntoView: () => scala.Unit,
    scrollToLine: (scala.Double, scala.Boolean, scala.Boolean, js.Function) => scala.Unit,
    scrollToRow: scala.Double => scala.Unit,
    scrollToX: scala.Double => scala.Double,
    scrollToY: scala.Double => scala.Double,
    scroller: js.Any,
    setAnimatedScroll: scala.Boolean => scala.Unit,
    setAnnotations: js.Array[_] => scala.Unit,
    setCompositionText: java.lang.String => scala.Unit,
    setHScrollBarAlwaysVisible: scala.Boolean => scala.Unit,
    setOption: (java.lang.String, js.Any) => scala.Unit,
    setOptions: js.Any => scala.Unit,
    setPadding: scala.Double => scala.Unit,
    setPrintMarginColumn: scala.Boolean => scala.Unit,
    setScrollMargin: (scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    setSession: IEditSession => scala.Unit,
    setShowGutter: scala.Boolean => scala.Unit,
    setShowInvisibles: scala.Boolean => scala.Unit,
    setShowPrintMargin: scala.Boolean => scala.Unit,
    setStyle: java.lang.String => scala.Unit,
    setTheme: java.lang.String => scala.Unit,
    showComposition: scala.Double => scala.Unit,
    showCursor: () => scala.Unit,
    textToScreenCoordinates: (scala.Double, scala.Double) => js.Any,
    unsetStyle: java.lang.String => scala.Unit,
    updateBackMarkers: () => scala.Unit,
    updateBreakpoints: () => scala.Unit,
    updateCursor: () => scala.Unit,
    updateFontSize: () => scala.Unit,
    updateFrontMarkers: () => scala.Unit,
    updateFull: scala.Boolean => scala.Unit,
    updateLines: (scala.Double, scala.Double) => scala.Unit,
    updateText: () => scala.Unit,
    visualizeBlur: () => scala.Unit,
    visualizeFocus: () => scala.Unit
  ): VirtualRenderer = {
    val __obj = js.Dynamic.literal(addGutterDecoration = js.Any.fromFunction0(addGutterDecoration), adjustWrapLimit = js.Any.fromFunction0(adjustWrapLimit), characterWidth = characterWidth, destroy = js.Any.fromFunction0(destroy), getAnimatedScroll = js.Any.fromFunction0(getAnimatedScroll), getContainerElement = js.Any.fromFunction0(getContainerElement), getFirstFullyVisibleRow = js.Any.fromFunction0(getFirstFullyVisibleRow), getFirstVisibleRow = js.Any.fromFunction0(getFirstVisibleRow), getHScrollBarAlwaysVisible = js.Any.fromFunction0(getHScrollBarAlwaysVisible), getLastFullyVisibleRow = js.Any.fromFunction0(getLastFullyVisibleRow), getLastVisibleRow = js.Any.fromFunction0(getLastVisibleRow), getMouseEventTarget = js.Any.fromFunction0(getMouseEventTarget), getOption = js.Any.fromFunction1(getOption), getOptions = js.Any.fromFunction0(getOptions), getPrintMarginColumn = js.Any.fromFunction0(getPrintMarginColumn), getScrollBottomRow = js.Any.fromFunction0(getScrollBottomRow), getScrollLeft = js.Any.fromFunction0(getScrollLeft), getScrollTop = js.Any.fromFunction0(getScrollTop), getScrollTopRow = js.Any.fromFunction0(getScrollTopRow), getShowGutter = js.Any.fromFunction0(getShowGutter), getShowInvisibles = js.Any.fromFunction0(getShowInvisibles), getShowPrintMargin = js.Any.fromFunction0(getShowPrintMargin), getTextAreaContainer = js.Any.fromFunction0(getTextAreaContainer), getTheme = js.Any.fromFunction0(getTheme), hideComposition = js.Any.fromFunction0(hideComposition), hideCursor = js.Any.fromFunction0(hideCursor), isScrollableBy = js.Any.fromFunction2(isScrollableBy), lineHeight = lineHeight, onResize = js.Any.fromFunction4(onResize), removeGutterDecoration = js.Any.fromFunction0(removeGutterDecoration), screenToTextCoordinates = js.Any.fromFunction2(screenToTextCoordinates), scrollBy = js.Any.fromFunction2(scrollBy), scrollCursorIntoView = js.Any.fromFunction0(scrollCursorIntoView), scrollToLine = js.Any.fromFunction4(scrollToLine), scrollToRow = js.Any.fromFunction1(scrollToRow), scrollToX = js.Any.fromFunction1(scrollToX), scrollToY = js.Any.fromFunction1(scrollToY), scroller = scroller, setAnimatedScroll = js.Any.fromFunction1(setAnimatedScroll), setAnnotations = js.Any.fromFunction1(setAnnotations), setCompositionText = js.Any.fromFunction1(setCompositionText), setHScrollBarAlwaysVisible = js.Any.fromFunction1(setHScrollBarAlwaysVisible), setOption = js.Any.fromFunction2(setOption), setOptions = js.Any.fromFunction1(setOptions), setPadding = js.Any.fromFunction1(setPadding), setPrintMarginColumn = js.Any.fromFunction1(setPrintMarginColumn), setScrollMargin = js.Any.fromFunction4(setScrollMargin), setSession = js.Any.fromFunction1(setSession), setShowGutter = js.Any.fromFunction1(setShowGutter), setShowInvisibles = js.Any.fromFunction1(setShowInvisibles), setShowPrintMargin = js.Any.fromFunction1(setShowPrintMargin), setStyle = js.Any.fromFunction1(setStyle), setTheme = js.Any.fromFunction1(setTheme), showComposition = js.Any.fromFunction1(showComposition), showCursor = js.Any.fromFunction0(showCursor), textToScreenCoordinates = js.Any.fromFunction2(textToScreenCoordinates), unsetStyle = js.Any.fromFunction1(unsetStyle), updateBackMarkers = js.Any.fromFunction0(updateBackMarkers), updateBreakpoints = js.Any.fromFunction0(updateBreakpoints), updateCursor = js.Any.fromFunction0(updateCursor), updateFontSize = js.Any.fromFunction0(updateFontSize), updateFrontMarkers = js.Any.fromFunction0(updateFrontMarkers), updateFull = js.Any.fromFunction1(updateFull), updateLines = js.Any.fromFunction2(updateLines), updateText = js.Any.fromFunction0(updateText), visualizeBlur = js.Any.fromFunction0(visualizeBlur), visualizeFocus = js.Any.fromFunction0(visualizeFocus))
  
    __obj.asInstanceOf[VirtualRenderer]
  }
}

