package typings
package awsDashSdkLib.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Validity extends js.Object {
  /**
    * Specifies whether the Value parameter represents days, months, or years.
    */
  var Type: ValidityPeriodType
  /**
    * Time period.
    */
  var Value: PositiveLong
}

object Validity {
  @scala.inline
  def apply(Type: ValidityPeriodType, Value: PositiveLong): Validity = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value)
  
    __obj.asInstanceOf[Validity]
  }
}

