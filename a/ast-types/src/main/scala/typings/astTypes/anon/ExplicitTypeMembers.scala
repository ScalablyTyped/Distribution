package typings.astTypes.anon

import typings.astTypes.kindsMod.EnumDefaultedMemberKind
import typings.astTypes.kindsMod.EnumStringMemberKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExplicitTypeMembers extends StObject {
  
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
  implicit class ExplicitTypeMembersMutableBuilder[Self <: ExplicitTypeMembers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplicitType(value: Boolean): Self = StObject.set(x, "explicitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: js.Array[EnumDefaultedMemberKind | EnumStringMemberKind]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: (EnumDefaultedMemberKind | EnumStringMemberKind)*): Self = StObject.set(x, "members", js.Array(value :_*))
  }
}
