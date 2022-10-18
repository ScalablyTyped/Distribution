package typings.atom

import typings.atom.anon.AllowPrevious
import typings.atom.anon.Autoscroll
import typings.atom.anon.Backwards
import typings.atom.anon.IncludeNewline
import typings.atom.anon.IncludeNonWordCharacters
import typings.atom.anon.MoveToEndOfSelection
import typings.atom.anon.WordRegex
import typings.atom.anon.`27`
import typings.atom.dependenciesTextBufferSrcDisplayMarkerMod.DisplayMarker
import typings.atom.dependenciesTextBufferSrcPointMod.PointCompatible
import typings.atom.mod.Disposable
import typings.atom.mod.Point
import typings.atom.mod.Range
import typings.atom.srcScopeDescriptorMod.ScopeDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCursorMod {
  
  @js.native
  trait Cursor extends StObject {
    
    // Utilities
    /** Prevents this cursor from causing scrolling. */
    def clearAutoscroll(): Unit = js.native
    
    /** Deselects the current selection. */
    def clearSelection(): Unit = js.native
    
    // Comparing to another cursor
    /**
      *  Compare this cursor's buffer position to another cursor's buffer position.
      *  See Point::compare for more details.
      */
    def compare(otherCursor: Cursor): Double = js.native
    
    /** Retrieves the buffer position of where the current word starts. */
    def getBeginningOfCurrentWordBufferPosition(): Point = js.native
    def getBeginningOfCurrentWordBufferPosition(options: AllowPrevious): Point = js.native
    
    /** Retrieves the buffer position of where the next word starts. */
    def getBeginningOfNextWordBufferPosition(): Point = js.native
    def getBeginningOfNextWordBufferPosition(options: WordRegex): Point = js.native
    
    /** Returns the cursor's current buffer column. */
    def getBufferColumn(): Double = js.native
    
    /** Returns the current buffer position as an Array. */
    def getBufferPosition(): Point = js.native
    
    /** Retrieves the cursor's current buffer row. */
    def getBufferRow(): Double = js.native
    
    /** Returns the cursor's current buffer row of text excluding its line ending. */
    def getCurrentBufferLine(): String = js.native
    
    /** Returns the buffer Range for the current line. */
    def getCurrentLineBufferRange(): Range = js.native
    def getCurrentLineBufferRange(options: IncludeNewline): Range = js.native
    
    /**
      *  Retrieves the range for the current paragraph.
      *  A paragraph is defined as a block of text surrounded by empty lines or comments.
      */
    def getCurrentParagraphBufferRange(): Range = js.native
    
    /** Returns the buffer Range occupied by the word located under the cursor. */
    def getCurrentWordBufferRange(): Range = js.native
    def getCurrentWordBufferRange(options: WordRegex): Range = js.native
    
    /** Returns the characters preceding the cursor in the current word. */
    def getCurrentWordPrefix(): String = js.native
    
    /** Retrieves the buffer position of where the current word ends. */
    def getEndOfCurrentWordBufferPosition(): Point = js.native
    def getEndOfCurrentWordBufferPosition(options: IncludeNonWordCharacters): Point = js.native
    
    /** Returns the indentation level of the current line. */
    def getIndentLevel(): Double = js.native
    
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
    def getNextWordBoundaryBufferPosition(options: WordRegex): Point = js.native
    
    // Local Positions and Ranges
    /**
      *  Returns buffer position of previous word boundary. It might be on the current
      *  word, or the previous word.
      */
    def getPreviousWordBoundaryBufferPosition(): Point = js.native
    def getPreviousWordBoundaryBufferPosition(options: WordRegex): Point = js.native
    
    /** Retrieves the scope descriptor for the cursor's current position. */
    def getScopeDescriptor(): ScopeDescriptor = js.native
    
    /** Returns the cursor's current screen column. */
    def getScreenColumn(): Double = js.native
    
    /** Returns the screen position of the cursor as a Point. */
    def getScreenPosition(): Point = js.native
    
    /** Returns the cursor's current screen row. */
    def getScreenRow(): Double = js.native
    
    /** Retrieves the syntax tree scope descriptor for the cursor's current position. */
    def getSyntaxTreeScopeDescriptor(): ScopeDescriptor = js.native
    
    /**
      *  Returns true if this cursor has no non-whitespace characters before its
      *  current position.
      */
    def hasPrecedingCharactersOnLine(): Boolean = js.native
    
    /** Returns whether the cursor is at the start of a line. */
    def isAtBeginningOfLine(): Boolean = js.native
    
    /** Returns whether the cursor is on the line return character. */
    def isAtEndOfLine(): Boolean = js.native
    
    /** This method returns false if the character before or after the cursor is whitespace. */
    def isBetweenWordAndNonWord(): Boolean = js.native
    
    /** Returns whether this cursor is between a word's start and end. */
    def isInsideWord(): Boolean = js.native
    def isInsideWord(options: WordRegex): Boolean = js.native
    
    /**
      *  Identifies if this cursor is the last in the TextEditor.
      *  "Last" is defined as the most recently added cursor.
      */
    def isLastCursor(): Boolean = js.native
    
    /**
      *  Identifies if the cursor is surrounded by whitespace.
      *  "Surrounded" here means that the character directly before and after the cursor
      *  are both whitespace.
      */
    def isSurroundedByWhitespace(): Boolean = js.native
    
    /** Returns the visibility of the cursor. */
    def isVisible(): Boolean = js.native
    
    /** Moves the cursor down one screen row. */
    def moveDown(): Unit = js.native
    def moveDown(rowCount: Double): Unit = js.native
    def moveDown(rowCount: Double, options: MoveToEndOfSelection): Unit = js.native
    def moveDown(rowCount: Unit, options: MoveToEndOfSelection): Unit = js.native
    
    /** Moves the cursor left one screen column. */
    def moveLeft(): Unit = js.native
    def moveLeft(columnCount: Double): Unit = js.native
    def moveLeft(columnCount: Double, options: MoveToEndOfSelection): Unit = js.native
    def moveLeft(columnCount: Unit, options: MoveToEndOfSelection): Unit = js.native
    
    /** Moves the cursor right one screen column. */
    def moveRight(): Unit = js.native
    def moveRight(columnCount: Double): Unit = js.native
    def moveRight(columnCount: Double, options: MoveToEndOfSelection): Unit = js.native
    def moveRight(columnCount: Unit, options: MoveToEndOfSelection): Unit = js.native
    
    /** Moves the cursor to the beginning of the buffer line. */
    def moveToBeginningOfLine(): Unit = js.native
    
    /** Moves the cursor to the beginning of the next paragraph. */
    def moveToBeginningOfNextParagraph(): Unit = js.native
    
    /** Moves the cursor to the beginning of the next word. */
    def moveToBeginningOfNextWord(): Unit = js.native
    
    /** Moves the cursor to the beginning of the previous paragraph. */
    def moveToBeginningOfPreviousParagraph(): Unit = js.native
    
    /** Moves the cursor to the beginning of the line. */
    def moveToBeginningOfScreenLine(): Unit = js.native
    
    /** Moves the cursor to the beginning of the word. */
    def moveToBeginningOfWord(): Unit = js.native
    
    /** Moves the cursor to the bottom of the buffer. */
    def moveToBottom(): Unit = js.native
    
    /** Moves the cursor to the end of the buffer line. */
    def moveToEndOfLine(): Unit = js.native
    
    /** Moves the cursor to the end of the line. */
    def moveToEndOfScreenLine(): Unit = js.native
    
    /** Moves the cursor to the end of the word. */
    def moveToEndOfWord(): Unit = js.native
    
    /** Moves the cursor to the beginning of the first character in the line. */
    def moveToFirstCharacterOfLine(): Unit = js.native
    
    /** Moves the cursor to the next subword boundary. */
    def moveToNextSubwordBoundary(): Unit = js.native
    
    /** Moves the cursor to the next word boundary. */
    def moveToNextWordBoundary(): Unit = js.native
    
    /** Moves the cursor to the previous subword boundary. */
    def moveToPreviousSubwordBoundary(): Unit = js.native
    
    /** Moves the cursor to the previous word boundary. */
    def moveToPreviousWordBoundary(): Unit = js.native
    
    /** Moves the cursor to the top of the buffer. */
    def moveToTop(): Unit = js.native
    
    // Moving the Cursor
    /** Moves the cursor up one screen row. */
    def moveUp(): Unit = js.native
    def moveUp(rowCount: Double): Unit = js.native
    def moveUp(rowCount: Double, options: MoveToEndOfSelection): Unit = js.native
    def moveUp(rowCount: Unit, options: MoveToEndOfSelection): Unit = js.native
    
    // Event Subscription
    /** Calls your callback when the cursor has been moved. */
    def onDidChangePosition(callback: js.Function1[/* event */ CursorPositionChangedEvent, Unit]): Disposable = js.native
    
    /** Calls your callback when the cursor's visibility has changed. */
    def onDidChangeVisibility(callback: js.Function1[/* visibility */ Boolean, Unit]): Disposable = js.native
    
    /** Calls your callback when the cursor is destroyed. */
    def onDidDestroy(callback: js.Function0[Unit]): Disposable = js.native
    
    /** Moves a cursor to a given buffer position. */
    def setBufferPosition(bufferPosition: PointCompatible): Unit = js.native
    def setBufferPosition(bufferPosition: PointCompatible, options: Autoscroll): Unit = js.native
    
    // Managing Cursor Position
    /** Moves a cursor to a given screen position. */
    def setScreenPosition(screenPosition: PointCompatible): Unit = js.native
    def setScreenPosition(screenPosition: PointCompatible, options: Autoscroll): Unit = js.native
    
    // Visibility
    /** Sets whether the cursor is visible. */
    def setVisible(visible: Boolean): Unit = js.native
    
    /** Moves the cursor to the beginning of the buffer line, skipping all whitespace. */
    def skipLeadingWhitespace(): Unit = js.native
    
    /** Get the RegExp used by the cursor to determine what a "subword" is. */
    def subwordRegExp(): js.RegExp = js.native
    def subwordRegExp(options: Backwards): js.RegExp = js.native
    
    /** Get the RegExp used by the cursor to determine what a "word" is. */
    def wordRegExp(): js.RegExp = js.native
    def wordRegExp(options: `27`): js.RegExp = js.native
  }
  
  trait CursorPositionChangedEvent extends StObject {
    
    var cursor: Cursor
    
    var newBufferPosition: Point
    
    var newScreenPosition: Point
    
    var oldBufferPosition: Point
    
    var oldScreenPosition: Point
    
    var textChanged: Boolean
  }
  object CursorPositionChangedEvent {
    
    inline def apply(
      cursor: Cursor,
      newBufferPosition: Point,
      newScreenPosition: Point,
      oldBufferPosition: Point,
      oldScreenPosition: Point,
      textChanged: Boolean
    ): CursorPositionChangedEvent = {
      val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], newBufferPosition = newBufferPosition.asInstanceOf[js.Any], newScreenPosition = newScreenPosition.asInstanceOf[js.Any], oldBufferPosition = oldBufferPosition.asInstanceOf[js.Any], oldScreenPosition = oldScreenPosition.asInstanceOf[js.Any], textChanged = textChanged.asInstanceOf[js.Any])
      __obj.asInstanceOf[CursorPositionChangedEvent]
    }
    
    extension [Self <: CursorPositionChangedEvent](x: Self) {
      
      inline def setCursor(value: Cursor): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setNewBufferPosition(value: Point): Self = StObject.set(x, "newBufferPosition", value.asInstanceOf[js.Any])
      
      inline def setNewScreenPosition(value: Point): Self = StObject.set(x, "newScreenPosition", value.asInstanceOf[js.Any])
      
      inline def setOldBufferPosition(value: Point): Self = StObject.set(x, "oldBufferPosition", value.asInstanceOf[js.Any])
      
      inline def setOldScreenPosition(value: Point): Self = StObject.set(x, "oldScreenPosition", value.asInstanceOf[js.Any])
      
      inline def setTextChanged(value: Boolean): Self = StObject.set(x, "textChanged", value.asInstanceOf[js.Any])
    }
  }
}
