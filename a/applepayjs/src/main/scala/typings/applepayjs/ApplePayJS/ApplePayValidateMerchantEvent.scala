package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The attributes contained by the onvalidatemerchant callback function.
  */
@js.native
trait ApplePayValidateMerchantEvent extends Event {
  
  /**
    * The URL your server must use to validate itself and obtain a merchant session object.
    */
  val validationURL: String = js.native
}
