package typings
package appDashBuilderDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Provider extends js.Object {
  var provider: builderDashUtilDashRuntimeLib.outPublishOptionsMod.PublishProvider
  var publishAutoUpdate: js.UndefOr[scala.Boolean] = js.undefined
  var publisherName: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
  var updaterCacheDirName: java.lang.String
}

object Anon_Provider {
  @scala.inline
  def apply(
    provider: builderDashUtilDashRuntimeLib.outPublishOptionsMod.PublishProvider,
    updaterCacheDirName: java.lang.String,
    publishAutoUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    publisherName: js.Array[java.lang.String] = null
  ): Anon_Provider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provider")(provider)
    __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName)
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate)
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName)
    __obj.asInstanceOf[Anon_Provider]
  }
}

