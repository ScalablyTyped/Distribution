package typings.antvG2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectNulls extends StObject {
  
  /**
    * @title 是否连接空值，仅对 'line', 'area' 和 'path' 生效
    */
  var connectNulls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 是否对数据进行排序
    */
  var sortable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 是否可见
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ConnectNulls {
  
  inline def apply(): ConnectNulls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectNulls]
  }
  
  extension [Self <: ConnectNulls](x: Self) {
    
    inline def setConnectNulls(value: Boolean): Self = StObject.set(x, "connectNulls", value.asInstanceOf[js.Any])
    
    inline def setConnectNullsUndefined: Self = StObject.set(x, "connectNulls", js.undefined)
    
    inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
