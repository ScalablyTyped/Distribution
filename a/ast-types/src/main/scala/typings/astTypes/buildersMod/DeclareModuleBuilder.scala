package typings.astTypes.buildersMod

import typings.astTypes.AnonBodyCommentsIdLoc
import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.namedTypesMod.namedTypes.DeclareModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareModuleBuilder extends js.Object {
  def apply(id: IdentifierKind, body: BlockStatementKind): DeclareModule = js.native
  def apply(id: LiteralKind, body: BlockStatementKind): DeclareModule = js.native
  def from(params: AnonBodyCommentsIdLoc): DeclareModule = js.native
}

