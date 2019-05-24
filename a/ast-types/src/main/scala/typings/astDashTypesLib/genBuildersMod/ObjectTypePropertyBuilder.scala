package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectTypePropertyBuilder extends js.Object {
  def apply(
    key: astDashTypesLib.genKindsMod.IdentifierKind,
    value: astDashTypesLib.genKindsMod.FlowTypeKind,
    optional: scala.Boolean
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectTypeProperty = js.native
  def apply(
    key: astDashTypesLib.genKindsMod.LiteralKind,
    value: astDashTypesLib.genKindsMod.FlowTypeKind,
    optional: scala.Boolean
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectTypeProperty = js.native
  def from(params: astDashTypesLib.Anon_CommentsKey): astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectTypeProperty = js.native
}

