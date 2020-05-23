package typings.apolloServerCore.anon

import typings.apolloServerCore.typesMod.GraphQLServiceEngineConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Engine extends js.Object {
  var engine: js.UndefOr[GraphQLServiceEngineConfig] = js.undefined
}

object Engine {
  @scala.inline
  def apply(engine: GraphQLServiceEngineConfig = null): Engine = {
    val __obj = js.Dynamic.literal()
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    __obj.asInstanceOf[Engine]
  }
}

