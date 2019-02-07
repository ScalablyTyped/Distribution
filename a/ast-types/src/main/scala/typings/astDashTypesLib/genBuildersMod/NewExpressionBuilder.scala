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
  ): astDashTypesLib.genNodesMod.NewExpression = js.native
  def from(params: astDashTypesLib.Anon_Arguments): astDashTypesLib.genNodesMod.NewExpression = js.native
}

