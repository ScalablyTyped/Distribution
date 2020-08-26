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
  @scala.inline
  implicit class ValidityOps[Self <: Validity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: ValidityPeriodType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: PositiveLong): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

