package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLocNameArray
import typings.astTypes.kindsMod.JSXIdentifierKind
import typings.astTypes.kindsMod.JSXMemberExpressionKind
import typings.astTypes.kindsMod.JSXNamespacedNameKind
import typings.astTypes.namedTypesMod.namedTypes.JSXClosingElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXClosingElementBuilder extends js.Object {
  def apply(name: JSXIdentifierKind): JSXClosingElement = js.native
  def apply(name: JSXMemberExpressionKind): JSXClosingElement = js.native
  def apply(name: JSXNamespacedNameKind): JSXClosingElement = js.native
  def from(params: AnonCommentsLocNameArray): JSXClosingElement = js.native
}

