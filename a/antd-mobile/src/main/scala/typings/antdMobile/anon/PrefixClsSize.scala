package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrefixClsSize extends StObject {
  
  var prefixCls: String
  
  var size: String
}
object PrefixClsSize {
  
  @scala.inline
  def apply(prefixCls: String, size: String): PrefixClsSize = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefixClsSize]
  }
  
  @scala.inline
  implicit class PrefixClsSizeMutableBuilder[Self <: PrefixClsSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
