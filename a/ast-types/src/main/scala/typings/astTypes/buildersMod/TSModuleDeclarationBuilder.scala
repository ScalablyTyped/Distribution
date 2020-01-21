package typings.astTypes.buildersMod

import typings.astTypes.AnonBodyCommentsDeclare
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.StringLiteralKind
import typings.astTypes.kindsMod.TSModuleBlockKind
import typings.astTypes.kindsMod.TSModuleDeclarationKind
import typings.astTypes.kindsMod.TSQualifiedNameKind
import typings.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration
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
  def from(params: AnonBodyCommentsDeclare): TSModuleDeclaration = js.native
}

