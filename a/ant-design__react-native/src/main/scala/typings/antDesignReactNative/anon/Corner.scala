package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Corner extends StObject {
  
  var corner: Boolean = js.native
  
  var dot: Boolean = js.native
  
  var overflowCount: Double = js.native
  
  var size: String = js.native
}
object Corner {
  
  @scala.inline
  def apply(corner: Boolean, dot: Boolean, overflowCount: Double, size: String): Corner = {
    val __obj = js.Dynamic.literal(corner = corner.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], overflowCount = overflowCount.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Corner]
  }
  
  @scala.inline
  implicit class CornerMutableBuilder[Self <: Corner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorner(value: Boolean): Self = StObject.set(x, "corner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowCount(value: Double): Self = StObject.set(x, "overflowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
