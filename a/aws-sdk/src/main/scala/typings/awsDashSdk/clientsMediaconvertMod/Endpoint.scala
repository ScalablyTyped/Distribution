package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endpoint extends js.Object {
  /**
    * URL of endpoint
    */
  var Url: js.UndefOr[__string] = js.undefined
}

object Endpoint {
  @scala.inline
  def apply(Url: __string = null): Endpoint = {
    val __obj = js.Dynamic.literal()
    if (Url != null) __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[Endpoint]
  }
}

