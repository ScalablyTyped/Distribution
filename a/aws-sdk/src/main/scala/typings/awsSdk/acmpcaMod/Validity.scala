package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validity extends js.Object {
  /**
    * Specifies whether the Value parameter represents days, months, or years.
    */
  var Type: ValidityPeriodType = js.native
  /**
    * Time period.
    */
  var Value: PositiveLong = js.native
}

object Validity {
  @scala.inline
  def apply(Type: ValidityPeriodType, Value: PositiveLong): Validity = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validity]
  }
}

