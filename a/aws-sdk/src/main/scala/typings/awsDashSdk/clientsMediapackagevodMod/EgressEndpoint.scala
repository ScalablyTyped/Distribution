package typings.awsDashSdk.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EgressEndpoint extends js.Object {
  /**
    * The ID of the PackagingConfiguration being applied to the Asset.
    */
  var PackagingConfigurationId: js.UndefOr[__string] = js.undefined
  /**
    * The URL of the parent manifest for the repackaged Asset.
    */
  var Url: js.UndefOr[__string] = js.undefined
}

object EgressEndpoint {
  @scala.inline
  def apply(PackagingConfigurationId: __string = null, Url: __string = null): EgressEndpoint = {
    val __obj = js.Dynamic.literal()
    if (PackagingConfigurationId != null) __obj.updateDynamic("PackagingConfigurationId")(PackagingConfigurationId)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[EgressEndpoint]
  }
}

