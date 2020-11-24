package typings.angularPlatformBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomEventName extends js.Object {
  
  var domEventName: String = js.native
  
  var fullKey: String = js.native
}
object DomEventName {
  
  @scala.inline
  def apply(domEventName: String, fullKey: String): DomEventName = {
    val __obj = js.Dynamic.literal(domEventName = domEventName.asInstanceOf[js.Any], fullKey = fullKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomEventName]
  }
  
  @scala.inline
  implicit class DomEventNameOps[Self <: DomEventName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDomEventName(value: String): Self = this.set("domEventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullKey(value: String): Self = this.set("fullKey", value.asInstanceOf[js.Any])
  }
}
