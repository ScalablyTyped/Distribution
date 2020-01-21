package typings.agGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object baseFilterMod {
  type Comparator[T] = js.Function2[/* left */ T, /* right */ T, scala.Double]
}
