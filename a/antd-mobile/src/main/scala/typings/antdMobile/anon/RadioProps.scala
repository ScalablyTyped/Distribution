package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadioProps extends StObject {
  
  var listPrefixCls: String = js.native
  
  var prefixCls: String = js.native
}
object RadioProps {
  
  @scala.inline
  def apply(listPrefixCls: String, prefixCls: String): RadioProps = {
    val __obj = js.Dynamic.literal(listPrefixCls = listPrefixCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioProps]
  }
  
  @scala.inline
  implicit class RadioPropsMutableBuilder[Self <: RadioProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListPrefixCls(value: String): Self = StObject.set(x, "listPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
  }
}
