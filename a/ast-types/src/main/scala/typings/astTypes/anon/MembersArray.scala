package typings.astTypes.anon

import typings.astTypes.kindsMod.EnumDefaultedMemberKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembersArray extends StObject {
  
  var members: js.Array[EnumDefaultedMemberKind] = js.native
}
object MembersArray {
  
  @scala.inline
  def apply(members: js.Array[EnumDefaultedMemberKind]): MembersArray = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.asInstanceOf[MembersArray]
  }
  
  @scala.inline
  implicit class MembersArrayMutableBuilder[Self <: MembersArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembers(value: js.Array[EnumDefaultedMemberKind]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: EnumDefaultedMemberKind*): Self = StObject.set(x, "members", js.Array(value :_*))
  }
}
