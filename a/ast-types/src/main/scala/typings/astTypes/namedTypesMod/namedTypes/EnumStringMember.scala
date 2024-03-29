package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumStringMember
  extends StObject
     with ASTNode {
  
  var id: IdentifierKind
  
  var init: LiteralKind
  
  var `type`: typings.astTypes.astTypesStrings.EnumStringMember
}
object EnumStringMember {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.EnumStringMember")
  @js.native
  val ^ : Type[EnumStringMember] = js.native
  
  extension [Self <: EnumStringMember](x: Self) {
    
    inline def setId(value: IdentifierKind): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInit(value: LiteralKind): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.astTypes.astTypesStrings.EnumStringMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
