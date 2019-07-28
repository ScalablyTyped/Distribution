package typings.antd.esConfigDashProviderMod

import typings.antd.esConfigDashProviderRenderEmptyMod.RenderEmptyHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigConsumerProps extends js.Object {
  var autoInsertSpaceInButton: js.UndefOr[Boolean] = js.native
  var csp: js.UndefOr[CSPConfig] = js.native
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.native
  var renderEmpty: RenderEmptyHandler = js.native
  var rootPrefixCls: js.UndefOr[String] = js.native
  def getPrefixCls(suffixCls: String): String = js.native
  def getPrefixCls(suffixCls: String, customizePrefixCls: String): String = js.native
}

