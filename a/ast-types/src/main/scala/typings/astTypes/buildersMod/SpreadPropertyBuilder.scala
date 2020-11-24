package typings.astTypes.buildersMod

import typings.astTypes.anon.ArgumentComments
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.SpreadProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadPropertyBuilder extends js.Object {
  
  def apply(argument: ExpressionKind): SpreadProperty = js.native
  
  def from(params: ArgumentComments): SpreadProperty = js.native
}
