package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXAttributeBuilder extends js.Object {
  def apply(name: astDashTypesLib.genKindsMod.JSXIdentifierKind): astDashTypesLib.genNodesMod.JSXAttribute = js.native
  def apply(
    name: astDashTypesLib.genKindsMod.JSXIdentifierKind,
    value: astDashTypesLib.genKindsMod.JSXExpressionContainerKind
  ): astDashTypesLib.genNodesMod.JSXAttribute = js.native
  def apply(
    name: astDashTypesLib.genKindsMod.JSXIdentifierKind,
    value: astDashTypesLib.genKindsMod.LiteralKind
  ): astDashTypesLib.genNodesMod.JSXAttribute = js.native
  def apply(name: astDashTypesLib.genKindsMod.JSXNamespacedNameKind): astDashTypesLib.genNodesMod.JSXAttribute = js.native
  def apply(
    name: astDashTypesLib.genKindsMod.JSXNamespacedNameKind,
    value: astDashTypesLib.genKindsMod.JSXExpressionContainerKind
  ): astDashTypesLib.genNodesMod.JSXAttribute = js.native
  def apply(
    name: astDashTypesLib.genKindsMod.JSXNamespacedNameKind,
    value: astDashTypesLib.genKindsMod.LiteralKind
  ): astDashTypesLib.genNodesMod.JSXAttribute = js.native
  def from(params: astDashTypesLib.Anon_CommentsLocName): astDashTypesLib.genNodesMod.JSXAttribute = js.native
}

