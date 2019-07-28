package typings.anymatch

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object anymatchMod {
  type Matcher = MatcherType | js.Array[MatcherType]
  type MatcherType = String | RegExp | (js.Function1[/* repeated */ String, Boolean])
}
