package typings.awsDashSdk.clientsSecretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RotationRulesType extends js.Object {
  /**
    * Specifies the number of days between automatic scheduled rotations of the secret. Secrets Manager schedules the next rotation when the previous one is complete. Secrets Manager schedules the date by adding the rotation interval (number of days) to the actual date of the last rotation. The service chooses the hour within that 24-hour date window randomly. The minute is also chosen somewhat randomly, but weighted towards the top of the hour and influenced by a variety of factors that help distribute load.
    */
  var AutomaticallyAfterDays: js.UndefOr[AutomaticallyRotateAfterDaysType] = js.native
}

object RotationRulesType {
  @scala.inline
  def apply(AutomaticallyAfterDays: Int | Double = null): RotationRulesType = {
    val __obj = js.Dynamic.literal()
    if (AutomaticallyAfterDays != null) __obj.updateDynamic("AutomaticallyAfterDays")(AutomaticallyAfterDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotationRulesType]
  }
}

