package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.com_.sun.star.awt.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This struct defines the attributes of a glue point.
  *
  * A glue point is a position inside a drawing shape where an edge of a connector shape can be connected.
  */
trait GluePoint2 extends StObject {
  
  /** this member specifies the escape direction for a glue point. The escape direction is the direction the connecting line escapes the shape. */
  var Escape: EscapeDirection
  
  /** if this flag is set to true, the position of this glue point is given in 1/100% values instead of 1/100cm. */
  var IsRelative: Boolean
  
  /**
    * if this flag is set to false, this is a default glue point. Some shapes may have default glue points attached to them which cannot be altered or
    * removed.
    */
  var IsUserDefined: Boolean
  
  /** This is the position of this glue point. Depending on the flag `IsRelative` , this is either in 1/100cm or in 1/100%. */
  var Position: Point
  
  /**
    * if this glue points position is not relative, this enum specifies the vertical and horizontal alignment of this point. The alignment specifies how the
    * glue point is moved if the shape is resized.
    */
  var PositionAlignment: Alignment
}
object GluePoint2 {
  
  @scala.inline
  def apply(
    Escape: EscapeDirection,
    IsRelative: Boolean,
    IsUserDefined: Boolean,
    Position: Point,
    PositionAlignment: Alignment
  ): GluePoint2 = {
    val __obj = js.Dynamic.literal(Escape = Escape.asInstanceOf[js.Any], IsRelative = IsRelative.asInstanceOf[js.Any], IsUserDefined = IsUserDefined.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PositionAlignment = PositionAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[GluePoint2]
  }
  
  @scala.inline
  implicit class GluePoint2MutableBuilder[Self <: GluePoint2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEscape(value: EscapeDirection): Self = StObject.set(x, "Escape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRelative(value: Boolean): Self = StObject.set(x, "IsRelative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUserDefined(value: Boolean): Self = StObject.set(x, "IsUserDefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionAlignment(value: Alignment): Self = StObject.set(x, "PositionAlignment", value.asInstanceOf[js.Any])
  }
}
