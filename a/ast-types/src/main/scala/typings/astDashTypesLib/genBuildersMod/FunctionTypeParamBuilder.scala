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
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.FunctionTypeParam = js.native
  def from(params: astDashTypesLib.Anon_CommentsLocNameOptional): astDashTypesLib.genNamedTypesMod.namedTypesNs.FunctionTypeParam = js.native
}

