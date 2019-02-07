package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionTypeParamBuilder extends js.Object {
  def apply(
    name: astDashTypesLib.genKindsMod.IdentifierKind,
    typeAnnotation: astDashTypesLib.genKindsMod.FlowTypeKind,
    optional: scala.Boolean
  ): astDashTypesLib.genNodesMod.FunctionTypeParam = js.native
  def from(params: astDashTypesLib.Anon_CommentsLocNameOptional): astDashTypesLib.genNodesMod.FunctionTypeParam = js.native
}

