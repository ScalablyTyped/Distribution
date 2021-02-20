package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumDefaultedMember extends ASTNode {
  
  var id: IdentifierKind = js.native
  
  var `type`: typings.astTypes.astTypesStrings.EnumDefaultedMember = js.native
}
object EnumDefaultedMember {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.EnumDefaultedMember")
  @js.native
  val ^ : Type[EnumDefaultedMember] = js.native
  
  @scala.inline
  implicit class EnumDefaultedMemberMutableBuilder[Self <: EnumDefaultedMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: IdentifierKind): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.EnumDefaultedMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
