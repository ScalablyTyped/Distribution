package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Selection extends js.Object {
  /** Moves the selection up one row. */
  def addSelectionAbove(): scala.Unit = js.native
  // Managing multiple selections
  /** Moves the selection down one row. */
  def addSelectionBelow(): scala.Unit = js.native
  /**
    *  Sets the indentation level of all selected rows to values suggested by the
    *  relevant grammars.
    */
  def autoIndentSelectedRows(): scala.Unit = js.native
  def autoIndentSelectedRows(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  Removes the first character before the selection if the selection is empty
    *  otherwise it deletes the selection.
    */
  def backspace(): scala.Unit = js.native
  def backspace(options: ReadonlyEditOptions): scala.Unit = js.native
  // Modifying the selected range
  /** Clears the selection, moving the marker to the head. */
  def clear(): scala.Unit = js.native
  def clear(options: atomLib.Anon_Autoscroll): scala.Unit = js.native
  // Comparing to other selections
  /**
    *  Compare this selection's buffer range to another selection's buffer range.
    *  See Range::compare for more details.
    */
  def compare(otherSelection: Selection): scala.Double = js.native
  /** Copies the current selection to the clipboard. */
  def copy(): scala.Unit = js.native
  def copy(maintainClipboard: scala.Boolean): scala.Unit = js.native
  def copy(maintainClipboard: scala.Boolean, fullLine: scala.Boolean): scala.Unit = js.native
  /** Copies the selection to the clipboard and then deletes it. */
  def cut(): scala.Unit = js.native
  def cut(maintainClipboard: scala.Boolean): scala.Unit = js.native
  def cut(maintainClipboard: scala.Boolean, fullLine: scala.Boolean): scala.Unit = js.native
  def cut(maintainClipboard: scala.Boolean, fullLine: scala.Boolean, options: ReadonlyEditOptions): scala.Unit = js.native
  /** Cuts the selection until the end of the buffer line. */
  def cutToEndOfBufferLine(): scala.Unit = js.native
  def cutToEndOfBufferLine(maintainClipboard: scala.Boolean): scala.Unit = js.native
  def cutToEndOfBufferLine(maintainClipboard: scala.Boolean, options: ReadonlyEditOptions): scala.Unit = js.native
  /** Cuts the selection until the end of the screen line. */
  def cutToEndOfLine(): scala.Unit = js.native
  def cutToEndOfLine(maintainClipboard: scala.Boolean): scala.Unit = js.native
  def cutToEndOfLine(maintainClipboard: scala.Boolean, options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  Removes the selection or the next character after the start of the selection
    *  if the selection is empty.
    */
  def delete(): scala.Unit = js.native
  def delete(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  Removes the line at the beginning of the selection if the selection is empty
    *  unless the selection spans multiple lines in which case all lines are removed.
    */
  def deleteLine(): scala.Unit = js.native
  def deleteLine(options: ReadonlyEditOptions): scala.Unit = js.native
  /** Removes only the selected text. */
  def deleteSelectedText(): scala.Unit = js.native
  def deleteSelectedText(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  Removes from the beginning of the line which the selection begins on all
    *  the way through to the end of the selection.
    */
  def deleteToBeginningOfLine(): scala.Unit = js.native
  def deleteToBeginningOfLine(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  Removes the selection or all characters from the start of the selection to
    *  the end of the current word if nothing is selected.
    */
  def deleteToBeginningOfSubword(): scala.Unit = js.native
  def deleteToBeginningOfSubword(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  Removes from the start of the selection to the beginning of the current
    *  word if the selection is empty otherwise it deletes the selection.
    */
  def deleteToBeginningOfWord(): scala.Unit = js.native
  def deleteToBeginningOfWord(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  If the selection is empty, removes all text from the cursor to the end of
    *  the line. If the cursor is already at the end of the line, it removes the following
    *  newline. If the selection isn't empty, only deletes the contents of the selection.
    */
  def deleteToEndOfLine(): scala.Unit = js.native
  def deleteToEndOfLine(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  Removes the selection or all characters from the start of the selection to
    *  the end of the current word if nothing is selected.
    */
  def deleteToEndOfSubword(): scala.Unit = js.native
  def deleteToEndOfSubword(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  Removes the selection or all characters from the start of the selection to
    *  the end of the current word if nothing is selected.
    */
  def deleteToEndOfWord(): scala.Unit = js.native
  def deleteToEndOfWord(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  Removes the selection or, if nothing is selected, then all characters from
    *  the start of the selection up to the next word boundary.
    */
  def deleteToNextWordBoundary(): scala.Unit = js.native
  def deleteToNextWordBoundary(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  Removes the selection or, if nothing is selected, then all characters from
    *  the start of the selection back to the previous word boundary.
    */
  def deleteToPreviousWordBoundary(): scala.Unit = js.native
  def deleteToPreviousWordBoundary(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  Expands the newest selection to include the entire line on which the cursor
    *  currently rests.
    *  It also includes the newline character.
    */
  def expandOverLine(): scala.Unit = js.native
  /**
    *  Expands the newest selection to include the entire word on which the
    *  cursors rests.
    */
  def expandOverWord(): scala.Unit = js.native
  /** Creates a fold containing the current selection. */
  def fold(): scala.Unit = js.native
  /** Returns the buffer Range for the selection. */
  def getBufferRange(): Range = js.native
  /** Returns the starting and ending buffer rows the selection is highlighting. */
  def getBufferRowRange(): js.Tuple2[scala.Double, scala.Double] = js.native
  // Managing the selection range
  /** Returns the screen Range for the selection. */
  def getScreenRange(): Range = js.native
  /** Returns the text in the selection. */
  def getText(): java.lang.String = js.native
  /** If the selection spans multiple rows, indent all of them. */
  def indentSelectedRows(): scala.Unit = js.native
  def indentSelectedRows(options: ReadonlyEditOptions): scala.Unit = js.native
  // Modifying the selected text
  /** Replaces text at the current selection. */
  def insertText(text: java.lang.String): scala.Unit = js.native
  def insertText(text: java.lang.String, options: TextInsertionOptions with ReadonlyEditOptions): scala.Unit = js.native
  // NOTE: this calls into Range.intersectsWith(), which is one of the few functions
  //   that doesn't take a range-compatible range, despite what the API says.
  /** Identifies if a selection intersects with a given buffer range. */
  def intersectsBufferRange(bufferRange: RangeLike): scala.Boolean = js.native
  /** Identifies if a selection intersects with another selection. */
  def intersectsWith(otherSelection: Selection): scala.Boolean = js.native
  // Info about the selection
  /** Determines if the selection contains anything. */
  def isEmpty(): scala.Boolean = js.native
  /**
    *  Determines if the ending position of a marker is greater than the starting position.
    *  This can happen when, for example, you highlight text "up" in a TextBuffer.
    */
  def isReversed(): scala.Boolean = js.native
  /** Returns whether the selection is a single line or not. */
  def isSingleScreenLine(): scala.Boolean = js.native
  /**
    *  Joins the current line with the one below it. Lines will be separated by a single space.
    *  If there selection spans more than one line, all the lines are joined together.
    */
  def joinLines(): scala.Unit = js.native
  def joinLines(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  Combines the given selection into this selection and then destroys the
    *  given selection.
    */
  def merge(otherSelection: Selection): scala.Unit = js.native
  def merge(otherSelection: Selection, options: atomLib.Anon_AutoscrollPreserveFolds): scala.Unit = js.native
  // Event Subscription
  /** Calls your callback when the selection was moved. */
  def onDidChangeRange(callback: js.Function1[/* event */ SelectionChangedEvent, scala.Unit]): Disposable = js.native
  /** Calls your callback when the selection was destroyed. */
  def onDidDestroy(callback: js.Function0[scala.Unit]): Disposable = js.native
  /** Removes one level of indent from the currently selected rows. */
  def outdentSelectedRows(): scala.Unit = js.native
  def outdentSelectedRows(options: ReadonlyEditOptions): scala.Unit = js.native
  /** Selects all the text in the buffer. */
  def selectAll(): scala.Unit = js.native
  /** Selects all the text one position below the cursor. */
  def selectDown(): scala.Unit = js.native
  def selectDown(rowCount: scala.Double): scala.Unit = js.native
  /** Selects the text one position left of the cursor. */
  def selectLeft(): scala.Unit = js.native
  def selectLeft(columnCount: scala.Double): scala.Unit = js.native
  /** Selects an entire line in the buffer. */
  def selectLine(row: scala.Double): scala.Unit = js.native
  /** Selects the text one position right of the cursor. */
  def selectRight(): scala.Unit = js.native
  def selectRight(columnCount: scala.Double): scala.Unit = js.native
  /**
    *  Selects all the text from the current cursor position to the beginning of
    *  the line.
    */
  def selectToBeginningOfLine(): scala.Unit = js.native
  /**
    *  Selects all the text from the current cursor position to the beginning of
    *  the next paragraph.
    */
  def selectToBeginningOfNextParagraph(): scala.Unit = js.native
  /**
    *  Selects all the text from the current cursor position to the beginning of
    *  the next word.
    */
  def selectToBeginningOfNextWord(): scala.Unit = js.native
  /**
    *  Selects all the text from the current cursor position to the beginning of
    *  the previous paragraph.
    */
  def selectToBeginningOfPreviousParagraph(): scala.Unit = js.native
  /**
    *  Selects all the text from the current cursor position to the beginning
    *  of the word.
    */
  def selectToBeginningOfWord(): scala.Unit = js.native
  /**
    *  Selects all the text from the current cursor position to the bottom of
    *  the buffer.
    */
  def selectToBottom(): scala.Unit = js.native
  /** Selects the text from the current cursor position to a given buffer position. */
  def selectToBufferPosition(position: PointCompatible): scala.Unit = js.native
  /**
    *  Selects all the text from the current cursor position to the end of the
    *  buffer line.
    */
  def selectToEndOfBufferLine(): scala.Unit = js.native
  /**
    *  Selects all the text from the current cursor position to the end of the
    *  screen line.
    */
  def selectToEndOfLine(): scala.Unit = js.native
  /** Selects all the text from the current cursor position to the end of the word. */
  def selectToEndOfWord(): scala.Unit = js.native
  /**
    *  Selects all the text from the current cursor position to the first character
    *  of the line.
    */
  def selectToFirstCharacterOfLine(): scala.Unit = js.native
  /** Selects text to the next subword boundary. */
  def selectToNextSubwordBoundary(): scala.Unit = js.native
  /** Selects text to the next word boundary. */
  def selectToNextWordBoundary(): scala.Unit = js.native
  /** Selects text to the previous subword boundary. */
  def selectToPreviousSubwordBoundary(): scala.Unit = js.native
  /** Selects text to the previous word boundary. */
  def selectToPreviousWordBoundary(): scala.Unit = js.native
  /** Selects the text from the current cursor position to a given screen position. */
  def selectToScreenPosition(position: PointCompatible): scala.Unit = js.native
  /**
    *  Selects all the text from the current cursor position to the top of the
    *  buffer.
    */
  def selectToTop(): scala.Unit = js.native
  /** Selects all the text one position above the cursor. */
  def selectUp(): scala.Unit = js.native
  def selectUp(rowCount: scala.Double): scala.Unit = js.native
  /** Modifies the selection to encompass the current word. */
  def selectWord(): scala.Unit = js.native
  /** Modifies the buffer Range for the selection. */
  def setBufferRange(bufferRange: RangeCompatible): scala.Unit = js.native
  def setBufferRange(bufferRange: RangeCompatible, options: atomLib.Anon_AutoscrollPreserveFolds): scala.Unit = js.native
  /** Modifies the screen range for the selection. */
  def setScreenRange(screenRange: RangeCompatible): scala.Unit = js.native
  def setScreenRange(screenRange: RangeCompatible, options: atomLib.Anon_AutoscrollPreserveFolds): scala.Unit = js.native
  /**
    *  Wraps the selected lines in comments if they aren't currently part of a comment.
    *  Removes the comment if they are currently wrapped in a comment.
    */
  def toggleLineComments(): scala.Unit = js.native
  def toggleLineComments(options: ReadonlyEditOptions): scala.Unit = js.native
}

