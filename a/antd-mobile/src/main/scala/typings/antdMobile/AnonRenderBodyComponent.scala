package typings.antdMobile

import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRenderBodyComponent extends js.Object {
  var renderFooter: js.Any
  var renderHeader: js.Any
  var renderSectionHeader: js.Any
  def renderBodyComponent(): Element
}

object AnonRenderBodyComponent {
  @scala.inline
  def apply(
    renderBodyComponent: () => Element,
    renderFooter: js.Any,
    renderHeader: js.Any,
    renderSectionHeader: js.Any
  ): AnonRenderBodyComponent = {
    val __obj = js.Dynamic.literal(renderBodyComponent = js.Any.fromFunction0(renderBodyComponent), renderFooter = renderFooter.asInstanceOf[js.Any], renderHeader = renderHeader.asInstanceOf[js.Any], renderSectionHeader = renderSectionHeader.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRenderBodyComponent]
  }
}

