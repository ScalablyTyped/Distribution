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
    val __obj = js.Dynamic.literal(apiKeyHash = apiKeyHash.asInstanceOf[js.Any], graphId = graphId.asInstanceOf[js.Any])
    if (graphVariant != null) __obj.updateDynamic("graphVariant")(graphVariant.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLServiceEngineConfig]
  }
}

