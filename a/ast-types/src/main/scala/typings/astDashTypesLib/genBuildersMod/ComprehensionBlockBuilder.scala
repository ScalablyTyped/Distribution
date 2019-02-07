package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComprehensionBlockBuilder extends js.Object {
  def apply(
    left: astDashTypesLib.genKindsMod.PatternKind,
    right: astDashTypesLib.genKindsMod.ExpressionKind,
    each: scala.Boolean
  ): astDashTypesLib.genNodesMod.ComprehensionBlock = js.native
  def from(params: astDashTypesLib.Anon_CommentsEach): astDashTypesLib.genNodesMod.ComprehensionBlock = js.native
}

