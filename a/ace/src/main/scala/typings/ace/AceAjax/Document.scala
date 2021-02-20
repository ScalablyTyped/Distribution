package typings.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends StObject {
  
  /**
    * Applies all the changes previously accumulated. These can be either `'includeText'`, `'insertLines'`, `'removeText'`, and `'removeLines'`.
    **/
  def applyDeltas(deltas: js.Array[Delta]): Unit = js.native
  
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
  
  /**
    * Returns the newline character that's being used, depending on the value of `newLineMode`.
    **/
  def getNewLineCharacter(): String = js.native
  
  /**
    * [Returns the type of newlines being used; either `windows`, `unix`, or `auto`]{: #Document.getNewLineMode}
    **/
  def getNewLineMode(): String = js.native
  
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
  def insert(position: Position, text: String): js.Any = js.native
  
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
  def insertFullLines(row: Double, lines: js.Array[String]): js.Any = js.native
  
  /**
    * Inserts `text` into the `position` at the current row. This method also triggers the `'change'` event.
    * @param position The position to insert at
    * @param text A chunk of text
    **/
  def insertInLine(position: js.Any, text: String): js.Any = js.native
  
  /**
    * @deprecated Use the insertFullLines method instead.
    */
  def insertLines(row: Double, lines: js.Array[String]): js.Any = js.native
  
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
  def insertMergedLines(row: Double, lines: js.Array[String]): js.Any = js.native
  
  /**
    * @deprecated Use insertMergedLines(position, ['', '']) instead.
    */
  def insertNewLine(position: Position): js.Any = js.native
  
  /**
    * Returns `true` if `text` is a newline character (either `\r\n`, `\r`, or `\n`).
    * @param text The text to check
    **/
  def isNewLine(text: String): Boolean = js.native
  
  def on(event: String, fn: js.Function1[/* e */ js.Any, _]): Unit = js.native
  
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
  def positionToIndex(pos: Position, startRow: Double): Double = js.native
  
  /**
    * Removes the `range` from the document.
    * @param range A specified Range to remove
    **/
  def remove(range: Range): js.Any = js.native
  
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
  def removeInLine(row: Double, startColumn: Double, endColumn: Double): js.Any = js.native
  
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
  def replace(range: Range, text: String): js.Any = js.native
  
  /**
    * Reverts any changes previously applied. These can be either `'includeText'`, `'insertLines'`, `'removeText'`, and `'removeLines'`.
    **/
  def revertDeltas(deltas: js.Array[Delta]): Unit = js.native
  
  /**
    * [Sets the new line mode.]{: #Document.setNewLineMode.desc}
    * @param newLineMode [The newline mode to use; can be either `windows`, `unix`, or `auto`]{: #Document.setNewLineMode.param}
    **/
  def setNewLineMode(newLineMode: String): Unit = js.native
  
  /**
    * Replaces all the lines in the current `Document` with the value of `text`.
    * @param text The text to use
    **/
  def setValue(text: String): Unit = js.native
}
object Document {
  
