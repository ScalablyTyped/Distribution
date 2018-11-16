package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTooltipMod {
  type RenderFunction = js.Function0[reactLib.reactMod.ReactNs.ReactNode]
  type TooltipPlacement = antdLib.antdLibStrings.top | antdLib.antdLibStrings.left | antdLib.antdLibStrings.right | antdLib.antdLibStrings.bottom | antdLib.antdLibStrings.topLeft | antdLib.antdLibStrings.topRight | antdLib.antdLibStrings.bottomLeft | antdLib.antdLibStrings.bottomRight | antdLib.antdLibStrings.leftTop | antdLib.antdLibStrings.leftBottom | antdLib.antdLibStrings.rightTop | antdLib.antdLibStrings.rightBottom
  type TooltipTrigger = antdLib.antdLibStrings.hover | antdLib.antdLibStrings.focus | antdLib.antdLibStrings.click | antdLib.antdLibStrings.contextMenu
}
