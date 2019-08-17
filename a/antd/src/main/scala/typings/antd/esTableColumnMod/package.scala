package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esTableColumnMod {
  import typings.antd.esTableInterfaceMod.ColumnProps
  import typings.react.reactMod.Component
  import typings.react.reactMod.ComponentState

  type Column[T] = Component[ColumnProps[T], ComponentState, js.Any]
}
