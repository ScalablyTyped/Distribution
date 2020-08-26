package typings.antDesignPro.countDownMod

import typings.react.mod.CSSProperties
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICountDownProps extends js.Object {
  var format: js.UndefOr[js.Function1[/* time */ Double, Unit]] = js.native
  var onEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var target: Date | Double = js.native
}

object ICountDownProps {
  @scala.inline
  def apply(target: Date | Double): ICountDownProps = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICountDownProps]
  }
  @scala.inline
  implicit class ICountDownPropsOps[Self <: ICountDownProps] (val x: Self) extends AnyVal {
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
    def setTarget(value: Date | Double): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: /* time */ Double => Unit): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setOnEnd(value: () => Unit): Self = this.set("onEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

