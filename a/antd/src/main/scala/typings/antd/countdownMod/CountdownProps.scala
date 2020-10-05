package typings.antd.countdownMod

import typings.antd.statisticStatisticMod.StatisticProps
import typings.antd.statisticUtilsMod.countdownValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountdownProps extends StatisticProps {
  var format: js.UndefOr[String] = js.native
  var onFinish: js.UndefOr[js.Function0[Unit]] = js.native
  @JSName("value")
  var value_CountdownProps: js.UndefOr[countdownValueType] = js.native
}

object CountdownProps {
  @scala.inline
  def apply(): CountdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountdownProps]
  }
  @scala.inline
  implicit class CountdownPropsOps[Self <: CountdownProps] (val x: Self) extends AnyVal {
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setOnFinish(value: () => Unit): Self = this.set("onFinish", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnFinish: Self = this.set("onFinish", js.undefined)
    @scala.inline
    def setValue(value: countdownValueType): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

