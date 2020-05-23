package typings.atom.mod

import typings.atom.anon.ExclusiveBoolean
import typings.atom.anon.ExclusiveInvalidate
import typings.atom.anon.History
import typings.atom.anon.NewExtent
import typings.atom.anon.Role
import typings.atom.anon.ShouldDestroyOnFileDelete
import typings.atom.anon.groupingIntervalnumberHis
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atom", "TextBuffer")
@js.native
/** Create a new buffer with the given params. */
class TextBuffer () extends js.Object {
  def this(params: ShouldDestroyOnFileDelete) = this()
  /** Create a new buffer with the given starting text. */
  def this(text: String) = this()
  /** Whether or not the bufffer has been destroyed. */
  val destroyed: Boolean = js.native
  /** The unique identifier for this buffer. */
  val id: String = js.native
  /** The number of retainers for the buffer. */
  val refcount: Double = js.native
  /**
    *  Abort the currently running transaction.
    *
    *  Only intended to be called within the `fn` option to `::transact`.
    */
  def abortTransaction(): Unit = js.native
  // Markers
  /** Create a layer to contain a set of related markers. */
  def addMarkerLayer(): MarkerLayer = js.native
  def addMarkerLayer(options: Role): MarkerLayer = js.native
  /** Append text to the end of the buffer. */
  def append(text: String): Range = js.native
  def append(text: String, options: TextEditOptions): Range = js.native
  /**
    *  Scan regular expression matches in the entire buffer in reverse order,
    *  calling the given iterator function on each match.
    */
  def backwardsScan(regex: RegExp, iterator: js.Function1[/* params */ BufferScanResult, Unit]): Unit = js.native
  /**
    *  Scan regular expression matches in the entire buffer in reverse order,
    *  calling the given iterator function on each match.
    */
  def backwardsScan(
    regex: RegExp,
    options: ScanContextOptions,
    iterator: js.Function1[/* params */ ContextualBufferScanResult, Unit]
  ): Unit = js.native
  /**
    *  Scan regular expression matches in a given range in reverse order,
    *  calling the given iterator function on each match.
    */
  def backwardsScanInRange(regex: RegExp, range: RangeCompatible, iterator: js.Function1[/* params */ BufferScanResult, Unit]): Unit = js.native
  /**
    *  Scan regular expression matches in a given range in reverse order,
    *  calling the given iterator function on each match.
    */
  def backwardsScanInRange(
    regex: RegExp,
    range: RangeCompatible,
    options: ScanContextOptions,
    iterator: js.Function1[/* params */ ContextualBufferScanResult, Unit]
  ): Unit = js.native
  /**
    *  Convert a position in the buffer in row/column coordinates to an absolute
    *  character offset, inclusive of line ending characters.
    */
  def characterIndexForPosition(position: PointCompatible): Double = js.native
  /** Clear the undo stack. */
  def clearUndoStack(): Unit = js.native
  /** Clip the given point so it is at a valid position in the buffer. */
  def clipPosition(position: PointCompatible): Point = js.native
  /** Clip the given range so it starts and ends at valid positions. */
  def clipRange(range: RangeCompatible): Range = js.native
  /**
    *  Create a pointer to the current state of the buffer for use with
    *  `::revertToCheckpoint` and `::groupChangesSinceCheckpoint`.
    *  @return A checkpoint ID value.
    */
  def createCheckpoint(): Double = js.native
  def createCheckpoint(options: HistoryTransactionOptions): Double = js.native
  /** Delete the text in the given range. */
  def delete(range: RangeCompatible): Range = js.native
  /**
    *  Delete the line associated with a specified 0-indexed row.
    *  @param row A number representing the row to delete.
    */
  def deleteRow(row: Double): Range = js.native
  /**
    *  Delete the lines associated with the specified 0-indexed row range.
    *
    *  If the row range is out of bounds, it will be clipped. If the `startRow`
    *  is greater than the `endRow`, they will be reordered.
    */
  def deleteRows(startRow: Double, endRow: Double): Range = js.native
  /** Destroy the buffer, even if there are retainers for it. */
  def destroy(): Unit = js.native
  /** Find markers conforming to the given parameters in the default marker layer. */
  def findMarkers(params: FindMarkerOptions): js.Array[Marker] = js.native
  /**
    *  Returns a list of changes since the given checkpoint.
    *  If the given checkpoint is no longer present in the undo history, this method
    *  will return an empty Array.
    */
  def getChangesSinceCheckpoint(checkpoint: Double): js.Array[NewExtent] = js.native
  /** Get the default MarkerLayer. */
  def getDefaultMarkerLayer(): MarkerLayer = js.native
  /** Returns the string encoding of this buffer. */
  def getEncoding(): String = js.native
  /** Get the maximal position in the buffer, where new text would be appended. */
  def getEndPosition(): Point = js.native
  /** Get the first position in the buffer, which is always [0, 0]. */
  def getFirstPosition(): Point = js.native
  /** Returns the unique identifier for this buffer. */
  def getId(): String = js.native
  /** Get the text of the last line of the buffer, without its line ending. */
  def getLastLine(): String = js.native
  /** Get the last 0-indexed row in the buffer. */
  def getLastRow(): Double = js.native
  /** Get the length of the buffer's text. */
  def getLength(): Double = js.native
  /** Get the number of lines in the buffer. */
  def getLineCount(): Double = js.native
  /** Get the text of all lines in the buffer, without their line endings. */
  def getLines(): js.Array[String] = js.native
  /** Get an existing marker by its id from the default marker layer. */
  def getMarker(id: Double): Marker = js.native
  /** Get the number of markers in the default marker layer. */
  def getMarkerCount(): Double = js.native
  /**
    *  Get a MarkerLayer by id.
    *  Returns a MarkerLayer or undefined if no layer exists with the given id.
    */
  def getMarkerLayer(id: String): js.UndefOr[MarkerLayer] = js.native
  /** Get all existing markers on the default marker layer. */
  def getMarkers(): js.Array[Marker] = js.native
  /** Get the length of the buffer in characters. */
  def getMaxCharacterIndex(): Double = js.native
  /** Get the path of the associated file. */
  def getPath(): js.UndefOr[String] = js.native
  // Buffer Range Details
  /** Get the range spanning from [0, 0] to ::getEndPosition. */
  def getRange(): Range = js.native
  /**
    *  Get the number of milliseconds that will elapse without a change before
    *  ::onDidStopChanging observers are invoked following a change.
    */
  def getStoppedChangingDelay(): Double = js.native
  /**
    *  Get the entire text of the buffer. Avoid using this unless you know that
    *  the buffer's text is reasonably short.
    */
  def getText(): String = js.native
  /** Get the text in a range. */
  def getTextInRange(range: RangeCompatible): String = js.native
  /** Get the path of the associated file. */
  def getUri(): String = js.native
  /**
    *  Group all changes since the given checkpoint into a single transaction for
    *  purposes of undo/redo.
    *  @return A boolean indicating whether the operation succeeded.
    */
  def groupChangesSinceCheckpoint(checkpoint: Double): Boolean = js.native
  def groupChangesSinceCheckpoint(checkpoint: Double, options: HistoryTransactionOptions): Boolean = js.native
  /**
    *  Group the last two text changes for purposes of undo/redo.
    *
    *  This operation will only succeed if there are two changes on the undo stack.
    *  It will not group past the beginning of an open transaction.
    *  @return A boolean indicating whether the operation succeeded.
    */
  def groupLastChanges(): Boolean = js.native
  /**
    *  Return true if the buffer contains any astral-plane Unicode characters that
    *  are encoded as surrogate pairs.
    */
  def hasAstral(): Boolean = js.native
  /** Identifies if the buffer belongs to multiple editors. */
  def hasMultipleEditors(): Boolean = js.native
  /** Insert text at the given position. */
  def insert(position: PointCompatible, text: String): Range = js.native
  def insert(position: PointCompatible, text: String, options: TextEditOptions): Range = js.native
  /** Returns whether or not this buffer is alive. */
  def isAlive(): Boolean = js.native
  /** Returns whether or not this buffer has been destroyed. */
  def isDestroyed(): Boolean = js.native
  // Reading Text
  /** Determine whether the buffer is empty. */
  def isEmpty(): Boolean = js.native
  /**
    *  Determine if the in-memory contents of the buffer conflict with the on-disk
    *  contents of its associated file.
    */
  def isInConflict(): Boolean = js.native
  // File Details
  /**
    *  Determine if the in-memory contents of the buffer differ from its contents
    *  on disk.
    *  If the buffer is unsaved, always returns true unless the buffer is empty.
    */
  def isModified(): Boolean = js.native
  /** Returns whether or not this buffer has a retainer. */
  def isRetained(): Boolean = js.native
  /** Determine if the given row contains only whitespace. */
  def isRowBlank(row: Double): Boolean = js.native
  /** Get the line ending for the given 0-indexed row. */
  def lineEndingForRow(row: Double): js.UndefOr[String] = js.native
  /**
    *  Get the text of the line at the given 0-indexed row, without its line ending.
    *  @param row A number representing the row.
    */
  def lineForRow(row: Double): js.UndefOr[String] = js.native
  /**
    *  Get the length of the line for the given 0-indexed row, without its line
    *  ending.
    */
  def lineLengthForRow(row: Double): Double = js.native
  /** Create a marker at the given position with no tail in the default marker layer. */
  def markPosition(position: PointCompatible): Marker = js.native
  def markPosition(position: PointCompatible, options: ExclusiveBoolean): Marker = js.native
  /** Create a marker with the given range in the default marker layer. */
  def markRange(range: RangeCompatible): Marker = js.native
  def markRange(range: RangeCompatible, properties: ExclusiveInvalidate): Marker = js.native
  /**
    *  Given a row, find the next row that's not blank.
    *  Returns a number or null if there's no next non-blank row.
    */
  def nextNonBlankRow(startRow: Double): Double | Null = js.native
  /**
    *  Invoke the given callback synchronously when the content of the buffer
    *  changes. You should probably not be using this in packages.
    */
  def onDidChange(callback: js.Function1[/* event */ BufferChangedEvent, Unit]): Disposable = js.native
  /** Invoke the given callback when the value of ::getEncoding changes. */
  def onDidChangeEncoding(callback: js.Function1[/* encoding */ String, Unit]): Disposable = js.native
  /** Invoke the given callback if the value of ::isModified changes. */
  def onDidChangeModified(callback: js.Function1[/* modified */ Boolean, Unit]): Disposable = js.native
  /** Invoke the given callback when the value of ::getPath changes. */
  def onDidChangePath(callback: js.Function1[/* path */ String, Unit]): Disposable = js.native
  /**
    *  Invoke the given callback synchronously when a transaction finishes with
    *  a list of all the changes in the transaction.
    */
  def onDidChangeText(callback: js.Function1[/* event */ BufferStoppedChangingEvent, Unit]): Disposable = js.native
  /**
    *  Invoke the given callback when the in-memory contents of the buffer become
    *  in conflict with the contents of the file on disk.
    */
  def onDidConflict(callback: js.Function0[Unit]): Disposable = js.native
  def onDidCreateMarker(callback: js.Function1[/* marker */ Marker, Unit]): Disposable = js.native
  /** Invoke the given callback after the file backing the buffer is deleted. */
  def onDidDelete(callback: js.Function0[Unit]): Disposable = js.native
  /** Invoke the given callback when the buffer is destroyed. */
  def onDidDestroy(callback: js.Function0[Unit]): Disposable = js.native
  /**
    *  Invoke the given callback after the buffer is reloaded from the contents
    *  of its file on disk.
    */
  def onDidReload(callback: js.Function0[Unit]): Disposable = js.native
  /** Invoke the given callback after the buffer is saved to disk. */
  def onDidSave(callback: js.Function1[/* event */ FileSavedEvent, Unit]): Disposable = js.native
  /**
    *  Invoke the given callback asynchronously following one or more changes after
    *  ::getStoppedChangingDelay milliseconds elapse without an additional change.
    */
  def onDidStopChanging(callback: js.Function1[/* event */ BufferStoppedChangingEvent, Unit]): Disposable = js.native
  /**
    *  Invoke the given callback when all marker ::onDidChange observers have been
    *  notified following a change to the buffer.
    */
  def onDidUpdateMarkers(callback: js.Function0[Unit]): Disposable = js.native
  // Event Subscription
  /**
    *  Invoke the given callback synchronously before the content of the buffer
    *  changes.
    */
  def onWillChange(callback: js.Function1[/* event */ BufferChangingEvent, Unit]): Disposable = js.native
  /**
    *  Invoke the given callback before the buffer is reloaded from the contents
    *  of its file on disk.
    */
  def onWillReload(callback: js.Function0[Unit]): Disposable = js.native
  /**
    *  Invoke the given callback before the buffer is saved to disk. If the
    *  given callback returns a promise, then the buffer will not be saved until
    *  the promise resolves.
    */
  def onWillSave(callback: js.Function0[js.Promise[Unit] | Unit]): Disposable = js.native
  /** Invoke the given callback when there is an error in watching the file. */
  def onWillThrowWatchError(callback: js.Function1[/* errorObject */ HandleableErrorEvent, Unit]): Disposable = js.native
  /**
    *  Convert an absolute character offset, inclusive of newlines, to a position
    *  in the buffer in row/column coordinates.
    */
  def positionForCharacterIndex(offset: Double): Point = js.native
  /**
    *  Given a row, find the first preceding row that's not blank.
    *  Returns a number or null if there's no preceding non-blank row.
    */
  def previousNonBlankRow(startRow: Double): Double | Null = js.native
  /**
    *  Get the range for the given row.
    *  @param row A number representing a 0-indexed row.
    *  @param includeNewline A boolean indicating whether or not to include the
    *  newline, which results in a range that extends to the start of the next line.
    *  (default: false)
    */
  def rangeForRow(row: Double): Range = js.native
  def rangeForRow(row: Double, includeNewline: Boolean): Range = js.native
  /**
    *  Redo the last operation.
    *  @return A boolean of whether or not a change was made.
    */
  def redo(): Boolean = js.native
  def redo(options: HistoryTraversalOptions): Boolean = js.native
  /**
    *  Releases a retainer on the buffer, destroying the buffer if there are
    *  no additional retainers.
    */
  def release(): TextBuffer = js.native
  /** Reload the buffer's contents from disk. */
  def reload(): Unit = js.native
  /** Replace all regular expression matches in the entire buffer. */
  def replace(regex: RegExp, replacementText: String): Double = js.native
  /**
    *  Places a retainer on the buffer, preventing its destruction until the
    *  final retainer has called ::release().
    */
  def retain(): TextBuffer = js.native
  /**
    *  Revert the buffer to the state it was in when the given checkpoint was created.
    *  @return A boolean indicating whether the operation succeeded.
    */
  def revertToCheckpoint(checkpoint: Double): Boolean = js.native
  def revertToCheckpoint(checkpoint: Double, options: HistoryTraversalOptions): Boolean = js.native
  // Buffer Operations
  /** Save the buffer. */
  def save(): js.Promise[Unit] = js.native
  /** Save the buffer at a specific path. */
  def saveAs(filePath: String): js.Promise[Unit] = js.native
  // Search and Replace
  /**
    *  Scan regular expression matches in the entire buffer, calling the given
    *  iterator function on each match.
    */
  def scan(regex: RegExp, iterator: js.Function1[/* params */ BufferScanResult, Unit]): Unit = js.native
  /**
    *  Scan regular expression matches in the entire buffer, calling the given
    *  iterator function on each match.
    */
  def scan(
    regex: RegExp,
    options: ScanContextOptions,
    iterator: js.Function1[/* params */ ContextualBufferScanResult, Unit]
  ): Unit = js.native
  /**
    *  Scan regular expression matches in a given range , calling the given
    *  iterator function on each match.
    */
  def scanInRange(regex: RegExp, range: RangeCompatible, iterator: js.Function1[/* params */ BufferScanResult, Unit]): Unit = js.native
  /**
    *  Scan regular expression matches in a given range , calling the given
    *  iterator function on each match.
    */
  def scanInRange(
    regex: RegExp,
    range: RangeCompatible,
    options: ScanContextOptions,
    iterator: js.Function1[/* params */ ContextualBufferScanResult, Unit]
  ): Unit = js.native
  /** Returns a plain javascript object representation of the TextBuffer. */
  def serialize(): js.Object = js.native
  def serialize(options: History): js.Object = js.native
  /** Sets the character set encoding for this buffer. */
  def setEncoding(encoding: String): Unit = js.native
  /** Experimental: Set a custom {TextBufferFileBackend} object as the buffer's backing store. */
  def setFile(fileBackend: TextBufferFileBackend): Unit = js.native
  /** Set the path for the buffer's associated file. */
  def setPath(filePath: String): Unit = js.native
  // Mutating Text
  /** Replace the entire contents of the buffer with the given text. */
  def setText(text: String): Range = js.native
  /** Set the text in the given range. */
  def setTextInRange(range: RangeCompatible, text: String): Range = js.native
  def setTextInRange(range: RangeCompatible, text: String, options: TextEditOptions): Range = js.native
  /**
    *  Replace the current buffer contents by applying a diff based on the
    *  given text.
    */
  def setTextViaDiff(text: String): Unit = js.native
  /** Batch multiple operations as a single undo/redo step. */
  def transact[T](fn: js.Function0[T]): T = js.native
  /** Batch multiple operations as a single undo/redo step. */
  def transact[T](optionsOrInterval: Double, fn: js.Function0[T]): T = js.native
  def transact[T](optionsOrInterval: groupingIntervalnumberHis, fn: js.Function0[T]): T = js.native
  // History
  /**
    *  Undo the last operation. If a transaction is in progress, aborts it.
    *  @return A boolean of whether or not a change was made.
    */
  def undo(): Boolean = js.native
  def undo(options: HistoryTraversalOptions): Boolean = js.native
}

/* static members */
@JSImport("atom", "TextBuffer")
@js.native
object TextBuffer extends js.Object {
  /**
    *  Restore a TextBuffer based on an earlier state created using the
    *  TextBuffer::serialize method.
    */
  def deserialize(params: js.Object): js.Promise[TextBuffer] = js.native
  /** Create a new buffer backed by the given file path. */
  def load(filePath: String): js.Promise[TextBuffer] = js.native
  def load(filePath: String, params: BufferLoadOptions): js.Promise[TextBuffer] = js.native
  def load(filePath: TextBufferFileBackend): js.Promise[TextBuffer] = js.native
  def load(filePath: TextBufferFileBackend, params: BufferLoadOptions): js.Promise[TextBuffer] = js.native
  /**
    *  Create a new buffer backed by the given file path. For better performance,
    *  use TextBuffer.load instead.
    */
  def loadSync(filePath: String): TextBuffer = js.native
  def loadSync(filePath: String, params: BufferLoadOptions): TextBuffer = js.native
}

