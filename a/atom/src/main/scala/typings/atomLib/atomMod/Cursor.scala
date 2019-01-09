package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cursor extends js.Object {
  // Utilities
  /** Prevents this cursor from causing scrolling. */
  def clearAutoscroll(): scala.Unit = js.native
  /** Deselects the current selection. */
  def clearSelection(): scala.Unit = js.native
  // Comparing to another cursor
  /**
    *  Compare this cursor's buffer position to another cursor's buffer position.
    *  See Point::compare for more details.
    */
  def compare(otherCursor: Cursor): scala.Double = js.native
  /** Retrieves the buffer position of where the current word starts. */
  def getBeginningOfCurrentWordBufferPosition(): Point = js.native
  def getBeginningOfCurrentWordBufferPosition(options: atomLib.Anon_AllowPrevious): Point = js.native
  /** Retrieves the buffer position of where the next word starts. */
  def getBeginningOfNextWordBufferPosition(): Point = js.native
  def getBeginningOfNextWordBufferPosition(options: atomLib.Anon_WordRegex): Point = js.native
  /** Returns the cursor's current buffer column. */
  def getBufferColumn(): scala.Double = js.native
  /** Returns the current buffer position as an Array. */
  def getBufferPosition(): Point = js.native
  /** Retrieves the cursor's current buffer row. */
  def getBufferRow(): scala.Double = js.native
  /** Returns the cursor's current buffer row of text excluding its line ending. */
  def getCurrentBufferLine(): java.lang.String = js.native
  /** Returns the buffer Range for the current line. */
  def getCurrentLineBufferRange(): Range = js.native
  def getCurrentLineBufferRange(options: atomLib.Anon_IncludeNewline): Range = js.native
  /**
    *  Retrieves the range for the current paragraph.
    *  A paragraph is defined as a block of text surrounded by empty lines or comments.
    */
  def getCurrentParagraphBufferRange(): Range = js.native
  /** Returns the buffer Range occupied by the word located under the cursor. */
  def getCurrentWordBufferRange(): Range = js.native
  def getCurrentWordBufferRange(options: atomLib.Anon_WordRegex): Range = js.native
  /** Returns the characters preceding the cursor in the current word. */
  def getCurrentWordPrefix(): java.lang.String = js.native
  /** Retrieves the buffer position of where the current word ends. */
  def getEndOfCurrentWordBufferPosition(): Point = js.native
  def getEndOfCurrentWordBufferPosition(options: atomLib.Anon_IncludeNonWordCharacters): Point = js.native
  /** Returns the indentation level of the current line. */
  def getIndentLevel(): scala.Double = js.native
  // Cursor Position Details
  /**
    *  Returns the underlying DisplayMarker for the cursor. Useful with overlay
    *  Decorations.
    */
  def getMarker(): DisplayMarker = js.native
  /**
    *  Returns buffer position of the next word boundary. It might be on the current
    *  word, or the previous word.
    */
  def getNextWordBoundaryBufferPosition(): Point = js.native
  def getNextWordBoundaryBufferPosition(options: atomLib.Anon_WordRegex): Point = js.native
  // Local Positions and Ranges
  /**
    *  Returns buffer position of previous word boundary. It might be on the current
    *  word, or the previous word.
    */
  def getPreviousWordBoundaryBufferPosition(): Point = js.native
  def getPreviousWordBoundaryBufferPosition(options: atomLib.Anon_WordRegex): Point = js.native
  /** Retrieves the scope descriptor for the cursor's current position. */
  def getScopeDescriptor(): ScopeDescriptor = js.native
  /** Returns the cursor's current screen column. */
  def getScreenColumn(): scala.Double = js.native
  /** Returns the screen position of the cursor as a Point. */
  def getScreenPosition(): Point = js.native
  /** Returns the cursor's current screen row. */
  def getScreenRow(): scala.Double = js.native
  /**
    *  Returns true if this cursor has no non-whitespace characters before its
    *  current position.
    */
  def hasPrecedingCharactersOnLine(): scala.Boolean = js.native
  /** Returns whether the cursor is at the start of a line. */
  def isAtBeginningOfLine(): scala.Boolean = js.native
  /** Returns whether the cursor is on the line return character. */
  def isAtEndOfLine(): scala.Boolean = js.native
  /** This method returns false if the character before or after the cursor is whitespace. */
  def isBetweenWordAndNonWord(): scala.Boolean = js.native
  /** Returns whether this cursor is between a word's start and end. */
  def isInsideWord(): scala.Boolean = js.native
  def isInsideWord(options: atomLib.Anon_WordRegex): scala.Boolean = js.native
  /**
    *  Identifies if this cursor is the last in the TextEditor.
    *  "Last" is defined as the most recently added cursor.
    */
  def isLastCursor(): scala.Boolean = js.native
  /**
    *  Identifies if the cursor is surrounded by whitespace.
    *  "Surrounded" here means that the character directly before and after the cursor
    *  are both whitespace.
    */
  def isSurroundedByWhitespace(): scala.Boolean = js.native
  /** Returns the visibility of the cursor. */
  def isVisible(): scala.Boolean = js.native
  /** Moves the cursor down one screen row. */
  def moveDown(): scala.Unit = js.native
  def moveDown(rowCount: scala.Double): scala.Unit = js.native
  def moveDown(rowCount: scala.Double, options: atomLib.Anon_MoveToEndOfSelection): scala.Unit = js.native
  /** Moves the cursor left one screen column. */
  def moveLeft(): scala.Unit = js.native
  def moveLeft(columnCount: scala.Double): scala.Unit = js.native
  def moveLeft(columnCount: scala.Double, options: atomLib.Anon_MoveToEndOfSelection): scala.Unit = js.native
  /** Moves the cursor right one screen column. */
  def moveRight(): scala.Unit = js.native
  def moveRight(columnCount: scala.Double): scala.Unit = js.native
  def moveRight(columnCount: scala.Double, options: atomLib.Anon_MoveToEndOfSelection): scala.Unit = js.native
  /** Moves the cursor to the beginning of the buffer line. */
  def moveToBeginningOfLine(): scala.Unit = js.native
  /** Moves the cursor to the beginning of the next paragraph. */
  def moveToBeginningOfNextParagraph(): scala.Unit = js.native
  /** Moves the cursor to the beginning of the next word. */
  def moveToBeginningOfNextWord(): scala.Unit = js.native
  /** Moves the cursor to the beginning of the previous paragraph. */
  def moveToBeginningOfPreviousParagraph(): scala.Unit = js.native
  /** Moves the cursor to the beginning of the line. */
  def moveToBeginningOfScreenLine(): scala.Unit = js.native
  /** Moves the cursor to the beginning of the word. */
  def moveToBeginningOfWord(): scala.Unit = js.native
  /** Moves the cursor to the bottom of the buffer. */
  def moveToBottom(): scala.Unit = js.native
  /** Moves the cursor to the end of the buffer line. */
  def moveToEndOfLine(): scala.Unit = js.native
  /** Moves the cursor to the end of the line. */
  def moveToEndOfScreenLine(): scala.Unit = js.native
  /** Moves the cursor to the end of the word. */
  def moveToEndOfWord(): scala.Unit = js.native
  /** Moves the cursor to the beginning of the first character in the line. */
  def moveToFirstCharacterOfLine(): scala.Unit = js.native
  /** Moves the cursor to the next subword boundary. */
  def moveToNextSubwordBoundary(): scala.Unit = js.native
  /** Moves the cursor to the next word boundary. */
  def moveToNextWordBoundary(): scala.Unit = js.native
  /** Moves the cursor to the previous subword boundary. */
  def moveToPreviousSubwordBoundary(): scala.Unit = js.native
  /** Moves the cursor to the previous word boundary. */
  def moveToPreviousWordBoundary(): scala.Unit = js.native
  /** Moves the cursor to the top of the buffer. */
  def moveToTop(): scala.Unit = js.native
  // Moving the Cursor
  /** Moves the cursor up one screen row. */
  def moveUp(): scala.Unit = js.native
  def moveUp(rowCount: scala.Double): scala.Unit = js.native
  def moveUp(rowCount: scala.Double, options: atomLib.Anon_MoveToEndOfSelection): scala.Unit = js.native
  // Event Subscription
  /** Calls your callback when the cursor has been moved. */
  def onDidChangePosition(callback: js.Function1[/* event */ CursorPositionChangedEvent, scala.Unit]): Disposable = js.native
  /** Calls your callback when the cursor's visibility has changed. */
  def onDidChangeVisibility(callback: js.Function1[/* visibility */ scala.Boolean, scala.Unit]): Disposable = js.native
  /** Calls your callback when the cursor is destroyed. */
  def onDidDestroy(callback: js.Function0[scala.Unit]): Disposable = js.native
  /** Moves a cursor to a given buffer position. */
  def setBufferPosition(bufferPosition: PointCompatible): scala.Unit = js.native
  def setBufferPosition(bufferPosition: PointCompatible, options: atomLib.Anon_Autoscroll): scala.Unit = js.native
  // Managing Cursor Position
  /** Moves a cursor to a given screen position. */
  def setScreenPosition(screenPosition: PointCompatible): scala.Unit = js.native
  def setScreenPosition(screenPosition: PointCompatible, options: atomLib.Anon_Autoscroll): scala.Unit = js.native
  // Visibility
  /** Sets whether the cursor is visible. */
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  /** Moves the cursor to the beginning of the buffer line, skipping all whitespace. */
  def skipLeadingWhitespace(): scala.Unit = js.native
  /** Get the RegExp used by the cursor to determine what a "subword" is. */
  def subwordRegExp(): stdLib.RegExp = js.native
  def subwordRegExp(options: atomLib.Anon_Backwards): stdLib.RegExp = js.native
  /** Get the RegExp used by the cursor to determine what a "word" is. */
  def wordRegExp(): stdLib.RegExp = js.native
  def wordRegExp(options: atomLib.Anon_IncludeNonWordCharactersBoolean): stdLib.RegExp = js.native
}

