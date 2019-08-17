package typings.addDashMatchers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distMod {
  import org.scalablytyped.runtime.StringDictionary

  type CustomMatcher = js.Function1[/* repeated */ js.Any, Boolean]
  type MatchersByName = StringDictionary[CustomMatcher]
}
