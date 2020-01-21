package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsExportedLocSource
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportAllDeclarationBuilder extends js.Object {
  def apply(exported: Null, source: LiteralKind): ExportAllDeclaration = js.native
  def apply(exported: IdentifierKind, source: LiteralKind): ExportAllDeclaration = js.native
  def from(params: AnonCommentsExportedLocSource): ExportAllDeclaration = js.native
}

