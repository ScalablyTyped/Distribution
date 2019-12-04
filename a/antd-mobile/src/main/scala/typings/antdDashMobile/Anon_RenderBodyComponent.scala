package typings.antdDashMobile

import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RenderBodyComponent extends js.Object {
  var renderFooter: js.Any
  var renderHeader: js.Any
  var renderSectionHeader: js.Any
  def renderBodyComponent(): Element
}

object Anon_RenderBodyComponent {
  @scala.inline
  def apply(
    renderBodyComponent: () => Element,
    renderFooter: js.Any,
    renderHeader: js.Any,
    renderSectionHeader: js.Any
  ): Anon_RenderBodyComponent = {
    val __obj = js.Dynamic.literal(renderBodyComponent = js.Any.fromFunction0(renderBodyComponent), renderFooter = renderFooter.asInstanceOf[js.Any], renderHeader = renderHeader.asInstanceOf[js.Any], renderSectionHeader = renderSectionHeader.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_RenderBodyComponent]
  }
}

