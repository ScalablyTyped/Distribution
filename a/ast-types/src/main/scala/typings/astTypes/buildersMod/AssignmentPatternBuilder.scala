package typings.astTypes.buildersMod

import typings.astTypes.anon.LocRight
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.namedTypesMod.namedTypes.AssignmentPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignmentPatternBuilder extends js.Object {
  
  def apply(left: PatternKind, right: ExpressionKind): AssignmentPattern = js.native
  
  def from(params: LocRight): AssignmentPattern = js.native
}
