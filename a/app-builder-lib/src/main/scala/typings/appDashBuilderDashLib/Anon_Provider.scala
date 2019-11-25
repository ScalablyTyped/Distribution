package typings.appDashBuilderDashLib

import typings.builderDashUtilDashRuntime.outPublishOptionsMod.PublishProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Provider extends js.Object {
  var provider: PublishProvider
  var publishAutoUpdate: js.UndefOr[Boolean] = js.undefined
  var publisherName: js.UndefOr[js.Array[String] | Null] = js.undefined
  var updaterCacheDirName: String
}

object Anon_Provider {
  @scala.inline
  def apply(
    provider: PublishProvider,
    updaterCacheDirName: String,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.Array[String] = null
  ): Anon_Provider = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], updaterCacheDirName = updaterCacheDirName.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.asInstanceOf[js.Any])
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Provider]
  }
}

