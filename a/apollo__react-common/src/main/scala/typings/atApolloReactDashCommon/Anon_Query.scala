package typings.atApolloReactDashCommon

import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Query extends js.Object {
  var query: js.UndefOr[DocumentNode] = js.undefined
}

object Anon_Query {
  @scala.inline
  def apply(query: DocumentNode = null): Anon_Query = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Anon_Query]
  }
}

