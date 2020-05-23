package typings.apolloEngineReportingProtobuf.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IField extends js.Object {
  /** Field name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** Field returnType */
  var returnType: js.UndefOr[String | Null] = js.undefined
}

object IField {
  @scala.inline
  def apply(
    name: js.UndefOr[Null | String] = js.undefined,
    returnType: js.UndefOr[Null | String] = js.undefined
  ): IField = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(returnType)) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IField]
  }
}

