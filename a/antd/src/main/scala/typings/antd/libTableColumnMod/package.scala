package typings.antd

import typings.antd.libTableInterfaceMod.ColumnProps
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTableColumnMod {
  type Column[T] = Component[ColumnProps[T], ComponentState, js.Any]
}
