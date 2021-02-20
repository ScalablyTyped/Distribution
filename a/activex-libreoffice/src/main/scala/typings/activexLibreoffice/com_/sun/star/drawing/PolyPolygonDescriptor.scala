package typings.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This service describes a poly-polygon.
  *
  * A poly-polygon consists of multiple polygons combined in one.
  */
@js.native
trait PolyPolygonDescriptor extends StObject {
  
  /** These are the untransformed points of this polygon. */
  var Geometry: PointSequenceSequence = js.native
  
  /** These are the reference points for this polygon. */
  var PolyPolygon: PointSequenceSequence = js.native
  
  /** This is the type of polygon. */
  var PolygonKind: typings.activexLibreoffice.com_.sun.star.drawing.PolygonKind = js.native
}
object PolyPolygonDescriptor {
  
  @scala.inline
  def apply(Geometry: PointSequenceSequence, PolyPolygon: PointSequenceSequence, PolygonKind: PolygonKind): PolyPolygonDescriptor = {
    val __obj = js.Dynamic.literal(Geometry = Geometry.asInstanceOf[js.Any], PolyPolygon = PolyPolygon.asInstanceOf[js.Any], PolygonKind = PolygonKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyPolygonDescriptor]
  }
  
  @scala.inline
  implicit class PolyPolygonDescriptorMutableBuilder[Self <: PolyPolygonDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeometry(value: PointSequenceSequence): Self = StObject.set(x, "Geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryVarargs(value: PointSequence*): Self = StObject.set(x, "Geometry", js.Array(value :_*))
    
    @scala.inline
    def setPolyPolygon(value: PointSequenceSequence): Self = StObject.set(x, "PolyPolygon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolyPolygonVarargs(value: PointSequence*): Self = StObject.set(x, "PolyPolygon", js.Array(value :_*))
    
    @scala.inline
    def setPolygonKind(value: PolygonKind): Self = StObject.set(x, "PolygonKind", value.asInstanceOf[js.Any])
  }
}
