package typings.agDashGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distLibFilterTextFilterMod {
  type TextComparator = js.Function3[/* filter */ String, /* gridValue */ js.Any, /* filterText */ String, Boolean]
  type TextFormatter = js.Function1[/* from */ String, String]
}
