package typings.aframe.anon

import typings.three.srcExtrasShapeUtilsMod.Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofShapeUtils extends StObject {
  
  /**
    * Calculate area of a ( 2D ) contour polygon.
    */
  def area(contour: js.Array[Vec2]): Double
  
  /**
    * Note that this is a linear function so it is necessary to calculate separately for x, y components of a polygon.
    * @remarks Used internally by {@link THREE.Path | Path}, {@link THREE.ExtrudeGeometry | ExtrudeGeometry} and {@link THREE.ShapeGeometry | ShapeGeometry}.
    */
  def isClockWise(pts: js.Array[Vec2]): Boolean
  
  /**
    * Used internally by {@link THREE.ExtrudeGeometry | ExtrudeGeometry} and {@link THREE.ShapeGeometry | ShapeGeometry} to calculate faces in shapes with holes.
    */
  def triangulateShape(contour: js.Array[Vec2], holes: js.Array[js.Array[Vec2]]): js.Array[js.Array[Double]]
}
object TypeofShapeUtils {
  
  inline def apply(
    area: js.Array[Vec2] => Double,
    isClockWise: js.Array[Vec2] => Boolean,
    triangulateShape: (js.Array[Vec2], js.Array[js.Array[Vec2]]) => js.Array[js.Array[Double]]
  ): TypeofShapeUtils = {
    val __obj = js.Dynamic.literal(area = js.Any.fromFunction1(area), isClockWise = js.Any.fromFunction1(isClockWise), triangulateShape = js.Any.fromFunction2(triangulateShape))
    __obj.asInstanceOf[TypeofShapeUtils]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofShapeUtils] (val x: Self) extends AnyVal {
    
    inline def setArea(value: js.Array[Vec2] => Double): Self = StObject.set(x, "area", js.Any.fromFunction1(value))
    
    inline def setIsClockWise(value: js.Array[Vec2] => Boolean): Self = StObject.set(x, "isClockWise", js.Any.fromFunction1(value))
    
    inline def setTriangulateShape(value: (js.Array[Vec2], js.Array[js.Array[Vec2]]) => js.Array[js.Array[Double]]): Self = StObject.set(x, "triangulateShape", js.Any.fromFunction2(value))
  }
}
