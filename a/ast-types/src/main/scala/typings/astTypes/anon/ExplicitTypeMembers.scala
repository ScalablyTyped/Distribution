package typings.astTypes.anon

import typings.astTypes.kindsMod.EnumDefaultedMemberKind
import typings.astTypes.kindsMod.EnumStringMemberKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExplicitTypeMembers extends js.Object {
  
  var explicitType: Boolean = js.native
  
  var members: js.Array[EnumDefaultedMemberKind | EnumStringMemberKind] = js.native
}
object ExplicitTypeMembers {
  
  @scala.inline
  def apply(explicitType: Boolean, members: js.Array[EnumDefaultedMemberKind | EnumStringMemberKind]): ExplicitTypeMembers = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplicitTypeMembers]
  }
  
  @scala.inline
  implicit class ExplicitTypeMembersOps[Self <: ExplicitTypeMembers] (val x: Self) extends AnyVal {
    
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
    def setExplicitType(value: Boolean): Self = this.set("explicitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: (EnumDefaultedMemberKind | EnumStringMemberKind)*): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: js.Array[EnumDefaultedMemberKind | EnumStringMemberKind]): Self = this.set("members", value.asInstanceOf[js.Any])
  }
}
