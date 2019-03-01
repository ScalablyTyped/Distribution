package typings
package apolloDashClientLib.coreWatchQueryOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchMoreQueryOptions[TVariables, K /* <: java.lang.String */] extends js.Object {
  var query: js.UndefOr[graphqlLib.languageAstMod.DocumentNode] = js.undefined
  var variables: js.UndefOr[stdLib.Pick[TVariables, K]] = js.undefined
}

object FetchMoreQueryOptions {
  @scala.inline
  def apply[TVariables, K /* <: java.lang.String */](query: graphqlLib.languageAstMod.DocumentNode = null, variables: stdLib.Pick[TVariables, K] = null): FetchMoreQueryOptions[TVariables, K] = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[FetchMoreQueryOptions[TVariables, K]]
  }
}

