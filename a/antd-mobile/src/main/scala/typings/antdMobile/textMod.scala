package typings.antdMobile

import typings.antdMobile.viewMod.ViewProps
import typings.react.mod.Component
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile/lib/text", JSImport.Namespace)
@js.native
object textMod extends js.Object {
  
  @js.native
  trait Text
    extends Component[ViewProps[HTMLSpanElement], js.Any, js.Any]
  
  @js.native
  class default () extends Text
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: typings.antdMobile.anon.Component = js.native
  }
}
