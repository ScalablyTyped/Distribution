package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The error code that indicates whether an error on the payment sheet is for shipping or billing information, or for another kind of error.
  */
/* Rewritten from type alias, can be one of: 
  - typings.applepayjs.applepayjsStrings.shippingContactInvalid
  - typings.applepayjs.applepayjsStrings.billingContactInvalid
  - typings.applepayjs.applepayjsStrings.addressUnserviceable
  - typings.applepayjs.applepayjsStrings.unknown
*/
trait ApplePayErrorCode extends StObject
object ApplePayErrorCode {
  
  inline def addressUnserviceable: typings.applepayjs.applepayjsStrings.addressUnserviceable = "addressUnserviceable".asInstanceOf[typings.applepayjs.applepayjsStrings.addressUnserviceable]
  
  inline def billingContactInvalid: typings.applepayjs.applepayjsStrings.billingContactInvalid = "billingContactInvalid".asInstanceOf[typings.applepayjs.applepayjsStrings.billingContactInvalid]
  
  inline def shippingContactInvalid: typings.applepayjs.applepayjsStrings.shippingContactInvalid = "shippingContactInvalid".asInstanceOf[typings.applepayjs.applepayjsStrings.shippingContactInvalid]
  
  inline def unknown: typings.applepayjs.applepayjsStrings.unknown = "unknown".asInstanceOf[typings.applepayjs.applepayjsStrings.unknown]
}
