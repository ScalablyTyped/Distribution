package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsImportKind
import typings.astDashTypes.astDashTypesStrings.`type`
import typings.astDashTypes.astDashTypesStrings.value
import typings.astDashTypes.genKindsMod.ImportDefaultSpecifierKind
import typings.astDashTypes.genKindsMod.ImportNamespaceSpecifierKind
import typings.astDashTypes.genKindsMod.ImportSpecifierKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.ImportDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportDeclarationBuilder extends js.Object {
  def apply(specifiers: js.UndefOr[scala.Nothing], source: LiteralKind): ImportDeclaration = js.native
  def apply(specifiers: js.UndefOr[scala.Nothing], source: LiteralKind, importKind: `type`): ImportDeclaration = js.native
  def apply(specifiers: js.UndefOr[scala.Nothing], source: LiteralKind, importKind: value): ImportDeclaration = js.native
  def apply(
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    source: LiteralKind
  ): ImportDeclaration = js.native
  def apply(
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    source: LiteralKind,
    importKind: `type`
  ): ImportDeclaration = js.native
  def apply(
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    source: LiteralKind,
    importKind: value
  ): ImportDeclaration = js.native
  def from(params: Anon_CommentsImportKind): ImportDeclaration = js.native
}

