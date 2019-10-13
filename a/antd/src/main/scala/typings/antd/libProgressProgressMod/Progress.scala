package typings.antd.libProgressProgressMod

import typings.antd.antdStrings.active
import typings.antd.antdStrings.exception
import typings.antd.antdStrings.normal
import typings.antd.antdStrings.success
import typings.antd.libConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Progress
  extends Component[ProgressProps, js.Object, js.Any] {
  def getPercentNumber(): Double = js.native
  def getProgressStatus(): normal | active | success | exception = js.native
  @JSName("renderProcessInfo")
  def renderProcessInfo_active(prefixCls: String, progressStatus: active): Element | Null = js.native
  @JSName("renderProcessInfo")
  def renderProcessInfo_exception(prefixCls: String, progressStatus: exception): Element | Null = js.native
  @JSName("renderProcessInfo")
  def renderProcessInfo_normal(prefixCls: String, progressStatus: normal): Element | Null = js.native
  @JSName("renderProcessInfo")
  def renderProcessInfo_success(prefixCls: String, progressStatus: success): Element | Null = js.native
  def renderProgress(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
}

