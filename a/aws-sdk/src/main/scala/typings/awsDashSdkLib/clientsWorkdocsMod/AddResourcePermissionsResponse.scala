package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddResourcePermissionsResponse extends js.Object {
  /**
    * The share results.
    */
  var ShareResults: js.UndefOr[ShareResultsList] = js.undefined
}

object AddResourcePermissionsResponse {
  @scala.inline
  def apply(ShareResults: ShareResultsList = null): AddResourcePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (ShareResults != null) __obj.updateDynamic("ShareResults")(ShareResults)
    __obj.asInstanceOf[AddResourcePermissionsResponse]
  }
}

