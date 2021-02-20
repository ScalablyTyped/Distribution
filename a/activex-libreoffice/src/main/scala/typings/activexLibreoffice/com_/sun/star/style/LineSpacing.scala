package typings.activexLibreoffice.com_.sun.star.style

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure is used to specify the height of a text line.
  * @see LineSpacingMode
  */
@js.native
trait LineSpacing extends StObject {
  
  /** This value specifies the height in regard to **Mode** . */
  var Height: Double = js.native
  
  /** This value specifies the way the height is specified. */
  var Mode: Double = js.native
}
object LineSpacing {
  
  @scala.inline
  def apply(Height: Double, Mode: Double): LineSpacing = {
    val __obj = js.Dynamic.literal(Height = Height.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineSpacing]
  }
  
  @scala.inline
  implicit class LineSpacingMutableBuilder[Self <: LineSpacing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
  }
}
