package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.EnumBooleanMemberKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumBooleanBody extends ASTNode {
  
  var explicitType: Boolean = js.native
  
  var members: js.Array[EnumBooleanMemberKind] = js.native
  
  var `type`: typings.astTypes.astTypesStrings.EnumBooleanBody = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.EnumBooleanBody")
@js.native
object EnumBooleanBody extends TopLevel[Type[EnumBooleanBody]]
