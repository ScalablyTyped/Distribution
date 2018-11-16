package typings
package autoDashBindLib.autoDashBindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object autoBindNs {
  type AutoBindFunction[selfT] = js.Function2[/* self */ selfT, /* options */ js.UndefOr[AutoBindOptions], selfT]
}
