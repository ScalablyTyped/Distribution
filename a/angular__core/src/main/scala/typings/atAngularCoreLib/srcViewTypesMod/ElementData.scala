package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementData extends js.Object {
  var componentView: ViewData
  var renderElement: js.Any
  var template: TemplateData
  var viewContainer: ViewContainerData | scala.Null
}

object ElementData {
  @scala.inline
  def apply(
    componentView: ViewData,
    renderElement: js.Any,
    template: TemplateData,
    viewContainer: ViewContainerData = null
  ): ElementData = {
    val __obj = js.Dynamic.literal(componentView = componentView, renderElement = renderElement, template = template)
    if (viewContainer != null) __obj.updateDynamic("viewContainer")(viewContainer)
    __obj.asInstanceOf[ElementData]
  }
}

