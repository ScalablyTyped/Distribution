package typings.appBuilderLib

import typings.builderUtilRuntime.publishOptionsMod.PublishProvider
import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProvider extends js.Object {
  var provider: PublishProvider
  var publishAutoUpdate: js.UndefOr[Boolean] = js.undefined
  var publisherName: js.UndefOr[js.Array[String] | Null] = js.undefined
  var requestHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  var updaterCacheDirName: String
}

object AnonProvider {
  @scala.inline
  def apply(
    provider: PublishProvider,
    updaterCacheDirName: String,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.Array[String] = null,
    requestHeaders: OutgoingHttpHeaders = null
  ): AnonProvider = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], updaterCacheDirName = updaterCacheDirName.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.asInstanceOf[js.Any])
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProvider]
  }
}

