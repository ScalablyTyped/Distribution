package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerProcess extends js.Object {
  /**
    * Number of server processes using this configuration to run concurrently on an instance.
    */
  var ConcurrentExecutions: PositiveInteger
  /**
    * Location of the server executable in a game build. All game builds are installed on instances at the root : for Windows instances C:\game, and for Linux instances /local/game. A Windows game build with an executable file located at MyGame\latest\server.exe must have a launch path of "C:\game\MyGame\latest\server.exe". A Linux game build with an executable file located at MyGame/latest/server.exe must have a launch path of "/local/game/MyGame/latest/server.exe". 
    */
  var LaunchPath: NonZeroAndMaxString
  /**
    * Optional list of parameters to pass to the server executable on launch.
    */
  var Parameters: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object ServerProcess {
  @scala.inline
  def apply(
    ConcurrentExecutions: PositiveInteger,
    LaunchPath: NonZeroAndMaxString,
    Parameters: NonZeroAndMaxString = null
  ): ServerProcess = {
    val __obj = js.Dynamic.literal(ConcurrentExecutions = ConcurrentExecutions, LaunchPath = LaunchPath)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    __obj.asInstanceOf[ServerProcess]
  }
}

