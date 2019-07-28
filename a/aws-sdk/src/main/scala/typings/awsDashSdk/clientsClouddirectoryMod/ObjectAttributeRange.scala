package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectAttributeRange extends js.Object {
  /**
    * The key of the attribute that the attribute range covers.
    */
  var AttributeKey: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.AttributeKey] = js.undefined
  /**
    * The range of attribute values being selected.
    */
  var Range: js.UndefOr[TypedAttributeValueRange] = js.undefined
}

object ObjectAttributeRange {
  @scala.inline
  def apply(AttributeKey: AttributeKey = null, Range: TypedAttributeValueRange = null): ObjectAttributeRange = {
    val __obj = js.Dynamic.literal()
    if (AttributeKey != null) __obj.updateDynamic("AttributeKey")(AttributeKey)
    if (Range != null) __obj.updateDynamic("Range")(Range)
    __obj.asInstanceOf[ObjectAttributeRange]
  }
}

