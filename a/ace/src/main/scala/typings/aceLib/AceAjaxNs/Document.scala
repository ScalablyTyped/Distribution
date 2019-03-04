package typings
package aceLib.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  /**
    * Applies all the changes previously accumulated. These can be either `'includeText'`, `'insertLines'`, `'removeText'`, and `'removeLines'`.
    **/
  def applyDeltas(deltas: js.Array[Delta]): scala.Unit
  /**
    * Creates a new `Anchor` to define a floating point in the document.
    * @param row The row number to use
    * @param column The column number to use
    **/
  def createAnchor(row: scala.Double, column: scala.Double): scala.Unit
  /**
    * Returns all lines in the document as string array. Warning: The caller should not modify this array!
    **/
  def getAllLines(): js.Array[java.lang.String]
  /**
    * Returns the number of rows in the document.
    **/
  def getLength(): scala.Double
  /**
    * Returns a verbatim copy of the given line as it is in the document
    * @param row The row index to retrieve
    **/
  def getLine(row: scala.Double): java.lang.String
  /**
    * Returns an array of strings of the rows between `firstRow` and `lastRow`. This function is inclusive of `lastRow`.
    * @param firstRow The first row index to retrieve
    * @param lastRow The final row index to retrieve
    **/
  def getLines(firstRow: scala.Double, lastRow: scala.Double): js.Array[java.lang.String]
  /**
    * Returns the newline character that's being used, depending on the value of `newLineMode`.
    **/
  def getNewLineCharacter(): java.lang.String
  /**
    * [Returns the type of newlines being used; either `windows`, `unix`, or `auto`]{: #Document.getNewLineMode}
    **/
  def getNewLineMode(): java.lang.String
  /**
    * [Given a range within the document, this function returns all the text within that range as a single string.]{: #Document.getTextRange.desc}
    * @param range The range to work with
    **/
  def getTextRange(range: Range): java.lang.String
  /**
    * Returns all the lines in the document as a single string, split by the new line character.
    **/
  def getValue(): java.lang.String
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
  def indexToPosition(index: scala.Double, startRow: scala.Double): Position
  /**
    * Inserts a block of `text` and the indicated `position`.
    * @param position The position to start inserting at
    * @param text A chunk of text to insert
    **/
  def insert(position: Position, text: java.lang.String): js.Any
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
  def insertFullLines(row: scala.Double, lines: js.Array[java.lang.String]): js.Any
  /**
    * Inserts `text` into the `position` at the current row. This method also triggers the `'change'` event.
    * @param position The position to insert at
    * @param text A chunk of text
    **/
  def insertInLine(position: js.Any, text: java.lang.String): js.Any
  /**
    * @deprecated Use the insertFullLines method instead.
    */
  def insertLines(row: scala.Double, lines: js.Array[java.lang.String]): js.Any
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
  def insertMergedLines(row: scala.Double, lines: js.Array[java.lang.String]): js.Any
  /**
    * @deprecated Use insertMergedLines(position, ['', '']) instead.
    */
  def insertNewLine(position: Position): js.Any
  /**
    * Returns `true` if `text` is a newline character (either `\r\n`, `\r`, or `\n`).
    * @param text The text to check
    **/
  def isNewLine(text: java.lang.String): scala.Boolean
  def on(event: java.lang.String, fn: js.Function1[/* e */ js.Any, _]): scala.Unit
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
  def positionToIndex(pos: Position, startRow: scala.Double): scala.Double
  /**
    * Removes the `range` from the document.
    * @param range A specified Range to remove
    **/
  def remove(range: Range): js.Any
  /**
    * Removes a range of full lines. This method also triggers the `"change"` event.
    * @param {Number} firstRow The first row to be removed
    * @param {Number} lastRow The last row to be removed
    * @returns {[String]} Returns all the removed lines.
    *
    **/
  def removeFullLines(firstRow: scala.Double, lastRow: scala.Double): js.Array[java.lang.String]
  /**
    * Removes the specified columns from the `row`. This method also triggers the `'change'` event.
    * @param row The row to remove from
    * @param startColumn The column to start removing at
    * @param endColumn The column to stop removing at
    **/
  def removeInLine(row: scala.Double, startColumn: scala.Double, endColumn: scala.Double): js.Any
  /**
    * @deprecated Use the removeFullLines method instead.
    */
  def removeLines(firstRow: scala.Double, lastRow: scala.Double): js.Array[java.lang.String]
  /**
    * Removes the new line between `row` and the row immediately following it. This method also triggers the `'change'` event.
    * @param row The row to check
    **/
  def removeNewLine(row: scala.Double): scala.Unit
  /**
    * Replaces a range in the document with the new `text`.
    * @param range A specified Range to replace
    * @param text The new text to use as a replacement
    **/
  def replace(range: Range, text: java.lang.String): js.Any
  /**
    * Reverts any changes previously applied. These can be either `'includeText'`, `'insertLines'`, `'removeText'`, and `'removeLines'`.
    **/
  def revertDeltas(deltas: js.Array[Delta]): scala.Unit
  /**
    * [Sets the new line mode.]{: #Document.setNewLineMode.desc}
    * @param newLineMode [The newline mode to use; can be either `windows`, `unix`, or `auto`]{: #Document.setNewLineMode.param}
    **/
  def setNewLineMode(newLineMode: java.lang.String): scala.Unit
  /**
    * Replaces all the lines in the current `Document` with the value of `text`.
    * @param text The text to use
    **/
  def setValue(text: java.lang.String): scala.Unit
}

