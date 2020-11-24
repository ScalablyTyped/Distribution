package typings.atom.mod

import typings.atom.anon.ClipDirection
import typings.atom.anon.Reversed
import typings.atom.anon.`26`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayMarker extends js.Object {
  
  /**
    *  Removes the marker's tail. After calling the marker's head position will be
    *  reported as its current tail position until the tail is planted again.
    */
  def clearTail(): Unit = js.native
  
  // Comparing to other markers
  /** Compares this marker to another based on their ranges. */
  def compare(other: DisplayMarker): Double = js.native
  
  /** Creates and returns a new DisplayMarker with the same properties as this marker. */
  def copy(): DisplayMarker = js.native
  def copy(options: CopyMarkerOptions): DisplayMarker = js.native
  
  // Construction and Destruction
  /**
    *  Destroys the marker, causing it to emit the 'destroyed' event. Once destroyed,
    *  a marker cannot be restored by undo/redo operations.
    */
  def destroy(): Unit = js.native
  
  // Managing the marker's range
  /** Gets the buffer range of this marker. */
  def getBufferRange(): Range = js.native
  
  /**
    *  Retrieves the buffer position of the marker's end. This will always be greater
    *  than or equal to the result of DisplayMarker::getStartBufferPosition.
    */
  def getEndBufferPosition(): Point = js.native
  
  /**
    *  Retrieves the screen position of the marker's end. This will always be
    *  greater than or equal to the result of DisplayMarker::getStartScreenPosition.
    */
  def getEndScreenPosition(): Point = js.native
  def getEndScreenPosition(options: `26`): Point = js.native
  
  /** Retrieves the buffer position of the marker's head. */
  def getHeadBufferPosition(): Point = js.native
  
  /** Retrieves the screen position of the marker's head. */
  def getHeadScreenPosition(): Point = js.native
  def getHeadScreenPosition(options: `26`): Point = js.native
  
  /**
    *  Get the invalidation strategy for this marker.
    *  Valid values include: never, surround, overlap, inside, and touch.
    */
  def getInvalidationStrategy(): String = js.native
  
  /** Returns an Object containing any custom properties associated with the marker. */
  def getProperties(): js.Object = js.native
  
  /** Gets the screen range of this marker. */
  def getScreenRange(): Range = js.native
  
  /**
    *  Retrieves the buffer position of the marker's start. This will always be less
    *  than or equal to the result of DisplayMarker::getEndBufferPosition.
    */
  def getStartBufferPosition(): Point = js.native
  
  /**
    *  Retrieves the screen position of the marker's start. This will always be
    *  less than or equal to the result of DisplayMarker::getEndScreenPosition.
    */
  def getStartScreenPosition(): Point = js.native
  def getStartScreenPosition(options: `26`): Point = js.native
  
  /** Retrieves the buffer position of the marker's tail. */
  def getTailBufferPosition(): Point = js.native
  
  /** Retrieves the screen position of the marker's tail. */
  def getTailScreenPosition(): Point = js.native
  def getTailScreenPosition(options: `26`): Point = js.native
  
  /** Returns a boolean indicating whether the marker has a tail. */
  def hasTail(): Boolean = js.native
  
  /**
    *  Returns a boolean indicating whether the marker has been destroyed. A marker
    *  can be invalid without being destroyed, in which case undoing the invalidating
    *  operation would restore the marker.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    *  Returns a boolean indicating whether this marker is equivalent to another
    *  marker, meaning they have the same range and options.
    */
  def isEqual(other: DisplayMarker): Boolean = js.native
  
  /**
    *  Returns a boolean indicating whether changes that occur exactly at the marker's
    *  head or tail cause it to move.
    */
  def isExclusive(): Boolean = js.native
  
  /** Returns a boolean indicating whether the head precedes the tail. */
  def isReversed(): Boolean = js.native
  
  // TextEditorMarker Details
  /**
    *  Returns a boolean indicating whether the marker is valid. Markers can be
    *  invalidated when a region surrounding them in the buffer is changed.
    */
  def isValid(): Boolean = js.native
  
  /** Returns whether this marker matches the given parameters. */
  def matchesProperties(attributes: FindDisplayMarkerOptions): Boolean = js.native
  
  // Event Subscription
  /** Invoke the given callback when the state of the marker changes. */
  def onDidChange(callback: js.Function1[/* event */ DisplayMarkerChangedEvent, Unit]): Disposable = js.native
  
  /** Invoke the given callback when the marker is destroyed. */
  def onDidDestroy(callback: js.Function0[Unit]): Disposable = js.native
  
  /**
    *  Plants the marker's tail at the current head position. After calling the
    *  marker's tail position will be its head position at the time of the call,
    *  regardless of where the marker's head is moved.
    */
  def plantTail(): Unit = js.native
  
  /** Modifies the buffer range of this marker. */
  def setBufferRange(bufferRange: RangeCompatible): Unit = js.native
  def setBufferRange(bufferRange: RangeCompatible, properties: Reversed): Unit = js.native
  
  /** Sets the buffer position of the marker's head. */
  def setHeadBufferPosition(bufferPosition: PointCompatible): Unit = js.native
  
  /** Sets the screen position of the marker's head. */
  def setHeadScreenPosition(screenPosition: PointCompatible): Unit = js.native
  def setHeadScreenPosition(screenPosition: PointCompatible, options: `26`): Unit = js.native
  
  /** Merges an Object containing new properties into the marker's existing properties. */
  def setProperties(properties: js.Object): Unit = js.native
  
  /** Modifies the screen range of this marker. */
  def setScreenRange(screenRange: RangeCompatible): Unit = js.native
  def setScreenRange(screenRange: RangeCompatible, options: ClipDirection): Unit = js.native
  
  /** Sets the buffer position of the marker's tail. */
  def setTailBufferPosition(bufferPosition: PointCompatible): Unit = js.native
  
  /** Sets the screen position of the marker's tail. */
  def setTailScreenPosition(screenPosition: PointCompatible): Unit = js.native
  def setTailScreenPosition(screenPosition: PointCompatible, options: `26`): Unit = js.native
}
