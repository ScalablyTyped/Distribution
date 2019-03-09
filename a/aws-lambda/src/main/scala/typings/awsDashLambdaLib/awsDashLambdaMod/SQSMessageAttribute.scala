package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SQSMessageAttribute extends js.Object {
   // Not implemented. Reserved for future use.
  var binaryListValues: js.Array[scala.Nothing]
  var binaryValue: js.UndefOr[java.lang.String] = js.undefined
   // Not implemented. Reserved for future use.
  var dataType: SQSMessageAttributeDataType
  var stringListValues: js.Array[scala.Nothing]
  var stringValue: js.UndefOr[java.lang.String] = js.undefined
}

object SQSMessageAttribute {
  @scala.inline
  def apply(
    binaryListValues: js.Array[scala.Nothing],
    dataType: SQSMessageAttributeDataType,
    stringListValues: js.Array[scala.Nothing],
    binaryValue: java.lang.String = null,
    stringValue: java.lang.String = null
  ): SQSMessageAttribute = {
    val __obj = js.Dynamic.literal(binaryListValues = binaryListValues, dataType = dataType.asInstanceOf[js.Any], stringListValues = stringListValues)
    if (binaryValue != null) __obj.updateDynamic("binaryValue")(binaryValue)
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue)
    __obj.asInstanceOf[SQSMessageAttribute]
  }
}

