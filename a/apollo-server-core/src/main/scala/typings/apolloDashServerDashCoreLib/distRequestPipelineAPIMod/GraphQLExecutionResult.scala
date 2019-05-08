package typings
package apolloDashServerDashCoreLib.distRequestPipelineAPIMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLExecutionResult extends js.Object {
  var data: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var errors: js.UndefOr[js.Array[graphqlLib.graphqlMod.GraphQLError]] = js.undefined
  var extensions: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
}

object GraphQLExecutionResult {
  @scala.inline
  def apply(
    data: stdLib.Record[java.lang.String, _] = null,
    errors: js.Array[graphqlLib.graphqlMod.GraphQLError] = null,
    extensions: stdLib.Record[java.lang.String, _] = null
  ): GraphQLExecutionResult = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    __obj.asInstanceOf[GraphQLExecutionResult]
  }
}

