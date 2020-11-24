package typings.astTypes.buildersMod

import typings.astTypes.anon.ArgumentComments
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.RestProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestPropertyBuilder extends js.Object {
  
  def apply(argument: ExpressionKind): RestProperty = js.native
  
  def from(params: ArgumentComments): RestProperty = js.native
}
