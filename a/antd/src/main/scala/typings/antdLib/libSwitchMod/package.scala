package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSwitchMod {
  type SwitchChangeEventHandler = js.Function2[/* checked */ scala.Boolean, /* event */ stdLib.MouseEvent, scala.Unit]
  type SwitchClickEventHandler = SwitchChangeEventHandler
}
