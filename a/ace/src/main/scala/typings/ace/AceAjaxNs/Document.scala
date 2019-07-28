package typings.ace.AceAjaxNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  /**
    * Applies all the changes previously accumulated. These can be either `'includeText'`, `'insertLines'`, `'removeText'`, and `'removeLines'`.
    **/
  def applyDeltas(deltas: js.Array[Delta]): Unit
  /**
    * Creates a new `Anchor` to define a floating point in the document.
    * @param row The row number to use
    * @param column The column number to use
    **/
  def createAnchor(row: Double, column: Double): Unit
  /**
    * Returns all lines in the document as string array. Warning: The caller should not modify this array!
    **/
  def getAllLines(): js.Array[String]
  /**
    * Returns the number of rows in the document.
    **/
  def getLength(): Double
  /**
    * Returns a verbatim copy of the given line as it is in the document
    * @param row The row index to retrieve
    **/
  def getLine(row: Double): String
  /**
    * Returns an array of strings of the rows between `firstRow` and `lastRow`. This function is inclusive of `lastRow`.
    * @param firstRow The first row index to retrieve
    * @param lastRow The final row index to retrieve
    **/
  def getLines(firstRow: Double, lastRow: Double): js.Array[String]
  /**
    * Returns the newline character that's being used, depending on the value of `newLineMode`.
    **/
  def getNewLineCharacter(): String
  /**
    * [Returns the type of newlines being used; either `windows`, `unix`, or `auto`]{: #Document.getNewLineMode}
    **/
  def getNewLineMode(): String
  /**
    * [Given a range within the document, this function returns all the text within that range as a single string.]{: #Document.getTextRange.desc}
    * @param range The range to work with
    **/
  def getTextRange(range: Range): String
  /**
    * Returns all the lines in the document as a single string, split by the new line character.
    **/
  def getValue(): String
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
  def indexToPosition(index: Double, startRow: Double): Position
  /**
    * Inserts a block of `text` and the indicated `position`.
    * @param position The position to start inserting at
    * @param text A chunk of text to insert
    **/
  def insert(position: Position, text: String): js.Any
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
  def insertFullLines(row: Double, lines: js.Array[String]): js.Any
  /**
    * Inserts `text` into the `position` at the current row. This method also triggers the `'change'` event.
    * @param position The position to insert at
    * @param text A chunk of text
    **/
  def insertInLine(position: js.Any, text: String): js.Any
  /**
    * @deprecated Use the insertFullLines method instead.
    */
  def insertLines(row: Double, lines: js.Array[String]): js.Any
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
  def insertMergedLines(row: Double, lines: js.Array[String]): js.Any
  /**
    * @deprecated Use insertMergedLines(position, ['', '']) instead.
    */
  def insertNewLine(position: Position): js.Any
  /**
    * Returns `true` if `text` is a newline character (either `\r\n`, `\r`, or `\n`).
    * @param text The text to check
    **/
  def isNewLine(text: String): Boolean
  def on(event: String, fn: js.Function1[/* e */ js.Any, _]): Unit
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
  def positionToIndex(pos: Position, startRow: Double): Double
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
  def removeFullLines(firstRow: Double, lastRow: Double): js.Array[String]
  /**
    * Removes the specified columns from the `row`. This method also triggers the `'change'` event.
    * @param row The row to remove from
    * @param startColumn The column to start removing at
    * @param endColumn The column to stop removing at
    **/
  def removeInLine(row: Double, startColumn: Double, endColumn: Double): js.Any
  /**
    * @deprecated Use the removeFullLines method instead.
    */
  def removeLines(firstRow: Double, lastRow: Double): js.Array[String]
  /**
    * Removes the new line between `row` and the row immediately following it. This method also triggers the `'change'` event.
    * @param row The row to check
    **/
  def removeNewLine(row: Double): Unit
  /**
    * Replaces a range in the document with the new `text`.
    * @param range A specified Range to replace
    * @param text The new text to use as a replacement
    **/
  def replace(range: Range, text: String): js.Any
  /**
    * Reverts any changes previously applied. These can be either `'includeText'`, `'insertLines'`, `'removeText'`, and `'removeLines'`.
    **/
  def revertDeltas(deltas: js.Array[Delta]): Unit
  /**
    * [Sets the new line mode.]{: #Document.setNewLineMode.desc}
    * @param newLineMode [The newline mode to use; can be either `windows`, `unix`, or `auto`]{: #Document.setNewLineMode.param}
    **/
  def setNewLineMode(newLineMode: String): Unit
  /**
    * Replaces all the lines in the current `Document` with the value of `text`.
    * @param text The text to use
    **/
  def setValue(text: String): Unit
}

@JSGlobal("AceAjax.Document")
@js.native
/**
  * Creates a new `Document`. If `text` is included, the `Document` contains those strings; otherwise, it's empty.
  * @param text The starting text
  **/
