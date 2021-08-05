package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumBooleanMember
  extends StObject
     with ASTNode {
  
  var id: IdentifierKind
  
  var init: LiteralKind | Boolean
  
  var `type`: typings.astTypes.astTypesStrings.EnumBooleanMember
}
object EnumBooleanMember {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.EnumBooleanMember")
  @js.native
  val ^ : Type[EnumBooleanMember] = js.native
  
  extension [Self <: EnumBooleanMember](x: Self) {
    
    inline def setId(value: IdentifierKind): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInit(value: LiteralKind | Boolean): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.astTypes.astTypesStrings.EnumBooleanMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
