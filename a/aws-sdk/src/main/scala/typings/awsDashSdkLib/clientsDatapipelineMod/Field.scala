package typings
package awsDashSdkLib.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  /**
    * The field identifier.
    */
  var key: fieldNameString
  /**
    * The field value, expressed as the identifier of another object.
    */
  var refValue: js.UndefOr[fieldNameString] = js.undefined
  /**
    * The field value, expressed as a String.
    */
  var stringValue: js.UndefOr[fieldStringValue] = js.undefined
}

object Field {
  @scala.inline
  def apply(key: fieldNameString, refValue: fieldNameString = null, stringValue: fieldStringValue = null): Field = {
    val __obj = js.Dynamic.literal(key = key)
    if (refValue != null) __obj.updateDynamic("refValue")(refValue)
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue)
    __obj.asInstanceOf[Field]
  }
}

