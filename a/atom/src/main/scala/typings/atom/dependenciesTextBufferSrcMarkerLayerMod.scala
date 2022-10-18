package typings.atom

import typings.atom.anon.ExclusiveInvalidate
import typings.atom.anon.Invalidate
import typings.atom.dependenciesTextBufferSrcMarkerMod.Marker
import typings.atom.dependenciesTextBufferSrcPointMod.PointCompatible
import typings.atom.dependenciesTextBufferSrcRangeMod.RangeCompatible
import typings.atom.mod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dependenciesTextBufferSrcMarkerLayerMod {
  
  trait FindMarkerOptions extends StObject {
    
    /** Only include markers that contain the given Point, inclusive. */
    var containsPoint: js.UndefOr[PointCompatible] = js.undefined
    
    /** Only include markers that contain the given Range, inclusive. */
    var containsRange: js.UndefOr[RangeCompatible] = js.undefined
    
    /** Only include markers that end at the given Point. */
    var endPosition: js.UndefOr[PointCompatible] = js.undefined
    
    /** Only include markers that end at the given row number. */
    var endRow: js.UndefOr[Double] = js.undefined
    
    /** Only include markers that end inside the given Range. */
    var endsInRange: js.UndefOr[RangeCompatible] = js.undefined
    
    /** Only include markers that intersect the given row number. */
    var intersectsRow: js.UndefOr[Double] = js.undefined
    
    /** Only include markers that start at the given Point. */
    var startPosition: js.UndefOr[PointCompatible] = js.undefined
    
    /** Only include markers that start at the given row number. */
    var startRow: js.UndefOr[Double] = js.undefined
    
    /** Only include markers that start inside the given Range. */
    var startsInRange: js.UndefOr[RangeCompatible] = js.undefined
  }
  object FindMarkerOptions {
    
    inline def apply(): FindMarkerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindMarkerOptions]
    }
    
    extension [Self <: FindMarkerOptions](x: Self) {
      
      inline def setContainsPoint(value: PointCompatible): Self = StObject.set(x, "containsPoint", value.asInstanceOf[js.Any])
      
      inline def setContainsPointUndefined: Self = StObject.set(x, "containsPoint", js.undefined)
      
      inline def setContainsRange(value: RangeCompatible): Self = StObject.set(x, "containsRange", value.asInstanceOf[js.Any])
      
      inline def setContainsRangeUndefined: Self = StObject.set(x, "containsRange", js.undefined)
      
      inline def setEndPosition(value: PointCompatible): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
      
      inline def setEndPositionUndefined: Self = StObject.set(x, "endPosition", js.undefined)
      
      inline def setEndRow(value: Double): Self = StObject.set(x, "endRow", value.asInstanceOf[js.Any])
      
      inline def setEndRowUndefined: Self = StObject.set(x, "endRow", js.undefined)
      
      inline def setEndsInRange(value: RangeCompatible): Self = StObject.set(x, "endsInRange", value.asInstanceOf[js.Any])
      
      inline def setEndsInRangeUndefined: Self = StObject.set(x, "endsInRange", js.undefined)
      
      inline def setIntersectsRow(value: Double): Self = StObject.set(x, "intersectsRow", value.asInstanceOf[js.Any])
      
      inline def setIntersectsRowUndefined: Self = StObject.set(x, "intersectsRow", js.undefined)
      
      inline def setStartPosition(value: PointCompatible): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
      
      inline def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
      
      inline def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
      
      inline def setStartRowUndefined: Self = StObject.set(x, "startRow", js.undefined)
      
      inline def setStartsInRange(value: RangeCompatible): Self = StObject.set(x, "startsInRange", value.asInstanceOf[js.Any])
      
      inline def setStartsInRangeUndefined: Self = StObject.set(x, "startsInRange", js.undefined)
    }
  }
  
  @js.native
  trait MarkerLayer extends StObject {
    
    /** Remove all markers from this layer. */
    def clear(): Unit = js.native
    
    // Lifecycle
    /** Create a copy of this layer with markers in the same state and locations. */
    def copy(): MarkerLayer = js.native
    
    /** Destroy this layer. */
    def destroy(): Boolean = js.native
    
    /** Find markers in the layer conforming to the given parameters. */
    def findMarkers(params: FindMarkerOptions): js.Array[Marker] = js.native
    
    // Querying
    /** Get an existing marker by its id. */
    def getMarker(id: Double): js.UndefOr[Marker] = js.native
    
    /** Get the number of markers in the marker layer. */
    def getMarkerCount(): Double = js.native
    
    /** Get all existing markers on the marker layer. */
    def getMarkers(): js.Array[Marker] = js.native
    
    /** Get the role of the marker layer e.g. "atom.selection". */
    def getRole(): js.UndefOr[String] = js.native
    
    /** The identifier for this MarkerLayer. */
    val id: String = js.native
    
    /** Determine whether this layer has been destroyed. */
    def isDestroyed(): Boolean = js.native
    
    /** Create a marker at with its head at the given position with no tail. */
    def markPosition(position: PointCompatible): Marker = js.native
    def markPosition(position: PointCompatible, options: ExclusiveInvalidate): Marker = js.native
    
    // Marker Creation
    /** Create a marker with the given range. */
    def markRange(range: RangeCompatible): Marker = js.native
    def markRange(range: RangeCompatible, options: Invalidate): Marker = js.native
    
    /**
      *  Subscribe to be notified synchronously whenever markers are created on
      *  this layer.
      */
    def onDidCreateMarker(callback: js.Function1[/* marker */ Marker, Unit]): Disposable = js.native
    
    /** Subscribe to be notified synchronously when this layer is destroyed. */
    def onDidDestroy(callback: js.Function0[Unit]): Disposable = js.native
    
    // Event Subscription
    /**
      *  Subscribe to be notified asynchronously whenever markers are created,
      *  updated, or destroyed on this layer.
      */
    def onDidUpdate(callback: js.Function0[Unit]): Disposable = js.native
  }
}
