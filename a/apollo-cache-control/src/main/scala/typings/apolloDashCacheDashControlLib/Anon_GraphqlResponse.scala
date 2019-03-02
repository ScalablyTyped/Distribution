package typings
package apolloDashCacheDashControlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GraphqlResponse extends js.Object {
  var graphqlResponse: apolloDashServerDashCoreLib.distRequestPipelineAPIMod.GraphQLResponse
}

object Anon_GraphqlResponse {
  @scala.inline
  def apply(graphqlResponse: apolloDashServerDashCoreLib.distRequestPipelineAPIMod.GraphQLResponse): Anon_GraphqlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("graphqlResponse")(graphqlResponse)
    __obj.asInstanceOf[Anon_GraphqlResponse]
  }
}

