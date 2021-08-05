package typings.antvG2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  /**
    * 一般的柱状图占比 1/2
    */
  var column: Double
  
  /**
    * 多层的饼图、环图
    */
  var multiplePie: Double
  
  /**
    * 玫瑰图柱状占比 1
    */
  var rose: Double
}
object Column {
  
  inline def apply(column: Double, multiplePie: Double, rose: Double): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], multiplePie = multiplePie.asInstanceOf[js.Any], rose = rose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  
  extension [Self <: Column](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setMultiplePie(value: Double): Self = StObject.set(x, "multiplePie", value.asInstanceOf[js.Any])
    
    inline def setRose(value: Double): Self = StObject.set(x, "rose", value.asInstanceOf[js.Any])
  }
}
