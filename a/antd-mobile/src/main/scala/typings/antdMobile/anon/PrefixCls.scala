package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrefixCls extends StObject {
  
  var prefixCls: String = js.native
}
object PrefixCls {
  
  @scala.inline
  def apply(prefixCls: String): PrefixCls = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefixCls]
  }
  
  @scala.inline
  implicit class PrefixClsMutableBuilder[Self <: PrefixCls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
  }
}
