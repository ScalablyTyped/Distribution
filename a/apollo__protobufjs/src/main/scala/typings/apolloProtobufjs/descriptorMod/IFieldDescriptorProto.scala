package typings.apolloProtobufjs.descriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFieldDescriptorProto extends js.Object {
  var defaultValue: js.UndefOr[String] = js.undefined
  var extendee: js.UndefOr[String] = js.undefined
  var jsonName: js.UndefOr[js.Any] = js.undefined
  var label: js.UndefOr[IFieldDescriptorProtoLabel] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var oneofIndex: js.UndefOr[Double] = js.undefined
  var options: js.UndefOr[IFieldOptions] = js.undefined
  var `type`: js.UndefOr[IFieldDescriptorProtoType] = js.undefined
  var typeName: js.UndefOr[String] = js.undefined
}

object IFieldDescriptorProto {
  @scala.inline
  def apply(
    defaultValue: String = null,
    extendee: String = null,
    jsonName: js.Any = null,
    label: js.UndefOr[IFieldDescriptorProtoLabel] = js.undefined,
    name: String = null,
    number: js.UndefOr[Double] = js.undefined,
    oneofIndex: js.UndefOr[Double] = js.undefined,
    options: IFieldOptions = null,
    `type`: js.UndefOr[IFieldDescriptorProtoType] = js.undefined,
    typeName: String = null
  ): IFieldDescriptorProto = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (extendee != null) __obj.updateDynamic("extendee")(extendee.asInstanceOf[js.Any])
    if (jsonName != null) __obj.updateDynamic("jsonName")(jsonName.asInstanceOf[js.Any])
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.get.asInstanceOf[js.Any])
    if (!js.isUndefined(oneofIndex)) __obj.updateDynamic("oneofIndex")(oneofIndex.get.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.get.asInstanceOf[js.Any])
    if (typeName != null) __obj.updateDynamic("typeName")(typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldDescriptorProto]
  }
}

