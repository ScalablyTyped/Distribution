package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityDetails extends js.Object {
  /**
    * The EntityInfo object that contains details about the entity (user or role).
    */
  var EntityInfo: typings.awsDashSdk.clientsIamMod.EntityInfo = js.native
  /**
    * The date and time, in ISO 8601 date-time format, when the authenticated entity last attempted to access AWS. AWS does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the reporting period.
    */
  var LastAuthenticated: js.UndefOr[dateType] = js.native
}

object EntityDetails {
  @scala.inline
  def apply(EntityInfo: EntityInfo, LastAuthenticated: dateType = null): EntityDetails = {
    val __obj = js.Dynamic.literal(EntityInfo = EntityInfo.asInstanceOf[js.Any])
    if (LastAuthenticated != null) __obj.updateDynamic("LastAuthenticated")(LastAuthenticated.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityDetails]
  }
}

