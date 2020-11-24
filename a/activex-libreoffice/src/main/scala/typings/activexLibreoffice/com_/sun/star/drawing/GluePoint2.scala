package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.com_.sun.star.awt.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This struct defines the attributes of a glue point.
  *
  * A glue point is a position inside a drawing shape where an edge of a connector shape can be connected.
  */
@js.native
trait GluePoint2 extends js.Object {
  
  /** this member specifies the escape direction for a glue point. The escape direction is the direction the connecting line escapes the shape. */
  var Escape: EscapeDirection = js.native
  
  /** if this flag is set to true, the position of this glue point is given in 1/100% values instead of 1/100cm. */
  var IsRelative: Boolean = js.native
  
  /**
    * if this flag is set to false, this is a default glue point. Some shapes may have default glue points attached to them which cannot be altered or
    * removed.
    */
  var IsUserDefined: Boolean = js.native
  
  /** This is the position of this glue point. Depending on the flag `IsRelative` , this is either in 1/100cm or in 1/100%. */
  var Position: Point = js.native
  
  /**
    * if this glue points position is not relative, this enum specifies the vertical and horizontal alignment of this point. The alignment specifies how the
    * glue point is moved if the shape is resized.
    */
  var PositionAlignment: Alignment = js.native
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
  implicit class GluePoint2Ops[Self <: GluePoint2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEscape(value: EscapeDirection): Self = this.set("Escape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRelative(value: Boolean): Self = this.set("IsRelative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUserDefined(value: Boolean): Self = this.set("IsUserDefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = this.set("Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionAlignment(value: Alignment): Self = this.set("PositionAlignment", value.asInstanceOf[js.Any])
  }
}
