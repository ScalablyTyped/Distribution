package typings.antDesignPro.barMod

import typings.antDesignPro.anon.X
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBarProps extends js.Object {
  var autoLabel: js.UndefOr[Boolean] = js.native
  var color: js.UndefOr[String] = js.native
  var data: js.Array[X] = js.native
  var height: Double = js.native
  var padding: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var title: ReactNode = js.native
}

object IBarProps {
  @scala.inline
  def apply(data: js.Array[X], height: Double): IBarProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBarProps]
  }
  @scala.inline
  implicit class IBarPropsOps[Self <: IBarProps] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: X*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[X]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoLabel(value: Boolean): Self = this.set("autoLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoLabel: Self = this.set("autoLabel", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setPadding(value: js.Tuple4[Double, Double, Double, Double]): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

