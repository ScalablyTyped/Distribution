package typings.apolloProtobufjs.descriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServiceDescriptorProto extends js.Object {
  var method: js.UndefOr[js.Array[IMethodDescriptorProto]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[IServiceOptions] = js.undefined
}

object IServiceDescriptorProto {
  @scala.inline
  def apply(
    method: js.Array[IMethodDescriptorProto] = null,
    name: String = null,
    options: IServiceOptions = null
  ): IServiceDescriptorProto = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServiceDescriptorProto]
  }
}

