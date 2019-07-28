package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends js.Object {
  /**
    * The name of the attribute. Up to 128 letters (uppercase and lowercase), numbers, hyphens, underscores, and periods are allowed.
    */
  var name: String
  /**
    * The ID of the target. You can specify the short form ID for a resource or the full Amazon Resource Name (ARN).
    */
  var targetId: js.UndefOr[String] = js.undefined
  /**
    * The type of the target with which to attach the attribute. This parameter is required if you use the short form ID for a resource instead of the full ARN.
    */
  var targetType: js.UndefOr[TargetType] = js.undefined
  /**
    * The value of the attribute. Up to 128 letters (uppercase and lowercase), numbers, hyphens, underscores, periods, at signs (@), forward slashes, colons, and spaces are allowed.
    */
  var value: js.UndefOr[String] = js.undefined
}

object Attribute {
  @scala.inline
  def apply(name: String, targetId: String = null, targetType: TargetType = null, value: String = null): Attribute = {
    val __obj = js.Dynamic.literal(name = name)
    if (targetId != null) __obj.updateDynamic("targetId")(targetId)
    if (targetType != null) __obj.updateDynamic("targetType")(targetType.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Attribute]
  }
}

