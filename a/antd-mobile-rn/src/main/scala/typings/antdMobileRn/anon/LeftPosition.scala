package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeftPosition extends StObject {
  
  var left: Double = js.native
  
  var position: String = js.native
  
  var top: Double = js.native
}
object LeftPosition {
  
  @scala.inline
  def apply(left: Double, position: String, top: Double): LeftPosition = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftPosition]
  }
  
  @scala.inline
  implicit class LeftPositionMutableBuilder[Self <: LeftPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
