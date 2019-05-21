package typings
package antdLib.esConfigDashProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigConsumerProps extends js.Object {
  var autoInsertSpaceInButton: js.UndefOr[scala.Boolean] = js.native
  var csp: js.UndefOr[CSPConfig] = js.native
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ stdLib.HTMLElement, stdLib.HTMLElement]] = js.native
  var renderEmpty: antdLib.esConfigDashProviderRenderEmptyMod.RenderEmptyHandler = js.native
  var rootPrefixCls: js.UndefOr[java.lang.String] = js.native
  def getPrefixCls(suffixCls: java.lang.String): java.lang.String = js.native
  def getPrefixCls(suffixCls: java.lang.String, customizePrefixCls: java.lang.String): java.lang.String = js.native
}

