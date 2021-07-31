package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.EnumDefaultedMemberKind
import typings.astTypes.kindsMod.EnumStringMemberKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumStringBody
  extends StObject
     with ASTNode {
  
  var explicitType: Boolean
  
  var members: js.Array[EnumDefaultedMemberKind | EnumStringMemberKind]
  
  var `type`: typings.astTypes.astTypesStrings.EnumStringBody
}
object EnumStringBody {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.EnumStringBody")
  @js.native
  val ^ : Type[EnumStringBody] = js.native
  
  @scala.inline
  implicit class EnumStringBodyMutableBuilder[Self <: EnumStringBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplicitType(value: Boolean): Self = StObject.set(x, "explicitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: js.Array[EnumDefaultedMemberKind | EnumStringMemberKind]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: (EnumDefaultedMemberKind | EnumStringMemberKind)*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.EnumStringBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