  @scala.inline
  def apply(
    applyDeltas: js.Array[Delta] => Unit,
    createAnchor: (Double, Double) => Unit,
    getAllLines: () => js.Array[String],
    getLength: () => Double,
    getLine: Double => String,
    getLines: (Double, Double) => js.Array[String],
    getNewLineCharacter: () => String,
    getNewLineMode: () => String,
    getTextRange: Range => String,
    getValue: () => String,
    indexToPosition: (Double, Double) => Position,
    insert: (Position, String) => js.Any,
    insertFullLines: (Double, js.Array[String]) => js.Any,
    insertInLine: (js.Any, String) => js.Any,
    insertLines: (Double, js.Array[String]) => js.Any,
    insertMergedLines: (Double, js.Array[String]) => js.Any,
    insertNewLine: Position => js.Any,
    isNewLine: String => Boolean,
    on: (String, js.Function1[/* e */ js.Any, _]) => Unit,
    positionToIndex: (Position, Double) => Double,
    remove: Range => js.Any,
    removeFullLines: (Double, Double) => js.Array[String],
    removeInLine: (Double, Double, Double) => js.Any,
    removeLines: (Double, Double) => js.Array[String],
    removeNewLine: Double => Unit,
    replace: (Range, String) => js.Any,
    revertDeltas: js.Array[Delta] => Unit,
    setNewLineMode: String => Unit,
    setValue: String => Unit
  ): Document = {
    val __obj = js.Dynamic.literal(applyDeltas = js.Any.fromFunction1(applyDeltas), createAnchor = js.Any.fromFunction2(createAnchor), getAllLines = js.Any.fromFunction0(getAllLines), getLength = js.Any.fromFunction0(getLength), getLine = js.Any.fromFunction1(getLine), getLines = js.Any.fromFunction2(getLines), getNewLineCharacter = js.Any.fromFunction0(getNewLineCharacter), getNewLineMode = js.Any.fromFunction0(getNewLineMode), getTextRange = js.Any.fromFunction1(getTextRange), getValue = js.Any.fromFunction0(getValue), indexToPosition = js.Any.fromFunction2(indexToPosition), insert = js.Any.fromFunction2(insert), insertFullLines = js.Any.fromFunction2(insertFullLines), insertInLine = js.Any.fromFunction2(insertInLine), insertLines = js.Any.fromFunction2(insertLines), insertMergedLines = js.Any.fromFunction2(insertMergedLines), insertNewLine = js.Any.fromFunction1(insertNewLine), isNewLine = js.Any.fromFunction1(isNewLine), on = js.Any.fromFunction2(on), positionToIndex = js.Any.fromFunction2(positionToIndex), remove = js.Any.fromFunction1(remove), removeFullLines = js.Any.fromFunction2(removeFullLines), removeInLine = js.Any.fromFunction3(removeInLine), removeLines = js.Any.fromFunction2(removeLines), removeNewLine = js.Any.fromFunction1(removeNewLine), replace = js.Any.fromFunction2(replace), revertDeltas = js.Any.fromFunction1(revertDeltas), setNewLineMode = js.Any.fromFunction1(setNewLineMode), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[Document]
  }
  
  @scala.inline
  implicit class DocumentMutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyDeltas(value: js.Array[Delta] => Unit): Self = StObject.set(x, "applyDeltas", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateAnchor(value: (Double, Double) => Unit): Self = StObject.set(x, "createAnchor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetAllLines(value: () => js.Array[String]): Self = StObject.set(x, "getAllLines", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLine(value: Double => String): Self = StObject.set(x, "getLine", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLines(value: (Double, Double) => js.Array[String]): Self = StObject.set(x, "getLines", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetNewLineCharacter(value: () => String): Self = StObject.set(x, "getNewLineCharacter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNewLineMode(value: () => String): Self = StObject.set(x, "getNewLineMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTextRange(value: Range => String): Self = StObject.set(x, "getTextRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndexToPosition(value: (Double, Double) => Position): Self = StObject.set(x, "indexToPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsert(value: (Position, String) => js.Any): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertFullLines(value: (Double, js.Array[String]) => js.Any): Self = StObject.set(x, "insertFullLines", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertInLine(value: (js.Any, String) => js.Any): Self = StObject.set(x, "insertInLine", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertLines(value: (Double, js.Array[String]) => js.Any): Self = StObject.set(x, "insertLines", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertMergedLines(value: (Double, js.Array[String]) => js.Any): Self = StObject.set(x, "insertMergedLines", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertNewLine(value: Position => js.Any): Self = StObject.set(x, "insertNewLine", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsNewLine(value: String => Boolean): Self = StObject.set(x, "isNewLine", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOn(value: (String, js.Function1[/* e */ js.Any, _]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPositionToIndex(value: (Position, Double) => Double): Self = StObject.set(x, "positionToIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemove(value: Range => js.Any): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveFullLines(value: (Double, Double) => js.Array[String]): Self = StObject.set(x, "removeFullLines", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveInLine(value: (Double, Double, Double) => js.Any): Self = StObject.set(x, "removeInLine", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemoveLines(value: (Double, Double) => js.Array[String]): Self = StObject.set(x, "removeLines", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveNewLine(value: Double => Unit): Self = StObject.set(x, "removeNewLine", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplace(value: (Range, String) => js.Any): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRevertDeltas(value: js.Array[Delta] => Unit): Self = StObject.set(x, "revertDeltas", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNewLineMode(value: String => Unit): Self = StObject.set(x, "setNewLineMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValue(value: String => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
  }
}
