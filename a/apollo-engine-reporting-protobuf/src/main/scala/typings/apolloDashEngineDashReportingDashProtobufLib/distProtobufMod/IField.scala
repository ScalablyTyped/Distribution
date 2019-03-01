package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IField extends js.Object {
  /** Field name */
  var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /** Field returnType */
  var returnType: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object IField {
  @scala.inline
  def apply(name: java.lang.String = null, returnType: java.lang.String = null): IField = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType)
    __obj.asInstanceOf[IField]
  }
}

