package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVaultOutput extends js.Object {
  /**
    * The URI of the vault that was created.
    */
  var location: js.UndefOr[String] = js.native
}

object CreateVaultOutput {
  @scala.inline
  def apply(location: String = null): CreateVaultOutput = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVaultOutput]
  }
}

