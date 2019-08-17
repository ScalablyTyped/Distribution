package typings.anymatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object anymatchMod {
  import typings.std.RegExp

  type Matcher = MatcherType | js.Array[MatcherType]
  type MatcherType = String | RegExp | (js.Function1[/* repeated */ String, Boolean])
}
