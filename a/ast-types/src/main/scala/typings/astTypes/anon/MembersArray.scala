package typings.astTypes.anon

import typings.astTypes.kindsMod.EnumDefaultedMemberKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembersArray extends js.Object {
  
  var members: js.Array[EnumDefaultedMemberKind] = js.native
}
object MembersArray {
  
  @scala.inline
  def apply(members: js.Array[EnumDefaultedMemberKind]): MembersArray = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.asInstanceOf[MembersArray]
  }
  
  @scala.inline
  implicit class MembersArrayOps[Self <: MembersArray] (val x: Self) extends AnyVal {
    
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
    def setMembersVarargs(value: EnumDefaultedMemberKind*): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: js.Array[EnumDefaultedMemberKind]): Self = this.set("members", value.asInstanceOf[js.Any])
  }
}
