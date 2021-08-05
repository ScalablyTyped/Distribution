package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Corner extends StObject {
  
  var corner: Boolean
  
  var dot: Boolean
  
  var overflowCount: Double
  
  var size: String
  
  var styles: StringDictionary[RegisteredStyle[js.Any]]
}
object Corner {
  
  inline def apply(
    corner: Boolean,
    dot: Boolean,
    overflowCount: Double,
    size: String,
    styles: StringDictionary[RegisteredStyle[js.Any]]
  ): Corner = {
    val __obj = js.Dynamic.literal(corner = corner.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], overflowCount = overflowCount.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Corner]
  }
  
  extension [Self <: Corner](x: Self) {
    
    inline def setCorner(value: Boolean): Self = StObject.set(x, "corner", value.asInstanceOf[js.Any])
    
    inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
    
    inline def setOverflowCount(value: Double): Self = StObject.set(x, "overflowCount", value.asInstanceOf[js.Any])
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: StringDictionary[RegisteredStyle[js.Any]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
