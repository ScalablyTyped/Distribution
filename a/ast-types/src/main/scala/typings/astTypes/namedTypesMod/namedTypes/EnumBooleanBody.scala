package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.EnumBooleanMemberKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumBooleanBody
  extends StObject
     with ASTNode {
  
  var explicitType: Boolean
  
  var members: js.Array[EnumBooleanMemberKind]
  
  var `type`: typings.astTypes.astTypesStrings.EnumBooleanBody
}
object EnumBooleanBody {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.EnumBooleanBody")
  @js.native
  val ^ : Type[EnumBooleanBody] = js.native
  
  extension [Self <: EnumBooleanBody](x: Self) {
    
    inline def setExplicitType(value: Boolean): Self = StObject.set(x, "explicitType", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: js.Array[EnumBooleanMemberKind]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: EnumBooleanMemberKind*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    inline def setType(value: typings.astTypes.astTypesStrings.EnumBooleanBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
