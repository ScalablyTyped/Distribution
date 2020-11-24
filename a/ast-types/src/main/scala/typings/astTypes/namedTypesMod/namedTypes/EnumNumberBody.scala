package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.EnumNumberMemberKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumNumberBody extends ASTNode {
  
  var explicitType: Boolean = js.native
  
  var members: js.Array[EnumNumberMemberKind] = js.native
  
  var `type`: typings.astTypes.astTypesStrings.EnumNumberBody = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.EnumNumberBody")
@js.native
object EnumNumberBody extends TopLevel[Type[EnumNumberBody]]
