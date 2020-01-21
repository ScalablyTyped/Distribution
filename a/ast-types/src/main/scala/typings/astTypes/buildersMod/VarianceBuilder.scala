package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsKind
import typings.astTypes.astTypesStrings.minus
import typings.astTypes.astTypesStrings.plus
import typings.astTypes.namedTypesMod.namedTypes.Variance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VarianceBuilder extends js.Object {
  def apply(kind: minus): Variance = js.native
  def apply(kind: plus): Variance = js.native
  def from(params: AnonCommentsKind): Variance = js.native
}

