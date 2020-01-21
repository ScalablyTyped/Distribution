package typings.assertionError

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AssertionError[T] = typings.std.Error with T with typings.assertionError.AnonShowDiff
}
