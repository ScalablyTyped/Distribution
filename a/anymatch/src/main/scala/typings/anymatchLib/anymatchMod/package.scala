package typings
package anymatchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object anymatchMod {
  type Matcher = MatcherType | js.Array[MatcherType]
  type MatcherType = java.lang.String | stdLib.RegExp | (js.Function1[/* repeated */ java.lang.String, scala.Boolean])
}
