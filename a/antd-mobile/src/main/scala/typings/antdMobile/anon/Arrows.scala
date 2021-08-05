package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arrows extends StObject {
  
  var arrows: Boolean
  
  var autoplay: Boolean
  
  var cellAlign: String
  
  var dots: Boolean
  
  var infinite: Boolean
  
  var prefixCls: String
  
  var selectedIndex: Double
}
object Arrows {
  
  inline def apply(
    arrows: Boolean,
    autoplay: Boolean,
    cellAlign: String,
    dots: Boolean,
    infinite: Boolean,
    prefixCls: String,
    selectedIndex: Double
  ): Arrows = {
    val __obj = js.Dynamic.literal(arrows = arrows.asInstanceOf[js.Any], autoplay = autoplay.asInstanceOf[js.Any], cellAlign = cellAlign.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arrows]
  }
  
  extension [Self <: Arrows](x: Self) {
    
    inline def setArrows(value: Boolean): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
    
    inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setCellAlign(value: String): Self = StObject.set(x, "cellAlign", value.asInstanceOf[js.Any])
    
    inline def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
    
    inline def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
  }
}
