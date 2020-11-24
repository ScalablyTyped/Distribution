package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumDefaultedMember extends ASTNode {
  
  var id: IdentifierKind = js.native
  
  var `type`: typings.astTypes.astTypesStrings.EnumDefaultedMember = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.EnumDefaultedMember")
@js.native
object EnumDefaultedMember extends TopLevel[Type[EnumDefaultedMember]]
