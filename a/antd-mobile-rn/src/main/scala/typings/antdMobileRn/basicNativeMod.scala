package typings.antdMobileRn

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile-rn/lib/accordion/demo/basic.native", JSImport.Namespace)
@js.native
object basicNativeMod extends js.Object {
  @js.native
  trait AccordionExmple
    extends Component[js.Any, js.Any, js.Any] {
    def onChange(key: String): Unit = js.native
  }
  
  @js.native
  class default () extends AccordionExmple
  
}

