package typings.apolloReactCommon.anon

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  var query: js.UndefOr[DocumentNode] = js.undefined
}

object Query {
  @scala.inline
  def apply(query: DocumentNode = null): Query = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
}