object Document {
  @scala.inline
  def apply(
    applyDeltas: js.Function1[js.Array[Delta], scala.Unit],
    createAnchor: js.Function2[scala.Double, scala.Double, scala.Unit],
    getAllLines: js.Function0[js.Array[java.lang.String]],
    getLength: js.Function0[scala.Double],
    getLine: js.Function1[scala.Double, java.lang.String],
    getLines: js.Function2[scala.Double, scala.Double, js.Array[java.lang.String]],
    getNewLineCharacter: js.Function0[java.lang.String],
    getNewLineMode: js.Function0[java.lang.String],
    getTextRange: js.Function1[Range, java.lang.String],
    getValue: js.Function0[java.lang.String],
    indexToPosition: js.Function2[scala.Double, scala.Double, Position],
    insert: js.Function2[Position, java.lang.String, js.Any],
    insertFullLines: js.Function2[scala.Double, js.Array[java.lang.String], js.Any],
    insertInLine: js.Function2[js.Any, java.lang.String, js.Any],
    insertLines: js.Function2[scala.Double, js.Array[java.lang.String], js.Any],
    insertMergedLines: js.Function2[scala.Double, js.Array[java.lang.String], js.Any],
    insertNewLine: js.Function1[Position, js.Any],
    isNewLine: js.Function1[java.lang.String, scala.Boolean],
    on: js.Function2[java.lang.String, js.Function1[/* e */ js.Any, _], scala.Unit],
    positionToIndex: js.Function2[Position, scala.Double, scala.Double],
    remove: js.Function1[Range, js.Any],
    removeFullLines: js.Function2[scala.Double, scala.Double, js.Array[java.lang.String]],
    removeInLine: js.Function3[scala.Double, scala.Double, scala.Double, js.Any],
    removeLines: js.Function2[scala.Double, scala.Double, js.Array[java.lang.String]],
    removeNewLine: js.Function1[scala.Double, scala.Unit],
    replace: js.Function2[Range, java.lang.String, js.Any],
    revertDeltas: js.Function1[js.Array[Delta], scala.Unit],
    setNewLineMode: js.Function1[java.lang.String, scala.Unit],
    setValue: js.Function1[java.lang.String, scala.Unit]
  ): Document = {
    val __obj = js.Dynamic.literal(applyDeltas = applyDeltas, createAnchor = createAnchor, getAllLines = getAllLines, getLength = getLength, getLine = getLine, getLines = getLines, getNewLineCharacter = getNewLineCharacter, getNewLineMode = getNewLineMode, getTextRange = getTextRange, getValue = getValue, indexToPosition = indexToPosition, insert = insert, insertFullLines = insertFullLines, insertInLine = insertInLine, insertLines = insertLines, insertMergedLines = insertMergedLines, insertNewLine = insertNewLine, isNewLine = isNewLine, on = on, positionToIndex = positionToIndex, remove = remove, removeFullLines = removeFullLines, removeInLine = removeInLine, removeLines = removeLines, removeNewLine = removeNewLine, replace = replace, revertDeltas = revertDeltas, setNewLineMode = setNewLineMode, setValue = setValue)
  
    __obj.asInstanceOf[Document]
  }
}

