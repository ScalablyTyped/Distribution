package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.EnumDefaultedMemberKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumSymbolBody
  extends StObject
     with ASTNode {
  
  var members: js.Array[EnumDefaultedMemberKind]
  
  var `type`: typings.astTypes.astTypesStrings.EnumSymbolBody
}
object EnumSymbolBody {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.EnumSymbolBody")
  @js.native
  val ^ : Type[EnumSymbolBody] = js.native
  
  extension [Self <: EnumSymbolBody](x: Self) {
    
    inline def setMembers(value: js.Array[EnumDefaultedMemberKind]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: EnumDefaultedMemberKind*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    inline def setType(value: typings.astTypes.astTypesStrings.EnumSymbolBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
