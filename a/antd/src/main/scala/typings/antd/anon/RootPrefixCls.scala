package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootPrefixCls extends StObject {
  
  var rootPrefixCls: js.UndefOr[String] = js.undefined
}
object RootPrefixCls {
  
  @scala.inline
  def apply(): RootPrefixCls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootPrefixCls]
  }
  
  @scala.inline
  implicit class RootPrefixClsMutableBuilder[Self <: RootPrefixCls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRootPrefixCls(value: String): Self = StObject.set(x, "rootPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootPrefixClsUndefined: Self = StObject.set(x, "rootPrefixCls", js.undefined)
  }
}
