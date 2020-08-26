package typings.angularAria.mod.aria

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * $aria service (https://docs.angularjs.org/api/ngAria/service/$aria).
  */
@js.native
trait IAriaService extends js.Object {
  def config(attribute: IAriaAttribute): Boolean = js.native
}

object IAriaService {
  @scala.inline
  def apply(config: IAriaAttribute => Boolean): IAriaService = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config))
    __obj.asInstanceOf[IAriaService]
  }
  @scala.inline
  implicit class IAriaServiceOps[Self <: IAriaService] (val x: Self) extends AnyVal {
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
    def setConfig(value: IAriaAttribute => Boolean): Self = this.set("config", js.Any.fromFunction1(value))
  }
  
}

