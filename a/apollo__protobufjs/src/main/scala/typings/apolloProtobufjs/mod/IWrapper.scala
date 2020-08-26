package typings.apolloProtobufjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWrapper extends js.Object {
  /** From object converter */
  var fromObject: js.UndefOr[WrapperFromObjectConverter] = js.native
  /** To object converter */
  var toObject: js.UndefOr[WrapperToObjectConverter] = js.native
}

object IWrapper {
  @scala.inline
  def apply(): IWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWrapper]
  }
  @scala.inline
  implicit class IWrapperOps[Self <: IWrapper] (val x: Self) extends AnyVal {
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
    def setFromObject(value: WrapperFromObjectConverter): Self = this.set("fromObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromObject: Self = this.set("fromObject", js.undefined)
    @scala.inline
    def setToObject(value: WrapperToObjectConverter): Self = this.set("toObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToObject: Self = this.set("toObject", js.undefined)
  }
  
}

