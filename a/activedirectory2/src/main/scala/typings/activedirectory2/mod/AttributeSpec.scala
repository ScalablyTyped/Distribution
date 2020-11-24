package typings.activedirectory2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeSpec extends js.Object {
  
  var group: js.Array[GroupAttributes] = js.native
  
  var user: js.Array[UserAttributes] = js.native
}
object AttributeSpec {
  
  @scala.inline
  def apply(group: js.Array[GroupAttributes], user: js.Array[UserAttributes]): AttributeSpec = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeSpec]
  }
  
  @scala.inline
  implicit class AttributeSpecOps[Self <: AttributeSpec] (val x: Self) extends AnyVal {
    
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
    def setGroupVarargs(value: GroupAttributes*): Self = this.set("group", js.Array(value :_*))
    
    @scala.inline
    def setGroup(value: js.Array[GroupAttributes]): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserVarargs(value: UserAttributes*): Self = this.set("user", js.Array(value :_*))
    
    @scala.inline
    def setUser(value: js.Array[UserAttributes]): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
