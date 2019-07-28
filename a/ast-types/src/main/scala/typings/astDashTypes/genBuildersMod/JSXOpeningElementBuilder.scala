package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_AttributesComments
import typings.astDashTypes.genKindsMod.JSXAttributeKind
import typings.astDashTypes.genKindsMod.JSXIdentifierKind
import typings.astDashTypes.genKindsMod.JSXMemberExpressionKind
import typings.astDashTypes.genKindsMod.JSXNamespacedNameKind
import typings.astDashTypes.genKindsMod.JSXSpreadAttributeKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.JSXOpeningElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXOpeningElementBuilder extends js.Object {
  def apply(name: JSXIdentifierKind): JSXOpeningElement = js.native
  def apply(name: JSXIdentifierKind, attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind]): JSXOpeningElement = js.native
  def apply(
    name: JSXIdentifierKind,
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind],
    selfClosing: Boolean
  ): JSXOpeningElement = js.native
  def apply(name: JSXMemberExpressionKind): JSXOpeningElement = js.native
  def apply(name: JSXMemberExpressionKind, attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind]): JSXOpeningElement = js.native
  def apply(
    name: JSXMemberExpressionKind,
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind],
    selfClosing: Boolean
  ): JSXOpeningElement = js.native
  def apply(name: JSXNamespacedNameKind): JSXOpeningElement = js.native
  def apply(name: JSXNamespacedNameKind, attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind]): JSXOpeningElement = js.native
  def apply(
    name: JSXNamespacedNameKind,
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind],
    selfClosing: Boolean
  ): JSXOpeningElement = js.native
  def from(params: Anon_AttributesComments): JSXOpeningElement = js.native
}

