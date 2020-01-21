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
  def apply(field: js.Array[IField] = null, name: String = null): IType = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IType]
  }
}

