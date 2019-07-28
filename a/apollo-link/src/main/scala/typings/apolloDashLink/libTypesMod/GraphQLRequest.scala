package typings.apolloDashLink.libTypesMod

import typings.graphql.languageAstMod.DocumentNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequest extends js.Object {
  var context: js.UndefOr[Record[String, _]] = js.undefined
  var extensions: js.UndefOr[Record[String, _]] = js.undefined
  var operationName: js.UndefOr[String] = js.undefined
  var query: DocumentNode
  var variables: js.UndefOr[Record[String, _]] = js.undefined
}

object GraphQLRequest {
  @scala.inline
  def apply(
    query: DocumentNode,
    context: Record[String, _] = null,
    extensions: Record[String, _] = null,
    operationName: String = null,
    variables: Record[String, _] = null
  ): GraphQLRequest = {
    val __obj = js.Dynamic.literal(query = query)
    if (context != null) __obj.updateDynamic("context")(context)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (operationName != null) __obj.updateDynamic("operationName")(operationName)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[GraphQLRequest]
  }
}

