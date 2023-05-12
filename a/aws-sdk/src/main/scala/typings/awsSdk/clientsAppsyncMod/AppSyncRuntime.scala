package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppSyncRuntime extends StObject {
  
  /**
    * The name of the runtime to use. Currently, the only allowed value is APPSYNC_JS.
    */
  var name: RuntimeName
  
  /**
    * The version of the runtime to use. Currently, the only allowed version is 1.0.0.
    */
  var runtimeVersion: String
}
object AppSyncRuntime {
  
  inline def apply(name: RuntimeName, runtimeVersion: String): AppSyncRuntime = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], runtimeVersion = runtimeVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppSyncRuntime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppSyncRuntime] (val x: Self) extends AnyVal {
    
    inline def setName(value: RuntimeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRuntimeVersion(value: String): Self = StObject.set(x, "runtimeVersion", value.asInstanceOf[js.Any])
  }
}
