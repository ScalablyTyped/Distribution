package typings
package awsDashSdkLib.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BundleDetails extends js.Object {
  var availablePlatforms: js.UndefOr[Platforms] = js.undefined
  var bundleId: js.UndefOr[BundleId] = js.undefined
  var description: js.UndefOr[BundleDescription] = js.undefined
  var iconUrl: js.UndefOr[IconUrl] = js.undefined
  var title: js.UndefOr[BundleTitle] = js.undefined
  var version: js.UndefOr[BundleVersion] = js.undefined
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
    if (availablePlatforms != null) __obj.updateDynamic("availablePlatforms")(availablePlatforms)
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (title != null) __obj.updateDynamic("title")(title)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[BundleDetails]
  }
}

