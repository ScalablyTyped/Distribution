package typings.antd.contextMod

import typings.antd.AnonGhost
import typings.antd.AnonSize
import typings.antd.antdStrings.ltr
import typings.antd.antdStrings.rtl
import typings.antd.localeProviderMod.Locale
import typings.antd.renderEmptyMod.RenderEmptyHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigConsumerProps extends js.Object {
  var autoInsertSpaceInButton: js.UndefOr[Boolean] = js.native
  var csp: js.UndefOr[CSPConfig] = js.native
  var direction: js.UndefOr[ltr | rtl] = js.native
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.native
  var locale: js.UndefOr[Locale] = js.native
  var pageHeader: js.UndefOr[AnonGhost] = js.native
  var renderEmpty: RenderEmptyHandler = js.native
  var rootPrefixCls: js.UndefOr[String] = js.native
  var space: js.UndefOr[AnonSize] = js.native
  def getPrefixCls(suffixCls: String): String = js.native
  def getPrefixCls(suffixCls: String, customizePrefixCls: String): String = js.native
}

