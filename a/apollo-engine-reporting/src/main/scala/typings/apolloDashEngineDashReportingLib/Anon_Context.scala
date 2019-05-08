package typings
package apolloDashEngineDashReportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context[TContext] extends js.Object {
  var context: TContext
  var extensions: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var parsedQuery: js.UndefOr[graphqlLib.languageAstMod.DocumentNode] = js.undefined
  var queryString: js.UndefOr[java.lang.String] = js.undefined
  var request: apolloDashServerDashEnvLib.apolloDashServerDashEnvMod.Request
  var requestContext: apolloDashServerDashEnvLib.distTypescriptDashUtilityDashTypesMod.WithRequired[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ _, 
    apolloDashEngineDashReportingLib.apolloDashEngineDashReportingLibStrings.metrics
  ]
  var variables: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
}

object Anon_Context {
  @scala.inline
  def apply[TContext](
    context: TContext,
    request: apolloDashServerDashEnvLib.apolloDashServerDashEnvMod.Request,
    requestContext: apolloDashServerDashEnvLib.distTypescriptDashUtilityDashTypesMod.WithRequired[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ _, 
      apolloDashEngineDashReportingLib.apolloDashEngineDashReportingLibStrings.metrics
    ],
    extensions: stdLib.Record[java.lang.String, _] = null,
    parsedQuery: graphqlLib.languageAstMod.DocumentNode = null,
    queryString: java.lang.String = null,
    variables: stdLib.Record[java.lang.String, _] = null
  ): Anon_Context[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], request = request, requestContext = requestContext.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (parsedQuery != null) __obj.updateDynamic("parsedQuery")(parsedQuery)
    if (queryString != null) __obj.updateDynamic("queryString")(queryString)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[Anon_Context[TContext]]
  }
}

