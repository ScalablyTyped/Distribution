package typings.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait To extends js.Object {
  
  var _from: String = js.native
  
  var _to: String = js.native
}
object To {
  
  @scala.inline
  def apply(_from: String, _to: String): To = {
    val __obj = js.Dynamic.literal(_from = _from.asInstanceOf[js.Any], _to = _to.asInstanceOf[js.Any])
    __obj.asInstanceOf[To]
  }
  
  @scala.inline
  implicit class ToOps[Self <: To] (val x: Self) extends AnyVal {
    
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
    def set_from(value: String): Self = this.set("_from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_to(value: String): Self = this.set("_to", value.asInstanceOf[js.Any])
  }
}
