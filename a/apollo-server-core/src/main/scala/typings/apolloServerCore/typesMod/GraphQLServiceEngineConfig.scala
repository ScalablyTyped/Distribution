package typings.apolloServerCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLServiceEngineConfig extends js.Object {
  var apiKeyHash: String = js.native
  var graphId: String = js.native
  var graphVariant: js.UndefOr[String] = js.native
}

object GraphQLServiceEngineConfig {
  @scala.inline
  def apply(apiKeyHash: String, graphId: String): GraphQLServiceEngineConfig = {
    val __obj = js.Dynamic.literal(apiKeyHash = apiKeyHash.asInstanceOf[js.Any], graphId = graphId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLServiceEngineConfig]
  }
  @scala.inline
  implicit class GraphQLServiceEngineConfigOps[Self <: GraphQLServiceEngineConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiKeyHash(value: String): Self = this.set("apiKeyHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setGraphId(value: String): Self = this.set("graphId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGraphVariant(value: String): Self = this.set("graphVariant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraphVariant: Self = this.set("graphVariant", js.undefined)
  }
  
}

