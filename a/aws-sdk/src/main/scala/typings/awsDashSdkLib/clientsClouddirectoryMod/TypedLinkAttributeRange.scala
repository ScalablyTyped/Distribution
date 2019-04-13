package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypedLinkAttributeRange extends js.Object {
  /**
    * The unique name of the typed link attribute.
    */
  var AttributeName: js.UndefOr[AttributeName] = js.undefined
  /**
    * The range of attribute values that are being selected.
    */
  var Range: TypedAttributeValueRange
}

object TypedLinkAttributeRange {
  @scala.inline
  def apply(Range: TypedAttributeValueRange, AttributeName: AttributeName = null): TypedLinkAttributeRange = {
    val __obj = js.Dynamic.literal(Range = Range)
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName)
    __obj.asInstanceOf[TypedLinkAttributeRange]
  }
}

