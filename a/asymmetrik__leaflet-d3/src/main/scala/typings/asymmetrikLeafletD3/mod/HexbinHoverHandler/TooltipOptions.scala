package typings.asymmetrikLeafletD3.mod.HexbinHoverHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipOptions extends js.Object {
  def tooltipContent(d: js.Any): String
}

object TooltipOptions {
  @scala.inline
  def apply(tooltipContent: js.Any => String): TooltipOptions = {
    val __obj = js.Dynamic.literal(tooltipContent = js.Any.fromFunction1(tooltipContent))
  
    __obj.asInstanceOf[TooltipOptions]
  }
}

