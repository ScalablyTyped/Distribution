package typings.astTypes.buildersMod

import typings.astTypes.AnonAccessibilityComments
import typings.astTypes.kindsMod.AssignmentPatternKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.TSParameterProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSParameterPropertyBuilder extends js.Object {
  def apply(parameter: AssignmentPatternKind): TSParameterProperty = js.native
  def apply(parameter: IdentifierKind): TSParameterProperty = js.native
  def from(params: AnonAccessibilityComments): TSParameterProperty = js.native
}

