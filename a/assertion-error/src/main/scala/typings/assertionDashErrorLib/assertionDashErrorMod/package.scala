package typings
package assertionDashErrorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object assertionDashErrorMod {
  type AssertionError[T] = stdLib.Error with T with assertionDashErrorLib.Anon_ShowDiff
}
