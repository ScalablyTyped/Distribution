package typings.astTypes.buildersMod

import typings.astTypes.anon.Static
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.PrivateNameKind
import typings.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassPrivatePropertyBuilder extends js.Object {
  
  def apply(key: PrivateNameKind): ClassPrivateProperty = js.native
  def apply(key: PrivateNameKind, value: ExpressionKind): ClassPrivateProperty = js.native
  
  def from(params: Static): ClassPrivateProperty = js.native
}
