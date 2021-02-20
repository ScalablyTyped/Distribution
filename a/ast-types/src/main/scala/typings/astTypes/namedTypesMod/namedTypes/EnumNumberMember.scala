package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumNumberMember extends ASTNode {
  
  var id: IdentifierKind = js.native
  
  var init: LiteralKind = js.native
  
  var `type`: typings.astTypes.astTypesStrings.EnumNumberMember = js.native
}
object EnumNumberMember {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.EnumNumberMember")
  @js.native
  val ^ : Type[EnumNumberMember] = js.native
  
  @scala.inline
  implicit class EnumNumberMemberMutableBuilder[Self <: EnumNumberMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: IdentifierKind): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: LiteralKind): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.EnumNumberMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
