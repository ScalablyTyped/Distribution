package typings.activexLibreoffice.com_.sun.star.geometry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure defines a two-dimensional point
  *
  * This structure contains x and y real-valued coordinates of a two-dimensional point.
  * @since OOo 2.0
  */
@js.native
trait RealPoint2D extends StObject {
  
  var X: Double = js.native
  
  var Y: Double = js.native
}
object RealPoint2D {
  
  @scala.inline
  def apply(X: Double, Y: Double): RealPoint2D = {
    val __obj = js.Dynamic.literal(X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealPoint2D]
  }
  
  @scala.inline
  implicit class RealPoint2DMutableBuilder[Self <: RealPoint2D] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
  }
}
