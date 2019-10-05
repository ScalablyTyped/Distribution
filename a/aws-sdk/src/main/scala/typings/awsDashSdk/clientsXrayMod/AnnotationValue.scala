package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationValue extends js.Object {
  /**
    * Value for a Boolean annotation.
    */
  var BooleanValue: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * Value for a Number annotation.
    */
  var NumberValue: js.UndefOr[NullableDouble] = js.undefined
  /**
    * Value for a String annotation.
    */
  var StringValue: js.UndefOr[String] = js.undefined
}

object AnnotationValue {
  @scala.inline
  def apply(
    BooleanValue: js.UndefOr[scala.Boolean] = js.undefined,
    NumberValue: Int | scala.Double = null,
    StringValue: String = null
  ): AnnotationValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BooleanValue)) __obj.updateDynamic("BooleanValue")(BooleanValue)
    if (NumberValue != null) __obj.updateDynamic("NumberValue")(NumberValue.asInstanceOf[js.Any])
    if (StringValue != null) __obj.updateDynamic("StringValue")(StringValue)
    __obj.asInstanceOf[AnnotationValue]
  }
}

