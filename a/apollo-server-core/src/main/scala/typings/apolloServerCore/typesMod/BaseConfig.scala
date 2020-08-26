package typings.apolloServerCore.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloServerCaching.keyValueCacheMod.KeyValueCache
import typings.apolloServerCore.graphqlOptionsMod.DataSources
import typings.apolloServerTypes.mod.GraphQLExecutionResult
import typings.apolloServerTypes.mod.GraphQLExecutor
import typings.apolloServerTypes.mod.GraphQLRequestContext
import typings.apolloServerTypes.mod.GraphQLRequestContextExecutionDidStart
import typings.apolloServerTypes.mod.GraphQLResponse
import typings.apolloServerTypes.mod.Logger
import typings.apolloServerTypes.mod.ValueOrPromise
import typings.graphql.astMod.DocumentNode
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.formatErrorMod.GraphQLFormattedError
import typings.graphql.mod.GraphQLError
import typings.graphql.mod.ValidationContext
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<apollo-server-core.apollo-server-core/dist/graphqlOptions.GraphQLServerOptions<apollo-server-core.apollo-server-core/dist/types.Context<object>, any>, 'formatError' | 'debug' | 'rootValue' | 'validationRules' | 'executor' | 'formatResponse' | 'fieldResolver' | 'tracing' | 'dataSources' | 'cache' | 'logger'> */
@js.native
trait BaseConfig extends js.Object {
  var cache: js.UndefOr[KeyValueCache[String]] = js.native
  var dataSources: js.UndefOr[js.Function0[DataSources[Context[js.Object]]]] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var executor: js.UndefOr[GraphQLExecutor[Record[String, _]]] = js.native
  var fieldResolver: js.UndefOr[GraphQLFieldResolver[_, Context[js.Object], StringDictionary[_]]] = js.native
  var formatError: js.UndefOr[js.Function1[/* error */ GraphQLError, GraphQLFormattedError[Record[String, _]]]] = js.native
  var formatResponse: js.UndefOr[
    js.Function2[
      /* response */ GraphQLResponse | Null, 
      /* requestContext */ GraphQLRequestContext[Context[js.Object]], 
      GraphQLResponse
    ]
  ] = js.native
  var logger: js.UndefOr[Logger] = js.native
  var rootValue: js.UndefOr[(js.Function1[/* parsedQuery */ DocumentNode, _]) | js.Any] = js.native
  var tracing: js.UndefOr[Boolean] = js.native
  var validationRules: js.UndefOr[js.Array[js.Function1[/* context */ ValidationContext, _]]] = js.native
}

object BaseConfig {
  @scala.inline
  def apply(): BaseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseConfig]
  }
  @scala.inline
  implicit class BaseConfigOps[Self <: BaseConfig] (val x: Self) extends AnyVal {
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
    def setCache(value: KeyValueCache[String]): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setDataSources(value: () => DataSources[Context[js.Object]]): Self = this.set("dataSources", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDataSources: Self = this.set("dataSources", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setExecutor(
      value: /* requestContext */ GraphQLRequestContextExecutionDidStart[Record[String, _]] => ValueOrPromise[GraphQLExecutionResult]
    ): Self = this.set("executor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExecutor: Self = this.set("executor", js.undefined)
    @scala.inline
    def setFieldResolver(value: (_, StringDictionary[_], Context[js.Object], /* info */ GraphQLResolveInfo) => js.Any): Self = this.set("fieldResolver", js.Any.fromFunction4(value))
    @scala.inline
    def deleteFieldResolver: Self = this.set("fieldResolver", js.undefined)
    @scala.inline
    def setFormatError(value: /* error */ GraphQLError => GraphQLFormattedError[Record[String, _]]): Self = this.set("formatError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormatError: Self = this.set("formatError", js.undefined)
    @scala.inline
    def setFormatResponse(
      value: (/* response */ GraphQLResponse | Null, /* requestContext */ GraphQLRequestContext[Context[js.Object]]) => GraphQLResponse
    ): Self = this.set("formatResponse", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFormatResponse: Self = this.set("formatResponse", js.undefined)
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setRootValueFunction1(value: /* parsedQuery */ DocumentNode => _): Self = this.set("rootValue", js.Any.fromFunction1(value))
    @scala.inline
    def setRootValue(value: (js.Function1[/* parsedQuery */ DocumentNode, _]) | js.Any): Self = this.set("rootValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootValue: Self = this.set("rootValue", js.undefined)
    @scala.inline
    def setTracing(value: Boolean): Self = this.set("tracing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracing: Self = this.set("tracing", js.undefined)
    @scala.inline
    def setValidationRulesVarargs(value: (js.Function1[/* context */ ValidationContext, js.Any])*): Self = this.set("validationRules", js.Array(value :_*))
    @scala.inline
    def setValidationRules(value: js.Array[js.Function1[/* context */ ValidationContext, _]]): Self = this.set("validationRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationRules: Self = this.set("validationRules", js.undefined)
  }
  
}

