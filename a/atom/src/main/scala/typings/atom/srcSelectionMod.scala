package typings.atom

import typings.atom.anon.Autoscroll
import typings.atom.anon.AutoscrollPreserveFolds
import typings.atom.anon.PreserveFolds
import typings.atom.dependenciesTextBufferSrcPointMod.PointCompatible
import typings.atom.dependenciesTextBufferSrcRangeMod.RangeCompatible
import typings.atom.dependenciesTextBufferSrcRangeMod.RangeLike
import typings.atom.mod.Disposable
import typings.atom.mod.Range
import typings.atom.srcOtherTypesMod.ReadonlyEditOptions
import typings.atom.srcOtherTypesMod.TextInsertionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSelectionMod {
  
  @js.native
  trait Selection extends StObject {
    
    /** Moves the selection up one row. */
    def addSelectionAbove(): Unit = js.native
    
    // Managing multiple selections
    /** Moves the selection down one row. */
    def addSelectionBelow(): Unit = js.native
    
    /**
      *  Sets the indentation level of all selected rows to values suggested by the
      *  relevant grammars.
      */
    def autoIndentSelectedRows(): Unit = js.native
    def autoIndentSelectedRows(options: ReadonlyEditOptions): Unit = js.native
    
    /**
      *  Removes the first character before the selection if the selection is empty
      *  otherwise it deletes the selection.
      */
    def backspace(): Unit = js.native
    def backspace(options: ReadonlyEditOptions): Unit = js.native
    
    // Modifying the selected range
    /** Clears the selection, moving the marker to the head. */
    def clear(): Unit = js.native
    def clear(options: Autoscroll): Unit = js.native
    
    // Comparing to other selections
    /**
      *  Compare this selection's buffer range to another selection's buffer range.
      *  See Range::compare for more details.
      */
    def compare(otherSelection: Selection): Double = js.native
    
    /** Copies the current selection to the clipboard. */
    def copy(): Unit = js.native
    def copy(maintainClipboard: Boolean): Unit = js.native
    def copy(maintainClipboard: Boolean, fullLine: Boolean): Unit = js.native
    def copy(maintainClipboard: Unit, fullLine: Boolean): Unit = js.native
    
    /** Copies the selection to the clipboard and then deletes it. */
    def cut(): Unit = js.native
    def cut(maintainClipboard: Boolean): Unit = js.native
    def cut(maintainClipboard: Boolean, fullLine: Boolean): Unit = js.native
    def cut(maintainClipboard: Boolean, fullLine: Boolean, options: ReadonlyEditOptions): Unit = js.native
    def cut(maintainClipboard: Boolean, fullLine: Unit, options: ReadonlyEditOptions): Unit = js.native
    def cut(maintainClipboard: Unit, fullLine: Boolean): Unit = js.native
    def cut(maintainClipboard: Unit, fullLine: Boolean, options: ReadonlyEditOptions): Unit = js.native
    def cut(maintainClipboard: Unit, fullLine: Unit, options: ReadonlyEditOptions): Unit = js.native
    
    /** Cuts the selection until the end of the buffer line. */
    def cutToEndOfBufferLine(): Unit = js.native
    def cutToEndOfBufferLine(maintainClipboard: Boolean): Unit = js.native
    def cutToEndOfBufferLine(maintainClipboard: Boolean, options: ReadonlyEditOptions): Unit = js.native
    def cutToEndOfBufferLine(maintainClipboard: Unit, options: ReadonlyEditOptions): Unit = js.native
    
    /** Cuts the selection until the end of the screen line. */
    def cutToEndOfLine(): Unit = js.native
    def cutToEndOfLine(maintainClipboard: Boolean): Unit = js.native
    def cutToEndOfLine(maintainClipboard: Boolean, options: ReadonlyEditOptions): Unit = js.native
    def cutToEndOfLine(maintainClipboard: Unit, options: ReadonlyEditOptions): Unit = js.native
    
    /**
      *  Removes the selection or the next character after the start of the selection
      *  if the selection is empty.
      */
    def delete(): Unit = js.native
    def delete(options: ReadonlyEditOptions): Unit = js.native
    
    /**
      *  Removes the line at the beginning of the selection if the selection is empty
      *  unless the selection spans multiple lines in which case all lines are removed.
      */
    def deleteLine(): Unit = js.native
    def deleteLine(options: ReadonlyEditOptions): Unit = js.native
    
    /** Removes only the selected text. */
    def deleteSelectedText(): Unit = js.native
    def deleteSelectedText(options: ReadonlyEditOptions): Unit = js.native
    
    /**
      *  Removes from the beginning of the line which the selection begins on all
      *  the way through to the end of the selection.
      */
    def deleteToBeginningOfLine(): Unit = js.native
    def deleteToBeginningOfLine(options: ReadonlyEditOptions): Unit = js.native
    
    /**
      *  Removes the selection or all characters from the start of the selection to
      *  the end of the current word if nothing is selected.
      */
    def deleteToBeginningOfSubword(): Unit = js.native
    def deleteToBeginningOfSubword(options: ReadonlyEditOptions): Unit = js.native
    
    /**
      *  Removes from the start of the selection to the beginning of the current
      *  word if the selection is empty otherwise it deletes the selection.
      */
    def deleteToBeginningOfWord(): Unit = js.native
    def deleteToBeginningOfWord(options: ReadonlyEditOptions): Unit = js.native
    
    /**
      *  If the selection is empty, removes all text from the cursor to the end of
      *  the line. If the cursor is already at the end of the line, it removes the following
      *  newline. If the selection isn't empty, only deletes the contents of the selection.
      */
    def deleteToEndOfLine(): Unit = js.native
    def deleteToEndOfLine(options: ReadonlyEditOptions): Unit = js.native
    
    /**
      *  Removes the selection or all characters from the start of the selection to
      *  the end of the current word if nothing is selected.
      */
    def deleteToEndOfSubword(): Unit = js.native
    def deleteToEndOfSubword(options: ReadonlyEditOptions): Unit = js.native
    
    /**
      *  Removes the selection or all characters from the start of the selection to
      *  the end of the current word if nothing is selected.
      */
    def deleteToEndOfWord(): Unit = js.native
    def deleteToEndOfWord(options: ReadonlyEditOptions): Unit = js.native
    
    /**
      *  Removes the selection or, if nothing is selected, then all characters from
      *  the start of the selection up to the next word boundary.
      */
    def deleteToNextWordBoundary(): Unit = js.native
    def deleteToNextWordBoundary(options: ReadonlyEditOptions): Unit = js.native
    
    /**
      *  Removes the selection or, if nothing is selected, then all characters from
      *  the start of the selection back to the previous word boundary.
      */
    def deleteToPreviousWordBoundary(): Unit = js.native
    def deleteToPreviousWordBoundary(options: ReadonlyEditOptions): Unit = js.native
    
    /**
      *  Expands the newest selection to include the entire line on which the cursor
      *  currently rests.
      *  It also includes the newline character.
      */
    def expandOverLine(): Unit = js.native
    
    /**
      *  Expands the newest selection to include the entire word on which the
      *  cursors rests.
      */
    def expandOverWord(): Unit = js.native
    
    /** Creates a fold containing the current selection. */
    def fold(): Unit = js.native
    
    /** Returns the buffer Range for the selection. */
    def getBufferRange(): Range = js.native
    
    /** Returns the starting and ending buffer rows the selection is highlighting. */
    def getBufferRowRange(): js.Tuple2[Double, Double] = js.native
    
    // Managing the selection range
    /** Returns the screen Range for the selection. */
    def getScreenRange(): Range = js.native
    
    /** Returns the text in the selection. */
    def getText(): String = js.native
    
    /** If the selection spans multiple rows, indent all of them. */
    def indentSelectedRows(): Unit = js.native
    def indentSelectedRows(options: ReadonlyEditOptions): Unit = js.native
    
    // Modifying the selected text
    /** Replaces text at the current selection. */
    def insertText(text: String): Unit = js.native
    def insertText(text: String, options: TextInsertionOptions & ReadonlyEditOptions): Unit = js.native
    
    // NOTE: this calls into Range.intersectsWith(), which is one of the few functions
    //   that doesn't take a range-compatible range, despite what the API says.
    /** Identifies if a selection intersects with a given buffer range. */
    def intersectsBufferRange(bufferRange: RangeLike): Boolean = js.native
    
    /** Identifies if a selection intersects with another selection. */
    def intersectsWith(otherSelection: Selection): Boolean = js.native
    
    // Info about the selection
    /** Determines if the selection contains anything. */
    def isEmpty(): Boolean = js.native
    
    /**
      *  Determines if the ending position of a marker is greater than the starting position.
      *  This can happen when, for example, you highlight text "up" in a TextBuffer.
      */
    def isReversed(): Boolean = js.native
    
    /** Returns whether the selection is a single line or not. */
    def isSingleScreenLine(): Boolean = js.native
    
    /**
      *  Joins the current line with the one below it. Lines will be separated by a single space.
      *  If there selection spans more than one line, all the lines are joined together.
      */
    def joinLines(): Unit = js.native
    def joinLines(options: ReadonlyEditOptions): Unit = js.native
    
    /**
      *  Combines the given selection into this selection and then destroys the
      *  given selection.
      */
    def merge(otherSelection: Selection): Unit = js.native
    def merge(otherSelection: Selection, options: PreserveFolds): Unit = js.native
    
    // Event Subscription
    /** Calls your callback when the selection was moved. */
    def onDidChangeRange(callback: js.Function1[/* event */ SelectionChangedEvent, Unit]): Disposable = js.native
    
    /** Calls your callback when the selection was destroyed. */
    def onDidDestroy(callback: js.Function0[Unit]): Disposable = js.native
    
    /** Removes one level of indent from the currently selected rows. */
    def outdentSelectedRows(): Unit = js.native
    def outdentSelectedRows(options: ReadonlyEditOptions): Unit = js.native
    
    /** Selects all the text in the buffer. */
    def selectAll(): Unit = js.native
    
    /** Selects all the text one position below the cursor. */
    def selectDown(): Unit = js.native
    def selectDown(rowCount: Double): Unit = js.native
    
    /** Selects the text one position left of the cursor. */
    def selectLeft(): Unit = js.native
    def selectLeft(columnCount: Double): Unit = js.native
    
    /** Selects an entire line in the buffer. */
    def selectLine(row: Double): Unit = js.native
    
    /** Selects the text one position right of the cursor. */
    def selectRight(): Unit = js.native
    def selectRight(columnCount: Double): Unit = js.native
    
    /**
      *  Selects all the text from the current cursor position to the beginning of
      *  the line.
      */
    def selectToBeginningOfLine(): Unit = js.native
    
    /**
      *  Selects all the text from the current cursor position to the beginning of
      *  the next paragraph.
      */
    def selectToBeginningOfNextParagraph(): Unit = js.native
    
    /**
      *  Selects all the text from the current cursor position to the beginning of
      *  the next word.
      */
    def selectToBeginningOfNextWord(): Unit = js.native
    
    /**
      *  Selects all the text from the current cursor position to the beginning of
      *  the previous paragraph.
      */
    def selectToBeginningOfPreviousParagraph(): Unit = js.native
    
    /**
      *  Selects all the text from the current cursor position to the beginning
      *  of the word.
      */
    def selectToBeginningOfWord(): Unit = js.native
    
    /**
      *  Selects all the text from the current cursor position to the bottom of
      *  the buffer.
      */
    def selectToBottom(): Unit = js.native
    
    /** Selects the text from the current cursor position to a given buffer position. */
    def selectToBufferPosition(position: PointCompatible): Unit = js.native
    
    /**
      *  Selects all the text from the current cursor position to the end of the
      *  buffer line.
      */
    def selectToEndOfBufferLine(): Unit = js.native
    
    /**
      *  Selects all the text from the current cursor position to the end of the
      *  screen line.
      */
    def selectToEndOfLine(): Unit = js.native
    
    /** Selects all the text from the current cursor position to the end of the word. */
    def selectToEndOfWord(): Unit = js.native
    
    /**
      *  Selects all the text from the current cursor position to the first character
      *  of the line.
      */
    def selectToFirstCharacterOfLine(): Unit = js.native
    
    /** Selects text to the next subword boundary. */
    def selectToNextSubwordBoundary(): Unit = js.native
    
    /** Selects text to the next word boundary. */
    def selectToNextWordBoundary(): Unit = js.native
    
    /** Selects text to the previous subword boundary. */
    def selectToPreviousSubwordBoundary(): Unit = js.native
    
    /** Selects text to the previous word boundary. */
    def selectToPreviousWordBoundary(): Unit = js.native
    
    /** Selects the text from the current cursor position to a given screen position. */
    def selectToScreenPosition(position: PointCompatible): Unit = js.native
    
    /**
      *  Selects all the text from the current cursor position to the top of the
      *  buffer.
      */
    def selectToTop(): Unit = js.native
    
    /** Selects all the text one position above the cursor. */
    def selectUp(): Unit = js.native
    def selectUp(rowCount: Double): Unit = js.native
    
    /** Modifies the selection to encompass the current word. */
    def selectWord(): Unit = js.native
    
    /** Modifies the buffer Range for the selection. */
    def setBufferRange(bufferRange: RangeCompatible): Unit = js.native
    def setBufferRange(bufferRange: RangeCompatible, options: AutoscrollPreserveFolds): Unit = js.native
    
    /** Modifies the screen range for the selection. */
    def setScreenRange(screenRange: RangeCompatible): Unit = js.native
    def setScreenRange(screenRange: RangeCompatible, options: PreserveFolds): Unit = js.native
    
    /**
      *  Wraps the selected lines in comments if they aren't currently part of a comment.
      *  Removes the comment if they are currently wrapped in a comment.
      */
    def toggleLineComments(): Unit = js.native
    def toggleLineComments(options: ReadonlyEditOptions): Unit = js.native
  }
  
  trait SelectionChangedEvent extends StObject {
    
    var newBufferRange: Range
    
    var newScreenRange: Range
    
    var oldBufferRange: Range
    
    var oldScreenRange: Range
    
    var selection: Selection
  }
  object SelectionChangedEvent {
    
    inline def apply(
      newBufferRange: Range,
      newScreenRange: Range,
      oldBufferRange: Range,
      oldScreenRange: Range,
      selection: Selection
    ): SelectionChangedEvent = {
      val __obj = js.Dynamic.literal(newBufferRange = newBufferRange.asInstanceOf[js.Any], newScreenRange = newScreenRange.asInstanceOf[js.Any], oldBufferRange = oldBufferRange.asInstanceOf[js.Any], oldScreenRange = oldScreenRange.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionChangedEvent] (val x: Self) extends AnyVal {
      
      inline def setNewBufferRange(value: Range): Self = StObject.set(x, "newBufferRange", value.asInstanceOf[js.Any])
      
      inline def setNewScreenRange(value: Range): Self = StObject.set(x, "newScreenRange", value.asInstanceOf[js.Any])
      
      inline def setOldBufferRange(value: Range): Self = StObject.set(x, "oldBufferRange", value.asInstanceOf[js.Any])
      
      inline def setOldScreenRange(value: Range): Self = StObject.set(x, "oldScreenRange", value.asInstanceOf[js.Any])
      
      inline def setSelection(value: Selection): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    }
  }
}
