package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Workteam extends js.Object {
  /**
    * The date and time that the work team was created (timestamp).
    */
  var CreateDate: js.UndefOr[Timestamp] = js.native
  /**
    * A description of the work team.
    */
  var Description: String200 = js.native
  /**
    * The date and time that the work team was last updated (timestamp).
    */
  var LastUpdatedDate: js.UndefOr[Timestamp] = js.native
  /**
    * The Amazon Cognito user groups that make up the work team.
    */
  var MemberDefinitions: typings.awsDashSdk.clientsSagemakerMod.MemberDefinitions = js.native
  /**
    * Configures SNS notifications of available or expiring work items for work teams.
    */
  var NotificationConfiguration: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NotificationConfiguration] = js.native
  /**
    * The Amazon Marketplace identifier for a vendor's work team.
    */
  var ProductListingIds: js.UndefOr[ProductListings] = js.native
  /**
    * The URI of the labeling job's user interface. Workers open this URI to start labeling your data objects.
    */
  var SubDomain: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) that identifies the work team.
    */
  var WorkteamArn: typings.awsDashSdk.clientsSagemakerMod.WorkteamArn = js.native
  /**
    * The name of the work team.
    */
  var WorkteamName: typings.awsDashSdk.clientsSagemakerMod.WorkteamName = js.native
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
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], MemberDefinitions = MemberDefinitions.asInstanceOf[js.Any], WorkteamArn = WorkteamArn.asInstanceOf[js.Any], WorkteamName = WorkteamName.asInstanceOf[js.Any])
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate.asInstanceOf[js.Any])
    if (LastUpdatedDate != null) __obj.updateDynamic("LastUpdatedDate")(LastUpdatedDate.asInstanceOf[js.Any])
    if (NotificationConfiguration != null) __obj.updateDynamic("NotificationConfiguration")(NotificationConfiguration.asInstanceOf[js.Any])
    if (ProductListingIds != null) __obj.updateDynamic("ProductListingIds")(ProductListingIds.asInstanceOf[js.Any])
    if (SubDomain != null) __obj.updateDynamic("SubDomain")(SubDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workteam]
  }
}

