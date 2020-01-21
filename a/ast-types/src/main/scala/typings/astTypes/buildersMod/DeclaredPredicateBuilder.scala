package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLocValue
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclaredPredicateBuilder extends js.Object {
  def apply(value: ExpressionKind): DeclaredPredicate = js.native
  def from(params: AnonCommentsLocValue): DeclaredPredicate = js.native
}

