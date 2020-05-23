package typings.apolloEngineReporting.anon

import typings.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  var logger: js.UndefOr[typings.apolloServerTypes.mod.Logger] = js.undefined
  var rewriteError: js.UndefOr[js.Function1[/* err */ GraphQLError, GraphQLError | Null]] = js.undefined
}

object Logger {
  @scala.inline
  def apply(
    logger: typings.apolloServerTypes.mod.Logger = null,
    rewriteError: /* err */ GraphQLError => GraphQLError | Null = null
  ): Logger = {
    val __obj = js.Dynamic.literal()
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (rewriteError != null) __obj.updateDynamic("rewriteError")(js.Any.fromFunction1(rewriteError))
    __obj.asInstanceOf[Logger]
  }
}

