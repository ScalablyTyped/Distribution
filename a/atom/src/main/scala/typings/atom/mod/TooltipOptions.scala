package typings.atom.mod

import typings.atom.anon.Hide
import typings.atom.atomBooleans.`false`
import typings.atom.atomStrings.auto
import typings.atom.atomStrings.bottom_
import typings.atom.atomStrings.left_
import typings.atom.atomStrings.right_
import typings.atom.atomStrings.top_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipOptions extends js.Object {
  /** Apply a CSS fade transition to the tooltip. */
  var animation: js.UndefOr[Boolean] = js.native
  /** Appends the tooltip to a specific element. */
  var container: js.UndefOr[String | HTMLElement | `false`] = js.native
  /**
    *  Delay showing and hiding the tooltip (ms) - does not apply to manual
    *  trigger type.
    */
  var delay: js.UndefOr[Double | Hide] = js.native
  /** Allow HTML in the tooltip. */
  var html: js.UndefOr[Boolean] = js.native
  /** How to position the tooltip. */
  var placement: js.UndefOr[top_ | bottom_ | left_ | right_ | auto] = js.native
  /**
    *  If a selector is provided, tooltip objects will be delegated to the
    *  specified targets.
    */
  var selector: js.UndefOr[String] = js.native
  /** Base HTML to use when creating the tooltip. */
  var template: js.UndefOr[String] = js.native
  /**
    *  Default title value if title attribute isn't present.
    *  If a function is given, it will be called with its this reference set to
    *  the element that the tooltip is attached to.
    */
  var title: js.UndefOr[String | HTMLElement | js.Function0[String]] = js.native
  /**
    *  How tooltip is triggered - click | hover | focus | manual.
    *  You may pass multiple triggers; separate them with a space.
    */
  var trigger: js.UndefOr[String] = js.native
}

object TooltipOptions {
  @scala.inline
  def apply(): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipOptions]
  }
  @scala.inline
  implicit class TooltipOptionsOps[Self <: TooltipOptions] (val x: Self) extends AnyVal {
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
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setContainer(value: String | HTMLElement | `false`): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setDelay(value: Double | Hide): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setPlacement(value: top_ | bottom_ | left_ | right_ | auto): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTitleFunction0(value: () => String): Self = this.set("title", js.Any.fromFunction0(value))
    @scala.inline
    def setTitle(value: String | HTMLElement | js.Function0[String]): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
  }
  
}

