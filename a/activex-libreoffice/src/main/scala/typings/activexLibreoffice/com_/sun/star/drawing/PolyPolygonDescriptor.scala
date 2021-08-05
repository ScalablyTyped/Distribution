package typings.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This service describes a poly-polygon.
  *
  * A poly-polygon consists of multiple polygons combined in one.
  */
trait PolyPolygonDescriptor extends StObject {
  
  /** These are the untransformed points of this polygon. */
  var Geometry: PointSequenceSequence
  
  /** These are the reference points for this polygon. */
  var PolyPolygon: PointSequenceSequence
  
  /** This is the type of polygon. */
  var PolygonKind: typings.activexLibreoffice.com_.sun.star.drawing.PolygonKind
}
object PolyPolygonDescriptor {
  
  inline def apply(Geometry: PointSequenceSequence, PolyPolygon: PointSequenceSequence, PolygonKind: PolygonKind): PolyPolygonDescriptor = {
    val __obj = js.Dynamic.literal(Geometry = Geometry.asInstanceOf[js.Any], PolyPolygon = PolyPolygon.asInstanceOf[js.Any], PolygonKind = PolygonKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyPolygonDescriptor]
  }
  
  extension [Self <: PolyPolygonDescriptor](x: Self) {
    
    inline def setGeometry(value: PointSequenceSequence): Self = StObject.set(x, "Geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryVarargs(value: PointSequence*): Self = StObject.set(x, "Geometry", js.Array(value :_*))
    
    inline def setPolyPolygon(value: PointSequenceSequence): Self = StObject.set(x, "PolyPolygon", value.asInstanceOf[js.Any])
    
    inline def setPolyPolygonVarargs(value: PointSequence*): Self = StObject.set(x, "PolyPolygon", js.Array(value :_*))
    
    inline def setPolygonKind(value: PolygonKind): Self = StObject.set(x, "PolygonKind", value.asInstanceOf[js.Any])
  }
}
