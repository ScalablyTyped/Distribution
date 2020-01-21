package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLocName
import typings.astTypes.kindsMod.JSXExpressionContainerKind
import typings.astTypes.kindsMod.JSXIdentifierKind
import typings.astTypes.kindsMod.JSXNamespacedNameKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.namedTypesMod.namedTypes.JSXAttribute
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
  def from(params: AnonCommentsLocName): JSXAttribute = js.native
}

