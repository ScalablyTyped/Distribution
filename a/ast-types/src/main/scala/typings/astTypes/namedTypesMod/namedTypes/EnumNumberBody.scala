package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.EnumNumberMemberKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumNumberBody
  extends StObject
     with ASTNode {
  
  var explicitType: Boolean
  
  var members: js.Array[EnumNumberMemberKind]
  
  var `type`: typings.astTypes.astTypesStrings.EnumNumberBody
}
object EnumNumberBody {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.EnumNumberBody")
  @js.native
  val ^ : Type[EnumNumberBody] = js.native
  
  @scala.inline
  implicit class EnumNumberBodyMutableBuilder[Self <: EnumNumberBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplicitType(value: Boolean): Self = StObject.set(x, "explicitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: js.Array[EnumNumberMemberKind]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: EnumNumberMemberKind*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.EnumNumberBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
