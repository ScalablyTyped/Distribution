package typings.antd.mod

import typings.antd.anon.PartialConfigProviderProp
import typings.antd.anon.WeakValidationMapConfigPr
import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.antd.configProviderMod.ConfigProviderProps
import typings.react.mod.Context
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd", "ConfigProvider")
@js.native
object ConfigProvider extends js.Object {
  
  def apply(props: PropsWithChildren[ConfigProviderProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[ConfigProviderProps], context: js.Any): ReactElement | Null = js.native
  
  var ConfigContext: Context[ConfigConsumerProps] = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialConfigProviderProp] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapConfigPr] = js.native
}
