package typings.assertionDashError

import typings.assertionDashError.Anon_ShowDiff
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object assertionDashErrorMod {
  type AssertionError[T] = Error with T with Anon_ShowDiff
}
