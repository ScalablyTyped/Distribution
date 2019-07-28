package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsConst
import typings.astDashTypes.astDashTypesStrings.`var`
import typings.astDashTypes.astDashTypesStrings.const
import typings.astDashTypes.astDashTypesStrings.let
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.VariableDeclaratorKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.VariableDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableDeclarationBuilder extends js.Object {
  def apply(kind: `var`, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration = js.native
  def apply(kind: const, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration = js.native
  def apply(kind: let, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration = js.native
  def from(params: Anon_CommentsConst): VariableDeclaration = js.native
}

