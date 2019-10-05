package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsLocName
import typings.astDashTypes.genKindsMod.JSXExpressionContainerKind
import typings.astDashTypes.genKindsMod.JSXIdentifierKind
import typings.astDashTypes.genKindsMod.JSXNamespacedNameKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.JSXAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXAttributeBuilder extends js.Object {
  def apply(name: JSXIdentifierKind): JSXAttribute = js.native
  def apply(name: JSXIdentifierKind, value: JSXExpressionContainerKind): JSXAttribute = js.native
  def apply(name: JSXIdentifierKind, value: LiteralKind): JSXAttribute = js.native
  def apply(name: JSXNamespacedNameKind): JSXAttribute = js.native
  def apply(name: JSXNamespacedNameKind, value: JSXExpressionContainerKind): JSXAttribute = js.native
  def apply(name: JSXNamespacedNameKind, value: LiteralKind): JSXAttribute = js.native
  def from(params: Anon_CommentsLocName): JSXAttribute = js.native
}

