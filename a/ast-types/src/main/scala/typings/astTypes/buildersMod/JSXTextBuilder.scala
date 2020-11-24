package typings.astTypes.buildersMod

import typings.astTypes.anon.Raw
import typings.astTypes.namedTypesMod.namedTypes.JSXText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXTextBuilder extends js.Object {
  
  def apply(value: String): JSXText = js.native
  def apply(value: String, raw: String): JSXText = js.native
  
  def from(params: Raw): JSXText = js.native
}
