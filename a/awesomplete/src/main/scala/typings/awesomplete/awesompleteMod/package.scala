package typings.awesomplete

import typings.awesomplete.Anon_Label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object awesompleteMod {
  type SortFunction = js.Function2[/* left */ Double | js.Array[js.Any], /* right */ Double | js.Array[js.Any], Double]
  type Suggestion = String | Anon_Label | (js.Tuple2[String, String])
}
