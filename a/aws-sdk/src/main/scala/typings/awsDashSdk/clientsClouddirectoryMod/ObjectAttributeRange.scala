package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectAttributeRange extends js.Object {
  /**
    * The key of the attribute that the attribute range covers.
    */
  var AttributeKey: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.AttributeKey] = js.native
  /**
    * The range of attribute values being selected.
    */
  var Range: js.UndefOr[TypedAttributeValueRange] = js.native
}

object ObjectAttributeRange {
  @scala.inline
  def apply(AttributeKey: AttributeKey = null, Range: TypedAttributeValueRange = null): ObjectAttributeRange = {
    val __obj = js.Dynamic.literal()
    if (AttributeKey != null) __obj.updateDynamic("AttributeKey")(AttributeKey.asInstanceOf[js.Any])
    if (Range != null) __obj.updateDynamic("Range")(Range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectAttributeRange]
  }
}

