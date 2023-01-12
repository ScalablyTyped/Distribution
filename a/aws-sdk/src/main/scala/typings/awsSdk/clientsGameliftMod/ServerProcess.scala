package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerProcess extends StObject {
  
  /**
    * The number of server processes using this configuration that run concurrently on each instance.
    */
  var ConcurrentExecutions: PositiveInteger
  
  /**
    * The location of a game build executable or the Realtime script file that contains the Init() function. Game builds and Realtime scripts are installed on instances at the root:    Windows (custom game builds only): C:\game. Example: "C:\game\MyGame\server.exe"    Linux: /local/game. Examples: "/local/game/MyGame/server.exe" or "/local/game/MyRealtimeScript.js"  
    */
  var LaunchPath: LaunchPathStringModel
  
  /**
    * An optional list of parameters to pass to the server executable or Realtime script on launch.
    */
  var Parameters: js.UndefOr[LaunchParametersStringModel] = js.undefined
}
object ServerProcess {
  
  inline def apply(ConcurrentExecutions: PositiveInteger, LaunchPath: LaunchPathStringModel): ServerProcess = {
    val __obj = js.Dynamic.literal(ConcurrentExecutions = ConcurrentExecutions.asInstanceOf[js.Any], LaunchPath = LaunchPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerProcess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerProcess] (val x: Self) extends AnyVal {
    
    inline def setConcurrentExecutions(value: PositiveInteger): Self = StObject.set(x, "ConcurrentExecutions", value.asInstanceOf[js.Any])
    
    inline def setLaunchPath(value: LaunchPathStringModel): Self = StObject.set(x, "LaunchPath", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: LaunchParametersStringModel): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
  }
}
