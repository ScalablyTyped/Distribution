package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_Async
import typings.astDashTypes.genKindsMod.BlockStatementKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.FunctionDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionDeclarationBuilder extends js.Object {
  def apply(id: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): FunctionDeclaration = js.native
  def apply(id: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind, generator: Boolean): FunctionDeclaration = js.native
  def apply(
    id: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionDeclaration = js.native
  def from(params: Anon_Async): FunctionDeclaration = js.native
}

