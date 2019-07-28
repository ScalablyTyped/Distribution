package typings.applepayjs.ApplePayJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The attributes contained by the onvalidatemerchant callback function.
  */
@JSGlobal("ApplePayJS.ApplePayValidateMerchantEvent")
@js.native
abstract class ApplePayValidateMerchantEvent () extends Event {
  /**
    * The URL your server must use to validate itself and obtain a merchant session object.
    */
  val validationURL: String = js.native
}

