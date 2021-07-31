package typings.awsSdk.acmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateOptions extends StObject {
  
  /**
    * You can opt out of certificate transparency logging by specifying the DISABLED option. Opt in by specifying ENABLED. 
    */
  var CertificateTransparencyLoggingPreference: js.UndefOr[typings.awsSdk.acmMod.CertificateTransparencyLoggingPreference] = js.undefined
}
object CertificateOptions {
  
  @scala.inline
  def apply(): CertificateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateOptions]
  }
  
  @scala.inline
  implicit class CertificateOptionsMutableBuilder[Self <: CertificateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateTransparencyLoggingPreference(value: CertificateTransparencyLoggingPreference): Self = StObject.set(x, "CertificateTransparencyLoggingPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateTransparencyLoggingPreferenceUndefined: Self = StObject.set(x, "CertificateTransparencyLoggingPreference", js.undefined)
  }
}
