package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStreamAttributesRequest extends StObject {
  
  /**
    * The settings that you want to use to define the media stream.
    */
  var Fmtp: js.UndefOr[FmtpRequest] = js.undefined
  
  /**
    * The audio language, in a format that is recognized by the receiver.
    */
  var Lang: js.UndefOr[string] = js.undefined
}
object MediaStreamAttributesRequest {
  
  inline def apply(): MediaStreamAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaStreamAttributesRequest]
  }
  
  extension [Self <: MediaStreamAttributesRequest](x: Self) {
    
    inline def setFmtp(value: FmtpRequest): Self = StObject.set(x, "Fmtp", value.asInstanceOf[js.Any])
    
    inline def setFmtpUndefined: Self = StObject.set(x, "Fmtp", js.undefined)
    
    inline def setLang(value: string): Self = StObject.set(x, "Lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "Lang", js.undefined)
  }
}
