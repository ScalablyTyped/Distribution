package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atom", "TextEditor")
@js.native
// NOTE: undocumented within the public API. Don't go down the rabbit hole.
class TextEditor () extends js.Object {
  def this(options: js.Object) = this()
  val id: scala.Double = js.native
  /**
    *  Abort an open transaction, undoing any operations performed so far within the
    *  transaction.
    */
  def abortTransaction(): scala.Unit = js.native
  /** Add a cursor at the given position in buffer coordinates. */
  def addCursorAtBufferPosition(bufferPosition: PointCompatible): Cursor = js.native
  def addCursorAtBufferPosition(bufferPosition: PointCompatible, options: atomLib.Anon_Autoscroll): Cursor = js.native
  /** Add a cursor at the position in screen coordinates. */
  def addCursorAtScreenPosition(screenPosition: PointCompatible): Cursor = js.native
  // Gutters
  /** Add a custom Gutter. */
  def addGutter(options: GutterOptions): Gutter = js.native
  /** Create a marker layer to group related markers. */
  def addMarkerLayer(): DisplayMarkerLayer = js.native
  def addMarkerLayer(options: atomLib.Anon_MaintainHistory): DisplayMarkerLayer = js.native
  /** Add a selection for the given range in buffer coordinates. */
  def addSelectionForBufferRange(bufferRange: RangeCompatible): Selection = js.native
  def addSelectionForBufferRange(bufferRange: RangeCompatible, options: atomLib.Anon_PreserveFolds): Selection = js.native
  /** Add a selection for the given range in screen coordinates. */
  def addSelectionForScreenRange(screenRange: RangeCompatible): Selection = js.native
  def addSelectionForScreenRange(screenRange: RangeCompatible, options: atomLib.Anon_PreserveFolds): Selection = js.native
  /** Indent rows intersecting selections based on the grammar's suggested indent level. */
  def autoIndentSelectedRows(): scala.Unit = js.native
  def autoIndentSelectedRows(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  For each selection, if the selection is empty, delete the character preceding
    *  the cursor. Otherwise delete the selected text.
    */
  def backspace(): scala.Unit = js.native
  def backspace(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  Scan regular expression matches in a given range in reverse order, calling the
    *  given iterator function on each match.
    */
  def backwardsScanInBufferRange(
    regex: stdLib.RegExp,
    range: RangeCompatible,
    iterator: js.Function1[/* params */ BufferScanResult, scala.Unit]
  ): scala.Unit = js.native
  /** Convert a position in screen-coordinates to buffer-coordinates. */
  def bufferPositionForScreenPosition(bufferPosition: PointCompatible): Point = js.native
  def bufferPositionForScreenPosition(bufferPosition: PointCompatible, options: atomLib.Anon_BackwardClipDirectionClosestForward): Point = js.native
  /**
    *  Get the range in buffer coordinates of all tokens surrounding the cursor
    *  that match the given scope selector.
    */
  def bufferRangeForScopeAtCursor(scopeSelector: java.lang.String): Range = js.native
  /** Undocumented: Buffer range for syntax scope at position */
  def bufferRangeForScopeAtPosition(scope: java.lang.String, point: PointCompatible): Range = js.native
  /** Convert a range in screen-coordinates to buffer-coordinates. */
  def bufferRangeForScreenRange(screenRange: RangeCompatible): Range = js.native
  /** Clip the given Point to a valid position in the buffer. */
  def clipBufferPosition(bufferPosition: PointCompatible): Point = js.native
  /**
    *  Clip the start and end of the given range to valid positions in the buffer.
    *  See ::clipBufferPosition for more information.
    */
  def clipBufferRange(range: RangeCompatible): Range = js.native
  /** Clip the given Point to a valid position on screen. */
  def clipScreenPosition(screenPosition: PointCompatible): Point = js.native
  def clipScreenPosition(screenPosition: PointCompatible, options: atomLib.Anon_BackwardClipDirectionClosestForward): Point = js.native
  /**
    *  Clip the start and end of the given range to valid positions on screen.
    *  See ::clipScreenPosition for more information.
    */
  def clipScreenRange(range: RangeCompatible): Range = js.native
  def clipScreenRange(range: RangeCompatible, options: atomLib.Anon_BackwardClipDirectionClosestForward): Range = js.native
  // Clipboard Operations
  /** For each selection, copy the selected text. */
  def copySelectedText(): scala.Unit = js.native
  /**
    *  Create a pointer to the current state of the buffer for use with ::revertToCheckpoint
    *  and ::groupChangesSinceCheckpoint.
    */
  def createCheckpoint(): scala.Double = js.native
  /** For each selection, cut the selected text. */
  def cutSelectedText(): scala.Unit = js.native
  def cutSelectedText(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  For each selection, if the selection is empty, cut all characters of the
    *  containing buffer line following the cursor. Otherwise cut the selected text.
    */
  def cutToEndOfBufferLine(): scala.Unit = js.native
  def cutToEndOfBufferLine(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  For each selection, if the selection is empty, cut all characters of the
    *  containing screen line following the cursor. Otherwise cut the selected text.
    */
  def cutToEndOfLine(): scala.Unit = js.native
  def cutToEndOfLine(options: ReadonlyEditOptions): scala.Unit = js.native
  // Decorations
  /**
    *  Add a decoration that tracks a DisplayMarker. When the marker moves, is
    *  invalidated, or is destroyed, the decoration will be updated to reflect
    *  the marker's state.
    */
  def decorateMarker(marker: DisplayMarker, decorationParams: DecorationOptions): Decoration = js.native
  def decorateMarkerLayer(markerLayer: DisplayMarkerLayer, decorationParams: DecorationLayerOptions): LayerDecoration = js.native
  /**
    *  Add a decoration to every marker in the given marker layer. Can be used to
    *  decorate a large number of markers without having to create and manage many
    *  individual decorations.
    */
  def decorateMarkerLayer(markerLayer: MarkerLayer, decorationParams: DecorationLayerOptions): LayerDecoration = js.native
  /**
    *  For each selection, if the selection is empty, delete the character following
    *  the cursor. Otherwise delete the selected text.
    */
  def delete(): scala.Unit = js.native
  def delete(options: ReadonlyEditOptions): scala.Unit = js.native
  /** Delete all lines intersecting selections. */
  def deleteLine(): scala.Unit = js.native
  def deleteLine(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  For each selection, if the selection is empty, delete all characters of the
    *  containing line that precede the cursor. Otherwise delete the selected text.
    */
  def deleteToBeginningOfLine(): scala.Unit = js.native
  def deleteToBeginningOfLine(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  For each selection, if the selection is empty, delete all characters of the
    *  containing subword following the cursor. Otherwise delete the selected text.
    */
  def deleteToBeginningOfSubword(): scala.Unit = js.native
  def deleteToBeginningOfSubword(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  For each selection, if the selection is empty, delete all characters of the
    *  containing word that precede the cursor. Otherwise delete the selected text.
    */
  def deleteToBeginningOfWord(): scala.Unit = js.native
  def deleteToBeginningOfWord(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  For each selection, if the selection is not empty, deletes the selection
    *  otherwise, deletes all characters of the containing line following the cursor.
    *  If the cursor is already at the end of the line, deletes the following newline.
    */
  def deleteToEndOfLine(): scala.Unit = js.native
  def deleteToEndOfLine(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  For each selection, if the selection is empty, delete all characters of the
    *  containing subword following the cursor. Otherwise delete the selected text.
    */
  def deleteToEndOfSubword(): scala.Unit = js.native
  def deleteToEndOfSubword(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  For each selection, if the selection is empty, delete all characters of the
    *  containing word following the cursor. Otherwise delete the selected text.
    */
  def deleteToEndOfWord(): scala.Unit = js.native
  def deleteToEndOfWord(options: ReadonlyEditOptions): scala.Unit = js.native
  /** Similar to ::deleteToEndOfWord, but deletes only up to the next word boundary. */
  def deleteToNextWordBoundary(): scala.Unit = js.native
  def deleteToNextWordBoundary(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  Similar to ::deleteToBeginningOfWord, but deletes only back to the previous
    *  word boundary.
    */
  def deleteToPreviousWordBoundary(): scala.Unit = js.native
  def deleteToPreviousWordBoundary(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  Find all DisplayMarkers on the default marker layer that match the given properties.
    *
    *  This method finds markers based on the given properties. Markers can be associated
    *  with custom properties that will be compared with basic equality. In addition, there
    *  are several special properties that will be compared with the range of the markers
    *  rather than their properties.
    */
  def findMarkers(properties: FindDisplayMarkerOptions): js.Array[DisplayMarker] = js.native
  /** Fold all foldable lines. */
  def foldAll(): scala.Unit = js.native
  /**
    * Fold all foldable lines at the given indent level.
    * @param level A zero-indexed number.
    */
  def foldAllAtIndentLevel(level: scala.Double): scala.Unit = js.native
  /**
    *  Fold the given row in buffer coordinates based on its indentation level.
    *  If the given row is foldable, the fold will begin there. Otherwise, it will
    *  begin at the first foldable row preceding the given row.
    */
  def foldBufferRow(bufferRow: scala.Double): scala.Unit = js.native
  // Folds
  /**
    *  Fold the most recent cursor's row based on its indentation level.
    *  The fold will extend from the nearest preceding line with a lower indentation
    *  level up to the nearest following row with a lower indentation level.
    */
  def foldCurrentRow(): scala.Unit = js.native
  /** For each selection, fold the rows it intersects. */
  def foldSelectedLines(): scala.Unit = js.native
  /** Retrieves the current TextBuffer. */
  def getBuffer(): TextBuffer = js.native
  /** Get the range of the paragraph surrounding the most recently added cursor. */
  def getCurrentParagraphBufferRange(): Range = js.native
  /** Get a Cursor at given screen coordinates Point. */
  def getCursorAtScreenPosition(position: PointCompatible): js.UndefOr[Cursor] = js.native
  // Cursors
  /** Get the position of the most recently added cursor in buffer coordinates. */
  def getCursorBufferPosition(): Point = js.native
  /** Get the position of all the cursor positions in buffer coordinates. */
  def getCursorBufferPositions(): js.Array[Point] = js.native
  /** Get the position of the most recently added cursor in screen coordinates. */
  def getCursorScreenPosition(): Point = js.native
  /** Get the position of all the cursor positions in screen coordinates. */
  def getCursorScreenPositions(): js.Array[Point] = js.native
  /** Get an Array of all Cursors. */
  def getCursors(): js.Array[Cursor] = js.native
  /**
    *  Get all Cursors, ordered by their position in the buffer instead of the
    *  order in which they were added.
    */
  def getCursorsOrderedByBufferPosition(): js.Array[Cursor] = js.native
  /** Get all decorations. */
  def getDecorations(): js.Array[Decoration] = js.native
  def getDecorations(propertyFilter: DecorationOptions): js.Array[Decoration] = js.native
  /**
    *  Get the default DisplayMarkerLayer.
    *  All marker APIs not tied to an explicit layer interact with this default layer.
    */
  def getDefaultMarkerLayer(): DisplayMarkerLayer = js.native
  /** Returns the string character set encoding of this editor's text buffer. */
  def getEncoding(): java.lang.String = js.native
  // Grammars
  /** Get the current Grammar of this editor. */
  def getGrammar(): Grammar = js.native
  /** Get this editor's gutters. */
  def getGutters(): js.Array[Gutter] = js.native
  /** Get all decorations of type 'highlight'. */
  def getHighlightDecorations(): js.Array[Decoration] = js.native
  def getHighlightDecorations(propertyFilter: DecorationOptions): js.Array[Decoration] = js.native
  /**
    *  Returns a number representing the last zero-indexed buffer row number of
    *  the editor.
    */
  def getLastBufferRow(): scala.Double = js.native
  /** Returns the most recently added Cursor. */
  def getLastCursor(): Cursor = js.native
  /**
    *  Returns a number representing the last zero-indexed screen row number of
    *  the editor.
    */
  def getLastScreenRow(): scala.Double = js.native
  /** Get the most recently added Selection. */
  def getLastSelection(): Selection = js.native
  /** Returns a number representing the number of lines in the buffer. */
  def getLineCount(): scala.Double = js.native
  /** Get all decorations of type 'line'. */
  def getLineDecorations(): js.Array[Decoration] = js.native
  def getLineDecorations(propertyFilter: DecorationOptions): js.Array[Decoration] = js.native
  // TextEditor Rendering
  /** Retrieves the rendered line height in pixels. */
  def getLineHeightInPixels(): scala.Double = js.native
  /** Get all decorations of type 'line-number'. */
  def getLineNumberDecorations(): js.Array[Decoration] = js.native
  def getLineNumberDecorations(propertyFilter: DecorationOptions): js.Array[Decoration] = js.native
  /**
    *  Get unique title for display in other parts of the UI, such as the window title.
    *  If the editor's buffer is unsaved, its title is "untitled" If the editor's
    *  buffer is saved, its unique title is formatted as one of the following,
    *
    *  "" when it is the only editing buffer with this file name.
    *  " — " when other buffers have this file name.
    */
  def getLongTitle(): java.lang.String = js.native
  /** Get the DisplayMarker on the default layer for the given marker id. */
  def getMarker(id: scala.Double): DisplayMarker = js.native
  /** Get the number of markers in the default marker layer. */
  def getMarkerCount(): scala.Double = js.native
  /** Get a DisplayMarkerLayer by id. */
  def getMarkerLayer(id: scala.Double): js.UndefOr[DisplayMarkerLayer] = js.native
  /** Get all DisplayMarkers on the default marker layer. Consider using ::findMarkers. */
  def getMarkers(): js.Array[DisplayMarker] = js.native
  /** Get all decorations of type 'overlay'. */
  def getOverlayDecorations(): js.Array[Decoration] = js.native
  def getOverlayDecorations(propertyFilter: DecorationOptions): js.Array[Decoration] = js.native
  /** Returns the string path of this editor's text buffer. */
  def getPath(): js.UndefOr[java.lang.String] = js.native
  /** Retrieves the greyed out placeholder of a mini editor. */
  def getPlaceholderText(): java.lang.String = js.native
  // Managing Syntax Scopes
  /**
    *  Returns a ScopeDescriptor that includes this editor's language.
    *  e.g. [".source.ruby"], or [".source.coffee"].
    */
  def getRootScopeDescriptor(): ScopeDescriptor = js.native
  /**
    *  Returns a number representing the number of screen lines in the editor.
    *  This accounts for folds.
    */
  def getScreenLineCount(): scala.Double = js.native
  /** Get the Range of the most recently added selection in buffer coordinates. */
  def getSelectedBufferRange(): Range = js.native
  /**
    *  Get the Ranges of all selections in buffer coordinates.
    *  The ranges are sorted by when the selections were added. Most recent at the end.
    */
  def getSelectedBufferRanges(): js.Array[Range] = js.native
  /** Get the Range of the most recently added selection in screen coordinates. */
  def getSelectedScreenRange(): Range = js.native
  /**
    *  Get the Ranges of all selections in screen coordinates.
    *  The ranges are sorted by when the selections were added. Most recent at the end.
    */
  def getSelectedScreenRanges(): js.Array[Range] = js.native
  // Selections
  /** Get the selected text of the most recently added selection. */
  def getSelectedText(): java.lang.String = js.native
  /** Get current Selections. */
  def getSelections(): js.Array[Selection] = js.native
  /**
    *  Get all Selections, ordered by their position in the buffer instead of the
    *  order in which they were added.
    */
  def getSelectionsOrderedByBufferPosition(): js.Array[Selection] = js.native
  // Tab Behavior
  /** Returns a boolean indicating whether softTabs are enabled for this editor. */
  def getSoftTabs(): scala.Boolean = js.native
  /** Gets the column at which column will soft wrap. */
  def getSoftWrapColumn(): scala.Double = js.native
  /** Get the on-screen length of tab characters. */
  def getTabLength(): scala.Double = js.native
  /**
    *  Get the text representing a single level of indent.
    *  If soft tabs are enabled, the text is composed of N spaces, where N is the
    *  tab length. Otherwise the text is a tab character (\t).
    */
  def getTabText(): java.lang.String = js.native
  // Reading Text
  /** Returns a string representing the entire contents of the editor. */
  def getText(): java.lang.String = js.native
  /** Get the text in the given range in buffer coordinates. */
  def getTextInBufferRange(range: RangeCompatible): java.lang.String = js.native
  // File Details
  /**
    *  Get the editor's title for display in other parts of the UI such as the tabs.
    *  If the editor's buffer is saved, its title is the file name. If it is unsaved,
    *  its title is "untitled".
    */
  def getTitle(): java.lang.String = js.native
  /** Returns the word surrounding the most recently added cursor. */
  def getWordUnderCursor(): java.lang.String = js.native
  def getWordUnderCursor(options: atomLib.Anon_AllowPrevious): java.lang.String = js.native
  /**
    *  Group all changes since the given checkpoint into a single transaction for purposes
    *  of undo/redo.
    *  If the given checkpoint is no longer present in the undo history, no grouping will be
    *  performed and this method will return false.
    */
  def groupChangesSinceCheckpoint(checkpoint: scala.Double): scala.Boolean = js.native
  /** Get the gutter with the given name. */
  def gutterWithName(name: java.lang.String): Gutter | scala.Null = js.native
  /** Returns a boolean indicating whether or not there are multiple cursors. */
  def hasMultipleCursors(): scala.Boolean = js.native
  /**
    *  Get the indentation level of the given line of text.
    *  Determines how deeply the given line is indented based on the soft tabs and tab length
    *  settings of this editor. Note that if soft tabs are enabled and the tab length is 2,
    *  a row with 4 leading spaces would have an indentation level of 2.
    */
  def indentLevelForLine(line: java.lang.String): scala.Double = js.native
  /** Indent rows intersecting selections by one level. */
  def indentSelectedRows(): scala.Unit = js.native
  def indentSelectedRows(options: ReadonlyEditOptions): scala.Unit = js.native
  // Indentation
  /**
    *  Get the indentation level of the given buffer row.
    *  Determines how deeply the given row is indented based on the soft tabs and tab
    *  length settings of this editor. Note that if soft tabs are enabled and the tab
    *  length is 2, a row with 4 leading spaces would have an indentation level of 2.
    */
  def indentationForBufferRow(bufferRow: scala.Double): scala.Double = js.native
  /** For each selection, replace the selected text with a newline. */
  def insertNewline(): scala.Unit = js.native
  def insertNewline(options: ReadonlyEditOptions): scala.Unit = js.native
  /** For each cursor, insert a newline at the end of the preceding line. */
  def insertNewlineAbove(): scala.Unit = js.native
  def insertNewlineAbove(options: ReadonlyEditOptions): scala.Unit = js.native
  /** For each cursor, insert a newline at beginning the following line. */
  def insertNewlineBelow(): scala.Unit = js.native
  def insertNewlineBelow(options: ReadonlyEditOptions): scala.Unit = js.native
  /* For each selection, replace the selected text with the given text. */
  def insertText(text: java.lang.String): Range | atomLib.atomLibNumbers.`false` = js.native
  def insertText(text: java.lang.String, options: TextInsertionOptions with ReadonlyEditOptions): Range | atomLib.atomLibNumbers.`false` = js.native
  /** Determine if the given row is entirely a comment. */
  def isBufferRowCommented(bufferRow: scala.Double): scala.Boolean = js.native
  /** Returns boolean true if this editor has no content. */
  def isEmpty(): scala.Boolean = js.native
  /**
    *  Determine whether the given row in buffer coordinates is foldable.
    *  A foldable row is a row that starts a row range that can be folded.
    */
  def isFoldableAtBufferRow(bufferRow: scala.Double): scala.Boolean = js.native
  /**
    *  Determine whether the given row in screen coordinates is foldable.
    *  A foldable row is a row that starts a row range that can be folded.
    */
  def isFoldableAtScreenRow(bufferRow: scala.Double): scala.Boolean = js.native
  /** Determine whether the given row in buffer coordinates is folded. */
  def isFoldedAtBufferRow(bufferRow: scala.Double): scala.Boolean = js.native
  /** Determine whether the most recently added cursor's row is folded. */
  def isFoldedAtCursorRow(): scala.Boolean = js.native
  /** Determine whether the given row in screen coordinates is folded. */
  def isFoldedAtScreenRow(screenRow: scala.Double): scala.Boolean = js.native
  /** Returns boolean true if this editor has been modified. */
  def isModified(): scala.Boolean = js.native
  /** Whether or not this editor is in read-only mode. */
  def isReadOnly(): scala.Boolean = js.native
  // Soft Wrap Behavior
  /** Determine whether lines in this editor are soft-wrapped. */
  def isSoftWrapped(): scala.Boolean = js.native
  /**
    *  Returns a string representing the contents of the line at the given
    *  buffer row.
    */
  def lineTextForBufferRow(bufferRow: scala.Double): java.lang.String = js.native
  /**
    *  Returns a string representing the contents of the line at the given
    *  screen row.
    */
  def lineTextForScreenRow(screenRow: scala.Double): java.lang.String = js.native
  /**
    *  Convert the selected text to lower case.
    *  For each selection, if the selection is empty, converts the containing word
    *  to upper case. Otherwise convert the selected text to upper case.
    */
  def lowerCase(): scala.Unit = js.native
  def lowerCase(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  Create a marker on the default marker layer with the given buffer position and no tail.
    *  To group multiple markers together in their own private layer, see ::addMarkerLayer.
    */
  def markBufferPosition(bufferPosition: PointCompatible): DisplayMarker = js.native
  def markBufferPosition(bufferPosition: PointCompatible, options: atomLib.Anon_InsideInvalidate): DisplayMarker = js.native
  // Markers
  /**
    *  Create a marker on the default marker layer with the given range in buffer coordinates.
    *  This marker will maintain its logical location as the buffer is changed, so if you mark
    *  a particular word, the marker will remain over that word even if the word's location
    *  in the buffer changes.
    */
  def markBufferRange(range: RangeCompatible): DisplayMarker = js.native
  def markBufferRange(range: RangeCompatible, properties: atomLib.Anon_Inside): DisplayMarker = js.native
  /**
    *  Create a marker on the default marker layer with the given screen position and no tail.
    *  To group multiple markers together in their own private layer, see ::addMarkerLayer.
    */
  def markScreenPosition(screenPosition: PointCompatible): DisplayMarker = js.native
  def markScreenPosition(screenPosition: PointCompatible, options: atomLib.Anon_BackwardClipDirectionClosestForwardInside): DisplayMarker = js.native
  /**
    *  Create a marker on the default marker layer with the given range in screen coordinates.
    *  This marker will maintain its logical location as the buffer is changed, so if you mark
    *  a particular word, the marker will remain over that word even if the word's location in
    *  the buffer changes.
    */
  def markScreenRange(range: RangeCompatible): DisplayMarker = js.native
  def markScreenRange(range: RangeCompatible, properties: atomLib.Anon_Inside): DisplayMarker = js.native
  /** Move every cursor down one row in screen coordinates. */
  def moveDown(): scala.Unit = js.native
  def moveDown(lineCount: scala.Double): scala.Unit = js.native
  /** Move every cursor left one column. */
  def moveLeft(): scala.Unit = js.native
  def moveLeft(columnCount: scala.Double): scala.Unit = js.native
  /** Move every cursor right one column. */
  def moveRight(): scala.Unit = js.native
  def moveRight(columnCount: scala.Double): scala.Unit = js.native
  /** Move every cursor to the beginning of its line in buffer coordinates. */
  def moveToBeginningOfLine(): scala.Unit = js.native
  /** Move every cursor to the beginning of the next paragraph. */
  def moveToBeginningOfNextParagraph(): scala.Unit = js.native
  /** Move every cursor to the beginning of the next word. */
  def moveToBeginningOfNextWord(): scala.Unit = js.native
  /** Move every cursor to the beginning of the previous paragraph. */
  def moveToBeginningOfPreviousParagraph(): scala.Unit = js.native
  /** Move every cursor to the beginning of its line in screen coordinates. */
  def moveToBeginningOfScreenLine(): scala.Unit = js.native
  /** Move every cursor to the beginning of its surrounding word. */
  def moveToBeginningOfWord(): scala.Unit = js.native
  /**
    *  Move every cursor to the bottom of the buffer.
    *  If there are multiple cursors, they will be merged into a single cursor.
    */
  def moveToBottom(): scala.Unit = js.native
  /** Move every cursor to the end of its line in buffer coordinates. */
  def moveToEndOfLine(): scala.Unit = js.native
  /** Move every cursor to the end of its line in screen coordinates. */
  def moveToEndOfScreenLine(): scala.Unit = js.native
  /** Move every cursor to the end of its surrounding word. */
  def moveToEndOfWord(): scala.Unit = js.native
  /** Move every cursor to the first non-whitespace character of its line. */
  def moveToFirstCharacterOfLine(): scala.Unit = js.native
  /** Move every cursor to the next subword boundary. */
  def moveToNextSubwordBoundary(): scala.Unit = js.native
  /** Move every cursor to the next word boundary. */
  def moveToNextWordBoundary(): scala.Unit = js.native
  /** Move every cursor to the previous subword boundary. */
  def moveToPreviousSubwordBoundary(): scala.Unit = js.native
  /** Move every cursor to the previous word boundary. */
  def moveToPreviousWordBoundary(): scala.Unit = js.native
  /**
    *  Move every cursor to the top of the buffer.
    *  If there are multiple cursors, they will be merged into a single cursor.
    */
  def moveToTop(): scala.Unit = js.native
  /** Move every cursor up one row in screen coordinates. */
  def moveUp(): scala.Unit = js.native
  def moveUp(lineCount: scala.Double): scala.Unit = js.native
  /**
    *  Mutate the text of all the selections in a single transaction.
    *  All the changes made inside the given function can be reverted with a single
    *  call to ::undo.
    */
  def mutateSelectedText(fn: js.Function2[/* selection */ Selection, /* index */ scala.Double, scala.Unit]): scala.Unit = js.native
  /**
    *  Calls your callback when a Cursor is added to the editor. Immediately calls
    *  your callback for each existing cursor.
    */
  def observeCursors(callback: js.Function1[/* cursor */ Cursor, scala.Unit]): Disposable = js.native
  /**
    *  Calls your callback with each Decoration added to the editor. Calls your
    *  callback immediately for any existing decorations.
    */
  def observeDecorations(callback: js.Function1[/* decoration */ Decoration, scala.Unit]): Disposable = js.native
  /**
    *  Calls your callback when the grammar that interprets and colorizes the text
    *  has been changed. Immediately calls your callback with the current grammar.
    */
  def observeGrammar(callback: js.Function1[/* grammar */ Grammar, scala.Unit]): Disposable = js.native
  /**
    *  Calls your callback when a Gutter is added to the editor. Immediately calls
    *  your callback for each existing gutter.
    */
  def observeGutters(callback: js.Function1[/* gutter */ Gutter, scala.Unit]): Disposable = js.native
  /**
    *  Calls your callback when a Selection is added to the editor. Immediately
    *  calls your callback for each existing selection.
    */
  def observeSelections(callback: js.Function1[/* selection */ Selection, scala.Unit]): Disposable = js.native
  /** Calls your callback when a Cursor is added to the editor. */
  def onDidAddCursor(callback: js.Function1[/* cursor */ Cursor, scala.Unit]): Disposable = js.native
  /** Calls your callback when a Decoration is added to the editor. */
  def onDidAddDecoration(callback: js.Function1[/* decoration */ Decoration, scala.Unit]): Disposable = js.native
  /** Calls your callback when a Gutter is added to the editor. */
  def onDidAddGutter(callback: js.Function1[/* gutter */ Gutter, scala.Unit]): Disposable = js.native
  /** Calls your callback when a Selection is added to the editor. */
  def onDidAddSelection(callback: js.Function1[/* selection */ Selection, scala.Unit]): Disposable = js.native
  /**
    *  Invoke the given callback synchronously when the content of the buffer
    *  changes.
    */
  def onDidChange(callback: js.Function1[/* event */ js.Array[EditorChangedEvent], scala.Unit]): Disposable = js.native
  /**
    *  Calls your callback when a Cursor is moved. If there are multiple cursors,
    *  your callback will be called for each cursor.
    */
  def onDidChangeCursorPosition(callback: js.Function1[/* event */ CursorPositionChangedEvent, scala.Unit]): Disposable = js.native
  /** Calls your callback when the buffer's encoding has changed. */
  def onDidChangeEncoding(callback: js.Function1[/* encoding */ java.lang.String, scala.Unit]): Disposable = js.native
  /**
    *  Calls your callback when the grammar that interprets and colorizes the text
    *  has been changed.
    */
  def onDidChangeGrammar(callback: js.Function1[/* grammar */ Grammar, scala.Unit]): Disposable = js.native
  /** Calls your callback when the result of ::isModified changes. */
  def onDidChangeModified(callback: js.Function1[/* modified */ scala.Boolean, scala.Unit]): Disposable = js.native
  /** Calls your callback when the buffer's path, and therefore title, has changed. */
  def onDidChangePath(callback: js.Function1[/* path */ java.lang.String, scala.Unit]): Disposable = js.native
  /** Calls your callback when the placeholder text is changed. */
  def onDidChangePlaceholderText(callback: js.Function1[/* placeholderText */ java.lang.String, scala.Unit]): Disposable = js.native
  /** Calls your callback when a selection's screen range changes. */
  def onDidChangeSelectionRange(callback: js.Function1[/* event */ SelectionChangedEvent, scala.Unit]): Disposable = js.native
  /** Calls your callback when soft wrap was enabled or disabled. */
  def onDidChangeSoftWrapped(callback: js.Function1[/* softWrapped */ scala.Boolean, scala.Unit]): Disposable = js.native
  // Event Subscription
  /** Calls your callback when the buffer's title has changed. */
  def onDidChangeTitle(callback: js.Function1[/* title */ java.lang.String, scala.Unit]): Disposable = js.native
  /**
    *  Calls your callback when the buffer's underlying file changes on disk at a
    *  moment when the result of ::isModified is true.
    */
  def onDidConflict(callback: js.Function0[scala.Unit]): Disposable = js.native
  /** Invoke the given callback when the editor is destroyed. */
  def onDidDestroy(callback: js.Function0[scala.Unit]): Disposable = js.native
  /** Calls your callback after text has been inserted. */
  def onDidInsertText(callback: js.Function1[/* event */ atomLib.Anon_Text, scala.Unit]): Disposable = js.native
  /** Calls your callback when a Cursor is removed from the editor. */
  def onDidRemoveCursor(callback: js.Function1[/* cursor */ Cursor, scala.Unit]): Disposable = js.native
  /** Calls your callback when a Decoration is removed from the editor. */
  def onDidRemoveDecoration(callback: js.Function1[/* decoration */ Decoration, scala.Unit]): Disposable = js.native
  /** Calls your callback when a Gutter is removed from the editor. */
  def onDidRemoveGutter(callback: js.Function1[/* name */ java.lang.String, scala.Unit]): Disposable = js.native
  /** Calls your callback when a Selection is removed from the editor. */
  def onDidRemoveSelection(callback: js.Function1[/* selection */ Selection, scala.Unit]): Disposable = js.native
  /** Invoke the given callback after the buffer is saved to disk. */
  def onDidSave(callback: js.Function1[/* event */ atomLib.Anon_Path, scala.Unit]): Disposable = js.native
  /**
    *  Invoke callback when the buffer's contents change. It is emit
    *  asynchronously 300ms after the last buffer change. This is a good place
    *  to handle changes to the buffer without compromising typing performance.
    */
  def onDidStopChanging(callback: js.Function1[/* event */ BufferStoppedChangingEvent, scala.Unit]): Disposable = js.native
  /** Calls your callback before text has been inserted. */
  def onWillInsertText(callback: js.Function1[/* event */ atomLib.Anon_Cancel, scala.Unit]): Disposable = js.native
  /** Outdent rows intersecting selections by one level. */
  def outdentSelectedRows(): scala.Unit = js.native
  def outdentSelectedRows(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  For each selection, replace the selected text with the contents of the clipboard.
    *  If the clipboard contains the same number of selections as the current editor,
    *  each selection will be replaced with the content of the corresponding clipboard
    *  selection text.
    */
  def pasteText(): scala.Unit = js.native
  def pasteText(options: TextInsertionOptions with ReadonlyEditOptions): scala.Unit = js.native
  /** Redo the last change. */
  def redo(): scala.Unit = js.native
  def redo(options: ReadonlyEditOptions): scala.Unit = js.native
  /**
    *  Revert the buffer to the state it was in when the given checkpoint was created.
    *  The redo stack will be empty following this operation, so changes since the checkpoint
    *  will be lost. If the given checkpoint is no longer present in the undo history, no
    *  changes will be made to the buffer and this method will return false.
    */
  def revertToCheckpoint(checkpoint: scala.Double): scala.Boolean = js.native
  // File Operations
  /**
    *  Saves the editor's text buffer.
    *  See TextBuffer::save for more details.
    */
  def save(): js.Promise[scala.Unit] = js.native
  /**
    *  Saves the editor's text buffer as the given path.
    *  See TextBuffer::saveAs for more details.
    */
  def saveAs(filePath: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    *  Scan regular expression matches in the entire buffer, calling the given
    *  iterator function on each match.
    *
    *  ::scan functions as the replace method as well via the replace.
    */
  def scan(regex: stdLib.RegExp, iterator: js.Function1[/* params */ BufferScanResult, scala.Unit]): scala.Unit = js.native
  // Searching and Replacing
  /**
    *  Scan regular expression matches in the entire buffer, calling the given
    *  iterator function on each match.
    *
    *  ::scan functions as the replace method as well via the replace.
    */
  def scan(
    regex: stdLib.RegExp,
    options: ScanContextOptions,
    iterator: js.Function1[/* params */ ContextualBufferScanResult, scala.Unit]
  ): scala.Unit = js.native
  /**
    *  Scan regular expression matches in a given range, calling the given iterator.
    *  function on each match.
    */
  def scanInBufferRange(
    regex: stdLib.RegExp,
    range: RangeCompatible,
    iterator: js.Function1[/* params */ BufferScanResult, scala.Unit]
  ): scala.Unit = js.native
  /** Get the syntactic scopeDescriptor for the given position in buffer coordinates. */
  def scopeDescriptorForBufferPosition(bufferPosition: PointCompatible): ScopeDescriptor = js.native
  // TextEditor Coordinates
  /** Convert a position in buffer-coordinates to screen-coordinates. */
  def screenPositionForBufferPosition(bufferPosition: PointCompatible): Point = js.native
  def screenPositionForBufferPosition(bufferPosition: PointCompatible, options: atomLib.Anon_BackwardClipDirectionClosestForward): Point = js.native
  /** Convert a range in buffer-coordinates to screen-coordinates. */
  def screenRangeForBufferRange(bufferRange: RangeCompatible): Range = js.native
  /** Scrolls the editor to the given buffer position. */
  def scrollToBufferPosition(bufferPosition: PointCompatible): scala.Unit = js.native
  def scrollToBufferPosition(bufferPosition: PointCompatible, options: atomLib.Anon_Center): scala.Unit = js.native
  // Scrolling the TextEditor
  /** Scroll the editor to reveal the most recently added cursor if it is off-screen. */
  def scrollToCursorPosition(): scala.Unit = js.native
  def scrollToCursorPosition(options: atomLib.Anon_Center): scala.Unit = js.native
  /** Scrolls the editor to the given screen position. */
  def scrollToScreenPosition(screenPosition: PointCompatible): scala.Unit = js.native
  def scrollToScreenPosition(screenPosition: PointCompatible, options: atomLib.Anon_Center): scala.Unit = js.native
  /**
    *  Select all text in the buffer.
    *  This method merges multiple selections into a single selection.
    */
  def selectAll(): scala.Unit = js.native
  /**
    *  Move the cursor of each selection one character downward while preserving
    *  the selection's tail position.
    *  This method may merge selections that end up intersecting.
    */
  def selectDown(): scala.Unit = js.native
  def selectDown(rowCount: scala.Double): scala.Unit = js.native
  /** For each selection, select the syntax node that contains that selection. */
  def selectLargerSyntaxNode(): scala.Unit = js.native
  /**
    *  Move the cursor of each selection one character leftward while preserving
    *  the selection's tail position.
    *  This method may merge selections that end up intersecting.
    */
  def selectLeft(): scala.Unit = js.native
  def selectLeft(columnCount: scala.Double): scala.Unit = js.native
  /**
    *  For each cursor, select the containing line.
    *  This method merges selections on successive lines.
    */
  def selectLinesContainingCursors(): scala.Unit = js.native
  /** Select the range of the given marker if it is valid. */
  def selectMarker(marker: DisplayMarker): js.UndefOr[Range] = js.native
  /**
    *  Move the cursor of each selection one character rightward while preserving
    *  the selection's tail position.
    *  This method may merge selections that end up intersecting.
    */
  def selectRight(): scala.Unit = js.native
  def selectRight(columnCount: scala.Double): scala.Unit = js.native
  /** Undo the effect a preceding call to `::selectLargerSyntaxNode`. */
  def selectSmallerSyntaxNode(): scala.Unit = js.native
  /**
    *  Move the cursor of each selection to the beginning of its line while preserving
    *  the selection's tail position.
    *  This method may merge selections that end up intersecting.
    */
  def selectToBeginningOfLine(): scala.Unit = js.native
  /**
    *  Expand selections to the beginning of the next paragraph.
    *  Operates on all selections. Moves the cursor to the beginning of the next
    *  paragraph while preserving the selection's tail position.
    */
  def selectToBeginningOfNextParagraph(): scala.Unit = js.native
  /**
    *  Expand selections to the beginning of the next word.
    *  Operates on all selections. Moves the cursor to the beginning of the next word
    *  while preserving the selection's tail position.
    */
  def selectToBeginningOfNextWord(): scala.Unit = js.native
  /**
    *  Expand selections to the beginning of the next paragraph.
    *  Operates on all selections. Moves the cursor to the beginning of the next
    *  paragraph while preserving the selection's tail position.
    */
  def selectToBeginningOfPreviousParagraph(): scala.Unit = js.native
  /**
    *  Expand selections to the beginning of their containing word.
    *  Operates on all selections. Moves the cursor to the beginning of the containing
    *  word while preserving the selection's tail position.
    */
  def selectToBeginningOfWord(): scala.Unit = js.native
  /**
    *  Selects from the top of the first selection in the buffer to the end of the buffer.
    *  This method merges multiple selections into a single selection.
    */
  def selectToBottom(): scala.Unit = js.native
  /**
    *  Select from the current cursor position to the given position in buffer coordinates.
    *  This method may merge selections that end up intersecting.
    */
  def selectToBufferPosition(position: PointCompatible): scala.Unit = js.native
  /**
    *  Move the cursor of each selection to the end of its line while preserving the
    *  selection's tail position.
    *  This method may merge selections that end up intersecting.
    */
  def selectToEndOfLine(): scala.Unit = js.native
  /**
    *  Expand selections to the end of their containing word.
    *  Operates on all selections. Moves the cursor to the end of the containing word
    *  while preserving the selection's tail position.
    */
  def selectToEndOfWord(): scala.Unit = js.native
  /**
    *  Move the cursor of each selection to the first non-whitespace character of its
    *  line while preserving the selection's tail position. If the cursor is already
    *  on the first character of the line, move it to the beginning of the line.
    *  This method may merge selections that end up intersecting.
    */
  def selectToFirstCharacterOfLine(): scala.Unit = js.native
  /**
    *  For each selection, move its cursor to the next subword boundary while maintaining
    *  the selection's tail position.
    *  This method may merge selections that end up intersecting.
    */
  def selectToNextSubwordBoundary(): scala.Unit = js.native
  /**
    *  For each selection, move its cursor to the next word boundary while maintaining
    *  the selection's tail position.
    *  This method may merge selections that end up intersecting.
    */
  def selectToNextWordBoundary(): scala.Unit = js.native
  /**
    *  For each selection, move its cursor to the preceding subword boundary while
    *  maintaining the selection's tail position.
    *  This method may merge selections that end up intersecting.
    */
  def selectToPreviousSubwordBoundary(): scala.Unit = js.native
  /**
    *  For each selection, move its cursor to the preceding word boundary while
    *  maintaining the selection's tail position.
    *  This method may merge selections that end up intersecting.
    */
  def selectToPreviousWordBoundary(): scala.Unit = js.native
  /**
    *  Select from the current cursor position to the given position in screen coordinates.
    *  This method may merge selections that end up intersecting.
    */
  def selectToScreenPosition(position: PointCompatible): scala.Unit = js.native
  /**
    *  Select from the top of the buffer to the end of the last selection in the buffer.
    *  This method merges multiple selections into a single selection.
    */
  def selectToTop(): scala.Unit = js.native
  /**
    *  Move the cursor of each selection one character upward while preserving the
    *  selection's tail position.
    *  This method may merge selections that end up intersecting.
    */
  def selectUp(): scala.Unit = js.native
  def selectUp(rowCount: scala.Double): scala.Unit = js.native
  /** Select the word surrounding each cursor. */
  def selectWordsContainingCursors(): scala.Unit = js.native
  // NOTE: this calls into Selection::intersectsBufferRange, which itself calls
  // into Range::intersectsWith. Range::intersectsWith is one of the few functions
  // which does NOT take a range-compatible array.
  /** Determine if a given range in buffer coordinates intersects a selection. */
  def selectionIntersectsBufferRange(bufferRange: RangeLike): scala.Boolean = js.native
  /**
    *  Move the cursor to the given position in buffer coordinates.
    *  If there are multiple cursors, they will be consolidated to a single cursor.
    */
  def setCursorBufferPosition(position: PointCompatible): scala.Unit = js.native
  def setCursorBufferPosition(position: PointCompatible, options: atomLib.Anon_Autoscroll): scala.Unit = js.native
  /**
    *  Move the cursor to the given position in screen coordinates.
    *  If there are multiple cursors, they will be consolidated to a single cursor.
    */
  def setCursorScreenPosition(position: PointCompatible): scala.Unit = js.native
  def setCursorScreenPosition(position: PointCompatible, options: atomLib.Anon_Autoscroll): scala.Unit = js.native
  /** Set the character set encoding to use in this editor's text buffer. */
  def setEncoding(encoding: java.lang.String): scala.Unit = js.native
  /**
    *  Set the indentation level for the given buffer row.
    *  Inserts or removes hard tabs or spaces based on the soft tabs and tab length settings
    *  of this editor in order to bring it to the given indentation level. Note that if soft
    *  tabs are enabled and the tab length is 2, a row with 4 leading spaces would have an
    *  indentation level of 2.
    */
  def setIndentationForBufferRow(bufferRow: scala.Double, newLevel: scala.Double): scala.Unit = js.native
  def setIndentationForBufferRow(bufferRow: scala.Double, newLevel: scala.Double, options: atomLib.Anon_PreserveLeadingWhitespace): scala.Unit = js.native
  /**
    *  Set the greyed out placeholder of a mini editor. Placeholder text will be
    *  displayed when the editor has no content.
    */
  def setPlaceholderText(placeholderText: java.lang.String): scala.Unit = js.native
  /** Sets the read-only state for the editor. */
  def setReadOnly(readonly: scala.Boolean): scala.Unit = js.native
  /**
    *  Set the selected range in buffer coordinates. If there are multiple selections,
    *  they are reduced to a single selection with the given range.
    */
  def setSelectedBufferRange(bufferRange: RangeCompatible): scala.Unit = js.native
  def setSelectedBufferRange(bufferRange: RangeCompatible, options: atomLib.Anon_PreserveFolds): scala.Unit = js.native
  /**
    *  Set the selected ranges in buffer coordinates. If there are multiple selections,
    *  they are replaced by new selections with the given ranges.
    */
  def setSelectedBufferRanges(bufferRanges: js.Array[RangeCompatible]): scala.Unit = js.native
  def setSelectedBufferRanges(bufferRanges: js.Array[RangeCompatible], options: atomLib.Anon_PreserveFolds): scala.Unit = js.native
  /**
    *  Set the selected range in screen coordinates. If there are multiple selections,
    *  they are reduced to a single selection with the given range.
    */
  def setSelectedScreenRange(screenRange: RangeCompatible): scala.Unit = js.native
  def setSelectedScreenRange(screenRange: RangeCompatible, options: atomLib.Anon_ReversedBoolean): scala.Unit = js.native
  /**
    *  Set the selected ranges in screen coordinates. If there are multiple selections,
    *  they are replaced by new selections with the given ranges.
    */
  def setSelectedScreenRanges(screenRanges: js.Array[RangeCompatible]): scala.Unit = js.native
  def setSelectedScreenRanges(screenRanges: js.Array[RangeCompatible], options: atomLib.Anon_ReversedBoolean): scala.Unit = js.native
  /** Enable or disable soft tabs for this editor. */
  def setSoftTabs(softTabs: scala.Boolean): scala.Unit = js.native
  /** Enable or disable soft wrapping for this editor. */
  def setSoftWrapped(softWrapped: scala.Boolean): scala.Boolean = js.native
  /**
    *  Set the on-screen length of tab characters. Setting this to a number will
    *  override the editor.tabLength setting.
    */
  def setTabLength(tabLength: scala.Double): scala.Unit = js.native
  // Mutating Text
  /** Replaces the entire contents of the buffer with the given string. */
  def setText(text: java.lang.String): scala.Unit = js.native
  def setText(text: java.lang.String, options: ReadonlyEditOptions): scala.Unit = js.native
  /** Set the text in the given Range in buffer coordinates. */
  def setTextInBufferRange(range: RangeCompatible, text: java.lang.String): Range = js.native
  def setTextInBufferRange(range: RangeCompatible, text: java.lang.String, options: TextEditOptions with ReadonlyEditOptions): Range = js.native
  /** Fold the given buffer row if it isn't currently folded, and unfold it otherwise. */
  def toggleFoldAtBufferRow(bufferRow: scala.Double): scala.Unit = js.native
  /**
    *  Toggle line comments for rows intersecting selections.
    *  If the current grammar doesn't support comments, does nothing.
    */
  def toggleLineCommentsInSelection(): scala.Unit = js.native
  def toggleLineCommentsInSelection(options: ReadonlyEditOptions): scala.Unit = js.native
  /** Toggle soft tabs for this editor. */
  def toggleSoftTabs(): scala.Boolean = js.native
  /** Toggle soft wrapping for this editor. */
  def toggleSoftWrapped(): scala.Boolean = js.native
  /** Undocumented: Get syntax token at buffer position */
  def tokenForBufferPosition(pos: PointCompatible): atomLib.Anon_Scopes = js.native
  /**
    *  Batch multiple operations as a single undo/redo step.
    *  Any group of operations that are logically grouped from the perspective of undoing
    *  and redoing should be performed in a transaction. If you want to abort the transaction,
    *  call ::abortTransaction to terminate the function's execution and revert any changes
    *  performed up to the abortion.
    */
  def transact(fn: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    *  Batch multiple operations as a single undo/redo step.
    *  Any group of operations that are logically grouped from the perspective of undoing
    *  and redoing should be performed in a transaction. If you want to abort the transaction,
    *  call ::abortTransaction to terminate the function's execution and revert any changes
    *  performed up to the abortion.
    */
  def transact(groupingInterval: scala.Double, fn: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    *  For each selection, transpose the selected text.
    *  If the selection is empty, the characters preceding and following the cursor
    *  are swapped. Otherwise, the selected characters are reversed.
    */
  def transpose(): scala.Unit = js.native
  def transpose(options: ReadonlyEditOptions): scala.Unit = js.native
  // History
  /** Undo the last change. */
  def undo(): scala.Unit = js.native
  def undo(options: ReadonlyEditOptions): scala.Unit = js.native
  /** Unfold all existing folds. */
  def unfoldAll(): scala.Unit = js.native
  /** Unfold all folds containing the given row in buffer coordinates. */
  def unfoldBufferRow(bufferRow: scala.Double): scala.Unit = js.native
  /** Unfold the most recent cursor's row by one level. */
  def unfoldCurrentRow(): scala.Unit = js.native
  /**
    *  Convert the selected text to upper case.
    *  For each selection, if the selection is empty, converts the containing word
    *  to upper case. Otherwise convert the selected text to upper case.
    */
  def upperCase(): scala.Unit = js.native
  def upperCase(options: ReadonlyEditOptions): scala.Unit = js.native
  /** Determine if the buffer uses hard or soft tabs. */
  def usesSoftTabs(): js.UndefOr[scala.Boolean] = js.native
}

