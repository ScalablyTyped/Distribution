package typings.atom

import typings.atom.anon.ExclusiveInvalidate
import typings.atom.anon.History
import typings.atom.anon.Invalidate
import typings.atom.anon.MaintainHistory
import typings.atom.anon.NewExtent
import typings.atom.anon.NewRange
import typings.atom.anon.ShouldDestroyOnFileDelete
import typings.atom.anon.groupingIntervalnumberund
import typings.atom.dependenciesTextBufferSrcHelpersMod.TextChange
import typings.atom.dependenciesTextBufferSrcMarkerLayerMod.FindMarkerOptions
import typings.atom.dependenciesTextBufferSrcMarkerLayerMod.MarkerLayer
import typings.atom.dependenciesTextBufferSrcMarkerMod.Marker
import typings.atom.dependenciesTextBufferSrcPointMod.PointCompatible
import typings.atom.dependenciesTextBufferSrcRangeMod.RangeCompatible
import typings.atom.mod.Disposable
import typings.atom.srcOtherTypesMod.FileSavedEvent
import typings.atom.srcOtherTypesMod.HandleableErrorEvent
import typings.atom.srcOtherTypesMod.HistoryTransactionOptions
import typings.atom.srcOtherTypesMod.HistoryTraversalOptions
import typings.atom.srcOtherTypesMod.TextEditOptions
import typings.node.fsMod.ReadStream
import typings.node.fsMod.WriteStream
import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dependenciesTextBufferSrcTextBufferMod {
  
  @JSImport("atom/dependencies/text-buffer/src/text-buffer", "Point")
  @js.native
  /** Construct a Point object */
  open class Point ()
    extends typings.atom.dependenciesTextBufferSrcPointMod.Point {
    def this(row: Double) = this()
    def this(row: Double, column: Double) = this()
    def this(row: Unit, column: Double) = this()
  }
  /* static members */
  object Point {
    
    @JSImport("atom/dependencies/text-buffer/src/text-buffer", "Point")
    @js.native
    val ^ : js.Any = js.native
    
    // Construction
    /**
      *  Create a Point from an array containing two numbers representing the
      *  row and column.
      */
    inline def fromObject(`object`: PointCompatible): typings.atom.dependenciesTextBufferSrcPointMod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.atom.dependenciesTextBufferSrcPointMod.Point]
    inline def fromObject(`object`: PointCompatible, copy: Boolean): typings.atom.dependenciesTextBufferSrcPointMod.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any], copy.asInstanceOf[js.Any])).asInstanceOf[typings.atom.dependenciesTextBufferSrcPointMod.Point]
    
    // Comparison
    /** Returns the given Point that is earlier in the buffer. */
    inline def min(point1: PointCompatible, point2: PointCompatible): typings.atom.dependenciesTextBufferSrcPointMod.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[typings.atom.dependenciesTextBufferSrcPointMod.Point]
  }
  
  @JSImport("atom/dependencies/text-buffer/src/text-buffer", "Range")
  @js.native
  /** Construct a Range object. */
  open class Range ()
    extends typings.atom.dependenciesTextBufferSrcRangeMod.Range {
    def this(pointA: PointCompatible) = this()
    def this(pointA: Unit, pointB: PointCompatible) = this()
    def this(pointA: PointCompatible, pointB: PointCompatible) = this()
  }
  /* static members */
  object Range {
    
    @JSImport("atom/dependencies/text-buffer/src/text-buffer", "Range")
    @js.native
    val ^ : js.Any = js.native
    
    /** Call this with the result of Range::serialize to construct a new Range. */
    inline def deserialize(array: js.Object): typings.atom.dependenciesTextBufferSrcRangeMod.Range = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(array.asInstanceOf[js.Any]).asInstanceOf[typings.atom.dependenciesTextBufferSrcRangeMod.Range]
    
    // Construction
    /** Convert any range-compatible object to a Range. */
    inline def fromObject(`object`: RangeCompatible): typings.atom.dependenciesTextBufferSrcRangeMod.Range = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.atom.dependenciesTextBufferSrcRangeMod.Range]
    inline def fromObject(`object`: RangeCompatible, copy: Boolean): typings.atom.dependenciesTextBufferSrcRangeMod.Range = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any], copy.asInstanceOf[js.Any])).asInstanceOf[typings.atom.dependenciesTextBufferSrcRangeMod.Range]
  }
  
  @JSImport("atom/dependencies/text-buffer/src/text-buffer", "TextBuffer")
  @js.native
  /** Create a new buffer with the given params. */
  open class TextBuffer () extends StObject {
    def this(params: ShouldDestroyOnFileDelete) = this()
    /** Create a new buffer with the given starting text. */
    def this(text: String) = this()
    
    /**
      *  Abort the currently running transaction.
      *
      *  Only intended to be called within the `fn` option to `::transact`.
      */
    def abortTransaction(): Unit = js.native
    
    // Markers
    /** Create a layer to contain a set of related markers. */
    def addMarkerLayer(): MarkerLayer = js.native
    def addMarkerLayer(options: MaintainHistory): MarkerLayer = js.native
    
    /** Append text to the end of the buffer. */
    def append(text: String): Range = js.native
    def append(text: String, options: TextEditOptions): Range = js.native
    
    /**
      *  Scan regular expression matches in the entire buffer in reverse order,
      *  calling the given iterator function on each match.
      */
    def backwardsScan(regex: js.RegExp, iterator: js.Function1[/* params */ BufferScanResult, Unit]): Unit = js.native
    /**
      *  Scan regular expression matches in the entire buffer in reverse order,
      *  calling the given iterator function on each match.
      */
    def backwardsScan(
      regex: js.RegExp,
      options: ScanContextOptions,
      iterator: js.Function1[/* params */ ContextualBufferScanResult, Unit]
    ): Unit = js.native
    
    /**
      *  Scan regular expression matches in a given range in reverse order,
      *  calling the given iterator function on each match.
      */
    def backwardsScanInRange(
      regex: js.RegExp,
      range: RangeCompatible,
      iterator: js.Function1[/* params */ BufferScanResult, Unit]
    ): Unit = js.native
    /**
      *  Scan regular expression matches in a given range in reverse order,
      *  calling the given iterator function on each match.
      */
    def backwardsScanInRange(
      regex: js.RegExp,
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
    
    /** Whether or not the bufffer has been destroyed. */
    val destroyed: Boolean = js.native
    
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
    
    /** The unique identifier for this buffer. */
    val id: String = js.native
    
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
    def markPosition(position: PointCompatible, options: ExclusiveInvalidate): Marker = js.native
    
    /** Create a marker with the given range in the default marker layer. */
    def markRange(range: RangeCompatible): Marker = js.native
    def markRange(range: RangeCompatible, properties: Invalidate): Marker = js.native
    
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
    
    /** The number of retainers for the buffer. */
    val refcount: Double = js.native
    
    /**
      *  Releases a retainer on the buffer, destroying the buffer if there are
      *  no additional retainers.
      */
    def release(): TextBuffer = js.native
    
    /** Reload the buffer's contents from disk. */
    def reload(): Unit = js.native
    
    /** Replace all regular expression matches in the entire buffer. */
    def replace(regex: js.RegExp, replacementText: String): Double = js.native
    
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
    def scan(regex: js.RegExp, iterator: js.Function1[/* params */ BufferScanResult, Unit]): Unit = js.native
    /**
      *  Scan regular expression matches in the entire buffer, calling the given
      *  iterator function on each match.
      */
    def scan(
      regex: js.RegExp,
      options: ScanContextOptions,
      iterator: js.Function1[/* params */ ContextualBufferScanResult, Unit]
    ): Unit = js.native
    
    /**
      *  Scan regular expression matches in a given range , calling the given
      *  iterator function on each match.
      */
    def scanInRange(
      regex: js.RegExp,
      range: RangeCompatible,
      iterator: js.Function1[/* params */ BufferScanResult, Unit]
    ): Unit = js.native
    /**
      *  Scan regular expression matches in a given range , calling the given
      *  iterator function on each match.
      */
    def scanInRange(
      regex: js.RegExp,
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
    def transact[T](optionsOrInterval: groupingIntervalnumberund, fn: js.Function0[T]): T = js.native
    
    // History
    /**
      *  Undo the last operation. If a transaction is in progress, aborts it.
      *  @return A boolean of whether or not a change was made.
      */
    def undo(): Boolean = js.native
    def undo(options: HistoryTraversalOptions): Boolean = js.native
  }
  /* static members */
  object TextBuffer {
    
    @JSImport("atom/dependencies/text-buffer/src/text-buffer", "TextBuffer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Restore a TextBuffer based on an earlier state created using the
      *  TextBuffer::serialize method.
      */
    inline def deserialize(params: js.Object): js.Promise[TextBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TextBuffer]]
    
    /** Create a new buffer backed by the given file path. */
    inline def load(filePath: String): js.Promise[TextBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TextBuffer]]
    inline def load(filePath: String, params: BufferLoadOptions): js.Promise[TextBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filePath.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TextBuffer]]
    inline def load(filePath: TextBufferFileBackend): js.Promise[TextBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TextBuffer]]
    inline def load(filePath: TextBufferFileBackend, params: BufferLoadOptions): js.Promise[TextBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filePath.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TextBuffer]]
    
    /**
      *  Create a new buffer backed by the given file path. For better performance,
      *  use TextBuffer.load instead.
      */
    inline def loadSync(filePath: String): TextBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filePath.asInstanceOf[js.Any]).asInstanceOf[TextBuffer]
    inline def loadSync(filePath: String, params: BufferLoadOptions): TextBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filePath.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[TextBuffer]
  }
  
  trait BufferChangedEvent extends StObject {
    
    /**
      *  An array of objects summarizing the aggregated changes that occurred
      *  during the transaction.
      */
    var changes: js.Array[NewRange]
    
    /** Range of the new text. */
    var newRange: Range
    
    /** String containing the text that was inserted. */
    var newText: String
    
    /** Range of the old text. */
    var oldRange: Range
    
    /** String containing the text that was replaced. */
    var oldText: String
  }
  object BufferChangedEvent {
    
    inline def apply(changes: js.Array[NewRange], newRange: Range, newText: String, oldRange: Range, oldText: String): BufferChangedEvent = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], newRange = newRange.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any], oldRange = oldRange.asInstanceOf[js.Any], oldText = oldText.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferChangedEvent]
    }
    
    extension [Self <: BufferChangedEvent](x: Self) {
      
      inline def setChanges(value: js.Array[NewRange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setChangesVarargs(value: NewRange*): Self = StObject.set(x, "changes", js.Array(value*))
      
      inline def setNewRange(value: Range): Self = StObject.set(x, "newRange", value.asInstanceOf[js.Any])
      
      inline def setNewText(value: String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
      
      inline def setOldRange(value: Range): Self = StObject.set(x, "oldRange", value.asInstanceOf[js.Any])
      
      inline def setOldText(value: String): Self = StObject.set(x, "oldText", value.asInstanceOf[js.Any])
    }
  }
  
  trait BufferChangingEvent extends StObject {
    
    /** Range of the old text. */
    var oldRange: Range
  }
  object BufferChangingEvent {
    
    inline def apply(oldRange: Range): BufferChangingEvent = {
      val __obj = js.Dynamic.literal(oldRange = oldRange.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferChangingEvent]
    }
    
    extension [Self <: BufferChangingEvent](x: Self) {
      
      inline def setOldRange(value: Range): Self = StObject.set(x, "oldRange", value.asInstanceOf[js.Any])
    }
  }
  
  trait BufferLoadOptions extends StObject {
    
    /** The file's encoding. */
    var encoding: js.UndefOr[String] = js.undefined
    
    /**
      *  A function that returns a boolean indicating whether the buffer should
      *  be destroyed if its file is deleted.
      */
    var shouldDestroyOnFileDelete: js.UndefOr[js.Function0[Boolean]] = js.undefined
  }
  object BufferLoadOptions {
    
    inline def apply(): BufferLoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BufferLoadOptions]
    }
    
    extension [Self <: BufferLoadOptions](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setShouldDestroyOnFileDelete(value: () => Boolean): Self = StObject.set(x, "shouldDestroyOnFileDelete", js.Any.fromFunction0(value))
      
      inline def setShouldDestroyOnFileDeleteUndefined: Self = StObject.set(x, "shouldDestroyOnFileDelete", js.undefined)
    }
  }
  
  trait BufferScanResult extends StObject {
    
    var buffer: TextBuffer
    
    var lineText: String
    
    var `match`: RegExpExecArray
    
    var matchText: String
    
    var range: Range
    
    def replace(replacementText: String): Unit
    
    def stop(): Unit
    
    var stopped: Boolean
  }
  object BufferScanResult {
    
    inline def apply(
      buffer: TextBuffer,
      lineText: String,
      `match`: RegExpExecArray,
      matchText: String,
      range: Range,
      replace: String => Unit,
      stop: () => Unit,
      stopped: Boolean
    ): BufferScanResult = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], lineText = lineText.asInstanceOf[js.Any], matchText = matchText.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], replace = js.Any.fromFunction1(replace), stop = js.Any.fromFunction0(stop), stopped = stopped.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferScanResult]
    }
    
    extension [Self <: BufferScanResult](x: Self) {
      
      inline def setBuffer(value: TextBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setLineText(value: String): Self = StObject.set(x, "lineText", value.asInstanceOf[js.Any])
      
      inline def setMatch(value: RegExpExecArray): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchText(value: String): Self = StObject.set(x, "matchText", value.asInstanceOf[js.Any])
      
      inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setReplace(value: String => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
    }
  }
  
  trait BufferStoppedChangingEvent extends StObject {
    
    var changes: js.Array[TextChange]
  }
  object BufferStoppedChangingEvent {
    
    inline def apply(changes: js.Array[TextChange]): BufferStoppedChangingEvent = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferStoppedChangingEvent]
    }
    
    extension [Self <: BufferStoppedChangingEvent](x: Self) {
      
      inline def setChanges(value: js.Array[TextChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setChangesVarargs(value: TextChange*): Self = StObject.set(x, "changes", js.Array(value*))
    }
  }
  
  trait ContextualBufferScanResult
    extends StObject
       with BufferScanResult {
    
    var leadingContextLines: js.Array[String]
    
    var trailingContextLines: js.Array[String]
  }
  object ContextualBufferScanResult {
    
    inline def apply(
      buffer: TextBuffer,
      leadingContextLines: js.Array[String],
      lineText: String,
      `match`: RegExpExecArray,
      matchText: String,
      range: Range,
      replace: String => Unit,
      stop: () => Unit,
      stopped: Boolean,
      trailingContextLines: js.Array[String]
    ): ContextualBufferScanResult = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], leadingContextLines = leadingContextLines.asInstanceOf[js.Any], lineText = lineText.asInstanceOf[js.Any], matchText = matchText.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], replace = js.Any.fromFunction1(replace), stop = js.Any.fromFunction0(stop), stopped = stopped.asInstanceOf[js.Any], trailingContextLines = trailingContextLines.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextualBufferScanResult]
    }
    
    extension [Self <: ContextualBufferScanResult](x: Self) {
      
      inline def setLeadingContextLines(value: js.Array[String]): Self = StObject.set(x, "leadingContextLines", value.asInstanceOf[js.Any])
      
      inline def setLeadingContextLinesVarargs(value: String*): Self = StObject.set(x, "leadingContextLines", js.Array(value*))
      
      inline def setTrailingContextLines(value: js.Array[String]): Self = StObject.set(x, "trailingContextLines", value.asInstanceOf[js.Any])
      
      inline def setTrailingContextLinesVarargs(value: String*): Self = StObject.set(x, "trailingContextLines", js.Array(value*))
    }
  }
  
  trait ScanContextOptions extends StObject {
    
    /** The number of lines before the matched line to include in the results object. */
    var leadingContextLineCount: js.UndefOr[Double] = js.undefined
    
    /** The number of lines after the matched line to include in the results object. */
    var trailingContextLineCount: js.UndefOr[Double] = js.undefined
  }
  object ScanContextOptions {
    
    inline def apply(): ScanContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScanContextOptions]
    }
    
    extension [Self <: ScanContextOptions](x: Self) {
      
      inline def setLeadingContextLineCount(value: Double): Self = StObject.set(x, "leadingContextLineCount", value.asInstanceOf[js.Any])
      
      inline def setLeadingContextLineCountUndefined: Self = StObject.set(x, "leadingContextLineCount", js.undefined)
      
      inline def setTrailingContextLineCount(value: Double): Self = StObject.set(x, "trailingContextLineCount", value.asInstanceOf[js.Any])
      
      inline def setTrailingContextLineCountUndefined: Self = StObject.set(x, "trailingContextLineCount", js.undefined)
    }
  }
  
  trait TextBufferFileBackend extends StObject {
    
    /**
      *  A {Function} that returns a `Readable` stream
      *  that can be used to load the file's content.
      */
    def createReadStream(): ReadStream
    
    /**
      *  A {Function} that returns a `Writable` stream
      *  that can be used to save content to the file.
      */
    def createWriteStream(): WriteStream
    
    /** A {Function} that returns a {Boolean}, true if the file exists, false otherwise. */
    def existsSync(): Boolean
    
    /** A {Function} that returns the {String} path to the file. */
    def getPath(): String
    
    /**
      *  A {Function} that invokes its callback argument
      *  when the file changes. The method should return a {Disposable} that
      *  can be used to prevent further calls to the callback.
      */
    var onDidChange: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Disposable]] = js.undefined
    
    /**
      *  A {Function} that invokes its callback argument
      *  when the file is deleted. The method should return a {Disposable} that
      *  can be used to prevent further calls to the callback.
      */
    var onDidDelete: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Disposable]] = js.undefined
    
    /**
      *  A {Function} that invokes its callback argument
      *  when the file is renamed. The method should return a {Disposable} that
      *  can be used to prevent further calls to the callback.
      */
    var onDidRename: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Disposable]] = js.undefined
  }
  object TextBufferFileBackend {
    
    inline def apply(
      createReadStream: () => ReadStream,
      createWriteStream: () => WriteStream,
      existsSync: () => Boolean,
      getPath: () => String
    ): TextBufferFileBackend = {
      val __obj = js.Dynamic.literal(createReadStream = js.Any.fromFunction0(createReadStream), createWriteStream = js.Any.fromFunction0(createWriteStream), existsSync = js.Any.fromFunction0(existsSync), getPath = js.Any.fromFunction0(getPath))
      __obj.asInstanceOf[TextBufferFileBackend]
    }
    
    extension [Self <: TextBufferFileBackend](x: Self) {
      
      inline def setCreateReadStream(value: () => ReadStream): Self = StObject.set(x, "createReadStream", js.Any.fromFunction0(value))
      
      inline def setCreateWriteStream(value: () => WriteStream): Self = StObject.set(x, "createWriteStream", js.Any.fromFunction0(value))
      
      inline def setExistsSync(value: () => Boolean): Self = StObject.set(x, "existsSync", js.Any.fromFunction0(value))
      
      inline def setGetPath(value: () => String): Self = StObject.set(x, "getPath", js.Any.fromFunction0(value))
      
      inline def setOnDidChange(value: /* callback */ js.Function0[Unit] => Disposable): Self = StObject.set(x, "onDidChange", js.Any.fromFunction1(value))
      
      inline def setOnDidChangeUndefined: Self = StObject.set(x, "onDidChange", js.undefined)
      
      inline def setOnDidDelete(value: /* callback */ js.Function0[Unit] => Disposable): Self = StObject.set(x, "onDidDelete", js.Any.fromFunction1(value))
      
      inline def setOnDidDeleteUndefined: Self = StObject.set(x, "onDidDelete", js.undefined)
      
      inline def setOnDidRename(value: /* callback */ js.Function0[Unit] => Disposable): Self = StObject.set(x, "onDidRename", js.Any.fromFunction1(value))
      
      inline def setOnDidRenameUndefined: Self = StObject.set(x, "onDidRename", js.undefined)
    }
  }
}
