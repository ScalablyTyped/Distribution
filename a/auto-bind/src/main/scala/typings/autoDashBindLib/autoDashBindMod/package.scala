package typings
package autoDashBindLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object autoDashBindMod {
  type AutoBindFunction[selfT] = js.Function2[/* self */ selfT, /* options */ js.UndefOr[AutoBindOptions], selfT]
}
