package typings.activexLibreoffice.com_.sun.star.geometry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure specifies an arbitrary elliptical arc.
  *
  * This structure contains all parameters necessary to specify arbitrary elliptical arcs. The parameters are modeled closely after the [SVG]{@link
  * url="http://www.w3c.org"} specification.
  *
  * As with the parameters below, there are mostly four different ellipses arcs (two different ellipses, on which four different arcs connect start and
  * end point) which satisfy the given set of constrains. Thus, there are two flags indicating which one of those ellipses should be taken.
  * @since OOo 2.0
  */
@js.native
trait EllipticalArc extends StObject {
  
  var EndPosition: RealPoint2D = js.native
  
  /** If `TRUE` , and there's a choice, take the arc that goes clock-wise from start to end point. */
  var IsClockwiseSweep: Boolean = js.native
  
  /** If `TRUE` , and there's a choice, take the longer one of two arcs connecting start and end point. */
  var IsLargeArc: Boolean = js.native
  
  var RadiusX: Double = js.native
  
  var RadiusY: Double = js.native
  
  var StartPosition: RealPoint2D = js.native
  
  /** Rotation angle of the x axis of the ellipse relative to the x axis of the reference coordinate system. */
  var XAxisRotation: Double = js.native
}
object EllipticalArc {
  
  @scala.inline
  def apply(
    EndPosition: RealPoint2D,
    IsClockwiseSweep: Boolean,
    IsLargeArc: Boolean,
    RadiusX: Double,
    RadiusY: Double,
    StartPosition: RealPoint2D,
    XAxisRotation: Double
  ): EllipticalArc = {
    val __obj = js.Dynamic.literal(EndPosition = EndPosition.asInstanceOf[js.Any], IsClockwiseSweep = IsClockwiseSweep.asInstanceOf[js.Any], IsLargeArc = IsLargeArc.asInstanceOf[js.Any], RadiusX = RadiusX.asInstanceOf[js.Any], RadiusY = RadiusY.asInstanceOf[js.Any], StartPosition = StartPosition.asInstanceOf[js.Any], XAxisRotation = XAxisRotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[EllipticalArc]
  }
  
  @scala.inline
  implicit class EllipticalArcMutableBuilder[Self <: EllipticalArc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndPosition(value: RealPoint2D): Self = StObject.set(x, "EndPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsClockwiseSweep(value: Boolean): Self = StObject.set(x, "IsClockwiseSweep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLargeArc(value: Boolean): Self = StObject.set(x, "IsLargeArc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusX(value: Double): Self = StObject.set(x, "RadiusX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusY(value: Double): Self = StObject.set(x, "RadiusY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPosition(value: RealPoint2D): Self = StObject.set(x, "StartPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisRotation(value: Double): Self = StObject.set(x, "XAxisRotation", value.asInstanceOf[js.Any])
  }
}
