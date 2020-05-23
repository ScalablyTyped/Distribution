package typings.apolloProtobufjs.descriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEnumValueDescriptorProto extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
}

object IEnumValueDescriptorProto {
  @scala.inline
  def apply(name: String = null, number: js.UndefOr[Double] = js.undefined, options: js.Any = null): IEnumValueDescriptorProto = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.get.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnumValueDescriptorProto]
  }
}

