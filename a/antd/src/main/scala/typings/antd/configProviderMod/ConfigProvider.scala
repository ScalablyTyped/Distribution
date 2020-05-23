package typings.antd.configProviderMod

import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.antd.localeProviderMod.Locale
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigProvider
  extends Component[ConfigProviderProps, js.Object, js.Any] {
  def getPrefixClsWrapper(context: ConfigConsumerProps): js.Function2[/* suffixCls */ String, /* customizePrefixCls */ js.UndefOr[String], String] = js.native
  def renderProvider(context: ConfigConsumerProps, legacyLocale: Locale): Element = js.native
}

