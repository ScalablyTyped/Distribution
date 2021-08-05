package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListViewPrefixCls extends StObject {
  
  var listPrefixCls: String
  
  var listViewPrefixCls: String
  
  var prefixCls: String
}
object ListViewPrefixCls {
  
  inline def apply(listPrefixCls: String, listViewPrefixCls: String, prefixCls: String): ListViewPrefixCls = {
    val __obj = js.Dynamic.literal(listPrefixCls = listPrefixCls.asInstanceOf[js.Any], listViewPrefixCls = listViewPrefixCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewPrefixCls]
  }
  
  extension [Self <: ListViewPrefixCls](x: Self) {
    
    inline def setListPrefixCls(value: String): Self = StObject.set(x, "listPrefixCls", value.asInstanceOf[js.Any])
    
    inline def setListViewPrefixCls(value: String): Self = StObject.set(x, "listViewPrefixCls", value.asInstanceOf[js.Any])
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
  }
}
