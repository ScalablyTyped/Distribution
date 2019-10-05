package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsLeftLocRightArray
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.TSQualifiedNameKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSQualifiedName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSQualifiedNameBuilder extends js.Object {
  def apply(left: IdentifierKind, right: IdentifierKind): TSQualifiedName = js.native
  def apply(left: IdentifierKind, right: TSQualifiedNameKind): TSQualifiedName = js.native
  def apply(left: TSQualifiedNameKind, right: IdentifierKind): TSQualifiedName = js.native
  def apply(left: TSQualifiedNameKind, right: TSQualifiedNameKind): TSQualifiedName = js.native
  def from(params: Anon_CommentsLeftLocRightArray): TSQualifiedName = js.native
}

