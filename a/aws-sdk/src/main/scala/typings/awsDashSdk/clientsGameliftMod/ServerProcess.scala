package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerProcess extends js.Object {
  /**
    * The number of server processes that use this configuration to run concurrently on an instance.
    */
  var ConcurrentExecutions: PositiveInteger = js.native
  /**
    * The location of the server executable in a custom game build or the name of the Realtime script file that contains the Init() function. Game builds and Realtime scripts are installed on instances at the root:    Windows (for custom game builds only): C:\game. Example: "C:\game\MyGame\server.exe"    Linux: /local/game. Examples: "/local/game/MyGame/server.exe" or "/local/game/MyRealtimeScript.js"  
    */
  var LaunchPath: NonZeroAndMaxString = js.native
  /**
    * An optional list of parameters to pass to the server executable or Realtime script on launch.
    */
  var Parameters: js.UndefOr[NonZeroAndMaxString] = js.native
}

object ServerProcess {
  @scala.inline
  def apply(
    ConcurrentExecutions: PositiveInteger,
    LaunchPath: NonZeroAndMaxString,
    Parameters: NonZeroAndMaxString = null
  ): ServerProcess = {
    val __obj = js.Dynamic.literal(ConcurrentExecutions = ConcurrentExecutions.asInstanceOf[js.Any], LaunchPath = LaunchPath.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerProcess]
  }
}

