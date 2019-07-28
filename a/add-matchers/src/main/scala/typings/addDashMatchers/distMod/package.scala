package typings.addDashMatchers

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distMod {
  type CustomMatcher = js.Function1[/* repeated */ js.Any, Boolean]
  type MatchersByName = StringDictionary[CustomMatcher]
}
