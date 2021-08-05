package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumNumberMember
  extends StObject
     with ASTNode {
  
  var id: IdentifierKind
  
  var init: LiteralKind
  
  var `type`: typings.astTypes.astTypesStrings.EnumNumberMember
}
object EnumNumberMember {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.EnumNumberMember")
  @js.native
  val ^ : Type[EnumNumberMember] = js.native
  
  extension [Self <: EnumNumberMember](x: Self) {
    
    inline def setId(value: IdentifierKind): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInit(value: LiteralKind): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.astTypes.astTypesStrings.EnumNumberMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
