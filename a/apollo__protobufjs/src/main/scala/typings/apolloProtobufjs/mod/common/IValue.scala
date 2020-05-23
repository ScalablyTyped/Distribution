package typings.apolloProtobufjs.mod.common

import typings.apolloProtobufjs.apolloProtobufjsNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.Value message. */
trait IValue extends js.Object {
  var boolValue: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var listValue: js.UndefOr[IListValue] = js.undefined
  var nullValue: js.UndefOr[`0`] = js.undefined
  var numberValue: js.UndefOr[Double] = js.undefined
  var stringValue: js.UndefOr[String] = js.undefined
  var structValue: js.UndefOr[IStruct] = js.undefined
}

object IValue {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    listValue: IListValue = null,
    nullValue: `0` = null,
    numberValue: js.UndefOr[Double] = js.undefined,
    stringValue: String = null,
    structValue: IStruct = null
  ): IValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (listValue != null) __obj.updateDynamic("listValue")(listValue.asInstanceOf[js.Any])
    if (nullValue != null) __obj.updateDynamic("nullValue")(nullValue.asInstanceOf[js.Any])
    if (!js.isUndefined(numberValue)) __obj.updateDynamic("numberValue")(numberValue.get.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    if (structValue != null) __obj.updateDynamic("structValue")(structValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValue]
  }
}

