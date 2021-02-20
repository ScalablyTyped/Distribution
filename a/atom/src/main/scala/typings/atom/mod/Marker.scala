package typings.atom.mod

import typings.atom.anon.ExclusiveReversed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Marker extends StObject {
  
  /**
    *  Removes the marker's tail.
    *  Returns a boolean indicating whether or not the marker was updated.
    */
  def clearTail(): Boolean = js.native
  
  /**
    *  Compares this marker to another based on their ranges.
    *  Returns "-1" if this marker precedes the argument.
    *  Returns "0" if this marker is equivalent to the argument.
    *  Returns "1" if this marker follows the argument.
    */
  def compare(other: Marker): Double = js.native
  
  // Lifecycle
  /**
    *  Creates and returns a new Marker with the same properties as this
    *  marker.
    */
  def copy(): Marker = js.native
  def copy(options: CopyMarkerOptions): Marker = js.native
  
  /** Destroys the marker, causing it to emit the "destroyed" event. */
  def destroy(): Unit = js.native
  
  /**
    *  Returns a point representing the end position of the marker, which
    *  could be the head or tail position, depending on its orientation.
    */
  def getEndPosition(): Point = js.native
  
  /** Returns a point representing the marker's current head position. */
  def getHeadPosition(): Point = js.native
  
  /** Get the invalidation strategy for this marker. */
  def getInvalidationStrategy(): String = js.native
  
  // Marker Details
  /** Returns the current range of the marker. The range is immutable. */
  def getRange(): Range = js.native
  
  /**
    *  Returns a point representing the start position of the marker, which
    *  could be the head or tail position, depending on its orientation.
    */
  def getStartPosition(): Point = js.native
  
  /** Returns a point representing the marker's current tail position. */
  def getTailPosition(): Point = js.native
  
  /** Returns a boolean indicating whether the marker has a tail. */
  def hasTail(): Boolean = js.native
  
  /** The identifier for this Marker. */
  val id: Double = js.native
  
  /** Is the marker destroyed? */
  def isDestroyed(): Boolean = js.native
  
  // Comparison
  /**
    *  Returns a boolean indicating whether this marker is equivalent to
    *  another marker, meaning they have the same range and options.
    */
  def isEqual(other: Marker): Boolean = js.native
  
  /**
    *  Returns a boolean indicating whether changes that occur exactly at
    *  the marker's head or tail cause it to move.
    */
  def isExclusive(): Boolean = js.native
  
  /** Returns a boolean indicating whether the head precedes the tail. */
  def isReversed(): Boolean = js.native
  
  /** Is the marker valid? */
  def isValid(): Boolean = js.native
  
  /** Invoke the given callback when the state of the marker changes. */
  def onDidChange(callback: js.Function1[/* event */ MarkerChangedEvent, Unit]): Disposable = js.native
  
  // Event Subscription
  /** Invoke the given callback when the marker is destroyed. */
  def onDidDestroy(callback: js.Function0[Unit]): Disposable = js.native
  
  /**
    *  Plants the marker's tail at the current head position.
    *  Returns a boolean indicating whether or not the marker was updated.
    */
  def plantTail(): Boolean = js.native
  
  /**
    *  Sets the head position of the marker.
    *  Returns a boolean indicating whether or not the marker was updated.
    */
  def setHeadPosition(position: PointCompatible): Boolean = js.native
  
  // Mutating Markers
  /**
    *  Sets the range of the marker.
    *  Returns a boolean indicating whether or not the marker was updated.
    */
  def setRange(range: RangeCompatible): Boolean = js.native
  def setRange(range: RangeCompatible, params: ExclusiveReversed): Boolean = js.native
  
  /**
    *  Sets the tail position of the marker.
    *  Returns a boolean indicating whether or not the marker was updated.
    */
  def setTailPosition(position: PointCompatible): Boolean = js.native
}
