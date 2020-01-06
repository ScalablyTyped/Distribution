package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryLimits extends js.Object {
  /**
    * The current number of cloud directories in the Region.
    */
  var CloudOnlyDirectoriesCurrentCount: js.UndefOr[Limit] = js.native
  /**
    * The maximum number of cloud directories allowed in the Region.
    */
  var CloudOnlyDirectoriesLimit: js.UndefOr[Limit] = js.native
  /**
    * Indicates if the cloud directory limit has been reached.
    */
  var CloudOnlyDirectoriesLimitReached: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.CloudOnlyDirectoriesLimitReached] = js.native
  /**
    * The current number of AWS Managed Microsoft AD directories in the region.
    */
  var CloudOnlyMicrosoftADCurrentCount: js.UndefOr[Limit] = js.native
  /**
    * The maximum number of AWS Managed Microsoft AD directories allowed in the region.
    */
  var CloudOnlyMicrosoftADLimit: js.UndefOr[Limit] = js.native
  /**
    * Indicates if the AWS Managed Microsoft AD directory limit has been reached.
    */
  var CloudOnlyMicrosoftADLimitReached: js.UndefOr[CloudOnlyDirectoriesLimitReached] = js.native
  /**
    * The current number of connected directories in the Region.
    */
  var ConnectedDirectoriesCurrentCount: js.UndefOr[Limit] = js.native
  /**
    * The maximum number of connected directories allowed in the Region.
    */
  var ConnectedDirectoriesLimit: js.UndefOr[Limit] = js.native
  /**
    * Indicates if the connected directory limit has been reached.
    */
  var ConnectedDirectoriesLimitReached: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.ConnectedDirectoriesLimitReached] = js.native
}

object DirectoryLimits {
  @scala.inline
  def apply(
    CloudOnlyDirectoriesCurrentCount: Int | Double = null,
    CloudOnlyDirectoriesLimit: Int | Double = null,
    CloudOnlyDirectoriesLimitReached: js.UndefOr[Boolean] = js.undefined,
    CloudOnlyMicrosoftADCurrentCount: Int | Double = null,
    CloudOnlyMicrosoftADLimit: Int | Double = null,
    CloudOnlyMicrosoftADLimitReached: js.UndefOr[Boolean] = js.undefined,
    ConnectedDirectoriesCurrentCount: Int | Double = null,
    ConnectedDirectoriesLimit: Int | Double = null,
    ConnectedDirectoriesLimitReached: js.UndefOr[Boolean] = js.undefined
  ): DirectoryLimits = {
    val __obj = js.Dynamic.literal()
    if (CloudOnlyDirectoriesCurrentCount != null) __obj.updateDynamic("CloudOnlyDirectoriesCurrentCount")(CloudOnlyDirectoriesCurrentCount.asInstanceOf[js.Any])
    if (CloudOnlyDirectoriesLimit != null) __obj.updateDynamic("CloudOnlyDirectoriesLimit")(CloudOnlyDirectoriesLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(CloudOnlyDirectoriesLimitReached)) __obj.updateDynamic("CloudOnlyDirectoriesLimitReached")(CloudOnlyDirectoriesLimitReached.asInstanceOf[js.Any])
    if (CloudOnlyMicrosoftADCurrentCount != null) __obj.updateDynamic("CloudOnlyMicrosoftADCurrentCount")(CloudOnlyMicrosoftADCurrentCount.asInstanceOf[js.Any])
    if (CloudOnlyMicrosoftADLimit != null) __obj.updateDynamic("CloudOnlyMicrosoftADLimit")(CloudOnlyMicrosoftADLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(CloudOnlyMicrosoftADLimitReached)) __obj.updateDynamic("CloudOnlyMicrosoftADLimitReached")(CloudOnlyMicrosoftADLimitReached.asInstanceOf[js.Any])
    if (ConnectedDirectoriesCurrentCount != null) __obj.updateDynamic("ConnectedDirectoriesCurrentCount")(ConnectedDirectoriesCurrentCount.asInstanceOf[js.Any])
    if (ConnectedDirectoriesLimit != null) __obj.updateDynamic("ConnectedDirectoriesLimit")(ConnectedDirectoriesLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(ConnectedDirectoriesLimitReached)) __obj.updateDynamic("ConnectedDirectoriesLimitReached")(ConnectedDirectoriesLimitReached.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryLimits]
  }
}

