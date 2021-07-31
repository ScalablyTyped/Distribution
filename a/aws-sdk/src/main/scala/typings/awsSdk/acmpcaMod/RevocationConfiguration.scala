package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevocationConfiguration extends StObject {
  
  /**
    * Configuration of the certificate revocation list (CRL), if any, maintained by your private CA.
    */
  var CrlConfiguration: js.UndefOr[typings.awsSdk.acmpcaMod.CrlConfiguration] = js.undefined
}
object RevocationConfiguration {
  
  @scala.inline
  def apply(): RevocationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevocationConfiguration]
  }
  
  @scala.inline
  implicit class RevocationConfigurationMutableBuilder[Self <: RevocationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrlConfiguration(value: CrlConfiguration): Self = StObject.set(x, "CrlConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrlConfigurationUndefined: Self = StObject.set(x, "CrlConfiguration", js.undefined)
  }
}
