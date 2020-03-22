package typings.apolloReactCommon.typesMod

import typings.graphql.mod.GraphQLError
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @apollo/react-common.@apollo/react-common/lib/types/types.ExecutionResult<TData> & {  extensions ? :E,   context ? :C} */
trait MutationFetchResult[TData, C, E] extends js.Object {
  var context: js.UndefOr[C] = js.undefined
  var data: js.UndefOr[TData] = js.undefined
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.undefined
  var extensions: js.UndefOr[(Record[String, _]) with E] = js.undefined
}

object MutationFetchResult {
  @scala.inline
  def apply[TData, C, E](
    context: C = null,
    data: TData = null,
    errors: js.Array[GraphQLError] = null,
    extensions: (Record[String, _]) with E = null
  ): MutationFetchResult[TData, C, E] = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationFetchResult[TData, C, E]]
  }
}

