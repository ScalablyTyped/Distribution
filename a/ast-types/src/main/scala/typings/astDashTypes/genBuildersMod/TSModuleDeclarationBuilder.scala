package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_BodyCommentsDeclare
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.StringLiteralKind
import typings.astDashTypes.genKindsMod.TSModuleBlockKind
import typings.astDashTypes.genKindsMod.TSModuleDeclarationKind
import typings.astDashTypes.genKindsMod.TSQualifiedNameKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSModuleDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSModuleDeclarationBuilder extends js.Object {
  def apply(id: IdentifierKind): TSModuleDeclaration = js.native
  def apply(id: IdentifierKind, body: TSModuleBlockKind): TSModuleDeclaration = js.native
  def apply(id: IdentifierKind, body: TSModuleDeclarationKind): TSModuleDeclaration = js.native
  def apply(id: StringLiteralKind): TSModuleDeclaration = js.native
  def apply(id: StringLiteralKind, body: TSModuleBlockKind): TSModuleDeclaration = js.native
  def apply(id: StringLiteralKind, body: TSModuleDeclarationKind): TSModuleDeclaration = js.native
  def apply(id: TSQualifiedNameKind): TSModuleDeclaration = js.native
  def apply(id: TSQualifiedNameKind, body: TSModuleBlockKind): TSModuleDeclaration = js.native
  def apply(id: TSQualifiedNameKind, body: TSModuleDeclarationKind): TSModuleDeclaration = js.native
  def from(params: Anon_BodyCommentsDeclare): TSModuleDeclaration = js.native
}

