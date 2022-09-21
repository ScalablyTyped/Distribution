package typings.ahooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Current extends StObject {
  
  var current: Double
  
  def onChange(current: Double): Unit
  
  def onPageSizeChange(size: Double): Unit
  
  var pageSize: Double
  
  var total: Double
}
object Current {
  
  inline def apply(
    current: Double,
    onChange: Double => Unit,
    onPageSizeChange: Double => Unit,
    pageSize: Double,
    total: Double
  ): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onPageSizeChange = js.Any.fromFunction1(onPageSizeChange), pageSize = pageSize.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  
  extension [Self <: Current](x: Self) {
    
    inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnPageSizeChange(value: Double => Unit): Self = StObject.set(x, "onPageSizeChange", js.Any.fromFunction1(value))
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
