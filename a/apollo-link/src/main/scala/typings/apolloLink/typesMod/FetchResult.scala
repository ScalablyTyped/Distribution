package typings.apolloLink.typesMod

import typings.graphql.graphQLErrorMod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql/execution/execute.ExecutionResult<TData> & {  extensions ? :E,   context ? :C} */
trait FetchResult[TData, C, E] extends js.Object {
  var context: js.UndefOr[C] = js.undefined
  var data: js.UndefOr[TData | Null] = js.undefined
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.undefined
  var extensions: js.UndefOr[E] = js.undefined
}

object FetchResult {
  @scala.inline
  def apply[TData, C, E](context: C = null, data: TData = null, errors: js.Array[GraphQLError] = null, extensions: E = null): FetchResult[TData, C, E] = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchResult[TData, C, E]]
  }
}

