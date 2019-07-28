package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsLocProperties
import typings.astDashTypes.genKindsMod.ObjectMethodKind
import typings.astDashTypes.genKindsMod.ObjectPropertyKind
import typings.astDashTypes.genKindsMod.PropertyKind
import typings.astDashTypes.genKindsMod.SpreadElementKind
import typings.astDashTypes.genKindsMod.SpreadPropertyKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.ObjectExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectExpressionBuilder extends js.Object {
  def apply(
    properties: js.Array[
      PropertyKind | ObjectMethodKind | ObjectPropertyKind | SpreadPropertyKind | SpreadElementKind
    ]
  ): ObjectExpression = js.native
  def from(params: Anon_CommentsLocProperties): ObjectExpression = js.native
}

