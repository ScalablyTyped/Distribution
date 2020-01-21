package typings.apolloReactCommon

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQuery extends js.Object {
  var query: js.UndefOr[DocumentNode] = js.undefined
}

object AnonQuery {
  @scala.inline
  def apply(query: DocumentNode = null): AnonQuery = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQuery]
  }
}

