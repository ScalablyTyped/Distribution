package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVaultOutput extends js.Object {
  /**
    * The URI of the vault that was created.
    */
  var location: js.UndefOr[java.lang.String] = js.undefined
}

object CreateVaultOutput {
  @scala.inline
  def apply(location: java.lang.String = null): CreateVaultOutput = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[CreateVaultOutput]
  }
}

