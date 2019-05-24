package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewExpressionBuilder extends js.Object {
  def apply(
    callee: astDashTypesLib.genKindsMod.ExpressionKind,
    argumentsParam: js.Array[
      astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.SpreadElementKind
    ]
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.NewExpression = js.native
  def from(params: astDashTypesLib.Anon_Arguments): astDashTypesLib.genNamedTypesMod.namedTypesNs.NewExpression = js.native
}

