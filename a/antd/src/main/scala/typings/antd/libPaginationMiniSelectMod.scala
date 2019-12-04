package typings.antd

import typings.antd.libPaginationMiniSelectMod.MiniSelect
import typings.antd.libSelectMod.OptionProps
import typings.react.reactMod.ClassicComponentClass
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/pagination/MiniSelect", JSImport.Namespace)
@js.native
object libPaginationMiniSelectMod extends js.Object {
  @js.native
  trait MiniSelect
    extends Component[js.Any, js.Any, js.Any]
  
  @js.native
  class default () extends MiniSelect
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Option: ClassicComponentClass[OptionProps] = js.native
  }
  
}

