package typings
package adoneLib.adoneNs.shaniNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SandboxConfig extends js.Object {
  /**
    * An object to add properties to
    */
  var injectInto: js.UndefOr[js.Any] = js.undefined
  /**
    * What properties to inject
    */
  var properties: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object SandboxConfig {
  @scala.inline
  def apply(injectInto: js.Any = null, properties: js.Array[java.lang.String] = null): SandboxConfig = {
    val __obj = js.Dynamic.literal()
    if (injectInto != null) __obj.updateDynamic("injectInto")(injectInto)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[SandboxConfig]
  }
}

