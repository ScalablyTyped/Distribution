package typings.apolloServerCore

import typings.apolloServerCore.typesMod.GraphQLServiceEngineConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEngine extends js.Object {
  var engine: js.UndefOr[GraphQLServiceEngineConfig] = js.undefined
}

object AnonEngine {
  @scala.inline
  def apply(engine: GraphQLServiceEngineConfig = null): AnonEngine = {
    val __obj = js.Dynamic.literal()
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEngine]
  }
}

