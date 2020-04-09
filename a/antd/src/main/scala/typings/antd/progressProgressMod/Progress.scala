package typings.antd.progressProgressMod

import typings.antd.antdStrings.active
import typings.antd.antdStrings.exception
import typings.antd.antdStrings.normal
import typings.antd.antdStrings.success
import typings.antd.contextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Progress
  extends Component[ProgressProps, js.Object, js.Any] {
  def getPercentNumber(): Double = js.native
  def getProgressStatus(): success | normal | active | exception = js.native
  @JSName("renderProcessInfo")
  def renderProcessInfo_active(prefixCls: String, progressStatus: active): Element | Null = js.native
  @JSName("renderProcessInfo")
  def renderProcessInfo_exception(prefixCls: String, progressStatus: exception): Element | Null = js.native
  @JSName("renderProcessInfo")
  def renderProcessInfo_normal(prefixCls: String, progressStatus: normal): Element | Null = js.native
  @JSName("renderProcessInfo")
  def renderProcessInfo_success(prefixCls: String, progressStatus: success): Element | Null = js.native
  def renderProgress(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
}

