package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVaultsOutput extends js.Object {
  /**
    * The vault ARN at which to continue pagination of the results. You use the marker in another List Vaults request to obtain more vaults in the list.
    */
  var Marker: js.UndefOr[java.lang.String] = js.undefined
  /**
    * List of vaults.
    */
  var VaultList: js.UndefOr[VaultList] = js.undefined
}

object ListVaultsOutput {
  @scala.inline
  def apply(Marker: java.lang.String = null, VaultList: VaultList = null): ListVaultsOutput = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (VaultList != null) __obj.updateDynamic("VaultList")(VaultList)
    __obj.asInstanceOf[ListVaultsOutput]
  }
}

