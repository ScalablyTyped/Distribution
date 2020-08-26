package typings.apolloProtobufjs.mod.common

import typings.apolloProtobufjs.apolloProtobufjsNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.Value message. */
@js.native
trait IValue extends js.Object {
  var boolValue: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[String] = js.native
  var listValue: js.UndefOr[IListValue] = js.native
  var nullValue: js.UndefOr[`0`] = js.native
  var numberValue: js.UndefOr[Double] = js.native
  var stringValue: js.UndefOr[String] = js.native
  var structValue: js.UndefOr[IStruct] = js.native
}

object IValue {
  @scala.inline
  def apply(): IValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IValue]
  }
  @scala.inline
  implicit class IValueOps[Self <: IValue] (val x: Self) extends AnyVal {
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
    def setBoolValue(value: Boolean): Self = this.set("boolValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoolValue: Self = this.set("boolValue", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setListValue(value: IListValue): Self = this.set("listValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListValue: Self = this.set("listValue", js.undefined)
    @scala.inline
    def setNullValue(value: `0`): Self = this.set("nullValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullValue: Self = this.set("nullValue", js.undefined)
    @scala.inline
    def setNumberValue(value: Double): Self = this.set("numberValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberValue: Self = this.set("numberValue", js.undefined)
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
    @scala.inline
    def setStructValue(value: IStruct): Self = this.set("structValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStructValue: Self = this.set("structValue", js.undefined)
  }
  
}

