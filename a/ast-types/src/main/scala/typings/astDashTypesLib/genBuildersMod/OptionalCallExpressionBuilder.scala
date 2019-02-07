package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionalCallExpressionBuilder extends js.Object {
  def apply(
    callee: astDashTypesLib.genKindsMod.ExpressionKind,
    argumentsParam: js.Array[
      astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.SpreadElementKind
    ]
  ): astDashTypesLib.genNodesMod.OptionalCallExpression = js.native
  def apply(
    callee: astDashTypesLib.genKindsMod.ExpressionKind,
    argumentsParam: js.Array[
      astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.SpreadElementKind
    ],
    optional: scala.Boolean
  ): astDashTypesLib.genNodesMod.OptionalCallExpression = js.native
  def from(params: astDashTypesLib.Anon_ArgumentsCallee): astDashTypesLib.genNodesMod.OptionalCallExpression = js.native
}

