package typings
package antdLib.libProgressProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Progress
  extends reactLib.reactMod.Component[ProgressProps, js.Object, js.Any] {
  def getPercentNumber(): scala.Double = js.native
  def getProgressStatus(): antdLib.antdLibStrings.normal | antdLib.antdLibStrings.active | antdLib.antdLibStrings.success | antdLib.antdLibStrings.exception = js.native
  @JSName("renderProcessInfo")
  def renderProcessInfo_active(prefixCls: java.lang.String, progressStatus: antdLib.antdLibStrings.active): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  @JSName("renderProcessInfo")
  def renderProcessInfo_exception(prefixCls: java.lang.String, progressStatus: antdLib.antdLibStrings.exception): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  @JSName("renderProcessInfo")
  def renderProcessInfo_normal(prefixCls: java.lang.String, progressStatus: antdLib.antdLibStrings.normal): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  @JSName("renderProcessInfo")
  def renderProcessInfo_success(prefixCls: java.lang.String, progressStatus: antdLib.antdLibStrings.success): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  def renderProgress(hasGetPrefixCls: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
}

