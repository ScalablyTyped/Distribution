package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTableColumnMod {
  type Column[T] = reactLib.reactMod.Component[
    antdLib.libTableInterfaceMod.ColumnProps[T], 
    reactLib.reactMod.ComponentState, 
    js.Any
  ]
}
