package typings.adone.adoneNs.dataNs.jsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object INs {
  type CompareFunction = js.Function2[/* a */ CompareValue, /* b */ CompareValue, Double]
  type Replacer = (js.Function2[/* key */ String, /* value */ js.Any, js.Any]) | js.Array[String]
}
