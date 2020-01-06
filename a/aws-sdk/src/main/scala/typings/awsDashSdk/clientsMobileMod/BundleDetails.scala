package typings.awsDashSdk.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BundleDetails extends js.Object {
  var availablePlatforms: js.UndefOr[Platforms] = js.native
  var bundleId: js.UndefOr[BundleId] = js.native
  var description: js.UndefOr[BundleDescription] = js.native
  var iconUrl: js.UndefOr[IconUrl] = js.native
  var title: js.UndefOr[BundleTitle] = js.native
  var version: js.UndefOr[BundleVersion] = js.native
}

object BundleDetails {
  @scala.inline
  def apply(
    availablePlatforms: Platforms = null,
    bundleId: BundleId = null,
    description: BundleDescription = null,
    iconUrl: IconUrl = null,
    title: BundleTitle = null,
    version: BundleVersion = null
  ): BundleDetails = {
    val __obj = js.Dynamic.literal()
    if (availablePlatforms != null) __obj.updateDynamic("availablePlatforms")(availablePlatforms.asInstanceOf[js.Any])
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleDetails]
  }
}

