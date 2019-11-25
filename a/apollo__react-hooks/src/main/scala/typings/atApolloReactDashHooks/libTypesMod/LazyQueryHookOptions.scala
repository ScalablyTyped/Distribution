package typings.atApolloReactDashHooks.libTypesMod

import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @apollo/react-common.@apollo/react-common/lib/types/types.QueryFunctionOptions<TData, TVariables>, 'skip'> ]: @apollo/react-common.@apollo/react-common/lib/types/types.QueryFunctionOptions<TData, TVariables>[P]} */ trait LazyQueryHookOptions[TData, TVariables] extends js.Object {
  var query: js.UndefOr[DocumentNode] = js.undefined
}

object LazyQueryHookOptions {
  @scala.inline
  def apply[TData, TVariables](query: DocumentNode = null): LazyQueryHookOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[LazyQueryHookOptions[TData, TVariables]]
  }
}

