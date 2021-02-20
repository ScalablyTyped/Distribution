package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumStringMember extends ASTNode {
  
  var id: IdentifierKind = js.native
  
  var init: LiteralKind = js.native
  
  var `type`: typings.astTypes.astTypesStrings.EnumStringMember = js.native
}
object EnumStringMember {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.EnumStringMember")
  @js.native
  val ^ : Type[EnumStringMember] = js.native
  
  @scala.inline
  implicit class EnumStringMemberMutableBuilder[Self <: EnumStringMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: IdentifierKind): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: LiteralKind): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.EnumStringMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
