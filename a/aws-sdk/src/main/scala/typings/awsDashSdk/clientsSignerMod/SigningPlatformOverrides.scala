package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SigningPlatformOverrides extends js.Object {
  /**
    * A signing configuration that overrides the default encryption or hash algorithm of a signing job.
    */
  var signingConfiguration: js.UndefOr[SigningConfigurationOverrides] = js.native
}

object SigningPlatformOverrides {
  @scala.inline
  def apply(signingConfiguration: SigningConfigurationOverrides = null): SigningPlatformOverrides = {
    val __obj = js.Dynamic.literal()
    if (signingConfiguration != null) __obj.updateDynamic("signingConfiguration")(signingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigningPlatformOverrides]
  }
}

