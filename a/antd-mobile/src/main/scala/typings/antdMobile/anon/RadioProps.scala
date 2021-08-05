package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadioProps extends StObject {
  
  var listPrefixCls: String
  
  var prefixCls: String
}
object RadioProps {
  
  inline def apply(listPrefixCls: String, prefixCls: String): RadioProps = {
    val __obj = js.Dynamic.literal(listPrefixCls = listPrefixCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioProps]
  }
  
  extension [Self <: RadioProps](x: Self) {
    
    inline def setListPrefixCls(value: String): Self = StObject.set(x, "listPrefixCls", value.asInstanceOf[js.Any])
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
  }
}
