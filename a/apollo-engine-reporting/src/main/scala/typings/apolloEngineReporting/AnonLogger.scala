package typings.apolloEngineReporting

import typings.apolloServerTypes.mod.Logger
import typings.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLogger extends js.Object {
  var logger: js.UndefOr[Logger] = js.undefined
  var rewriteError: js.UndefOr[js.Function1[/* err */ GraphQLError, GraphQLError | Null]] = js.undefined
}

object AnonLogger {
  @scala.inline
  def apply(logger: Logger = null, rewriteError: /* err */ GraphQLError => GraphQLError | Null = null): AnonLogger = {
    val __obj = js.Dynamic.literal()
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (rewriteError != null) __obj.updateDynamic("rewriteError")(js.Any.fromFunction1(rewriteError))
    __obj.asInstanceOf[AnonLogger]
  }
}

