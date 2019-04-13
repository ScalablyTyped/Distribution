package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryLimits extends js.Object {
  /**
    * The current number of cloud directories in the region.
    */
  var CloudOnlyDirectoriesCurrentCount: js.UndefOr[Limit] = js.undefined
  /**
    * The maximum number of cloud directories allowed in the region.
    */
  var CloudOnlyDirectoriesLimit: js.UndefOr[Limit] = js.undefined
  /**
    * Indicates if the cloud directory limit has been reached.
    */
  var CloudOnlyDirectoriesLimitReached: js.UndefOr[CloudOnlyDirectoriesLimitReached] = js.undefined
  /**
    * The current number of AWS Managed Microsoft AD directories in the region.
    */
  var CloudOnlyMicrosoftADCurrentCount: js.UndefOr[Limit] = js.undefined
  /**
    * The maximum number of AWS Managed Microsoft AD directories allowed in the region.
    */
  var CloudOnlyMicrosoftADLimit: js.UndefOr[Limit] = js.undefined
  /**
    * Indicates if the AWS Managed Microsoft AD directory limit has been reached.
    */
  var CloudOnlyMicrosoftADLimitReached: js.UndefOr[CloudOnlyDirectoriesLimitReached] = js.undefined
  /**
    * The current number of connected directories in the region.
    */
  var ConnectedDirectoriesCurrentCount: js.UndefOr[Limit] = js.undefined
  /**
    * The maximum number of connected directories allowed in the region.
    */
  var ConnectedDirectoriesLimit: js.UndefOr[Limit] = js.undefined
  /**
    * Indicates if the connected directory limit has been reached.
    */
  var ConnectedDirectoriesLimitReached: js.UndefOr[ConnectedDirectoriesLimitReached] = js.undefined
}

object DirectoryLimits {
  @scala.inline
  def apply(
    CloudOnlyDirectoriesCurrentCount: js.UndefOr[Limit] = js.undefined,
    CloudOnlyDirectoriesLimit: js.UndefOr[Limit] = js.undefined,
    CloudOnlyDirectoriesLimitReached: js.UndefOr[CloudOnlyDirectoriesLimitReached] = js.undefined,
    CloudOnlyMicrosoftADCurrentCount: js.UndefOr[Limit] = js.undefined,
    CloudOnlyMicrosoftADLimit: js.UndefOr[Limit] = js.undefined,
    CloudOnlyMicrosoftADLimitReached: js.UndefOr[CloudOnlyDirectoriesLimitReached] = js.undefined,
    ConnectedDirectoriesCurrentCount: js.UndefOr[Limit] = js.undefined,
    ConnectedDirectoriesLimit: js.UndefOr[Limit] = js.undefined,
    ConnectedDirectoriesLimitReached: js.UndefOr[ConnectedDirectoriesLimitReached] = js.undefined
  ): DirectoryLimits = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CloudOnlyDirectoriesCurrentCount)) __obj.updateDynamic("CloudOnlyDirectoriesCurrentCount")(CloudOnlyDirectoriesCurrentCount)
    if (!js.isUndefined(CloudOnlyDirectoriesLimit)) __obj.updateDynamic("CloudOnlyDirectoriesLimit")(CloudOnlyDirectoriesLimit)
    if (!js.isUndefined(CloudOnlyDirectoriesLimitReached)) __obj.updateDynamic("CloudOnlyDirectoriesLimitReached")(CloudOnlyDirectoriesLimitReached)
    if (!js.isUndefined(CloudOnlyMicrosoftADCurrentCount)) __obj.updateDynamic("CloudOnlyMicrosoftADCurrentCount")(CloudOnlyMicrosoftADCurrentCount)
    if (!js.isUndefined(CloudOnlyMicrosoftADLimit)) __obj.updateDynamic("CloudOnlyMicrosoftADLimit")(CloudOnlyMicrosoftADLimit)
    if (!js.isUndefined(CloudOnlyMicrosoftADLimitReached)) __obj.updateDynamic("CloudOnlyMicrosoftADLimitReached")(CloudOnlyMicrosoftADLimitReached)
    if (!js.isUndefined(ConnectedDirectoriesCurrentCount)) __obj.updateDynamic("ConnectedDirectoriesCurrentCount")(ConnectedDirectoriesCurrentCount)
    if (!js.isUndefined(ConnectedDirectoriesLimit)) __obj.updateDynamic("ConnectedDirectoriesLimit")(ConnectedDirectoriesLimit)
    if (!js.isUndefined(ConnectedDirectoriesLimitReached)) __obj.updateDynamic("ConnectedDirectoriesLimitReached")(ConnectedDirectoriesLimitReached)
    __obj.asInstanceOf[DirectoryLimits]
  }
}

