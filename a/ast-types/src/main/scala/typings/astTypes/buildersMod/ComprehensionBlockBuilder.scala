package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsEach
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.namedTypesMod.namedTypes.ComprehensionBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComprehensionBlockBuilder extends js.Object {
  def apply(left: PatternKind, right: ExpressionKind, each: Boolean): ComprehensionBlock = js.native
  def from(params: AnonCommentsEach): ComprehensionBlock = js.native
}

