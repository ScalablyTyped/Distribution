package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.EnumDefaultedMemberKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumSymbolBody extends ASTNode {
  
  var members: js.Array[EnumDefaultedMemberKind] = js.native
  
  var `type`: typings.astTypes.astTypesStrings.EnumSymbolBody = js.native
}
object EnumSymbolBody {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.EnumSymbolBody")
  @js.native
  val ^ : Type[EnumSymbolBody] = js.native
  
  @scala.inline
  implicit class EnumSymbolBodyMutableBuilder[Self <: EnumSymbolBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembers(value: js.Array[EnumDefaultedMemberKind]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: EnumDefaultedMemberKind*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.EnumSymbolBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
