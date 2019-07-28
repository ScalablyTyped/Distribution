package typings.astDashTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  type Deep = Boolean | (js.Function2[/* type */ Type[js.Any], /* value */ js.Any, Unit])
  type FieldType[T] = Field[T]
}
