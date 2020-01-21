package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLocTail
import typings.astTypes.AnonCooked
import typings.astTypes.namedTypesMod.namedTypes.TemplateElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateElementBuilder extends js.Object {
  def apply(value: AnonCooked, tail: Boolean): TemplateElement = js.native
  def from(params: AnonCommentsLocTail): TemplateElement = js.native
}

