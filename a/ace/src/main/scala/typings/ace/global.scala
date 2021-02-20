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
import typings.ace.AceAjax.Split
import typings.ace.AceAjax.TextMode
import typings.ace.AceAjax.TokenIterator
import typings.ace.AceAjax.Tokenizer
import typings.ace.AceAjax.UndoManager
import typings.ace.AceAjax.VirtualRenderer
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AceAjax {
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.Anchor")
    @js.native
    class AnchorCls protected () extends Anchor {
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
    class BackgroundTokenizerCls protected () extends BackgroundTokenizer {
      /**
        * Creates a new `BackgroundTokenizer` object.
        * @param tokenizer The tokenizer to use
        * @param editor The editor to associate with
        **/
      def this(tokenizer: Tokenizer, editor: Editor) = this()
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.Document")
    @js.native
    /**
      * Creates a new `Document`. If `text` is included, the `Document` contains those strings; otherwise, it's empty.
      * @param text The starting text
      **/
    class DocumentCls () extends Document {
      def this(text: String) = this()
      def this(text: js.Array[String]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("AceAjax.EditSession")
    @js.native
    class EditSession protected () extends IEditSession {
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
    class EditorCls protected () extends Editor {
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
    class PlaceHolderCls protected () extends PlaceHolder {
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
    }
    
    /**
      * Creates a new `Range` object with the given starting and ending row and column points.
      * @param startRow The starting row
      * @param startColumn The starting column
      * @param endRow The ending row
      * @param endColumn The ending column
      **/
    object Range {
      
      @JSGlobal("AceAjax.Range.fromPoints")
      @js.native
      def fromPoints(pos1: Position, pos2: Position): typings.ace.AceAjax.Range = js.native
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.Range")
    @js.native
    class RangeCls protected () extends Range {
      def this(startRow: Double, startColumn: Double, endRow: Double, endColumn: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("AceAjax.RangeList")
    @js.native
    class RangeList () extends IRangeList
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.RenderLoop")
    @js.native
    class RenderLoopCls () extends RenderLoop
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.ScrollBar")
    @js.native
    class ScrollBarCls protected () extends ScrollBar {
      /**
        * Creates a new `ScrollBar`. `parent` is the owner of the scroll bar.
        * @param parent A DOM element
        **/
      def this(parent: HTMLElement) = this()
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
    class SearchCls () extends Search
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.Selection")
    @js.native
    class SelectionCls protected () extends Selection {
      /**
        * Creates a new `Selection` object.
        * @param session The session to use
        **/
      def this(session: IEditSession) = this()
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.Split")
    @js.native
    class SplitCls () extends Split
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.TokenIterator")
    @js.native
    class TokenIteratorCls protected () extends TokenIterator {
      /**
        * Creates a new token iterator object. The inital token index is set to the provided row and column coordinates.
        * @param session The session to associate with
        * @param initialRow The row to start the tokenizing at
        * @param initialColumn The column to start the tokenizing at
        **/
      def this(session: IEditSession, initialRow: Double, initialColumn: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.Tokenizer")
    @js.native
    class TokenizerCls protected () extends Tokenizer {
      /**
        * Constructs a new tokenizer based on the given rules and flags.
        * @param rules The highlighting rules
        * @param flag Any additional regular expression flags to pass (like "i" for case insensitive)
        **/
      def this(rules: js.Any, flag: String) = this()
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("AceAjax.UndoManager")
    @js.native
    /**
      * Resets the current undo state and creates a new `UndoManager`.
      **/
    class UndoManagerCls () extends UndoManager
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
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
    }
  }
  
  @JSGlobal("ace")
  @js.native
  def ace: Ace = js.native
  @scala.inline
  def ace_=(x: Ace): Unit = js.Dynamic.global.updateDynamic("ace")(x.asInstanceOf[js.Any])
}
