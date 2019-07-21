package typings
package apolloDashServerDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Engine extends js.Object {
  var engine: js.UndefOr[apolloDashServerDashCoreLib.distTypesMod.GraphQLServiceEngineConfig] = js.undefined
}

object Anon_Engine {
  @scala.inline
  def apply(engine: apolloDashServerDashCoreLib.distTypesMod.GraphQLServiceEngineConfig = null): Anon_Engine = {
    val __obj = js.Dynamic.literal()
    if (engine != null) __obj.updateDynamic("engine")(engine)
    __obj.asInstanceOf[Anon_Engine]
  }
}

