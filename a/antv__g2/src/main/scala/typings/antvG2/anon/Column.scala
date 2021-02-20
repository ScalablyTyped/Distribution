package typings.antvG2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Column extends StObject {
  
  /**
    * 一般的柱状图占比 1/2
    */
  var column: Double = js.native
  
  /**
    * 多层的饼图、环图
    */
  var multiplePie: Double = js.native
  
  /**
    * 玫瑰图柱状占比 1
    */
  var rose: Double = js.native
}
object Column {
  
  @scala.inline
  def apply(column: Double, multiplePie: Double, rose: Double): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], multiplePie = multiplePie.asInstanceOf[js.Any], rose = rose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplePie(value: Double): Self = StObject.set(x, "multiplePie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRose(value: Double): Self = StObject.set(x, "rose", value.asInstanceOf[js.Any])
  }
}
