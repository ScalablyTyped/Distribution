package typings.appBuilderLib.snapStorePublisherMod

import typings.builderUtilRuntime.publishOptionsMod.PublishConfiguration
import typings.builderUtilRuntime.publishOptionsMod.PublishProvider
import typings.node.httpMod.OutgoingHttpHeaders
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
    channels: js.UndefOr[Null | String | js.Array[String]] = js.undefined,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.UndefOr[Null | js.Array[String]] = js.undefined,
    requestHeaders: OutgoingHttpHeaders = null,
    updaterCacheDirName: js.UndefOr[Null | String] = js.undefined
  ): SnapStoreOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    if (!js.isUndefined(channels)) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(publisherName)) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(updaterCacheDirName)) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapStoreOptions]
  }
}

