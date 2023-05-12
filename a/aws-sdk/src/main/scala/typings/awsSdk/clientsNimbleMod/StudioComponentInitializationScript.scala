package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StudioComponentInitializationScript extends StObject {
  
  /**
    * The version number of the protocol that is used by the launch profile. The only valid version is "2021-03-31".
    */
  var launchProfileProtocolVersion: js.UndefOr[LaunchProfileProtocolVersion] = js.undefined
  
  /**
    * The platform of the initialization script, either Windows or Linux.
    */
  var platform: js.UndefOr[LaunchProfilePlatform] = js.undefined
  
  /**
    * The method to use when running the initialization script.
    */
  var runContext: js.UndefOr[StudioComponentInitializationScriptRunContext] = js.undefined
  
  /**
    * The initialization script.
    */
  var script: js.UndefOr[StudioComponentInitializationScriptContent] = js.undefined
}
object StudioComponentInitializationScript {
  
  inline def apply(): StudioComponentInitializationScript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StudioComponentInitializationScript]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StudioComponentInitializationScript] (val x: Self) extends AnyVal {
    
    inline def setLaunchProfileProtocolVersion(value: LaunchProfileProtocolVersion): Self = StObject.set(x, "launchProfileProtocolVersion", value.asInstanceOf[js.Any])
    
    inline def setLaunchProfileProtocolVersionUndefined: Self = StObject.set(x, "launchProfileProtocolVersion", js.undefined)
    
    inline def setPlatform(value: LaunchProfilePlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setRunContext(value: StudioComponentInitializationScriptRunContext): Self = StObject.set(x, "runContext", value.asInstanceOf[js.Any])
    
    inline def setRunContextUndefined: Self = StObject.set(x, "runContext", js.undefined)
    
    inline def setScript(value: StudioComponentInitializationScriptContent): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
  }
}
