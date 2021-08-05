package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableDragHandle extends StObject {
  
  var enableDragHandle: Boolean
  
  var prefixCls: String
}
object EnableDragHandle {
  
  inline def apply(enableDragHandle: Boolean, prefixCls: String): EnableDragHandle = {
    val __obj = js.Dynamic.literal(enableDragHandle = enableDragHandle.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableDragHandle]
  }
  
  extension [Self <: EnableDragHandle](x: Self) {
    
    inline def setEnableDragHandle(value: Boolean): Self = StObject.set(x, "enableDragHandle", value.asInstanceOf[js.Any])
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
  }
}
