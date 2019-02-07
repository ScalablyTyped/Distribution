package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayExpressionBuilder extends js.Object {
  def apply(
    elements: js.Array[
      astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.SpreadElementKind | astDashTypesLib.genKindsMod.RestElementKind | scala.Null
    ]
  ): astDashTypesLib.genNodesMod.ArrayExpression = js.native
  def from(params: astDashTypesLib.Anon_CommentsElements): astDashTypesLib.genNodesMod.ArrayExpression = js.native
}

