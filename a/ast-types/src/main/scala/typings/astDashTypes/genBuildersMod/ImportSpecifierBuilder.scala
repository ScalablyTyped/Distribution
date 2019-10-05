package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsIdImported
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.ImportSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportSpecifierBuilder extends js.Object {
  def apply(imported: IdentifierKind): ImportSpecifier = js.native
  def apply(imported: IdentifierKind, local: IdentifierKind): ImportSpecifier = js.native
  def from(params: Anon_CommentsIdImported): ImportSpecifier = js.native
}

