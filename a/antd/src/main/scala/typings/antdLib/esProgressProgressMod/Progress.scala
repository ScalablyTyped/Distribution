package typings
package antdLib.esProgressProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Progress
  extends reactLib.reactMod.Component[ProgressProps, js.Object, js.Any] {
  def getPercentNumber(): scala.Double = js.native
  def getProgressStatus(): antdLib.antdLibStrings.normal | antdLib.antdLibStrings.active | antdLib.antdLibStrings.success | antdLib.antdLibStrings.exception = js.native
  def renderProcessInfo(
    prefixCls: java.lang.String,
    progressStatus: /* import warning: ImportType.apply Failed type conversion: ['normal', 'exception', 'active', 'success'][number] */ js.Any
  ): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  def renderProgress(hasGetPrefixCls: antdLib.esConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
}

