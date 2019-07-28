package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentPlatform extends js.Object {
  /**
    * The list of programming languages that are available for the specified platform.
    */
  var languages: js.UndefOr[EnvironmentLanguages] = js.undefined
  /**
    * The platform's name.
    */
  var platform: js.UndefOr[PlatformType] = js.undefined
}

object EnvironmentPlatform {
  @scala.inline
  def apply(languages: EnvironmentLanguages = null, platform: PlatformType = null): EnvironmentPlatform = {
    val __obj = js.Dynamic.literal()
    if (languages != null) __obj.updateDynamic("languages")(languages)
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentPlatform]
  }
}

