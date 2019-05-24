package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionDeclarationBuilder extends js.Object {
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    body: astDashTypesLib.genKindsMod.BlockStatementKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.FunctionDeclaration = js.native
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    body: astDashTypesLib.genKindsMod.BlockStatementKind,
    generator: scala.Boolean
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.FunctionDeclaration = js.native
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    body: astDashTypesLib.genKindsMod.BlockStatementKind,
    generator: scala.Boolean,
    expression: scala.Boolean
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.FunctionDeclaration = js.native
  def from(params: astDashTypesLib.Anon_Async): astDashTypesLib.genNamedTypesMod.namedTypesNs.FunctionDeclaration = js.native
}

