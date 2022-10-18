package typings.atom

import typings.atom.anon.ExclusiveReversed
import typings.atom.atomStrings.inside
import typings.atom.atomStrings.never
import typings.atom.atomStrings.overlap
import typings.atom.atomStrings.surround
import typings.atom.atomStrings.touch
import typings.atom.dependenciesTextBufferSrcPointMod.PointCompatible
import typings.atom.dependenciesTextBufferSrcRangeMod.RangeCompatible
import typings.atom.dependenciesTextBufferSrcTextBufferMod.Point
import typings.atom.dependenciesTextBufferSrcTextBufferMod.Range
import typings.atom.mod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dependenciesTextBufferSrcMarkerMod {
  
  trait CopyMarkerOptions extends StObject {
    
    /**
      *  Indicates whether insertions at the start or end of the marked range should
      *  be interpreted as happening outside the marker.
      */
    var exclusive: js.UndefOr[Boolean] = js.undefined
    
    /** Determines the rules by which changes to the buffer invalidate the marker. */
    var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
    
    /** Custom properties to be associated with the marker. */
    var properties: js.UndefOr[js.Object] = js.undefined
    
    /** Creates the marker in a reversed orientation. */
    var reversed: js.UndefOr[Boolean] = js.undefined
    
    /** Whether or not the marker should be tailed. */
    var tailed: js.UndefOr[Boolean] = js.undefined
  }
  object CopyMarkerOptions {
    
    inline def apply(): CopyMarkerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyMarkerOptions]
    }
    
    extension [Self <: CopyMarkerOptions](x: Self) {
      
      inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      inline def setInvalidate(value: never | surround | overlap | inside | touch): Self = StObject.set(x, "invalidate", value.asInstanceOf[js.Any])
      
      inline def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
      
      inline def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      inline def setTailed(value: Boolean): Self = StObject.set(x, "tailed", value.asInstanceOf[js.Any])
      
      inline def setTailedUndefined: Self = StObject.set(x, "tailed", js.undefined)
    }
  }
  
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
  
  trait MarkerChangedEvent extends StObject {
    
    /** Boolean indicating whether the marker had a tail before the change. */
    var hadTail: Boolean
    
    /** Boolean indicating whether the marker now has a tail. */
    var hasTail: Boolean
    
    /** Boolean indicating whether the marker is now valid. */
    var isValid: Boolean
    
    /** Point representing the new head position. */
    var newHeadPosition: Point
    
    /**
      *  -DEPRECATED- Object containing the marker's custom properties after the change.
      *  @deprecated
      */
    var newProperties: js.Object
    
    /** Point representing the new tail position. */
    var newTailPosition: Point
    
    /** Point representing the former head position. */
    var oldHeadPosition: Point
    
    /**
      *  -DEPRECATED- Object containing the marker's custom properties before the change.
      *  @deprecated
      */
    var oldProperties: js.Object
    
    /** Point representing the former tail position. */
    var oldTailPosition: Point
    
    /**
      *  Boolean indicating whether this change was caused by a textual
      *  change to the buffer or whether the marker was manipulated directly
      *  via its public API.
      */
    var textChanged: Boolean
    
    /** Boolean indicating whether the marker was valid before the change. */
    var wasValid: Boolean
  }
  object MarkerChangedEvent {
    
    inline def apply(
      hadTail: Boolean,
      hasTail: Boolean,
      isValid: Boolean,
      newHeadPosition: Point,
      newProperties: js.Object,
      newTailPosition: Point,
      oldHeadPosition: Point,
      oldProperties: js.Object,
      oldTailPosition: Point,
      textChanged: Boolean,
      wasValid: Boolean
    ): MarkerChangedEvent = {
      val __obj = js.Dynamic.literal(hadTail = hadTail.asInstanceOf[js.Any], hasTail = hasTail.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], newHeadPosition = newHeadPosition.asInstanceOf[js.Any], newProperties = newProperties.asInstanceOf[js.Any], newTailPosition = newTailPosition.asInstanceOf[js.Any], oldHeadPosition = oldHeadPosition.asInstanceOf[js.Any], oldProperties = oldProperties.asInstanceOf[js.Any], oldTailPosition = oldTailPosition.asInstanceOf[js.Any], textChanged = textChanged.asInstanceOf[js.Any], wasValid = wasValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkerChangedEvent]
    }
    
    extension [Self <: MarkerChangedEvent](x: Self) {
      
      inline def setHadTail(value: Boolean): Self = StObject.set(x, "hadTail", value.asInstanceOf[js.Any])
      
      inline def setHasTail(value: Boolean): Self = StObject.set(x, "hasTail", value.asInstanceOf[js.Any])
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      inline def setNewHeadPosition(value: Point): Self = StObject.set(x, "newHeadPosition", value.asInstanceOf[js.Any])
      
      inline def setNewProperties(value: js.Object): Self = StObject.set(x, "newProperties", value.asInstanceOf[js.Any])
      
      inline def setNewTailPosition(value: Point): Self = StObject.set(x, "newTailPosition", value.asInstanceOf[js.Any])
      
      inline def setOldHeadPosition(value: Point): Self = StObject.set(x, "oldHeadPosition", value.asInstanceOf[js.Any])
      
      inline def setOldProperties(value: js.Object): Self = StObject.set(x, "oldProperties", value.asInstanceOf[js.Any])
      
      inline def setOldTailPosition(value: Point): Self = StObject.set(x, "oldTailPosition", value.asInstanceOf[js.Any])
      
      inline def setTextChanged(value: Boolean): Self = StObject.set(x, "textChanged", value.asInstanceOf[js.Any])
      
      inline def setWasValid(value: Boolean): Self = StObject.set(x, "wasValid", value.asInstanceOf[js.Any])
    }
  }
}
