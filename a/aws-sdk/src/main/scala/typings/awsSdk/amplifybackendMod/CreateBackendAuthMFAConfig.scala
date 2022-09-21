package typings.awsSdk.amplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackendAuthMFAConfig extends StObject {
  
  /**
    * Describes whether MFA should be [ON, OFF, or OPTIONAL] for authentication in your Amplify project.
    */
  var MFAMode: typings.awsSdk.amplifybackendMod.MFAMode
  
  /**
    * Describes the configuration settings and methods for your Amplify app users to use MFA.
    */
  var Settings: js.UndefOr[typings.awsSdk.amplifybackendMod.Settings] = js.undefined
}
object CreateBackendAuthMFAConfig {
  
  inline def apply(MFAMode: MFAMode): CreateBackendAuthMFAConfig = {
    val __obj = js.Dynamic.literal(MFAMode = MFAMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackendAuthMFAConfig]
  }
  
  extension [Self <: CreateBackendAuthMFAConfig](x: Self) {
    
    inline def setMFAMode(value: MFAMode): Self = StObject.set(x, "MFAMode", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: Settings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
  }
}
