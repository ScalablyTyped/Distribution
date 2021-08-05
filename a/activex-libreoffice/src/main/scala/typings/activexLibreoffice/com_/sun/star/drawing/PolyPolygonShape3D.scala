package typings.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the coordinates of a 3-dimensional poly polygon. */
trait PolyPolygonShape3D extends StObject {
  
  var SequenceX: DoubleSequenceSequence
  
  var SequenceY: DoubleSequenceSequence
  
  var SequenceZ: DoubleSequenceSequence
}
object PolyPolygonShape3D {
  
  inline def apply(
    SequenceX: DoubleSequenceSequence,
    SequenceY: DoubleSequenceSequence,
    SequenceZ: DoubleSequenceSequence
  ): PolyPolygonShape3D = {
    val __obj = js.Dynamic.literal(SequenceX = SequenceX.asInstanceOf[js.Any], SequenceY = SequenceY.asInstanceOf[js.Any], SequenceZ = SequenceZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyPolygonShape3D]
  }
  
  extension [Self <: PolyPolygonShape3D](x: Self) {
    
    inline def setSequenceX(value: DoubleSequenceSequence): Self = StObject.set(x, "SequenceX", value.asInstanceOf[js.Any])
    
    inline def setSequenceXVarargs(value: DoubleSequence*): Self = StObject.set(x, "SequenceX", js.Array(value :_*))
    
    inline def setSequenceY(value: DoubleSequenceSequence): Self = StObject.set(x, "SequenceY", value.asInstanceOf[js.Any])
    
    inline def setSequenceYVarargs(value: DoubleSequence*): Self = StObject.set(x, "SequenceY", js.Array(value :_*))
    
    inline def setSequenceZ(value: DoubleSequenceSequence): Self = StObject.set(x, "SequenceZ", value.asInstanceOf[js.Any])
    
    inline def setSequenceZVarargs(value: DoubleSequence*): Self = StObject.set(x, "SequenceZ", js.Array(value :_*))
  }
}
