package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsteriskInfo extends StObject {
  
  /**
    * Info about how Asterisk was built.
    */
  var build: js.UndefOr[BuildInfo] = js.native
  
  /**
    * Info about Asterisk configuration.
    */
  var config: js.UndefOr[ConfigInfo] = js.native
  
  /**
    * Info about Asterisk status.
    */
  var status: js.UndefOr[StatusInfo] = js.native
  
  /**
    * Info about the system running Asterisk.
    */
  var system: js.UndefOr[SystemInfo] = js.native
}
object AsteriskInfo {
  
  @scala.inline
  def apply(): AsteriskInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsteriskInfo]
  }
  
  @scala.inline
  implicit class AsteriskInfoMutableBuilder[Self <: AsteriskInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: BuildInfo): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    @scala.inline
    def setConfig(value: ConfigInfo): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusInfo): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSystem(value: SystemInfo): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
  }
}
