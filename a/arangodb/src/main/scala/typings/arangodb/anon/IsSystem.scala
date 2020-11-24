package typings.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsSystem extends js.Object {
  
  var isSystem: js.UndefOr[Boolean] = js.native
}
object IsSystem {
  
  @scala.inline
  def apply(): IsSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsSystem]
  }
  
  @scala.inline
  implicit class IsSystemOps[Self <: IsSystem] (val x: Self) extends AnyVal {
    
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
    def setIsSystem(value: Boolean): Self = this.set("isSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSystem: Self = this.set("isSystem", js.undefined)
  }
}
