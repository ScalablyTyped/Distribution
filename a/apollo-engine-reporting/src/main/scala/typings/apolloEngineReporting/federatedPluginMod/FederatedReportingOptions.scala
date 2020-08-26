package typings.apolloEngineReporting.federatedPluginMod

import typings.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<apollo-engine-reporting.apollo-engine-reporting/dist/agent.EngineReportingOptions<TContext>, 'rewriteError'> */
@js.native
trait FederatedReportingOptions[TContext] extends js.Object {
  var rewriteError: js.UndefOr[js.Function1[/* err */ GraphQLError, GraphQLError | Null]] = js.native
}

object FederatedReportingOptions {
  @scala.inline
  def apply[TContext](): FederatedReportingOptions[TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FederatedReportingOptions[TContext]]
  }
  @scala.inline
  implicit class FederatedReportingOptionsOps[Self <: FederatedReportingOptions[_], TContext] (val x: Self with FederatedReportingOptions[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRewriteError(value: /* err */ GraphQLError => GraphQLError | Null): Self = this.set("rewriteError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRewriteError: Self = this.set("rewriteError", js.undefined)
  }
  
}

