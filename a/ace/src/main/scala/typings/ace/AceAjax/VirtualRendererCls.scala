package typings.ace.AceAjax

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AceAjax.VirtualRenderer")
@js.native
class VirtualRendererCls protected () extends VirtualRenderer {
  /**
    * Constructs a new `VirtualRenderer` within the `container` specified, applying the given `theme`.
    * @param container The root element of the editor
    * @param theme The starting theme
    **/
  def this(container: HTMLElement) = this()
  def this(container: HTMLElement, theme: String) = this()
  /* CompleteClass */
  override var characterWidth: Double = js.native
  /* CompleteClass */
  override var lineHeight: Double = js.native
  /* CompleteClass */
  override var scroller: js.Any = js.native
  /**
    * Deprecated; (moved to [[EditSession]])
    **/
  /* CompleteClass */
  override def addGutterDecoration(): Unit = js.native
  /**
    * Adjusts the wrap limit, which is the number of characters that can fit within the width of the edit area on screen.
    **/
  /* CompleteClass */
  override def adjustWrapLimit(): Unit = js.native
  /**
    * Destroys the text and cursor layers for this renderer.
    **/
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * Returns whether an animated scroll happens or not.
    **/
  /* CompleteClass */
  override def getAnimatedScroll(): Boolean = js.native
  /**
    * Returns the root element containing this renderer.
    **/
  /* CompleteClass */
  override def getContainerElement(): HTMLElement = js.native
  /**
    * Returns the index of the first fully visible row. "Fully" here means that the characters in the row are not truncated; that the top and the bottom of the row are on the screen.
    **/
  /* CompleteClass */
  override def getFirstFullyVisibleRow(): Double = js.native
  /**
    * [Returns the index of the first visible row.]{: #VirtualRenderer.getFirstVisibleRow}
    **/
  /* CompleteClass */
  override def getFirstVisibleRow(): Double = js.native
  /**
    * Returns whether the horizontal scrollbar is set to be always visible.
    **/
  /* CompleteClass */
  override def getHScrollBarAlwaysVisible(): Boolean = js.native
  /**
    * Returns the index of the last fully visible row. "Fully" here means that the characters in the row are not truncated; that the top and the bottom of the row are on the screen.
    **/
  /* CompleteClass */
  override def getLastFullyVisibleRow(): Double = js.native
  /**
    * [Returns the index of the last visible row.]{: #VirtualRenderer.getLastVisibleRow}
    **/
  /* CompleteClass */
  override def getLastVisibleRow(): Double = js.native
  /**
    * Returns the element that the mouse events are attached to
    **/
  /* CompleteClass */
  override def getMouseEventTarget(): HTMLElement = js.native
  /**
    * Get a Configuration Option
    **/
  /* CompleteClass */
  override def getOption(name: String): js.Any = js.native
  /**
    * Get Configuration Options
    **/
  /* CompleteClass */
  override def getOptions(): js.Any = js.native
  /**
    * Returns whether the print margin column is being shown or not.
    **/
  /* CompleteClass */
  override def getPrintMarginColumn(): Boolean = js.native
  /**
    * Returns the last visible row, regardless of whether it's fully visible or not.
    **/
  /* CompleteClass */
  override def getScrollBottomRow(): Double = js.native
  /**
    * {:EditSession.getScrollLeft}
    **/
  /* CompleteClass */
  override def getScrollLeft(): Double = js.native
  /**
    * {:EditSession.getScrollTop}
    **/
  /* CompleteClass */
  override def getScrollTop(): Double = js.native
  /**
    * Returns the first visible row, regardless of whether it's fully visible or not.
    **/
  /* CompleteClass */
  override def getScrollTopRow(): Double = js.native
  /**
    * Returns `true` if the gutter is being shown.
    **/
  /* CompleteClass */
  override def getShowGutter(): Boolean = js.native
  /**
    * Returns whether invisible characters are being shown or not.
    **/
  /* CompleteClass */
  override def getShowInvisibles(): Boolean = js.native
  /**
    * Returns whether the print margin is being shown or not.
    **/
  /* CompleteClass */
  override def getShowPrintMargin(): Boolean = js.native
  /**
    * Returns the element to which the hidden text area is added.
    **/
  /* CompleteClass */
  override def getTextAreaContainer(): HTMLElement = js.native
  /**
    * [Returns the path of the current theme.]{: #VirtualRenderer.getTheme}
    **/
  /* CompleteClass */
  override def getTheme(): String = js.native
  /**
    * Hides the current composition.
    **/
  /* CompleteClass */
  override def hideComposition(): Unit = js.native
  /**
    * Hides the cursor icon.
    **/
  /* CompleteClass */
  override def hideCursor(): Unit = js.native
  /**
    * Returns `true` if you can still scroll by either parameter; in other words, you haven't reached the end of the file or line.
    * @param deltaX The x value to scroll by
    * @param deltaY The y value to scroll by
    **/
  /* CompleteClass */
  override def isScrollableBy(deltaX: Double, deltaY: Double): Boolean = js.native
  /**
    * [Triggers a resize of the editor.]{: #VirtualRenderer.onResize}
    * @param force If `true`, recomputes the size, even if the height and width haven't changed
    * @param gutterWidth The width of the gutter in pixels
    * @param width The width of the editor in pixels
    * @param height The hiehgt of the editor, in pixels
    **/
  /* CompleteClass */
  override def onResize(force: Boolean, gutterWidth: Double, width: Double, height: Double): Unit = js.native
  /**
    * Deprecated; (moved to [[EditSession]])
    **/
  /* CompleteClass */
  override def removeGutterDecoration(): Unit = js.native
  /* CompleteClass */
  override def screenToTextCoordinates(left: Double, top: Double): Unit = js.native
  /**
    * Scrolls the editor across both x- and y-axes.
    * @param deltaX The x value to scroll by
    * @param deltaY The y value to scroll by
    **/
  /* CompleteClass */
  override def scrollBy(deltaX: Double, deltaY: Double): Unit = js.native
  /**
    * Scrolls the cursor into the first visibile area of the editor
    **/
  /* CompleteClass */
  override def scrollCursorIntoView(): Unit = js.native
  /**
    * Gracefully scrolls the editor to the row indicated.
    * @param line A line number
    * @param center If `true`, centers the editor the to indicated line
    * @param animate If `true` animates scrolling
    * @param callback Function to be called after the animation has finished
    **/
  /* CompleteClass */
  override def scrollToLine(line: Double, center: Boolean, animate: Boolean, callback: js.Function): Unit = js.native
  /**
    * Gracefully scrolls from the top of the editor to the row indicated.
    * @param row A row id
    **/
  /* CompleteClass */
  override def scrollToRow(row: Double): Unit = js.native
  /**
    * Scrolls the editor across the x-axis to the pixel indicated.
    * @param scrollLeft The position to scroll to
    **/
  /* CompleteClass */
  override def scrollToX(scrollLeft: Double): Double = js.native
  /**
    * Scrolls the editor to the y pixel indicated.
    * @param scrollTop The position to scroll to
    **/
  /* CompleteClass */
  override def scrollToY(scrollTop: Double): Double = js.native
  /**
    * Identifies whether you want to have an animated scroll or not.
    * @param shouldAnimate Set to `true` to show animated scrolls
    **/
  /* CompleteClass */
  override def setAnimatedScroll(shouldAnimate: Boolean): Unit = js.native
  /**
    * Sets annotations for the gutter.
    * @param annotations An array containing annotations
    **/
  /* CompleteClass */
  override def setAnnotations(annotations: js.Array[_]): Unit = js.native
  /**
    * Sets the inner text of the current composition to `text`.
    * @param text A string of text to use
    **/
  /* CompleteClass */
  override def setCompositionText(text: String): Unit = js.native
  /**
    * Identifies whether you want to show the horizontal scrollbar or not.
    * @param alwaysVisible Set to `true` to make the horizontal scroll bar visible
    **/
  /* CompleteClass */
  override def setHScrollBarAlwaysVisible(alwaysVisible: Boolean): Unit = js.native
  /**
    * Sets a Configuration Option
    **/
  /* CompleteClass */
  override def setOption(optionName: String, optionValue: js.Any): Unit = js.native
  /**
    * Sets Configuration Options
    **/
  /* CompleteClass */
  override def setOptions(keyValueTuples: js.Any): Unit = js.native
  /**
    * Sets the padding for all the layers.
    * @param padding A new padding value (in pixels)
    **/
  /* CompleteClass */
  override def setPadding(padding: Double): Unit = js.native
  /**
    * Identifies whether you want to show the print margin column or not.
    * @param showPrintMargin Set to `true` to show the print margin column
    **/
  /* CompleteClass */
  override def setPrintMarginColumn(showPrintMargin: Boolean): Unit = js.native
  /* CompleteClass */
  override def setScrollMargin(top: Double, bottom: Double, left: Double, right: Double): Unit = js.native
  /**
    * Associates the renderer with an [[EditSession `EditSession`]].
    **/
  /* CompleteClass */
  override def setSession(session: IEditSession): Unit = js.native
  /**
    * Identifies whether you want to show the gutter or not.
    * @param show Set to `true` to show the gutter
    **/
  /* CompleteClass */
  override def setShowGutter(show: Boolean): Unit = js.native
  /**
    * Identifies whether you want to show invisible characters or not.
    * @param showInvisibles Set to `true` to show invisibles
    **/
  /* CompleteClass */
  override def setShowInvisibles(showInvisibles: Boolean): Unit = js.native
  /**
    * Identifies whether you want to show the print margin or not.
    * @param showPrintMargin Set to `true` to show the print margin
    **/
  /* CompleteClass */
  override def setShowPrintMargin(showPrintMargin: Boolean): Unit = js.native
  /**
    * [Adds a new class, `style`, to the editor.]{: #VirtualRenderer.setStyle}
    * @param style A class name
    **/
  /* CompleteClass */
  override def setStyle(style: String): Unit = js.native
  /**
    * [Sets a new theme for the editor. `theme` should exist, and be a directory path, like `ace/theme/textmate`.]{: #VirtualRenderer.setTheme}
    * @param theme The path to a theme
    **/
  /* CompleteClass */
  override def setTheme(theme: String): Unit = js.native
  /**
    * undefined
    * @param position
    **/
  /* CompleteClass */
  override def showComposition(position: Double): Unit = js.native
  /**
    * Shows the cursor icon.
    **/
  /* CompleteClass */
  override def showCursor(): Unit = js.native
  /**
    * Returns an object containing the `pageX` and `pageY` coordinates of the document position.
    * @param row The document row position
    * @param column The document column position
    **/
  /* CompleteClass */
  override def textToScreenCoordinates(row: Double, column: Double): js.Any = js.native
  /**
    * [Removes the class `style` from the editor.]{: #VirtualRenderer.unsetStyle}
    * @param style A class name
    **/
  /* CompleteClass */
  override def unsetStyle(style: String): Unit = js.native
  /**
    * Schedules an update to all the back markers in the document.
    **/
  /* CompleteClass */
  override def updateBackMarkers(): Unit = js.native
  /**
    * Redraw breakpoints.
    **/
  /* CompleteClass */
  override def updateBreakpoints(): Unit = js.native
  /**
    * Updates the cursor icon.
    **/
  /* CompleteClass */
  override def updateCursor(): Unit = js.native
  /**
    * Updates the font size.
    **/
  /* CompleteClass */
  override def updateFontSize(): Unit = js.native
  /**
    * Schedules an update to all the front markers in the document.
    **/
  /* CompleteClass */
  override def updateFrontMarkers(): Unit = js.native
  /**
    * Triggers a full update of all the layers, for all the rows.
    * @param force If `true`, forces the changes through
    **/
  /* CompleteClass */
  override def updateFull(force: Boolean): Unit = js.native
  /**
    * Triggers a partial update of the text, from the range given by the two parameters.
    * @param firstRow The first row to update
    * @param lastRow The last row to update
    **/
  /* CompleteClass */
  override def updateLines(firstRow: Double, lastRow: Double): Unit = js.native
  /**
    * Triggers a full update of the text, for all the rows.
    **/
  /* CompleteClass */
  override def updateText(): Unit = js.native
  /**
    * Blurs the current container.
    **/
  /* CompleteClass */
  override def visualizeBlur(): Unit = js.native
  /**
    * Focuses the current container.
    **/
  /* CompleteClass */
  override def visualizeFocus(): Unit = js.native
}

