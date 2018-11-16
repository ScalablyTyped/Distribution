package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object assertionDashErrorLib {
  type AssertionError[T] = stdLib.Error with T with Anon_ShowDiff
}
