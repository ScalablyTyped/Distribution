package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsDecorators
import typings.astDashTypes.genKindsMod.ObjectPropertyKind
import typings.astDashTypes.genKindsMod.PropertyKind
import typings.astDashTypes.genKindsMod.PropertyPatternKind
import typings.astDashTypes.genKindsMod.RestPropertyKind
import typings.astDashTypes.genKindsMod.SpreadPropertyKind
import typings.astDashTypes.genKindsMod.SpreadPropertyPatternKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectPatternBuilder extends js.Object {
  def apply(
    properties: js.Array[
      PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind
    ]
  ): ObjectPattern = js.native
  def from(params: Anon_CommentsDecorators): ObjectPattern = js.native
}

