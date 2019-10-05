package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsExported
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.ExportSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportSpecifierBuilder extends js.Object {
  def apply(local: js.UndefOr[scala.Nothing], exported: IdentifierKind): ExportSpecifier = js.native
  def apply(local: Null, exported: IdentifierKind): ExportSpecifier = js.native
  def apply(local: IdentifierKind, exported: IdentifierKind): ExportSpecifier = js.native
  def from(params: Anon_CommentsExported): ExportSpecifier = js.native
}

