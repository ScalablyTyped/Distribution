package typings.ace

import typings.ace.AceAjax.Ace
import typings.ace.AceAjax.Anchor
import typings.ace.AceAjax.BackgroundTokenizer
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
    open class AnchorCls protected ()
      extends StObject
         with Anchor {
      /**
        * Creates a new `Anchor` and associates it with a document.
        * @param doc The document to associate with the anchor
        * @param row The starting row position
        * @param column The starting column position
        **/
      def this(doc: Document, row: Double, column: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.BackgroundTokenizer")
    @js.native
    open class BackgroundTokenizerCls protected ()
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
      var states: js.Array[Any] = js.native
      
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
    open class DocumentCls ()
      extends StObject
         with Document {
      def this(text: String) = this()
      def this(text: js.Array[String]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("AceAjax.EditSession")
    @js.native
    open class EditSession protected ()
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
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.Editor")
    @js.native
    open class EditorCls protected ()
      extends StObject
         with Editor {
      /**
        * Creates a new `Editor` object.
        * @param renderer Associated `VirtualRenderer` that draws everything
        * @param session The `EditSession` to refer to
        **/
      def this(renderer: VirtualRenderer) = this()
      def this(renderer: VirtualRenderer, session: IEditSession) = this()
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.PlaceHolder")
    @js.native
    open class PlaceHolderCls protected ()
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
      override def on(event: String, fn: js.Function1[/* e */ Any, Any]): Unit = js.native
      
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
      
      inline def fromPoints(pos1: Position, pos2: Position): typings.ace.AceAjax.Range = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(pos1.asInstanceOf[js.Any], pos2.asInstanceOf[js.Any])).asInstanceOf[typings.ace.AceAjax.Range]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.Range")
    @js.native
    open class RangeCls protected ()
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
    open class RangeList ()
      extends StObject
         with IRangeList
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.RenderLoop")
    @js.native
    open class RenderLoopCls ()
      extends StObject
         with RenderLoop
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.ScrollBar")
    @js.native
    open class ScrollBarCls protected ()
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
      override def onScroll(e: Any): Unit = js.native
      
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
    open class SearchCls ()
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
      override def getOptions(): Any = js.native
      
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
      override def set(options: Any): Search = js.native
      
      /**
        * Sets the search options via the `options` parameter.
        * @param An object containing all the search propertie
        **/
      /* CompleteClass */
      override def setOptions(An: Any): Unit = js.native
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.Selection")
    @js.native
    open class SelectionCls protected ()
      extends StObject
         with Selection {
      /**
        * Creates a new `Selection` object.
        * @param session The session to use
        **/
      def this(session: IEditSession) = this()
    }
    
    object Split {
      
      @JSGlobal("AceAjax.Split")
      @js.native
      val ^ : js.Any = js.native
      inline def Split(container: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Split")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def Split(container: HTMLElement, theme: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Split")(container.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def Split(container: HTMLElement, theme: Any, splits: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Split")(container.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], splits.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def Split(container: HTMLElement, theme: Unit, splits: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Split")(container.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], splits.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.TokenIterator")
    @js.native
    open class TokenIteratorCls protected ()
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
    open class TokenizerCls protected ()
      extends StObject
         with Tokenizer {
      /**
        * Constructs a new tokenizer based on the given rules and flags.
        * @param rules The highlighting rules
        * @param flag Any additional regular expression flags to pass (like "i" for case insensitive)
        **/
      def this(rules: Any, flag: String) = this()
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.UndoManager")
    @js.native
    /**
      * Resets the current undo state and creates a new `UndoManager`.
      **/
    open class UndoManagerCls ()
      extends StObject
         with UndoManager
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.VirtualRenderer")
    @js.native
    open class VirtualRendererCls protected ()
      extends StObject
         with VirtualRenderer {
      /**
        * Constructs a new `VirtualRenderer` within the `container` specified, applying the given `theme`.
        * @param container The root element of the editor
        * @param theme The starting theme
        **/
      def this(container: HTMLElement) = this()
      def this(container: HTMLElement, theme: String) = this()
    }
  }
  
  @JSGlobal("ace")
  @js.native
  def ace: Ace = js.native
  inline def ace_=(x: Ace): Unit = js.Dynamic.global.updateDynamic("ace")(x.asInstanceOf[js.Any])
}
