package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsConst
import typings.astTypes.astTypesStrings.`var`
import typings.astTypes.astTypesStrings.const
import typings.astTypes.astTypesStrings.let
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.VariableDeclaratorKind
import typings.astTypes.namedTypesMod.namedTypes.VariableDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableDeclarationBuilder extends js.Object {
  def apply(kind: `var`, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration = js.native
  def apply(kind: const, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration = js.native
  def apply(kind: let, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration = js.native
  def from(params: AnonCommentsConst): VariableDeclaration = js.native
}

