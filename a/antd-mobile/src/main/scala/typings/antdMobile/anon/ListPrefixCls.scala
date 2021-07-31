package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPrefixCls extends StObject {
  
  var listPrefixCls: String
  
  var prefixCls: String
}
object ListPrefixCls {
  
  @scala.inline
  def apply(listPrefixCls: String, prefixCls: String): ListPrefixCls = {
    val __obj = js.Dynamic.literal(listPrefixCls = listPrefixCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPrefixCls]
  }
  
  @scala.inline
  implicit class ListPrefixClsMutableBuilder[Self <: ListPrefixCls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListPrefixCls(value: String): Self = StObject.set(x, "listPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
  }
}
