package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_BodyCommentsIdLoc
import typings.astDashTypes.genKindsMod.BlockStatementKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareModuleBuilder extends js.Object {
  def apply(id: IdentifierKind, body: BlockStatementKind): DeclareModule = js.native
  def apply(id: LiteralKind, body: BlockStatementKind): DeclareModule = js.native
  def from(params: Anon_BodyCommentsIdLoc): DeclareModule = js.native
}

