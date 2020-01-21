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
  def apply(name: String = null, returnType: String = null): IField = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IField]
  }
}

