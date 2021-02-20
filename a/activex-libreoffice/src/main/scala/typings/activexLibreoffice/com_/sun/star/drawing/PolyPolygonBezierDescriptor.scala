package typings.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This service describes a polypolygonbezier.
  *
  * A polypolygonbezier consists of multiple Bezier polygons combined in one.
  */
@js.native
trait PolyPolygonBezierDescriptor extends StObject {
  
  /** These are the untransformed Bezier coordinates of this polygon. */
  var Geometry: PolyPolygonBezierCoords = js.native
  
  /** These are the Bezier points of this polygon. */
  var PolyPolygonBezier: PolyPolygonBezierCoords = js.native
  
  /** This is the type of this polygon. */
  var PolygonKind: typings.activexLibreoffice.com_.sun.star.drawing.PolygonKind = js.native
}
object PolyPolygonBezierDescriptor {
  
  @scala.inline
  def apply(
    Geometry: PolyPolygonBezierCoords,
    PolyPolygonBezier: PolyPolygonBezierCoords,
    PolygonKind: PolygonKind
  ): PolyPolygonBezierDescriptor = {
    val __obj = js.Dynamic.literal(Geometry = Geometry.asInstanceOf[js.Any], PolyPolygonBezier = PolyPolygonBezier.asInstanceOf[js.Any], PolygonKind = PolygonKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyPolygonBezierDescriptor]
  }
  
  @scala.inline
  implicit class PolyPolygonBezierDescriptorMutableBuilder[Self <: PolyPolygonBezierDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeometry(value: PolyPolygonBezierCoords): Self = StObject.set(x, "Geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolyPolygonBezier(value: PolyPolygonBezierCoords): Self = StObject.set(x, "PolyPolygonBezier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonKind(value: PolygonKind): Self = StObject.set(x, "PolygonKind", value.asInstanceOf[js.Any])
  }
}
