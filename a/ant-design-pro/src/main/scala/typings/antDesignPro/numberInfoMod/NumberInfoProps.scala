package typings.antDesignPro.numberInfoMod

import typings.antDesignPro.antDesignProStrings.down
import typings.antDesignPro.antDesignProStrings.up
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberInfoProps extends js.Object {
  var gap: js.UndefOr[Double] = js.native
  var status: js.UndefOr[up | down] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var subTitle: js.UndefOr[ReactNode | String] = js.native
  var subTotal: js.UndefOr[Double] = js.native
  var suffix: js.UndefOr[String] = js.native
  var theme: js.UndefOr[String] = js.native
  var title: js.UndefOr[ReactNode | String] = js.native
  var total: js.UndefOr[ReactNode | String] = js.native
}

object NumberInfoProps {
  @scala.inline
  def apply(): NumberInfoProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberInfoProps]
  }
  @scala.inline
  implicit class NumberInfoPropsOps[Self <: NumberInfoProps] (val x: Self) extends AnyVal {
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
    def setGap(value: Double): Self = this.set("gap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    @scala.inline
    def setStatus(value: up | down): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSubTitle(value: ReactNode | String): Self = this.set("subTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubTitle: Self = this.set("subTitle", js.undefined)
    @scala.inline
    def setSubTotal(value: Double): Self = this.set("subTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubTotal: Self = this.set("subTotal", js.undefined)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode | String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTotal(value: ReactNode | String): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
  
}

