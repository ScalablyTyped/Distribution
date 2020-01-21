package typings.apolloProtobufjs.descriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOneofDescriptorProto extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
}

object IOneofDescriptorProto {
  @scala.inline
  def apply(name: String = null, options: js.Any = null): IOneofDescriptorProto = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOneofDescriptorProto]
  }
}

