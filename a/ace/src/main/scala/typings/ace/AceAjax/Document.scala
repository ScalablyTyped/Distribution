package typings.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends StObject {
  
  /**
    * Applies all the changes previously accumulated. These can be either `'includeText'`, `'insertLines'`, `'removeText'`, and `'removeLines'`.
    **/
  def applyDeltas(deltas: js.Array[Delta]): Unit = js.native
  
  def clippedPos(row: Double, column: Double): Position = js.native
  
  def clonePos(pos: Position): Position = js.native
  
  /**
    * Creates a new `Anchor` to define a floating point in the document.
    * @param row The row number to use
    * @param column The column number to use
    **/
  def createAnchor(row: Double, column: Double): Unit = js.native
  
  /**
    * Returns all lines in the document as string array. Warning: The caller should not modify this array!
    **/
  def getAllLines(): js.Array[String] = js.native
  
  /**
    * Returns the number of rows in the document.
    **/
  def getLength(): Double = js.native
  
  /**
    * Returns a verbatim copy of the given line as it is in the document
    * @param row The row index to retrieve
    **/
  def getLine(row: Double): String = js.native
  
  /**
    * Returns an array of strings of the rows between `firstRow` and `lastRow`. This function is inclusive of `lastRow`.
    * @param firstRow The first row index to retrieve
    * @param lastRow The final row index to retrieve
    **/
  def getLines(firstRow: Double, lastRow: Double): js.Array[String] = js.native
  
  def getLinesForRange(range: Range): js.Array[String] = js.native
  
  /**
    * Returns the newline character that's being used, depending on the value of `newLineMode`.
    **/
  def getNewLineCharacter(): String = js.native
  
  /**
    * [Returns the type of newlines being used; either `windows`, `unix`, or `auto`]{: #Document.getNewLineMode}
    **/
  def getNewLineMode(): NewLineMode = js.native
  
  /**
    * [Given a range within the document, this function returns all the text within that range as a single string.]{: #Document.getTextRange.desc}
    * @param range The range to work with
    **/
  def getTextRange(range: Range): String = js.native
  
  /**
    * Returns all the lines in the document as a single string, split by the new line character.
    **/
  def getValue(): String = js.native
  
  /**
    * Converts an index position in a document to a `{row, column}` object.
    * Index refers to the "absolute position" of a character in the document. For example:
    * ```javascript
    * var x = 0; // 10 characters, plus one for newline
    * var y = -1;
    * ```
    * Here, `y` is an index 15: 11 characters for the first row, and 5 characters until `y` in the second.
    * @param index An index to convert
    * @param startRow=0 The row from which to start the conversion
    **/
  def indexToPosition(index: Double, startRow: Double): Position = js.native
  
  /**
    * Inserts a block of `text` and the indicated `position`.
    * @param position The position to start inserting at
    * @param text A chunk of text to insert
    **/
  def insert(position: Position, text: String): Position = js.native
  
  /**
    * Inserts the elements in `lines` into the document as full lines (does not merge with existing line), starting at the row index given by `row`. This method also triggers the `"change"` event.
    * @param {Number} row The index of the row to insert at
    * @param {Array} lines An array of strings
    * @returns {Object} Contains the final row and column, like this:
    *   ```
    *   {row: endRow, column: 0}
    *   ```
    *   If `lines` is empty, this function returns an object containing the current row, and column, like this:
    *   ```
    *   {row: row, column: 0}
    *   ```
    *
    **/
  def insertFullLines(row: Double, lines: js.Array[String]): Unit = js.native
  
  /**
    * Inserts `text` into the `position` at the current row. This method also triggers the `'change'` event.
    * @param position The position to insert at
    * @param text A chunk of text
    **/
  def insertInLine(position: Position, text: String): Position = js.native
  
  /**
    * @deprecated Use the insertFullLines method instead.
    */
  def insertLines(row: Double, lines: js.Array[String]): Position = js.native
  
  /**
    * Inserts the elements in `lines` into the document, starting at the position index given by `row`. This method also triggers the `"change"` event.
    * @param {Number} row The index of the row to insert at
    * @param {Array} lines An array of strings
    * @returns {Object} Contains the final row and column, like this:
    *   ```
    *   {row: endRow, column: 0}
    *   ```
    *   If `lines` is empty, this function returns an object containing the current row, and column, like this:
    *   ```
    *   {row: row, column: 0}
    *   ```
    *
    **/
  def insertMergedLines(row: Double, lines: js.Array[String]): Position = js.native
  
  /**
    * @deprecated Use insertMergedLines(position, ['', '']) instead.
    */
  def insertNewLine(position: Position): Position = js.native
  
  /**
    * Returns `true` if `text` is a newline character (either `\r\n`, `\r`, or `\n`).
    * @param text The text to check
    **/
  def isNewLine(text: String): Boolean = js.native
  
  def on(event: String, fn: js.Function1[/* e */ Any, Any]): Unit = js.native
  
  def pos(row: Double, column: Double): Position = js.native
  
  /**
    * Converts the `{row, column}` position in a document to the character's index.
    * Index refers to the "absolute position" of a character in the document. For example:
    * ```javascript
    * var x = 0; // 10 characters, plus one for newline
    * var y = -1;
    * ```
    * Here, `y` is an index 15: 11 characters for the first row, and 5 characters until `y` in the second.
    * @param pos The `{row, column}` to convert
    * @param startRow=0 The row from which to start the conversion
    **/
  def positionToIndex(pos: Position): Double = js.native
  def positionToIndex(pos: Position, startRow: Double): Double = js.native
  
  /**
    * Removes the `range` from the document.
    * @param range A specified Range to remove
    **/
  def remove(range: Range): Position = js.native
  
  /**
    * Removes a range of full lines. This method also triggers the `"change"` event.
    * @param {Number} firstRow The first row to be removed
    * @param {Number} lastRow The last row to be removed
    * @returns {[String]} Returns all the removed lines.
    *
    **/
  def removeFullLines(firstRow: Double, lastRow: Double): js.Array[String] = js.native
  
  /**
    * Removes the specified columns from the `row`. This method also triggers the `'change'` event.
    * @param row The row to remove from
    * @param startColumn The column to start removing at
    * @param endColumn The column to stop removing at
    **/
  def removeInLine(row: Double, startColumn: Double, endColumn: Double): Position = js.native
  
  /**
    * @deprecated Use the removeFullLines method instead.
    */
  def removeLines(firstRow: Double, lastRow: Double): js.Array[String] = js.native
  
  /**
    * Removes the new line between `row` and the row immediately following it. This method also triggers the `'change'` event.
    * @param row The row to check
    **/
  def removeNewLine(row: Double): Unit = js.native
  
  /**
    * Replaces a range in the document with the new `text`.
    * @param range A specified Range to replace
    * @param text The new text to use as a replacement
    **/
  def replace(range: Range, text: String): Position = js.native
  
  /**
    * Reverts any changes previously applied. These can be either `'includeText'`, `'insertLines'`, `'removeText'`, and `'removeLines'`.
    **/
  def revertDeltas(deltas: js.Array[Delta]): Unit = js.native
  
  /**
    * [Sets the new line mode.]{: #Document.setNewLineMode.desc}
    * @param newLineMode [The newline mode to use; can be either `windows`, `unix`, or `auto`]{: #Document.setNewLineMode.param}
    **/
  def setNewLineMode(newLineMode: NewLineMode): Unit = js.native
  
  /**
    * Replaces all the lines in the current `Document` with the value of `text`.
    * @param text The text to use
    **/
  def setValue(text: String): Unit = js.native
}
