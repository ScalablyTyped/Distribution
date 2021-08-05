package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Corner extends StObject {
  
  var corner: Boolean
  
  var dot: Boolean
  
  var overflowCount: Double
  
  var prefixCls: String
  
  var size: String
}
object Corner {
  
  inline def apply(corner: Boolean, dot: Boolean, overflowCount: Double, prefixCls: String, size: String): Corner = {
    val __obj = js.Dynamic.literal(corner = corner.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], overflowCount = overflowCount.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Corner]
  }
  
  extension [Self <: Corner](x: Self) {
    
    inline def setCorner(value: Boolean): Self = StObject.set(x, "corner", value.asInstanceOf[js.Any])
    
    inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
    
    inline def setOverflowCount(value: Double): Self = StObject.set(x, "overflowCount", value.asInstanceOf[js.Any])
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
