package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectPatternBuilder extends js.Object {
  def apply(
    properties: js.Array[
      astDashTypesLib.genKindsMod.PropertyKind | astDashTypesLib.genKindsMod.PropertyPatternKind | astDashTypesLib.genKindsMod.SpreadPropertyPatternKind | astDashTypesLib.genKindsMod.SpreadPropertyKind | astDashTypesLib.genKindsMod.ObjectPropertyKind | astDashTypesLib.genKindsMod.RestPropertyKind
    ]
  ): astDashTypesLib.genNodesMod.ObjectPattern = js.native
  def from(params: astDashTypesLib.Anon_CommentsDecorators): astDashTypesLib.genNodesMod.ObjectPattern = js.native
}

