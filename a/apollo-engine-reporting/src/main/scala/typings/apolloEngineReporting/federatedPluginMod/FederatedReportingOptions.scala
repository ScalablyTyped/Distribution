package typings.apolloEngineReporting.federatedPluginMod

import typings.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<apollo-engine-reporting.apollo-engine-reporting/dist/agent.EngineReportingOptions<TContext>, 'rewriteError'> */
trait FederatedReportingOptions[TContext] extends js.Object {
  var rewriteError: js.UndefOr[js.Function1[/* err */ GraphQLError, GraphQLError | Null]] = js.undefined
}

object FederatedReportingOptions {
  @scala.inline
  def apply[TContext](rewriteError: /* err */ GraphQLError => GraphQLError | Null = null): FederatedReportingOptions[TContext] = {
    val __obj = js.Dynamic.literal()
    if (rewriteError != null) __obj.updateDynamic("rewriteError")(js.Any.fromFunction1(rewriteError))
    __obj.asInstanceOf[FederatedReportingOptions[TContext]]
  }
}

