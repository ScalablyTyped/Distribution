package typings.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Available extends StObject {
  
  /**
    * 服务目前是否可用
    */
  var available: Boolean = js.native
  
  /**
    * 目前是否处于搜索状态
    */
  var discovering: Boolean = js.native
}
object Available {
  
  @scala.inline
  def apply(available: Boolean, discovering: Boolean): Available = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], discovering = discovering.asInstanceOf[js.Any])
    __obj.asInstanceOf[Available]
  }
  
  @scala.inline
  implicit class AvailableMutableBuilder[Self <: Available] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscovering(value: Boolean): Self = StObject.set(x, "discovering", value.asInstanceOf[js.Any])
  }
}
