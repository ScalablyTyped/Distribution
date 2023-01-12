package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MiniContentHeight extends StObject {
  
  var miniContentHeight: Double
  
  var monthControlWidth: Double
  
  var yearControlWidth: Double
}
object MiniContentHeight {
  
  inline def apply(miniContentHeight: Double, monthControlWidth: Double, yearControlWidth: Double): MiniContentHeight = {
    val __obj = js.Dynamic.literal(miniContentHeight = miniContentHeight.asInstanceOf[js.Any], monthControlWidth = monthControlWidth.asInstanceOf[js.Any], yearControlWidth = yearControlWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiniContentHeight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MiniContentHeight] (val x: Self) extends AnyVal {
    
    inline def setMiniContentHeight(value: Double): Self = StObject.set(x, "miniContentHeight", value.asInstanceOf[js.Any])
    
    inline def setMonthControlWidth(value: Double): Self = StObject.set(x, "monthControlWidth", value.asInstanceOf[js.Any])
    
    inline def setYearControlWidth(value: Double): Self = StObject.set(x, "yearControlWidth", value.asInstanceOf[js.Any])
  }
}
