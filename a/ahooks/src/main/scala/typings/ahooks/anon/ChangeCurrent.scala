package typings.ahooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeCurrent extends StObject {
  
  def changeCurrent(current: Double): Unit
  
  def changePageSize(pageSize: Double): Unit
  
  var current: Double
  
  def onChange(current: Double, pageSize: Double): Unit
  
  var pageSize: Double
  
  var total: Double
  
  var totalPage: Double
}
object ChangeCurrent {
  
  inline def apply(
    changeCurrent: Double => Unit,
    changePageSize: Double => Unit,
    current: Double,
    onChange: (Double, Double) => Unit,
    pageSize: Double,
    total: Double,
    totalPage: Double
  ): ChangeCurrent = {
    val __obj = js.Dynamic.literal(changeCurrent = js.Any.fromFunction1(changeCurrent), changePageSize = js.Any.fromFunction1(changePageSize), current = current.asInstanceOf[js.Any], onChange = js.Any.fromFunction2(onChange), pageSize = pageSize.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], totalPage = totalPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeCurrent]
  }
  
  extension [Self <: ChangeCurrent](x: Self) {
    
    inline def setChangeCurrent(value: Double => Unit): Self = StObject.set(x, "changeCurrent", js.Any.fromFunction1(value))
    
    inline def setChangePageSize(value: Double => Unit): Self = StObject.set(x, "changePageSize", js.Any.fromFunction1(value))
    
    inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: (Double, Double) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalPage(value: Double): Self = StObject.set(x, "totalPage", value.asInstanceOf[js.Any])
  }
}
