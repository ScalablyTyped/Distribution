package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapActionConfig extends js.Object {
  /**
    * The name of the bootstrap action.
    */
  var Name: XmlStringMaxLen256
  /**
    * The script run by the bootstrap action.
    */
  var ScriptBootstrapAction: ScriptBootstrapActionConfig
}

object BootstrapActionConfig {
  @scala.inline
  def apply(Name: XmlStringMaxLen256, ScriptBootstrapAction: ScriptBootstrapActionConfig): BootstrapActionConfig = {
    val __obj = js.Dynamic.literal(Name = Name, ScriptBootstrapAction = ScriptBootstrapAction)
  
    __obj.asInstanceOf[BootstrapActionConfig]
  }
}

