package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptBootstrapActionConfig extends js.Object {
  /**
    * A list of command line arguments to pass to the bootstrap action script.
    */
  var Args: js.UndefOr[XmlStringList] = js.undefined
  /**
    * Location of the script to run during a bootstrap action. Can be either a location in Amazon S3 or on a local file system.
    */
  var Path: XmlString
}

object ScriptBootstrapActionConfig {
  @scala.inline
  def apply(Path: XmlString, Args: XmlStringList = null): ScriptBootstrapActionConfig = {
    val __obj = js.Dynamic.literal(Path = Path)
    if (Args != null) __obj.updateDynamic("Args")(Args)
    __obj.asInstanceOf[ScriptBootstrapActionConfig]
  }
}

