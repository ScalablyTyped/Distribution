package typings.antDesignProLayout.anon

import typings.antDesignProLayout.typingsMod.WithFalse
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logo extends js.Object {
  var logo: js.UndefOr[ReactNode] = js.native
  var onCollapse: js.UndefOr[js.Function1[/* collapse */ Boolean, Unit]] = js.native
  var rightContentRender: js.UndefOr[WithFalse[js.Function1[/* props */ this.type, ReactNode]]] = js.native
}

object Logo {
  @scala.inline
  def apply(): Logo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logo]
  }
  @scala.inline
  implicit class LogoOps[Self <: Logo] (val x: Self) extends AnyVal {
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
    def setLogo(value: ReactNode): Self = this.set("logo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
    @scala.inline
    def setOnCollapse(value: /* collapse */ Boolean => Unit): Self = this.set("onCollapse", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCollapse: Self = this.set("onCollapse", js.undefined)
    @scala.inline
    def setRightContentRenderFunction1(value: Logo => ReactNode): Self = this.set("rightContentRender", js.Any.fromFunction1(value))
    @scala.inline
    def setRightContentRender(value: WithFalse[js.Function1[Logo, ReactNode]]): Self = this.set("rightContentRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightContentRender: Self = this.set("rightContentRender", js.undefined)
  }
  
}

