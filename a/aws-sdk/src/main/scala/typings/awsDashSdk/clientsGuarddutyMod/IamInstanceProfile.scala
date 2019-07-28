package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IamInstanceProfile extends js.Object {
  /**
    * AWS EC2 instance profile ARN.
    */
  var Arn: js.UndefOr[String] = js.undefined
  /**
    * AWS EC2 instance profile ID.
    */
  var Id: js.UndefOr[String] = js.undefined
}

object IamInstanceProfile {
  @scala.inline
  def apply(Arn: String = null, Id: String = null): IamInstanceProfile = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    __obj.asInstanceOf[IamInstanceProfile]
  }
}

