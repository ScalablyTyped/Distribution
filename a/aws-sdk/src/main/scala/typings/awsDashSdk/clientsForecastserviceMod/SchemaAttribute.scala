package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaAttribute extends js.Object {
  /**
    * The name of the dataset field.
    */
  var AttributeName: js.UndefOr[Name] = js.undefined
  /**
    * The data type of the field.
    */
  var AttributeType: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.AttributeType] = js.undefined
}

object SchemaAttribute {
  @scala.inline
  def apply(AttributeName: Name = null, AttributeType: AttributeType = null): SchemaAttribute = {
    val __obj = js.Dynamic.literal()
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName)
    if (AttributeType != null) __obj.updateDynamic("AttributeType")(AttributeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAttribute]
  }
}