class DocumentCls () extends Document {
  def this(text: String) = this()
  def this(text: js.Array[String]) = this()
  /**
    * Applies all the changes previously accumulated. These can be either `'includeText'`, `'insertLines'`, `'removeText'`, and `'removeLines'`.
    **/
  /* CompleteClass */
  override def applyDeltas(deltas: js.Array[Delta]): Unit = js.native
  /**
    * Creates a new `Anchor` to define a floating point in the document.
    * @param row The row number to use
    * @param column The column number to use
    **/
  /* CompleteClass */
  override def createAnchor(row: Double, column: Double): Unit = js.native
  /**
    * Returns all lines in the document as string array. Warning: The caller should not modify this array!
    **/
  /* CompleteClass */
  override def getAllLines(): js.Array[String] = js.native
  /**
    * Returns the number of rows in the document.
    **/
  /* CompleteClass */
  override def getLength(): Double = js.native
  /**
    * Returns a verbatim copy of the given line as it is in the document
    * @param row The row index to retrieve
    **/
  /* CompleteClass */
  override def getLine(row: Double): String = js.native
  /**
    * Returns an array of strings of the rows between `firstRow` and `lastRow`. This function is inclusive of `lastRow`.
    * @param firstRow The first row index to retrieve
    * @param lastRow The final row index to retrieve
    **/
  /* CompleteClass */
  override def getLines(firstRow: Double, lastRow: Double): js.Array[String] = js.native
  /**
    * Returns the newline character that's being used, depending on the value of `newLineMode`.
    **/
  /* CompleteClass */
  override def getNewLineCharacter(): String = js.native
  /**
    * [Returns the type of newlines being used; either `windows`, `unix`, or `auto`]{: #Document.getNewLineMode}
    **/
  /* CompleteClass */
  override def getNewLineMode(): String = js.native
  /**
    * [Given a range within the document, this function returns all the text within that range as a single string.]{: #Document.getTextRange.desc}
    * @param range The range to work with
    **/
  /* CompleteClass */
  override def getTextRange(range: Range): String = js.native
  /**
    * Returns all the lines in the document as a single string, split by the new line character.
    **/
  /* CompleteClass */
  override def getValue(): String = js.native
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
  override def indexToPosition(index: Double, startRow: Double): Position = js.native
  /**
    * Inserts a block of `text` and the indicated `position`.
    * @param position The position to start inserting at
    * @param text A chunk of text to insert
    **/
  /* CompleteClass */
  override def insert(position: Position, text: String): js.Any = js.native
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
  override def insertFullLines(row: Double, lines: js.Array[String]): js.Any = js.native
  /**
    * Inserts `text` into the `position` at the current row. This method also triggers the `'change'` event.
    * @param position The position to insert at
    * @param text A chunk of text
    **/
  /* CompleteClass */
  override def insertInLine(position: js.Any, text: String): js.Any = js.native
  /**
    * @deprecated Use the insertFullLines method instead.
    */
  /* CompleteClass */
  override def insertLines(row: Double, lines: js.Array[String]): js.Any = js.native
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
  override def insertMergedLines(row: Double, lines: js.Array[String]): js.Any = js.native
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
  override def isNewLine(text: String): Boolean = js.native
  /* CompleteClass */
  override def on(event: String, fn: js.Function1[/* e */ js.Any, _]): Unit = js.native
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
  override def positionToIndex(pos: Position, startRow: Double): Double = js.native
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
  override def removeFullLines(firstRow: Double, lastRow: Double): js.Array[String] = js.native
  /**
    * Removes the specified columns from the `row`. This method also triggers the `'change'` event.
    * @param row The row to remove from
    * @param startColumn The column to start removing at
    * @param endColumn The column to stop removing at
    **/
  /* CompleteClass */
  override def removeInLine(row: Double, startColumn: Double, endColumn: Double): js.Any = js.native
  /**
    * @deprecated Use the removeFullLines method instead.
    */
  /* CompleteClass */
  override def removeLines(firstRow: Double, lastRow: Double): js.Array[String] = js.native
  /**
    * Removes the new line between `row` and the row immediately following it. This method also triggers the `'change'` event.
    * @param row The row to check
    **/
  /* CompleteClass */
  override def removeNewLine(row: Double): Unit = js.native
  /**
    * Replaces a range in the document with the new `text`.
    * @param range A specified Range to replace
    * @param text The new text to use as a replacement
    **/
  /* CompleteClass */
  override def replace(range: Range, text: String): js.Any = js.native
  /**
    * Reverts any changes previously applied. These can be either `'includeText'`, `'insertLines'`, `'removeText'`, and `'removeLines'`.
    **/
  /* CompleteClass */
  override def revertDeltas(deltas: js.Array[Delta]): Unit = js.native
  /**
    * [Sets the new line mode.]{: #Document.setNewLineMode.desc}
    * @param newLineMode [The newline mode to use; can be either `windows`, `unix`, or `auto`]{: #Document.setNewLineMode.param}
    **/
  /* CompleteClass */
  override def setNewLineMode(newLineMode: String): Unit = js.native
  /**
    * Replaces all the lines in the current `Document` with the value of `text`.
    * @param text The text to use
    **/
  /* CompleteClass */
  override def setValue(text: String): Unit = js.native
}

@JSGlobal("AceAjax.Document")
@js.native
object Document
  extends /**
  * Creates a new `Document`. If `text` is included, the `Document` contains those strings; otherwise, it's empty.
  * @param text The starting text
  **/
Instantiable0[Document]
     with Instantiable1[(/* text */ js.Array[String]) | (/* text */ String), Document]

