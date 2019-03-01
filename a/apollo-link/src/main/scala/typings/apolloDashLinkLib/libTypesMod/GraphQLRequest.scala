package typings
package apolloDashLinkLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequest extends js.Object {
  var context: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var extensions: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var operationName: js.UndefOr[java.lang.String] = js.undefined
  var query: graphqlLib.languageAstMod.DocumentNode
  var variables: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
}

object GraphQLRequest {
  @scala.inline
  def apply(
    query: graphqlLib.languageAstMod.DocumentNode,
    context: stdLib.Record[java.lang.String, _] = null,
    extensions: stdLib.Record[java.lang.String, _] = null,
    operationName: java.lang.String = null,
    variables: stdLib.Record[java.lang.String, _] = null
  ): GraphQLRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(query)
    if (context != null) __obj.updateDynamic("context")(context)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (operationName != null) __obj.updateDynamic("operationName")(operationName)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[GraphQLRequest]
  }
}

