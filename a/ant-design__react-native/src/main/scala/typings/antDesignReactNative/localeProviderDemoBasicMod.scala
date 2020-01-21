package typings.antDesignReactNative

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/locale-provider/demo/basic", JSImport.Namespace)
@js.native
object localeProviderDemoBasicMod extends js.Object {
  @js.native
  trait LocaleProviderExample
    extends Component[js.Any, js.Any, js.Any] {
    def onChange(value: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends LocaleProviderExample {
    def this(props: js.Any) = this()
  }
  
}

