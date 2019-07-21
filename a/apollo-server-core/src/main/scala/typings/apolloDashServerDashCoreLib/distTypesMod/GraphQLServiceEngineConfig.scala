package typings
package apolloDashServerDashCoreLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLServiceEngineConfig extends js.Object {
  var apiKeyHash: java.lang.String
  var graphId: java.lang.String
  var graphVariant: js.UndefOr[java.lang.String] = js.undefined
}

object GraphQLServiceEngineConfig {
  @scala.inline
  def apply(apiKeyHash: java.lang.String, graphId: java.lang.String, graphVariant: java.lang.String = null): GraphQLServiceEngineConfig = {
    val __obj = js.Dynamic.literal(apiKeyHash = apiKeyHash, graphId = graphId)
    if (graphVariant != null) __obj.updateDynamic("graphVariant")(graphVariant)
    __obj.asInstanceOf[GraphQLServiceEngineConfig]
  }
}

