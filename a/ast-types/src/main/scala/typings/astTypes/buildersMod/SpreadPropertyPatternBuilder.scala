package typings.astTypes.buildersMod

import typings.astTypes.anon.ArgumentCommentsLoc
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadPropertyPatternBuilder extends js.Object {
  
  def apply(argument: PatternKind): SpreadPropertyPattern = js.native
  
  def from(params: ArgumentCommentsLoc): SpreadPropertyPattern = js.native
}
