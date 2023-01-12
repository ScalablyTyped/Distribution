package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageSize extends StObject {
  
  var pageSize: js.UndefOr[Double] = js.undefined
  
  var showLessItems: js.UndefOr[Boolean] = js.undefined
  
  var showSizeChanger: js.UndefOr[Boolean] = js.undefined
  
  var simple: js.UndefOr[Boolean] = js.undefined
}
object PageSize {
  
  inline def apply(): PageSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageSize] (val x: Self) extends AnyVal {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setShowLessItems(value: Boolean): Self = StObject.set(x, "showLessItems", value.asInstanceOf[js.Any])
    
    inline def setShowLessItemsUndefined: Self = StObject.set(x, "showLessItems", js.undefined)
    
    inline def setShowSizeChanger(value: Boolean): Self = StObject.set(x, "showSizeChanger", value.asInstanceOf[js.Any])
    
    inline def setShowSizeChangerUndefined: Self = StObject.set(x, "showSizeChanger", js.undefined)
    
    inline def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
    
    inline def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
  }
}
