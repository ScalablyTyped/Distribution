package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSInfo extends StObject {
  
  /**
    *  Information about the type of operating system. 
    */
  var `type`: js.UndefOr[OSType] = js.undefined
  
  /**
    *  Information about the version of operating system. 
    */
  var version: js.UndefOr[OSVersion] = js.undefined
}
object OSInfo {
  
  inline def apply(): OSInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSInfo]
  }
  
  extension [Self <: OSInfo](x: Self) {
    
    inline def setType(value: OSType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVersion(value: OSVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
