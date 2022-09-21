package typings.applepayjs

import typings.applepayjs.ApplePayJS.ApplePayErrorCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A customizable error type that you create to indicate problems with the address or contact information on an Apple Pay sheet.
  */
trait ApplePayError
  extends StObject
     with typings.applepayjs.ApplePayJS.ApplePayError
object ApplePayError {
  
  inline def apply(code: ApplePayErrorCode, message: String): ApplePayError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayError]
  }
}
