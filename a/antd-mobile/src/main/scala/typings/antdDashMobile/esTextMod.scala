package typings.antdDashMobile

import typings.antdDashMobile.esTextMod.Text
import typings.antdDashMobile.esViewMod.ViewProps
import typings.react.reactMod.Component
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/es/text", JSImport.Namespace)
@js.native
object esTextMod extends js.Object {
  @js.native
  trait Text
    extends Component[ViewProps[HTMLSpanElement], js.Any, js.Any]
  
  @js.native
  class default () extends Text
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Anon_Component = js.native
  }
  
}

