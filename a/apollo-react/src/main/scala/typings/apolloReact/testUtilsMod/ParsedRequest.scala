package typings.apolloReact.testUtilsMod

import typings.typedGraphql.mod.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedRequest extends js.Object {
  var debugName: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[Document] = js.undefined
  var variables: js.UndefOr[js.Object] = js.undefined
}

object ParsedRequest {
  @scala.inline
  def apply(debugName: String = null, query: Document = null, variables: js.Object = null): ParsedRequest = {
    val __obj = js.Dynamic.literal()
    if (debugName != null) __obj.updateDynamic("debugName")(debugName.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedRequest]
  }
}

