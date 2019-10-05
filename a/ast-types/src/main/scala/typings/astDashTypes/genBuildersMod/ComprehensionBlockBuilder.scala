package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsEach
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.ComprehensionBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComprehensionBlockBuilder extends js.Object {
  def apply(left: PatternKind, right: ExpressionKind, each: Boolean): ComprehensionBlock = js.native
  def from(params: Anon_CommentsEach): ComprehensionBlock = js.native
}

