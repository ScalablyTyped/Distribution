package typings.asymmetrikLeafletD3.mod.HexbinHoverHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompoundOptions extends js.Object {
  var handlers: js.Array[typings.asymmetrikLeafletD3.mod.HexbinHoverHandler] = js.native
}

object CompoundOptions {
  @scala.inline
  def apply(handlers: js.Array[typings.asymmetrikLeafletD3.mod.HexbinHoverHandler]): CompoundOptions = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompoundOptions]
  }
  @scala.inline
  implicit class CompoundOptionsOps[Self <: CompoundOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHandlersVarargs(value: typings.asymmetrikLeafletD3.mod.HexbinHoverHandler*): Self = this.set("handlers", js.Array(value :_*))
    @scala.inline
    def setHandlers(value: js.Array[typings.asymmetrikLeafletD3.mod.HexbinHoverHandler]): Self = this.set("handlers", value.asInstanceOf[js.Any])
  }
  
}

