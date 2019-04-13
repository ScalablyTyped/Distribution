package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  /**
    * Arguments for Amazon EMR to pass to the command for execution.
    */
  var Args: js.UndefOr[StringList] = js.undefined
  /**
    * The name of the command.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The Amazon S3 location of the command script.
    */
  var ScriptPath: js.UndefOr[String] = js.undefined
}

object Command {
  @scala.inline
  def apply(Args: StringList = null, Name: String = null, ScriptPath: String = null): Command = {
    val __obj = js.Dynamic.literal()
    if (Args != null) __obj.updateDynamic("Args")(Args)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (ScriptPath != null) __obj.updateDynamic("ScriptPath")(ScriptPath)
    __obj.asInstanceOf[Command]
  }
}

