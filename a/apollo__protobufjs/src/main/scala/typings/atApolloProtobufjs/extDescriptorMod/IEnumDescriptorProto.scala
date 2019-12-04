package typings.atApolloProtobufjs.extDescriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEnumDescriptorProto extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[IEnumOptions] = js.undefined
  var value: js.UndefOr[js.Array[IEnumValueDescriptorProto]] = js.undefined
}

object IEnumDescriptorProto {
  @scala.inline
  def apply(
    name: String = null,
    options: IEnumOptions = null,
    value: js.Array[IEnumValueDescriptorProto] = null
  ): IEnumDescriptorProto = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnumDescriptorProto]
  }
}

