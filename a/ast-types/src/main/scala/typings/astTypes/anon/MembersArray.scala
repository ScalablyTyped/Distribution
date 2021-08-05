package typings.astTypes.anon

import typings.astTypes.kindsMod.EnumDefaultedMemberKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MembersArray extends StObject {
  
  var members: js.Array[EnumDefaultedMemberKind]
}
object MembersArray {
  
  inline def apply(members: js.Array[EnumDefaultedMemberKind]): MembersArray = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.asInstanceOf[MembersArray]
  }
  
  extension [Self <: MembersArray](x: Self) {
    
    inline def setMembers(value: js.Array[EnumDefaultedMemberKind]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: EnumDefaultedMemberKind*): Self = StObject.set(x, "members", js.Array(value :_*))
  }
}
