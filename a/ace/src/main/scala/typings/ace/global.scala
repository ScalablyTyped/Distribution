package typings.ace

import typings.ace.AceAjax.Ace
import typings.ace.AceAjax.Anchor
import typings.ace.AceAjax.BackgroundTokenizer
import typings.ace.AceAjax.Delta
import typings.ace.AceAjax.Document
import typings.ace.AceAjax.Editor
import typings.ace.AceAjax.IEditSession
import typings.ace.AceAjax.IRangeList
import typings.ace.AceAjax.PlaceHolder
import typings.ace.AceAjax.Position
import typings.ace.AceAjax.Range
import typings.ace.AceAjax.RenderLoop
import typings.ace.AceAjax.ScrollBar
import typings.ace.AceAjax.Search
import typings.ace.AceAjax.Selection
import typings.ace.AceAjax.Split
import typings.ace.AceAjax.TextMode
import typings.ace.AceAjax.TokenInfo
import typings.ace.AceAjax.TokenIterator
import typings.ace.AceAjax.Tokenizer
import typings.ace.AceAjax.UndoManager
import typings.ace.AceAjax.VirtualRenderer
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AceAjax {
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.Anchor")
    @js.native
    class AnchorCls protected ()
      extends StObject
         with Anchor {
      /**
        * Creates a new `Anchor` and associates it with a document.
        * @param doc The document to associate with the anchor
        * @param row The starting row position
        * @param column The starting column position
        **/
      def this(doc: Document, row: Double, column: Double) = this()
      
      /**
        * When called, the `'change'` event listener is removed.
        **/
      /* CompleteClass */
      override def detach(): Unit = js.native
      
      /**
        * Returns the current document.
        **/
      /* CompleteClass */
      override def getDocument(): Document = js.native
      
      /**
        * Returns an object identifying the `row` and `column` position of the current anchor.
        **/
      /* CompleteClass */
      override def getPosition(): Position = js.native
      
      /* CompleteClass */
      override def on(event: String, fn: js.Function1[/* e */ js.Any, js.Any]): Unit = js.native
      
      /**
        * Fires whenever the anchor position changes.
        * Both of these objects have a `row` and `column` property corresponding to the position.
        * Events that can trigger this function include [[Anchor.setPosition `setPosition()`]].
        * @param e An object containing information about the anchor position. It has two properties:
        * - `old`: An object describing the old Anchor position
        * - `value`: An object describing the new Anchor position
        **/
      /* CompleteClass */
      override def onChange(e: js.Any): Unit = js.native
      
      /**
        * Sets the anchor position to the specified row and column. If `noClip` is `true`, the position is not clipped.
        * @param row The row index to move the anchor to
        * @param column The column index to move the anchor to
        * @param noClip Identifies if you want the position to be clipped
        **/
      /* CompleteClass */
      override def setPosition(row: Double, column: Double, noClip: Boolean): Unit = js.native
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.BackgroundTokenizer")
    @js.native
    class BackgroundTokenizerCls protected ()
      extends StObject
         with BackgroundTokenizer {
      /**
        * Creates a new `BackgroundTokenizer` object.
        * @param tokenizer The tokenizer to use
        * @param editor The editor to associate with
        **/
      def this(tokenizer: Tokenizer, editor: Editor) = this()
      
      /**
        * Emits the `'update'` event. `firstRow` and `lastRow` are used to define the boundaries of the region to be updated.
        * @param firstRow The starting row region
        * @param lastRow The final row region
        **/
      /* CompleteClass */
      override def fireUpdateEvent(firstRow: Double, lastRow: Double): Unit = js.native
      
      /**
        * [Returns the state of tokenization at the end of a row.]{: #BackgroundTokenizer.getState}
        * @param row The row to get state at
        **/
      /* CompleteClass */
      override def getState(row: Double): String = js.native
      
      /**
        * Gives list of tokens of the row. (tokens are cached)
        * @param row The row to get tokens at
        **/
      /* CompleteClass */
      override def getTokens(row: Double): js.Array[TokenInfo] = js.native
      
      /**
        * Sets a new document to associate with this object.
        * @param doc The new document to associate with
        **/
      /* CompleteClass */
      override def setDocument(doc: Document): Unit = js.native
      
      /**
        * Sets a new tokenizer for this object.
        * @param tokenizer The new tokenizer to use
        **/
      /* CompleteClass */
      override def setTokenizer(tokenizer: Tokenizer): Unit = js.native
      
      /**
        * Starts tokenizing at the row indicated.
        * @param startRow The row to start at
        **/
      /* CompleteClass */
      override def start(startRow: Double): Unit = js.native
      
      /* CompleteClass */
      var states: js.Array[js.Any] = js.native
      
      /**
        * Stops tokenizing.
        **/
      /* CompleteClass */
      override def stop(): Unit = js.native
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.Document")
    @js.native
    /**
      * Creates a new `Document`. If `text` is included, the `Document` contains those strings; otherwise, it's empty.
      * @param text The starting text
      **/
    class DocumentCls ()
      extends StObject
         with Document {
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
      override def on(event: String, fn: js.Function1[/* e */ js.Any, js.Any]): Unit = js.native
      
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
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("AceAjax.EditSession")
    @js.native
    class EditSession protected ()
      extends StObject
         with IEditSession {
      /**
        * Sets up a new `EditSession` and associates it with the given `Document` and `TextMode`.
        * @param text [If `text` is a `Document`, it associates the `EditSession` with it. Otherwise, a new `Document` is created, with the initial text]{: #textParam}
        * @param mode [The inital language mode to use for the document]{: #modeParam}
        **/
      def this(text: String) = this()
      def this(text: js.Array[String]) = this()
      def this(content: String, mode: String) = this()
      def this(text: String, mode: TextMode) = this()
      def this(text: js.Array[String], mode: String) = this()
      
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
        * Sets a Configuration Option
        **/
      /* CompleteClass */
      override def setOption(optionName: String, optionValue: js.Any): Unit = js.native
      
      /**
        * Sets Configuration Options
        **/
      /* CompleteClass */
      override def setOptions(keyValueTuples: js.Any): Unit = js.native
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.Editor")
    @js.native
    class EditorCls protected ()
      extends StObject
         with Editor {
      /**
        * Creates a new `Editor` object.
        * @param renderer Associated `VirtualRenderer` that draws everything
        * @param session The `EditSession` to refer to
        **/
      def this(renderer: VirtualRenderer) = this()
      def this(renderer: VirtualRenderer, session: IEditSession) = this()
      
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
        * Sets a Configuration Option
        **/
      /* CompleteClass */
      override def setOption(optionName: String, optionValue: js.Any): Unit = js.native
      
      /**
        * Sets Configuration Options
        **/
      /* CompleteClass */
      override def setOptions(keyValueTuples: js.Any): Unit = js.native
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.PlaceHolder")
    @js.native
    class PlaceHolderCls protected ()
      extends StObject
         with PlaceHolder {
      def this(session: IEditSession, length: Double, pos: Position, positions: js.Array[Position]) = this()
      /**
        * - @param session (Document): The document to associate with the anchor
        * - @param length (Number): The starting row position
        * - @param pos (Number): The starting column position
        * - @param others (String):
        * - @param mainClass (String):
        * - @param othersClass (String):
        **/
      def this(
        session: Document,
        length: Double,
        pos: Double,
        others: String,
        mainClass: String,
        othersClass: String
      ) = this()
      
      /**
        * PlaceHolder.cancel()
        * TODO
        **/
      /* CompleteClass */
      override def cancel(): Unit = js.native
      
      /**
        * PlaceHolder.detach()
        * TODO
        **/
      /* CompleteClass */
      override def detach(): Unit = js.native
      
      /**
        * PlaceHolder.hideOtherMarkers()
        * Hides all over markers in the [[EditSession `EditSession`]] that are not the currently selected one.
        **/
      /* CompleteClass */
      override def hideOtherMarkers(): Unit = js.native
      
      /* CompleteClass */
      override def on(event: String, fn: js.Function1[/* e */ js.Any, js.Any]): Unit = js.native
      
      /**
        * PlaceHolder@onCursorChange(e)
        * Emitted when the cursor changes.
        **/
      /* CompleteClass */
      override def onCursorChange(): Unit = js.native
      
      /**
        * PlaceHolder@onUpdate(e)
        * Emitted when the place holder updates.
        **/
      /* CompleteClass */
      override def onUpdate(): Unit = js.native
      
      /**
        * PlaceHolder.setup()
        * TODO
        **/
      /* CompleteClass */
      override def setup(): Unit = js.native
      
      /**
        * PlaceHolder.showOtherMarkers()
        * TODO
        **/
      /* CompleteClass */
      override def showOtherMarkers(): Unit = js.native
    }
    
    /**
      * Creates a new `Range` object with the given starting and ending row and column points.
      * @param startRow The starting row
      * @param startColumn The starting column
      * @param endRow The ending row
      * @param endColumn The ending column
      **/
    object Range {
      
      @JSGlobal("AceAjax.Range")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def fromPoints(pos1: Position, pos2: Position): typings.ace.AceAjax.Range = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(pos1.asInstanceOf[js.Any], pos2.asInstanceOf[js.Any])).asInstanceOf[typings.ace.AceAjax.Range]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.Range")
    @js.native
    class RangeCls protected ()
      extends StObject
         with Range {
      def this(startRow: Double, startColumn: Double, endRow: Double, endColumn: Double) = this()
      
      /**
        * Returns the part of the current `Range` that occurs within the boundaries of `firstRow` and `lastRow` as a new `Range` object.
        * @param firstRow The starting row
        * @param lastRow The ending row
        **/
      /* CompleteClass */
      override def clipRows(firstRow: Double, lastRow: Double): Range = js.native
      
      /**
        * Returns a range containing the starting and ending rows of the original range, but with a column value of `0`.
        **/
      /* CompleteClass */
      override def collapseRows(): Range = js.native
      
      /**
        * Checks the row and column points with the row and column points of the calling range.
        * @param row A row point to compare with
        * @param column A column point to compare with
        **/
      /* CompleteClass */
      override def compare(row: Double, column: Double): Double = js.native
      
      /**
        * Checks the row and column points with the row and column points of the calling range.
        * @param row A row point to compare with
        * @param column A column point to compare with
        **/
      /* CompleteClass */
      override def compareEnd(row: Double, column: Double): Double = js.native
      
      /**
        * Checks the row and column points with the row and column points of the calling range.
        * @param row A row point to compare with
        * @param column A column point to compare with
        **/
      /* CompleteClass */
      override def compareInside(row: Double, column: Double): Double = js.native
      
      /**
        * Checks the row and column points of `p` with the row and column points of the calling range.
        * @param p A point to compare with
        **/
      /* CompleteClass */
      override def comparePoint(p: Range): Double = js.native
      
      /**
        * Compares `this` range (A) with another range (B).
        * @param range A range to compare with
        **/
      /* CompleteClass */
      override def compareRange(range: Range): Double = js.native
      
      /**
        * Checks the row and column points with the row and column points of the calling range.
        * @param row A row point to compare with
        * @param column A column point to compare with
        **/
      /* CompleteClass */
      override def compareStart(row: Double, column: Double): Double = js.native
      
      /**
        * Returns `true` if the `row` and `column` provided are within the given range. This can better be expressed as returning `true` if:
        * ```javascript
        * this.start.row <= row <= this.end.row &&
        * this.start.column <= column <= this.end.column
        * ```
        * @param row A row to check for
        * @param column A column to check for
        **/
      /* CompleteClass */
      override def contains(row: Double, column: Double): Boolean = js.native
      
      /**
        * Checks the start and end points of `range` and compares them to the calling range. Returns `true` if the `range` is contained within the caller's range.
        * @param range A range to compare with
        **/
      /* CompleteClass */
      override def containsRange(range: Range): Boolean = js.native
      
      /* CompleteClass */
      var end: Position = js.native
      
      /* CompleteClass */
      var endColumn: Double = js.native
      
      /* CompleteClass */
      var endRow: Double = js.native
      
      /**
        * Changes the row and column points for the calling range for both the starting and ending points.
        * @param row A new row to extend to
        * @param column A new column to extend to
        **/
      /* CompleteClass */
      override def extend(row: Double, column: Double): Range = js.native
      
      /**
        * Creates and returns a new `Range` based on the row and column of the given parameters.
        * @param start A starting point to use
        * @param end An ending point to use
        **/
      /* CompleteClass */
      override def fromPoints(start: Range, end: Range): Range = js.native
      
      /**
        * Returns `true` if the `row` and `column` are within the given range.
        * @param row A row point to compare with
        * @param column A column point to compare with
        **/
      /* CompleteClass */
      override def inside(row: Double, column: Double): Boolean = js.native
      
      /**
        * Returns `true` if the `row` and `column` are within the given range's ending points.
        * @param row A row point to compare with
        * @param column A column point to compare with
        **/
      /* CompleteClass */
      override def insideEnd(row: Double, column: Double): Boolean = js.native
      
      /**
        * Returns `true` if the `row` and `column` are within the given range's starting points.
        * @param row A row point to compare with
        * @param column A column point to compare with
        **/
      /* CompleteClass */
      override def insideStart(row: Double, column: Double): Boolean = js.native
      
      /**
        * Returns `true` if passed in `range` intersects with the one calling this method.
        * @param range A range to compare with
        **/
      /* CompleteClass */
      override def intersects(range: Range): Boolean = js.native
      
      /* CompleteClass */
      override def isEmpty(): Boolean = js.native
      
      /**
        * Returns `true` if the caller's ending row point is the same as `row`, and if the caller's ending column is the same as `column`.
        * @param row A row point to compare with
        * @param column A column point to compare with
        **/
      /* CompleteClass */
      override def isEnd(row: Double, column: Double): Boolean = js.native
      
      /**
        * Returns `true` if and only if the starting row and column, and ending row and column, are equivalent to those given by `range`.
        * @param range A range to check against
        **/
      /* CompleteClass */
      override def isEqual(range: Range): Unit = js.native
      
      /**
        * Returns `true` if the range spans across multiple lines.
        **/
      /* CompleteClass */
      override def isMultiLine(): Boolean = js.native
      
      /**
        * Returns `true` if the caller's starting row point is the same as `row`, and if the caller's starting column is the same as `column`.
        * @param row A row point to compare with
        * @param column A column point to compare with
        **/
      /* CompleteClass */
      override def isStart(row: Double, column: Double): Boolean = js.native
      
      /**
        * Sets the starting row and column for the range.
        * @param row A row point to set
        * @param column A column point to set
        **/
      /* CompleteClass */
      override def setEnd(row: Double, column: Double): Unit = js.native
      
      /**
        * Sets the starting row and column for the range.
        * @param row A row point to set
        * @param column A column point to set
        **/
      /* CompleteClass */
      override def setStart(row: Double, column: Double): Unit = js.native
      
      /* CompleteClass */
      var start: Position = js.native
      
      /* CompleteClass */
      var startColumn: Double = js.native
      
      /* CompleteClass */
      var startRow: Double = js.native
      
      /**
        * Given the current `Range`, this function converts those starting and ending points into screen positions, and then returns a new `Range` object.
        * @param session The `EditSession` to retrieve coordinates from
        **/
      /* CompleteClass */
      override def toScreenRange(session: IEditSession): Range = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("AceAjax.RangeList")
    @js.native
    class RangeList ()
      extends StObject
         with IRangeList
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.RenderLoop")
    @js.native
    class RenderLoopCls ()
      extends StObject
         with RenderLoop
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.ScrollBar")
    @js.native
    class ScrollBarCls protected ()
      extends StObject
         with ScrollBar {
      /**
        * Creates a new `ScrollBar`. `parent` is the owner of the scroll bar.
        * @param parent A DOM element
        **/
      def this(parent: HTMLElement) = this()
      
      /**
        * Returns the width of the scroll bar.
        **/
      /* CompleteClass */
      override def getWidth(): Double = js.native
      
      /**
        * Emitted when the scroll bar, well, scrolls.
        * @param e Contains one property, `"data"`, which indicates the current scroll top position
        **/
      /* CompleteClass */
      override def onScroll(e: js.Any): Unit = js.native
      
      /**
        * Sets the height of the scroll bar, in pixels.
        * @param height The new height
        **/
      /* CompleteClass */
      override def setHeight(height: Double): Unit = js.native
      
      /**
        * Sets the inner height of the scroll bar, in pixels.
        * @param height The new inner height
        **/
      /* CompleteClass */
      override def setInnerHeight(height: Double): Unit = js.native
      
      /**
        * Sets the scroll top of the scroll bar.
        * @param scrollTop The new scroll top
        **/
      /* CompleteClass */
      override def setScrollTop(scrollTop: Double): Unit = js.native
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.Search")
    @js.native
    /**
      * Creates a new `Search` object. The following search options are avaliable:
      * - `needle`: The string or regular expression you're looking for
      * - `backwards`: Whether to search backwards from where cursor currently is. Defaults to `false`.
      * - `wrap`: Whether to wrap the search back to the beginning when it hits the end. Defaults to `false`.
      * - `caseSensitive`: Whether the search ought to be case-sensitive. Defaults to `false`.
      * - `wholeWord`: Whether the search matches only on whole words. Defaults to `false`.
      * - `range`: The [[Range]] to search within. Set this to `null` for the whole document
      * - `regExp`: Whether the search is a regular expression or not. Defaults to `false`.
      * - `start`: The starting [[Range]] or cursor position to begin the search
      * - `skipCurrent`: Whether or not to include the current line in the search. Default to `false`.
      **/
    class SearchCls ()
      extends StObject
         with Search {
      
      /**
        * Searches for `options.needle`. If found, this method returns the [[Range `Range`]] where the text first occurs. If `options.backwards` is `true`, the search goes backwards in the session.
        * @param session The session to search with
        **/
      /* CompleteClass */
      override def find(session: IEditSession): Range = js.native
      
      /**
        * Searches for all occurances `options.needle`. If found, this method returns an array of [[Range `Range`s]] where the text first occurs. If `options.backwards` is `true`, the search goes backwards in the session.
        * @param session The session to search with
        **/
      /* CompleteClass */
      override def findAll(session: IEditSession): js.Array[Range] = js.native
      
      /**
        * [Returns an object containing all the search options.]{: #Search.getOptions}
        **/
      /* CompleteClass */
      override def getOptions(): js.Any = js.native
      
      /**
        * Searches for `options.needle` in `input`, and, if found, replaces it with `replacement`.
        * @param input The text to search in
        * @param replacement The replacing text
        * + (String): If `options.regExp` is `true`, this function returns `input` with the replacement already made. Otherwise, this function just returns `replacement`.<br/>
        * If `options.needle` was not found, this function returns `null`.
        **/
      /* CompleteClass */
      override def replace(input: String, replacement: String): String = js.native
      
      /**
        * Sets the search options via the `options` parameter.
        * @param options An object containing all the new search properties
        **/
      /* CompleteClass */
      override def set(options: js.Any): Search = js.native
      
      /**
        * Sets the search options via the `options` parameter.
        * @param An object containing all the search propertie
        **/
      /* CompleteClass */
      override def setOptions(An: js.Any): Unit = js.native
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.Selection")
    @js.native
    class SelectionCls protected ()
      extends StObject
         with Selection {
      /**
        * Creates a new `Selection` object.
        * @param session The session to use
        **/
      def this(session: IEditSession) = this()
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.Split")
    @js.native
    class SplitCls ()
      extends StObject
         with Split {
      
      /**
        * Blurs the current editor.
        **/
      /* CompleteClass */
      override def blur(): Unit = js.native
      
      /**
        * Focuses the current editor.
        **/
      /* CompleteClass */
      override def focus(): Unit = js.native
      
      /**
        * Executes `callback` on all of the available editors.
        * @param callback A callback function to execute
        * @param scope The default scope for the callback
        **/
      /* CompleteClass */
      override def forEach(callback: js.Function, scope: String): Unit = js.native
      
      /**
        * Returns the current editor.
        **/
      /* CompleteClass */
      override def getCurrentEditor(): Editor = js.native
      
      /**
        * Returns the editor identified by the index `idx`.
        * @param idx The index of the editor you want
        **/
      /* CompleteClass */
      override def getEditor(idx: Double): Unit = js.native
      
      /**
        * Returns the orientation.
        **/
      /* CompleteClass */
      override def getOrientation(): Double = js.native
      
      /**
        * Returns the number of splits.
        **/
      /* CompleteClass */
      override def getSplits(): Double = js.native
      
      /**
        * Resizes the editor.
        **/
      /* CompleteClass */
      override def resize(): Unit = js.native
      
      /**
        * Sets the font size, in pixels, for all the available editors.
        * @param size The new font size
        **/
      /* CompleteClass */
      override def setFontSize(size: Double): Unit = js.native
      
      /**
        * Sets the keyboard handler for the editor.
        * @param keybinding
        **/
      /* CompleteClass */
      override def setKeyboardHandler(keybinding: String): Unit = js.native
      
      /**
        * Sets the orientation.
        * @param orientation The new orientation value
        **/
      /* CompleteClass */
      override def setOrientation(orientation: Double): Unit = js.native
      
      /**
        * Sets a new [[EditSession `EditSession`]] for the indicated editor.
        * @param session The new edit session
        * @param idx The editor's index you're interested in
        **/
      /* CompleteClass */
      override def setSession(session: IEditSession, idx: Double): Unit = js.native
      
      /**
        * Sets a theme for each of the available editors.
        * @param theme The name of the theme to set
        **/
      /* CompleteClass */
      override def setTheme(theme: String): Unit = js.native
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.TokenIterator")
    @js.native
    class TokenIteratorCls protected ()
      extends StObject
         with TokenIterator {
      /**
        * Creates a new token iterator object. The inital token index is set to the provided row and column coordinates.
        * @param session The session to associate with
        * @param initialRow The row to start the tokenizing at
        * @param initialColumn The column to start the tokenizing at
        **/
      def this(session: IEditSession, initialRow: Double, initialColumn: Double) = this()
      
      /**
        * Returns the current tokenized string.
        **/
      /* CompleteClass */
      override def getCurrentToken(): TokenInfo = js.native
      
      /**
        * Returns the current column.
        **/
      /* CompleteClass */
      override def getCurrentTokenColumn(): Double = js.native
      
      /**
        * Returns the current row.
        **/
      /* CompleteClass */
      override def getCurrentTokenRow(): Double = js.native
      
      /**
        * Tokenizes all the items from the current point to the row prior in the document.
        **/
      /* CompleteClass */
      override def stepBackward(): js.Array[String] = js.native
      
      /**
        * Tokenizes all the items from the current point until the next row in the document. If the current point is at the end of the file, this function returns `null`. Otherwise, it returns the tokenized string.
        **/
      /* CompleteClass */
      override def stepForward(): String = js.native
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.Tokenizer")
    @js.native
    class TokenizerCls protected ()
      extends StObject
         with Tokenizer {
      /**
        * Constructs a new tokenizer based on the given rules and flags.
        * @param rules The highlighting rules
        * @param flag Any additional regular expression flags to pass (like "i" for case insensitive)
        **/
      def this(rules: js.Any, flag: String) = this()
      
      /**
        * Returns an object containing two properties: `tokens`, which contains all the tokens; and `state`, the current state.
        **/
      /* CompleteClass */
      override def getLineTokens(): js.Any = js.native
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.UndoManager")
    @js.native
    /**
      * Resets the current undo state and creates a new `UndoManager`.
      **/
    class UndoManagerCls ()
      extends StObject
         with UndoManager
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.VirtualRenderer")
    @js.native
    class VirtualRendererCls protected ()
      extends StObject
         with VirtualRenderer {
      /**
        * Constructs a new `VirtualRenderer` within the `container` specified, applying the given `theme`.
        * @param container The root element of the editor
        * @param theme The starting theme
        **/
      def this(container: HTMLElement) = this()
      def this(container: HTMLElement, theme: String) = this()
      
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
      
      /* CompleteClass */
      var characterWidth: Double = js.native
      
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
      
      /* CompleteClass */
      var lineHeight: Double = js.native
      
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
      
      /* CompleteClass */
      var scroller: js.Any = js.native
      
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
      override def setAnnotations(annotations: js.Array[js.Any]): Unit = js.native
      
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
  }
  
  @JSGlobal("ace")
  @js.native
  def ace: Ace = js.native
  @scala.inline
  def ace_=(x: Ace): Unit = js.Dynamic.global.updateDynamic("ace")(x.asInstanceOf[js.Any])
}
