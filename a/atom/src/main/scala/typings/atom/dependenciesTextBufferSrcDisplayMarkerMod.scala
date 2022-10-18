package typings.atom

import typings.atom.anon.ClipDirectionReversed
import typings.atom.anon.Reversed
import typings.atom.anon.`0`
import typings.atom.dependenciesTextBufferSrcDisplayMarkerLayerMod.FindDisplayMarkerOptions
import typings.atom.dependenciesTextBufferSrcMarkerMod.CopyMarkerOptions
import typings.atom.dependenciesTextBufferSrcPointMod.PointCompatible
import typings.atom.dependenciesTextBufferSrcRangeMod.RangeCompatible
import typings.atom.dependenciesTextBufferSrcTextBufferMod.Point
import typings.atom.dependenciesTextBufferSrcTextBufferMod.Range
import typings.atom.mod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dependenciesTextBufferSrcDisplayMarkerMod {
  
  @js.native
  trait DisplayMarker extends StObject {
    
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
    def getEndScreenPosition(options: `0`): Point = js.native
    
    /** Retrieves the buffer position of the marker's head. */
    def getHeadBufferPosition(): Point = js.native
    
    /** Retrieves the screen position of the marker's head. */
    def getHeadScreenPosition(): Point = js.native
    def getHeadScreenPosition(options: `0`): Point = js.native
    
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
    def getStartScreenPosition(options: `0`): Point = js.native
    
    /** Retrieves the buffer position of the marker's tail. */
    def getTailBufferPosition(): Point = js.native
    
    /** Retrieves the screen position of the marker's tail. */
    def getTailScreenPosition(): Point = js.native
    def getTailScreenPosition(options: `0`): Point = js.native
    
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
    def setHeadScreenPosition(screenPosition: PointCompatible, options: `0`): Unit = js.native
    
    /** Merges an Object containing new properties into the marker's existing properties. */
    def setProperties(properties: js.Object): Unit = js.native
    
    /** Modifies the screen range of this marker. */
    def setScreenRange(screenRange: RangeCompatible): Unit = js.native
    def setScreenRange(screenRange: RangeCompatible, options: ClipDirectionReversed): Unit = js.native
    
    /** Sets the buffer position of the marker's tail. */
    def setTailBufferPosition(bufferPosition: PointCompatible): Unit = js.native
    
    /** Sets the screen position of the marker's tail. */
    def setTailScreenPosition(screenPosition: PointCompatible): Unit = js.native
    def setTailScreenPosition(screenPosition: PointCompatible, options: `0`): Unit = js.native
  }
  
  trait DisplayMarkerChangedEvent extends StObject {
    
    /** Boolean indicating whether the marker had a tail before the change. */
    var hadTail: Boolean
    
    /** Boolean indicating whether the marker now has a tail */
    var hasTail: Boolean
    
    /** Boolean indicating whether the marker is now valid. */
    var isValid: Boolean
    
    /** Point representing the new head buffer position. */
    var newHeadBufferPosition: Point
    
    /** Point representing the new head screen position. */
    var newHeadScreenPosition: Point
    
    /**
      *  -DEPRECATED- Object containing the marker's custom properties after the change.
      *  @deprecated
      */
    var newProperties: js.Object
    
    /** Point representing the new tail buffer position. */
    var newTailBufferPosition: Point
    
    /** Point representing the new tail screen position. */
    var newTailScreenPosition: Point
    
    /** Point representing the former head buffer position. */
    var oldHeadBufferPosition: Point
    
    /** Point representing the former head screen position. */
    var oldHeadScreenPosition: Point
    
    /**
      *  -DEPRECATED- Object containing the marker's custom properties before the change.
      *  @deprecated
      */
    var oldProperties: js.Object
    
    // Point representing the former tail buffer position. */
    var oldTailBufferPosition: Point
    
    /** Point representing the former tail screen position. */
    var oldTailScreenPosition: Point
    
    /**
      *  Boolean indicating whether this change was caused by a textual change to the
      *  buffer or whether the marker was manipulated directly via its public API.
      */
    var textChanged: Boolean
    
    /** Boolean indicating whether the marker was valid before the change. */
    var wasValid: Boolean
  }
  object DisplayMarkerChangedEvent {
    
    inline def apply(
      hadTail: Boolean,
      hasTail: Boolean,
      isValid: Boolean,
      newHeadBufferPosition: Point,
      newHeadScreenPosition: Point,
      newProperties: js.Object,
      newTailBufferPosition: Point,
      newTailScreenPosition: Point,
      oldHeadBufferPosition: Point,
      oldHeadScreenPosition: Point,
      oldProperties: js.Object,
      oldTailBufferPosition: Point,
      oldTailScreenPosition: Point,
      textChanged: Boolean,
      wasValid: Boolean
    ): DisplayMarkerChangedEvent = {
      val __obj = js.Dynamic.literal(hadTail = hadTail.asInstanceOf[js.Any], hasTail = hasTail.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], newHeadBufferPosition = newHeadBufferPosition.asInstanceOf[js.Any], newHeadScreenPosition = newHeadScreenPosition.asInstanceOf[js.Any], newProperties = newProperties.asInstanceOf[js.Any], newTailBufferPosition = newTailBufferPosition.asInstanceOf[js.Any], newTailScreenPosition = newTailScreenPosition.asInstanceOf[js.Any], oldHeadBufferPosition = oldHeadBufferPosition.asInstanceOf[js.Any], oldHeadScreenPosition = oldHeadScreenPosition.asInstanceOf[js.Any], oldProperties = oldProperties.asInstanceOf[js.Any], oldTailBufferPosition = oldTailBufferPosition.asInstanceOf[js.Any], oldTailScreenPosition = oldTailScreenPosition.asInstanceOf[js.Any], textChanged = textChanged.asInstanceOf[js.Any], wasValid = wasValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayMarkerChangedEvent]
    }
    
    extension [Self <: DisplayMarkerChangedEvent](x: Self) {
      
      inline def setHadTail(value: Boolean): Self = StObject.set(x, "hadTail", value.asInstanceOf[js.Any])
      
      inline def setHasTail(value: Boolean): Self = StObject.set(x, "hasTail", value.asInstanceOf[js.Any])
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      inline def setNewHeadBufferPosition(value: Point): Self = StObject.set(x, "newHeadBufferPosition", value.asInstanceOf[js.Any])
      
      inline def setNewHeadScreenPosition(value: Point): Self = StObject.set(x, "newHeadScreenPosition", value.asInstanceOf[js.Any])
      
      inline def setNewProperties(value: js.Object): Self = StObject.set(x, "newProperties", value.asInstanceOf[js.Any])
      
      inline def setNewTailBufferPosition(value: Point): Self = StObject.set(x, "newTailBufferPosition", value.asInstanceOf[js.Any])
      
      inline def setNewTailScreenPosition(value: Point): Self = StObject.set(x, "newTailScreenPosition", value.asInstanceOf[js.Any])
      
      inline def setOldHeadBufferPosition(value: Point): Self = StObject.set(x, "oldHeadBufferPosition", value.asInstanceOf[js.Any])
      
      inline def setOldHeadScreenPosition(value: Point): Self = StObject.set(x, "oldHeadScreenPosition", value.asInstanceOf[js.Any])
      
      inline def setOldProperties(value: js.Object): Self = StObject.set(x, "oldProperties", value.asInstanceOf[js.Any])
      
      inline def setOldTailBufferPosition(value: Point): Self = StObject.set(x, "oldTailBufferPosition", value.asInstanceOf[js.Any])
      
      inline def setOldTailScreenPosition(value: Point): Self = StObject.set(x, "oldTailScreenPosition", value.asInstanceOf[js.Any])
      
      inline def setTextChanged(value: Boolean): Self = StObject.set(x, "textChanged", value.asInstanceOf[js.Any])
      
      inline def setWasValid(value: Boolean): Self = StObject.set(x, "wasValid", value.asInstanceOf[js.Any])
    }
  }
}
