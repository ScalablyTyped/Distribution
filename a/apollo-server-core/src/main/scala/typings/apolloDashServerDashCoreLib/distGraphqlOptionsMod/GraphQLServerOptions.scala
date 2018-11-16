package typings
package apolloDashServerDashCoreLib.distGraphqlOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GraphQLServerOptions[TContext] extends js.Object {
  var cache: js.UndefOr[apolloDashServerDashCachingLib.distKeyValueCacheMod.KeyValueCache] = js.undefined
  var cacheControl: js.UndefOr[
    scala.Boolean | (apolloDashCacheDashControlLib.apolloDashCacheDashControlMod.CacheControlExtensionOptions with apolloDashServerDashCoreLib.Anon_CalculateHttpHeaders)
  ] = js.undefined
  var context: js.UndefOr[TContext] = js.undefined
  var dataSources: js.UndefOr[js.Function0[DataSources[TContext]]] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var extensions: js.UndefOr[
    js.Array[
      js.Function0[graphqlDashExtensionsLib.graphqlDashExtensionsMod.GraphQLExtension[_]]
    ]
  ] = js.undefined
  var fieldResolver: js.UndefOr[
    graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, TContext, ScalablyTyped.runtime.StringDictionary[_]]
  ] = js.undefined
  var formatError: js.UndefOr[js.Function] = js.undefined
  var formatResponse: js.UndefOr[js.Function] = js.undefined
  var persistedQueries: js.UndefOr[PersistedQueryOptions] = js.undefined
  var rootValue: js.UndefOr[js.Any] = js.undefined
  var schema: graphqlLib.graphqlMod.GraphQLSchema
  var tracing: js.UndefOr[scala.Boolean] = js.undefined
  var validationRules: js.UndefOr[js.Array[js.Function1[/* context */ graphqlLib.graphqlMod.ValidationContext, _]]] = js.undefined
}

