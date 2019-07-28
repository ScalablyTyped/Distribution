package typings.apolloDashServerDashCore.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLServiceEngineConfig extends js.Object {
  var apiKeyHash: String
  var graphId: String
  var graphVariant: js.UndefOr[String] = js.undefined
}

object GraphQLServiceEngineConfig {
  @scala.inline
  def apply(apiKeyHash: String, graphId: String, graphVariant: String = null): GraphQLServiceEngineConfig = {
    val __obj = js.Dynamic.literal(apiKeyHash = apiKeyHash, graphId = graphId)
    if (graphVariant != null) __obj.updateDynamic("graphVariant")(graphVariant)
    __obj.asInstanceOf[GraphQLServiceEngineConfig]
  }
}

