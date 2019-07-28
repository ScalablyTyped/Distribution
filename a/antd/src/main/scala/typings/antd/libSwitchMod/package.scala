package typings.antd

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSwitchMod {
  type SwitchChangeEventHandler = js.Function2[/* checked */ Boolean, /* event */ MouseEvent, Unit]
  type SwitchClickEventHandler = SwitchChangeEventHandler
}
