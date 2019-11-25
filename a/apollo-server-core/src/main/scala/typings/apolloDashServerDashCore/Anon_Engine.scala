package typings.apolloDashServerDashCore

import typings.apolloDashServerDashCore.distTypesMod.GraphQLServiceEngineConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Engine extends js.Object {
  var engine: js.UndefOr[GraphQLServiceEngineConfig] = js.undefined
}

object Anon_Engine {
  @scala.inline
  def apply(engine: GraphQLServiceEngineConfig = null): Anon_Engine = {
    val __obj = js.Dynamic.literal()
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Engine]
  }
}

