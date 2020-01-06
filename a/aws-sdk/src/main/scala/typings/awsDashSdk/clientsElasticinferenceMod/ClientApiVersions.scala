package typings.awsDashSdk.clientsElasticinferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientApiVersions extends js.Object {
  /**
    * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
    */
  var apiVersion: js.UndefOr[typings.awsDashSdk.clientsElasticinferenceMod.apiVersion] = js.native
}

object ClientApiVersions {
  @scala.inline
  def apply(apiVersion: apiVersion = null): ClientApiVersions = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientApiVersions]
  }
}

