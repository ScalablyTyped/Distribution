package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.EnumDefaultedMemberKind
import typings.astTypes.kindsMod.EnumStringMemberKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumStringBody extends ASTNode {
  
  var explicitType: Boolean = js.native
  
  var members: js.Array[EnumDefaultedMemberKind | EnumStringMemberKind] = js.native
  
  var `type`: typings.astTypes.astTypesStrings.EnumStringBody = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.EnumStringBody")
@js.native
object EnumStringBody extends TopLevel[Type[EnumStringBody]]
