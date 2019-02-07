package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectTypePropertyBuilder extends js.Object {
  def apply(
    key: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.LiteralKind,
    value: astDashTypesLib.genKindsMod.FlowTypeKind,
    optional: scala.Boolean
  ): astDashTypesLib.genNodesMod.ObjectTypeProperty = js.native
  def from(params: astDashTypesLib.Anon_CommentsKey): astDashTypesLib.genNodesMod.ObjectTypeProperty = js.native
}

