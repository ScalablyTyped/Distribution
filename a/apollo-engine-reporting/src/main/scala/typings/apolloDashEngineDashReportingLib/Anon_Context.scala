package typings
package apolloDashEngineDashReportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context[TContext] extends js.Object {
  var context: TContext
  var extensions: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var parsedQuery: js.UndefOr[graphqlLib.languageAstMod.DocumentNode] = js.undefined
  var persistedQueryHit: js.UndefOr[scala.Boolean] = js.undefined
  var persistedQueryRegister: js.UndefOr[scala.Boolean] = js.undefined
  var queryString: js.UndefOr[java.lang.String] = js.undefined
  var request: apolloDashServerDashEnvLib.apolloDashServerDashEnvMod.Request
  var requestContext: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ js.Any
  var variables: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
}

object Anon_Context {
  @scala.inline
  def apply[TContext](
    context: TContext,
    request: apolloDashServerDashEnvLib.apolloDashServerDashEnvMod.Request,
    requestContext: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ js.Any,
    extensions: stdLib.Record[java.lang.String, _] = null,
    parsedQuery: graphqlLib.languageAstMod.DocumentNode = null,
    persistedQueryHit: js.UndefOr[scala.Boolean] = js.undefined,
    persistedQueryRegister: js.UndefOr[scala.Boolean] = js.undefined,
    queryString: java.lang.String = null,
    variables: stdLib.Record[java.lang.String, _] = null
  ): Anon_Context[TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.updateDynamic("request")(request)
    __obj.updateDynamic("requestContext")(requestContext)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (parsedQuery != null) __obj.updateDynamic("parsedQuery")(parsedQuery)
    if (!js.isUndefined(persistedQueryHit)) __obj.updateDynamic("persistedQueryHit")(persistedQueryHit)
    if (!js.isUndefined(persistedQueryRegister)) __obj.updateDynamic("persistedQueryRegister")(persistedQueryRegister)
    if (queryString != null) __obj.updateDynamic("queryString")(queryString)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[Anon_Context[TContext]]
  }
}

