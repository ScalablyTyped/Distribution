package typings.alipayjssdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Discovering extends StObject {
  
  /** 蓝牙模块是否可用 */
  var available: Boolean
  
  /** 蓝牙模块是否处于搜索状态 */
  var discovering: Boolean
}
object Discovering {
  
  inline def apply(available: Boolean, discovering: Boolean): Discovering = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], discovering = discovering.asInstanceOf[js.Any])
    __obj.asInstanceOf[Discovering]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Discovering] (val x: Self) extends AnyVal {
    
    inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setDiscovering(value: Boolean): Self = StObject.set(x, "discovering", value.asInstanceOf[js.Any])
  }
}
