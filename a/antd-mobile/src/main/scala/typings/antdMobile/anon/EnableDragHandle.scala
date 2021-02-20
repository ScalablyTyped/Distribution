package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableDragHandle extends StObject {
  
  var enableDragHandle: Boolean = js.native
  
  var prefixCls: String = js.native
}
object EnableDragHandle {
  
  @scala.inline
  def apply(enableDragHandle: Boolean, prefixCls: String): EnableDragHandle = {
    val __obj = js.Dynamic.literal(enableDragHandle = enableDragHandle.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableDragHandle]
  }
  
  @scala.inline
  implicit class EnableDragHandleMutableBuilder[Self <: EnableDragHandle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableDragHandle(value: Boolean): Self = StObject.set(x, "enableDragHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
  }
}
