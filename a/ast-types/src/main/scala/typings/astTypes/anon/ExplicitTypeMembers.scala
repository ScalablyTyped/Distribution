package typings.astTypes.anon

import typings.astTypes.kindsMod.EnumDefaultedMemberKind
import typings.astTypes.kindsMod.EnumStringMemberKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplicitTypeMembers extends StObject {
  
  var explicitType: Boolean
  
  var members: js.Array[EnumDefaultedMemberKind | EnumStringMemberKind]
}
object ExplicitTypeMembers {
  
  inline def apply(explicitType: Boolean, members: js.Array[EnumDefaultedMemberKind | EnumStringMemberKind]): ExplicitTypeMembers = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplicitTypeMembers]
  }
  
  extension [Self <: ExplicitTypeMembers](x: Self) {
    
    inline def setExplicitType(value: Boolean): Self = StObject.set(x, "explicitType", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: js.Array[EnumDefaultedMemberKind | EnumStringMemberKind]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: (EnumDefaultedMemberKind | EnumStringMemberKind)*): Self = StObject.set(x, "members", js.Array(value :_*))
  }
}
