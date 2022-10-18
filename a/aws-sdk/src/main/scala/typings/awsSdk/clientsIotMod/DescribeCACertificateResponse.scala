package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCACertificateResponse extends StObject {
  
  /**
    * The CA certificate description.
    */
  var certificateDescription: js.UndefOr[CACertificateDescription] = js.undefined
  
  /**
    * Information about the registration configuration.
    */
  var registrationConfig: js.UndefOr[RegistrationConfig] = js.undefined
}
object DescribeCACertificateResponse {
  
  inline def apply(): DescribeCACertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCACertificateResponse]
  }
  
  extension [Self <: DescribeCACertificateResponse](x: Self) {
    
    inline def setCertificateDescription(value: CACertificateDescription): Self = StObject.set(x, "certificateDescription", value.asInstanceOf[js.Any])
    
    inline def setCertificateDescriptionUndefined: Self = StObject.set(x, "certificateDescription", js.undefined)
    
    inline def setRegistrationConfig(value: RegistrationConfig): Self = StObject.set(x, "registrationConfig", value.asInstanceOf[js.Any])
    
    inline def setRegistrationConfigUndefined: Self = StObject.set(x, "registrationConfig", js.undefined)
  }
}
