package typings.antvGLite

import typings.antvGLite.anon.Segments
import typings.antvGLite.displayObjectMod.DisplayObject
import typings.antvGLite.distTypesMod.BaseStyleProps
import typings.antvGLite.distTypesMod.ParsedBaseStyleProps
import typings.antvGLite.domInterfacesMod.DisplayObjectConfig
import typings.antvGLite.parserTransformMod.ParsedTransform
import typings.antvGLite.polygonMod.Polygon
import typings.antvGLite.shapesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polylineMod {
  
  @JSImport("@antv/g-lite/dist/display-objects/Polyline", "Polyline")
  @js.native
  open class Polyline () extends Polygon {
    def this(hasStyleRest: DisplayObjectConfig[PolylineStyleProps]) = this()
    
    def getEndTangent(): js.Array[js.Array[Double]] = js.native
    
    def getPoint(ratio: Double): Point = js.native
    
    def getPointAtLength(distance: Double): Point = js.native
    
    def getStartTangent(): js.Array[js.Array[Double]] = js.native
    
    def getTotalLength(): Double = js.native
  }
  
  trait ParsedPolylineStyleProps
    extends StObject
       with ParsedBaseStyleProps {
    
    var markerEnd: js.UndefOr[DisplayObject[Any, Any]] = js.undefined
    
    var markerEndOffset: js.UndefOr[Double] = js.undefined
    
    var markerMid: js.UndefOr[DisplayObject[Any, Any]] = js.undefined
    
    var markerStart: js.UndefOr[DisplayObject[Any, Any]] = js.undefined
    
    var markerStartOffset: js.UndefOr[Double] = js.undefined
    
    var points: Segments
  }
  object ParsedPolylineStyleProps {
    
    inline def apply(points: Segments, transform: js.Array[ParsedTransform]): ParsedPolylineStyleProps = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedPolylineStyleProps]
    }
    
    extension [Self <: ParsedPolylineStyleProps](x: Self) {
      
      inline def setMarkerEnd(value: DisplayObject[Any, Any]): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      inline def setMarkerEndOffset(value: Double): Self = StObject.set(x, "markerEndOffset", value.asInstanceOf[js.Any])
      
      inline def setMarkerEndOffsetUndefined: Self = StObject.set(x, "markerEndOffset", js.undefined)
      
      inline def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      inline def setMarkerMid(value: DisplayObject[Any, Any]): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      inline def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      inline def setMarkerStart(value: DisplayObject[Any, Any]): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      inline def setMarkerStartOffset(value: Double): Self = StObject.set(x, "markerStartOffset", value.asInstanceOf[js.Any])
      
      inline def setMarkerStartOffsetUndefined: Self = StObject.set(x, "markerStartOffset", js.undefined)
      
      inline def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      inline def setPoints(value: Segments): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolylineStyleProps
    extends StObject
       with BaseStyleProps {
    
    /**
      * marker will be positioned at the last point
      */
    var markerEnd: js.UndefOr[DisplayObject[Any, Any]] = js.undefined
    
    /**
      * offset relative to original position
      */
    var markerEndOffset: js.UndefOr[Double] = js.undefined
    
    var markerMid: js.UndefOr[DisplayObject[Any, Any]] = js.undefined
    
    /**
      * marker will be positioned at the first point
      */
    var markerStart: js.UndefOr[DisplayObject[Any, Any]] = js.undefined
    
    /**
      * offset relative to original position
      */
    var markerStartOffset: js.UndefOr[Double] = js.undefined
    
    var points: js.Array[js.Tuple2[Double, Double]]
  }
  object PolylineStyleProps {
    
    inline def apply(points: js.Array[js.Tuple2[Double, Double]]): PolylineStyleProps = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolylineStyleProps]
    }
    
    extension [Self <: PolylineStyleProps](x: Self) {
      
      inline def setMarkerEnd(value: DisplayObject[Any, Any]): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      inline def setMarkerEndOffset(value: Double): Self = StObject.set(x, "markerEndOffset", value.asInstanceOf[js.Any])
      
      inline def setMarkerEndOffsetUndefined: Self = StObject.set(x, "markerEndOffset", js.undefined)
      
      inline def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      inline def setMarkerMid(value: DisplayObject[Any, Any]): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      inline def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      inline def setMarkerStart(value: DisplayObject[Any, Any]): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      inline def setMarkerStartOffset(value: Double): Self = StObject.set(x, "markerStartOffset", value.asInstanceOf[js.Any])
      
      inline def setMarkerStartOffsetUndefined: Self = StObject.set(x, "markerStartOffset", js.undefined)
      
      inline def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      inline def setPoints(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "points", js.Array(value*))
    }
  }
}
