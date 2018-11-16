package typings
package apolloDashServerDashCoreLib.distRunQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QueryOptions extends js.Object {
  var cacheControl: js.UndefOr[
    scala.Boolean | apolloDashCacheDashControlLib.apolloDashCacheDashControlMod.CacheControlExtensionOptions
  ] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var extensions: js.UndefOr[
    js.Array[
      js.Function0[graphqlDashExtensionsLib.graphqlDashExtensionsMod.GraphQLExtension[_]]
    ]
  ] = js.undefined
  var fieldResolver: js.UndefOr[
    graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, ScalablyTyped.runtime.StringDictionary[_]]
  ] = js.undefined
  var formatError: js.UndefOr[js.Function] = js.undefined
  var formatResponse: js.UndefOr[js.Function] = js.undefined
  var nonQueryError: js.UndefOr[nodeLib.Error] = js.undefined
  var operationName: js.UndefOr[java.lang.String] = js.undefined
  var parsedQuery: js.UndefOr[graphqlLib.languageAstMod.DocumentNode] = js.undefined
  var persistedQueryHit: js.UndefOr[scala.Boolean] = js.undefined
  var persistedQueryRegister: js.UndefOr[scala.Boolean] = js.undefined
  var queryExtensions: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var queryString: js.UndefOr[java.lang.String] = js.undefined
  var request: stdLib.Pick[
    apolloDashServerDashEnvLib.apolloDashServerDashEnvMod.Request, 
    apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.url | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.method | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.headers
  ]
  var rootValue: js.UndefOr[js.Any] = js.undefined
  var schema: graphqlLib.graphqlMod.GraphQLSchema
  var tracing: js.UndefOr[scala.Boolean] = js.undefined
  var validationRules: js.UndefOr[js.Array[js.Function1[/* context */ graphqlLib.graphqlMod.ValidationContext, _]]] = js.undefined
  var variables: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
}

