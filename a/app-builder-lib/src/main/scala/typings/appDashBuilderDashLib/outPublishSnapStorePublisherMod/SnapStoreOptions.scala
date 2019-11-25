package typings.appDashBuilderDashLib.outPublishSnapStorePublisherMod

import typings.builderDashUtilDashRuntime.outPublishOptionsMod.PublishConfiguration
import typings.builderDashUtilDashRuntime.outPublishOptionsMod.PublishProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapStoreOptions extends PublishConfiguration {
  /**
    * The list of channels the snap would be released.
    * @default ["edge"]
    */
  val channels: js.UndefOr[String | js.Array[String] | Null] = js.undefined
}

object SnapStoreOptions {
  @scala.inline
  def apply(
    provider: PublishProvider,
    channels: String | js.Array[String] = null,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.Array[String] = null,
    updaterCacheDirName: String = null
  ): SnapStoreOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.asInstanceOf[js.Any])
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (updaterCacheDirName != null) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapStoreOptions]
  }
}

