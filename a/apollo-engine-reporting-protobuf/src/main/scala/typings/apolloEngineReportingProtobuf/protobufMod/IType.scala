package typings.apolloEngineReportingProtobuf.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IType extends js.Object {
  /** Type field */
  var field: js.UndefOr[js.Array[IField] | Null] = js.undefined
  /** Type name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IType {
  @scala.inline
  def apply(
    field: js.UndefOr[Null | js.Array[IField]] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined
  ): IType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(field)) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IType]
  }
}

