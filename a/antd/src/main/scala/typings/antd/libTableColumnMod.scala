package typings.antd

import typings.antd.libTableColumnMod.Column
import typings.antd.libTableInterfaceMod.ColumnProps
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/table/Column", JSImport.Namespace)
@js.native
object libTableColumnMod extends js.Object {
  @js.native
  class default[T] () extends Column[T]
  
  type Column[T] = Component[ColumnProps[T], ComponentState, js.Any]
}

