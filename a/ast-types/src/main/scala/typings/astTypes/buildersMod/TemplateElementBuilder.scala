package typings.astTypes.buildersMod

import typings.astTypes.anon.Cooked
import typings.astTypes.anon.Tail
import typings.astTypes.namedTypesMod.namedTypes.TemplateElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateElementBuilder extends js.Object {
  
  def apply(value: Cooked, tail: Boolean): TemplateElement = js.native
  
  def from(params: Tail): TemplateElement = js.native
}
