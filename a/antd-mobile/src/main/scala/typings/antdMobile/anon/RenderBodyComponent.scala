package typings.antdMobile.anon

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderBodyComponent extends js.Object {
  var renderFooter: js.Any = js.native
  var renderHeader: js.Any = js.native
  var renderSectionHeader: js.Any = js.native
  def renderBodyComponent(): Element = js.native
}

object RenderBodyComponent {
  @scala.inline
  def apply(
    renderBodyComponent: () => Element,
    renderFooter: js.Any,
    renderHeader: js.Any,
    renderSectionHeader: js.Any
  ): RenderBodyComponent = {
    val __obj = js.Dynamic.literal(renderBodyComponent = js.Any.fromFunction0(renderBodyComponent), renderFooter = renderFooter.asInstanceOf[js.Any], renderHeader = renderHeader.asInstanceOf[js.Any], renderSectionHeader = renderSectionHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderBodyComponent]
  }
  @scala.inline
  implicit class RenderBodyComponentOps[Self <: RenderBodyComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRenderBodyComponent(value: () => Element): Self = this.set("renderBodyComponent", js.Any.fromFunction0(value))
    @scala.inline
    def setRenderFooter(value: js.Any): Self = this.set("renderFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderHeader(value: js.Any): Self = this.set("renderHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderSectionHeader(value: js.Any): Self = this.set("renderSectionHeader", value.asInstanceOf[js.Any])
  }
  
}

