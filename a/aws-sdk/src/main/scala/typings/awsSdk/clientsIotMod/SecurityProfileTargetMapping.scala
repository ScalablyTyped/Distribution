package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityProfileTargetMapping extends StObject {
  
  /**
    * Information that identifies the security profile.
    */
  var securityProfileIdentifier: js.UndefOr[SecurityProfileIdentifier] = js.undefined
  
  /**
    * Information about the target (thing group) associated with the security profile.
    */
  var target: js.UndefOr[SecurityProfileTarget] = js.undefined
}
object SecurityProfileTargetMapping {
  
  inline def apply(): SecurityProfileTargetMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityProfileTargetMapping]
  }
  
  extension [Self <: SecurityProfileTargetMapping](x: Self) {
    
    inline def setSecurityProfileIdentifier(value: SecurityProfileIdentifier): Self = StObject.set(x, "securityProfileIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileIdentifierUndefined: Self = StObject.set(x, "securityProfileIdentifier", js.undefined)
    
    inline def setTarget(value: SecurityProfileTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
