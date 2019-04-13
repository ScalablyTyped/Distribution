package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAttributesRequest extends js.Object {
  /**
    * The GLOB wildcard for removing the attributes in the application
    */
  var Blacklist: js.UndefOr[ListOf__string] = js.undefined
}

object UpdateAttributesRequest {
  @scala.inline
  def apply(Blacklist: ListOf__string = null): UpdateAttributesRequest = {
    val __obj = js.Dynamic.literal()
    if (Blacklist != null) __obj.updateDynamic("Blacklist")(Blacklist)
    __obj.asInstanceOf[UpdateAttributesRequest]
  }
}

