package typings.astTypes.anon

import typings.astTypes.kindsMod.EnumNumberMemberKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Members extends StObject {
  
  var explicitType: Boolean
  
  var members: js.Array[EnumNumberMemberKind]
}
object Members {
  
  @scala.inline
  def apply(explicitType: Boolean, members: js.Array[EnumNumberMemberKind]): Members = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.asInstanceOf[Members]
  }
  
  @scala.inline
  implicit class MembersMutableBuilder[Self <: Members] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplicitType(value: Boolean): Self = StObject.set(x, "explicitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: js.Array[EnumNumberMemberKind]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: EnumNumberMemberKind*): Self = StObject.set(x, "members", js.Array(value :_*))
  }
}
