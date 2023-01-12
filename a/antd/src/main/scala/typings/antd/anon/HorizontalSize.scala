package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HorizontalSize extends StObject {
  
  var horizontalSize: Double
  
  var latestIndex: Double
  
  var supportFlexGap: Boolean
  
  var verticalSize: Double
}
object HorizontalSize {
  
  inline def apply(horizontalSize: Double, latestIndex: Double, supportFlexGap: Boolean, verticalSize: Double): HorizontalSize = {
    val __obj = js.Dynamic.literal(horizontalSize = horizontalSize.asInstanceOf[js.Any], latestIndex = latestIndex.asInstanceOf[js.Any], supportFlexGap = supportFlexGap.asInstanceOf[js.Any], verticalSize = verticalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HorizontalSize] (val x: Self) extends AnyVal {
    
    inline def setHorizontalSize(value: Double): Self = StObject.set(x, "horizontalSize", value.asInstanceOf[js.Any])
    
    inline def setLatestIndex(value: Double): Self = StObject.set(x, "latestIndex", value.asInstanceOf[js.Any])
    
    inline def setSupportFlexGap(value: Boolean): Self = StObject.set(x, "supportFlexGap", value.asInstanceOf[js.Any])
    
    inline def setVerticalSize(value: Double): Self = StObject.set(x, "verticalSize", value.asInstanceOf[js.Any])
  }
}
