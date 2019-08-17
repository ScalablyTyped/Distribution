package typings.assertionDashError

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object assertionDashErrorMod {
  import typings.assertionDashError.Anon_ShowDiff
  import typings.std.Error

  type AssertionError[T] = Error with T with Anon_ShowDiff
}
