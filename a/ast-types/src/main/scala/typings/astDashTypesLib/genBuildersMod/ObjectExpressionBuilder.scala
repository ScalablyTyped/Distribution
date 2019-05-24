package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectExpressionBuilder extends js.Object {
  def apply(
    properties: js.Array[
      astDashTypesLib.genKindsMod.PropertyKind | astDashTypesLib.genKindsMod.ObjectMethodKind | astDashTypesLib.genKindsMod.ObjectPropertyKind | astDashTypesLib.genKindsMod.SpreadPropertyKind | astDashTypesLib.genKindsMod.SpreadElementKind
    ]
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectExpression = js.native
  def from(params: astDashTypesLib.Anon_CommentsLocProperties): astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectExpression = js.native
}

