package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootPrefixCls extends StObject {
  
  var rootPrefixCls: String
}
object RootPrefixCls {
  
  inline def apply(rootPrefixCls: String): RootPrefixCls = {
    val __obj = js.Dynamic.literal(rootPrefixCls = rootPrefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootPrefixCls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RootPrefixCls] (val x: Self) extends AnyVal {
    
    inline def setRootPrefixCls(value: String): Self = StObject.set(x, "rootPrefixCls", value.asInstanceOf[js.Any])
  }
}
