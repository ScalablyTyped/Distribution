package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableDeclarationBuilder extends js.Object {
  def apply(
    kind: astDashTypesLib.astDashTypesLibStrings.`var`,
    declarations: js.Array[
      astDashTypesLib.genKindsMod.VariableDeclaratorKind | astDashTypesLib.genKindsMod.IdentifierKind
    ]
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.VariableDeclaration = js.native
  def apply(
    kind: astDashTypesLib.astDashTypesLibStrings.const,
    declarations: js.Array[
      astDashTypesLib.genKindsMod.VariableDeclaratorKind | astDashTypesLib.genKindsMod.IdentifierKind
    ]
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.VariableDeclaration = js.native
  def apply(
    kind: astDashTypesLib.astDashTypesLibStrings.let,
    declarations: js.Array[
      astDashTypesLib.genKindsMod.VariableDeclaratorKind | astDashTypesLib.genKindsMod.IdentifierKind
    ]
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.VariableDeclaration = js.native
  def from(params: astDashTypesLib.Anon_CommentsConst): astDashTypesLib.genNamedTypesMod.namedTypesNs.VariableDeclaration = js.native
}

