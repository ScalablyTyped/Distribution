package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SigningPlatformOverrides extends js.Object {
  var signingConfiguration: js.UndefOr[SigningConfigurationOverrides] = js.undefined
}

object SigningPlatformOverrides {
  @scala.inline
  def apply(signingConfiguration: SigningConfigurationOverrides = null): SigningPlatformOverrides = {
    val __obj = js.Dynamic.literal()
    if (signingConfiguration != null) __obj.updateDynamic("signingConfiguration")(signingConfiguration)
    __obj.asInstanceOf[SigningPlatformOverrides]
  }
}

