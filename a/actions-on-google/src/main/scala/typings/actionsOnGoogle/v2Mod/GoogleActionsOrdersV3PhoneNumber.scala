package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3PhoneNumber extends StObject {
  
  /**
    * Phone number in E.164 format, as defined in International
    * Telecommunication Union (ITU) Recommendation E.164.
    * wiki link: https://en.wikipedia.org/wiki/E.164
    */
  var e164PhoneNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Extension is not standardized in ITU recommendations, except for being
    * defined as a series of numbers with a maximum length of 40 digits. It is
    * defined as a string here to accommodate for the possible use of a leading
    * zero in the extension (organizations have complete freedom to do so, as
    * there is no standard defined). Other than digits, some other dialling
    * characters such as \",\" (indicating a wait) may be stored here.
    * For example, in xxx-xxx-xxxx ext. 123, \"123\" is the extension.
    */
  var `extension`: js.UndefOr[String] = js.undefined
  
  /**
    * The carrier selection code that is preferred when calling this phone number
    * domestically. This also includes codes that need to be dialed in some
    * countries when calling from landlines to mobiles or vice versa. For
    * example, in Columbia, a \"3\" needs to be dialed before the phone number
    * itself when calling from a mobile phone to a domestic landline phone and
    * vice versa. https://en.wikipedia.org/wiki/Telephone_numbers_in_Colombia
    * https://en.wikipedia.org/wiki/Brazilian_Carrier_Selection_Code
    *
    * Note this is the \"preferred\" code, which means other codes may work as
    * well.
    */
  var preferredDomesticCarrierCode: js.UndefOr[String] = js.undefined
}
object GoogleActionsOrdersV3PhoneNumber {
  
  inline def apply(): GoogleActionsOrdersV3PhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3PhoneNumber]
  }
  
  extension [Self <: GoogleActionsOrdersV3PhoneNumber](x: Self) {
    
    inline def setE164PhoneNumber(value: String): Self = StObject.set(x, "e164PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setE164PhoneNumberUndefined: Self = StObject.set(x, "e164PhoneNumber", js.undefined)
    
    inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setPreferredDomesticCarrierCode(value: String): Self = StObject.set(x, "preferredDomesticCarrierCode", value.asInstanceOf[js.Any])
    
    inline def setPreferredDomesticCarrierCodeUndefined: Self = StObject.set(x, "preferredDomesticCarrierCode", js.undefined)
  }
}
