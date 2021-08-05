package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsteriskInfo extends StObject {
  
  /**
    * Info about how Asterisk was built.
    */
  var build: js.UndefOr[BuildInfo] = js.undefined
  
  /**
    * Info about Asterisk configuration.
    */
  var config: js.UndefOr[ConfigInfo] = js.undefined
  
  /**
    * Info about Asterisk status.
    */
  var status: js.UndefOr[StatusInfo] = js.undefined
  
  /**
    * Info about the system running Asterisk.
    */
  var system: js.UndefOr[SystemInfo] = js.undefined
}
object AsteriskInfo {
  
  inline def apply(): AsteriskInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsteriskInfo]
  }
  
  extension [Self <: AsteriskInfo](x: Self) {
    
    inline def setBuild(value: BuildInfo): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    inline def setConfig(value: ConfigInfo): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setStatus(value: StatusInfo): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSystem(value: SystemInfo): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
  }
}
