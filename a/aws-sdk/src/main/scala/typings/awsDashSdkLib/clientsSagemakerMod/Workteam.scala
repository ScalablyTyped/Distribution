package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Workteam extends js.Object {
  /**
    * The date and time that the work team was created (timestamp).
    */
  var CreateDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * A description of the work team.
    */
  var Description: String200
  /**
    * The date and time that the work team was last updated (timestamp).
    */
  var LastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The Amazon Cognito user groups that make up the work team.
    */
  var MemberDefinitions: awsDashSdkLib.clientsSagemakerMod.MemberDefinitions
  var NotificationConfiguration: js.UndefOr[NotificationConfiguration] = js.undefined
  /**
    * The Amazon Marketplace identifier for a vendor's work team.
    */
  var ProductListingIds: js.UndefOr[ProductListings] = js.undefined
  /**
    * The URI of the labeling job's user interface. Workers open this URI to start labeling your data objects.
    */
  var SubDomain: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) that identifies the work team.
    */
  var WorkteamArn: awsDashSdkLib.clientsSagemakerMod.WorkteamArn
  /**
    * The name of the work team.
    */
  var WorkteamName: awsDashSdkLib.clientsSagemakerMod.WorkteamName
}

object Workteam {
  @scala.inline
  def apply(
    Description: String200,
    MemberDefinitions: MemberDefinitions,
    WorkteamArn: WorkteamArn,
    WorkteamName: WorkteamName,
    CreateDate: Timestamp = null,
    LastUpdatedDate: Timestamp = null,
    NotificationConfiguration: NotificationConfiguration = null,
    ProductListingIds: ProductListings = null,
    SubDomain: String = null
  ): Workteam = {
    val __obj = js.Dynamic.literal(Description = Description, MemberDefinitions = MemberDefinitions, WorkteamArn = WorkteamArn, WorkteamName = WorkteamName)
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate)
    if (LastUpdatedDate != null) __obj.updateDynamic("LastUpdatedDate")(LastUpdatedDate)
    if (NotificationConfiguration != null) __obj.updateDynamic("NotificationConfiguration")(NotificationConfiguration)
    if (ProductListingIds != null) __obj.updateDynamic("ProductListingIds")(ProductListingIds)
    if (SubDomain != null) __obj.updateDynamic("SubDomain")(SubDomain)
    __obj.asInstanceOf[Workteam]
  }
}

