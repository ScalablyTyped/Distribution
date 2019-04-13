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

@JSGlobal("AceAjax.Document")
@js.native
/**
  * Creates a new `Document`. If `text` is included, the `Document` contains those strings; otherwise, it's empty.
  * @param text The starting text
  **/
class DocumentCls () extends Document {
  def this(text: java.lang.String) = this()
  def this(text: js.Array[java.lang.String]) = this()
  /**
    * Applies all the changes previously accumulated. These can be either `'includeText'`, `'insertLines'`, `'removeText'`, and `'removeLines'`.
    **/
  /* CompleteClass */
  override def applyDeltas(deltas: js.Array[Delta]): scala.Unit = js.native
  /**
    * Creates a new `Anchor` to define a floating point in the document.
    * @param row The row number to use
    * @param column The column number to use
    **/
  /* CompleteClass */
  override def createAnchor(row: scala.Double, column: scala.Double): scala.Unit = js.native
  /**
    * Returns all lines in the document as string array. Warning: The caller should not modify this array!
    **/
  /* CompleteClass */
  override def getAllLines(): js.Array[java.lang.String] = js.native
  /**
    * Returns the number of rows in the document.
    **/
  /* CompleteClass */
  override def getLength(): scala.Double = js.native
  /**
    * Returns a verbatim copy of the given line as it is in the document
    * @param row The row index to retrieve
    **/
  /* CompleteClass */
  override def getLine(row: scala.Double): java.lang.String = js.native
  /**
    * Returns an array of strings of the rows between `firstRow` and `lastRow`. This function is inclusive of `lastRow`.
    * @param firstRow The first row index to retrieve
    * @param lastRow The final row index to retrieve
    **/
  /* CompleteClass */
  override def getLines(firstRow: scala.Double, lastRow: scala.Double): js.Array[java.lang.String] = js.native
  /**
    * Returns the newline character that's being used, depending on the value of `newLineMode`.
    **/
  /* CompleteClass */
  override def getNewLineCharacter(): java.lang.String = js.native
  /**
    * [Returns the type of newlines being used; either `windows`, `unix`, or `auto`]{: #Document.getNewLineMode}
    **/
  /* CompleteClass */
  override def getNewLineMode(): java.lang.String = js.native
  /**
    * [Given a range within the document, this function returns all the text within that range as a single string.]{: #Document.getTextRange.desc}
    * @param range The range to work with
    **/
  /* CompleteClass */
  override def getTextRange(range: Range): java.lang.String = js.native
  /**
    * Returns all the lines in the document as a single string, split by the new line character.
    **/
  /* CompleteClass */
  override def getValue(): java.lang.String = js.native
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
  /* CompleteClass */
  override def indexToPosition(index: scala.Double, startRow: scala.Double): Position = js.native
  /**
    * Inserts a block of `text` and the indicated `position`.
    * @param position The position to start inserting at
    * @param text A chunk of text to insert
    **/
  /* CompleteClass */
  override def insert(position: Position, text: java.lang.String): js.Any = js.native
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
  /* CompleteClass */
  override def insertFullLines(row: scala.Double, lines: js.Array[java.lang.String]): js.Any = js.native
  /**
    * Inserts `text` into the `position` at the current row. This method also triggers the `'change'` event.
    * @param position The position to insert at
    * @param text A chunk of text
    **/
  /* CompleteClass */
  override def insertInLine(position: js.Any, text: java.lang.String): js.Any = js.native
  /**
    * @deprecated Use the insertFullLines method instead.
    */
  /* CompleteClass */
  override def insertLines(row: scala.Double, lines: js.Array[java.lang.String]): js.Any = js.native
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
  /* CompleteClass */
  override def insertMergedLines(row: scala.Double, lines: js.Array[java.lang.String]): js.Any = js.native
  /**
    * @deprecated Use insertMergedLines(position, ['', '']) instead.
    */
  /* CompleteClass */
  override def insertNewLine(position: Position): js.Any = js.native
  /**
    * Returns `true` if `text` is a newline character (either `\r\n`, `\r`, or `\n`).
    * @param text The text to check
    **/
  /* CompleteClass */
  override def isNewLine(text: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def on(event: java.lang.String, fn: js.Function1[/* e */ js.Any, _]): scala.Unit = js.native
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
  /* CompleteClass */
  override def positionToIndex(pos: Position, startRow: scala.Double): scala.Double = js.native
  /**
    * Removes the `range` from the document.
    * @param range A specified Range to remove
    **/
  /* CompleteClass */
  override def remove(range: Range): js.Any = js.native
  /**
    * Removes a range of full lines. This method also triggers the `"change"` event.
    * @param {Number} firstRow The first row to be removed
    * @param {Number} lastRow The last row to be removed
    * @returns {[String]} Returns all the removed lines.
    *
    **/
  /* CompleteClass */
  override def removeFullLines(firstRow: scala.Double, lastRow: scala.Double): js.Array[java.lang.String] = js.native
  /**
    * Removes the specified columns from the `row`. This method also triggers the `'change'` event.
    * @param row The row to remove from
    * @param startColumn The column to start removing at
    * @param endColumn The column to stop removing at
    **/
  /* CompleteClass */
  override def removeInLine(row: scala.Double, startColumn: scala.Double, endColumn: scala.Double): js.Any = js.native
  /**
    * @deprecated Use the removeFullLines method instead.
    */
  /* CompleteClass */
  override def removeLines(firstRow: scala.Double, lastRow: scala.Double): js.Array[java.lang.String] = js.native
  /**
    * Removes the new line between `row` and the row immediately following it. This method also triggers the `'change'` event.
    * @param row The row to check
    **/
  /* CompleteClass */
  override def removeNewLine(row: scala.Double): scala.Unit = js.native
  /**
    * Replaces a range in the document with the new `text`.
    * @param range A specified Range to replace
    * @param text The new text to use as a replacement
    **/
  /* CompleteClass */
  override def replace(range: Range, text: java.lang.String): js.Any = js.native
  /**
    * Reverts any changes previously applied. These can be either `'includeText'`, `'insertLines'`, `'removeText'`, and `'removeLines'`.
    **/
  /* CompleteClass */
  override def revertDeltas(deltas: js.Array[Delta]): scala.Unit = js.native
  /**
    * [Sets the new line mode.]{: #Document.setNewLineMode.desc}
    * @param newLineMode [The newline mode to use; can be either `windows`, `unix`, or `auto`]{: #Document.setNewLineMode.param}
    **/
  /* CompleteClass */
  override def setNewLineMode(newLineMode: java.lang.String): scala.Unit = js.native
  /**
    * Replaces all the lines in the current `Document` with the value of `text`.
    * @param text The text to use
    **/
  /* CompleteClass */
  override def setValue(text: java.lang.String): scala.Unit = js.native
}

@JSGlobal("AceAjax.Document")
@js.native
object Document
  extends /**
  * Creates a new `Document`. If `text` is included, the `Document` contains those strings; otherwise, it's empty.
  * @param text The starting text
  **/
org.scalablytyped.runtime.Instantiable0[Document]
     with org.scalablytyped.runtime.Instantiable1[(/* text */ js.Array[java.lang.String]) | (/* text */ java.lang.String), Document]

