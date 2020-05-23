package typings.apolloEngineReporting.anon

import typings.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RewriteError extends js.Object {
  var rewriteError: js.UndefOr[js.Function1[/* err */ GraphQLError, GraphQLError | Null]] = js.undefined
}

object RewriteError {
  @scala.inline
  def apply(rewriteError: /* err */ GraphQLError => GraphQLError | Null = null): RewriteError = {
    val __obj = js.Dynamic.literal()
    if (rewriteError != null) __obj.updateDynamic("rewriteError")(js.Any.fromFunction1(rewriteError))
    __obj.asInstanceOf[RewriteError]
  }
}

