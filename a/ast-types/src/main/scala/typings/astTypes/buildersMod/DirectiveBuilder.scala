package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLocValueArray
import typings.astTypes.kindsMod.DirectiveLiteralKind
import typings.astTypes.namedTypesMod.namedTypes.Directive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectiveBuilder extends js.Object {
  def apply(value: DirectiveLiteralKind): Directive = js.native
  def from(params: AnonCommentsLocValueArray): Directive = js.native
}

