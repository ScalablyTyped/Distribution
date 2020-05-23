package typings.antd

import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/breadcrumb/BreadcrumbSeparator", JSImport.Namespace)
@js.native
object breadcrumbSeparatorMod extends js.Object {
  @js.native
  trait BreadcrumbSeparator
    extends Component[js.Any, js.Object, js.Any] {
    def renderSeparator(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  }
  
  @js.native
  class default () extends BreadcrumbSeparator
  
  /* static members */
  @js.native
  object default extends js.Object {
    var __ANT_BREADCRUMB_SEPARATOR: Boolean = js.native
  }
  
}

