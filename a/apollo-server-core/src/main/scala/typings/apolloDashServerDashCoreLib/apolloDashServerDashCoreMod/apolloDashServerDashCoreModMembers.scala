package typings
package apolloDashServerDashCoreLib.apolloDashServerDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core", JSImport.Namespace)
@js.native
object apolloDashServerDashCoreModMembers extends js.Object {
  val GraphQLUpload: graphqlLib.graphqlMod.GraphQLScalarType = js.native
  val defaultPlaygroundOptions: apolloDashServerDashCoreLib.Anon_Settings = js.native
  val gql: js.Function2[
    /* template */ stdLib.TemplateStringsArray | java.lang.String, 
    /* repeated */js.Any, 
    graphqlLib.languageAstMod.DocumentNode
  ] = js.native
  def convertNodeHttpToRequest(req: nodeLib.httpMod.IncomingMessage): apolloDashServerDashEnvLib.apolloDashServerDashEnvMod.Request = js.native
  def createPlaygroundOptions(): js.UndefOr[
    atApollographqlGraphqlDashPlaygroundDashHtmlLib.distRenderDashPlaygroundDashPageMod.RenderPageOptions
  ] = js.native
  def createPlaygroundOptions(playground: apolloDashServerDashCoreLib.distPlaygroundMod.PlaygroundConfig): js.UndefOr[
    atApollographqlGraphqlDashPlaygroundDashHtmlLib.distRenderDashPlaygroundDashPageMod.RenderPageOptions
  ] = js.native
  def formatApolloErrors(errors: js.Array[stdLib.Error]): js.Array[apolloDashServerDashErrorsLib.apolloDashServerDashErrorsMod.ApolloError] = js.native
  def formatApolloErrors(errors: js.Array[stdLib.Error], options: apolloDashServerDashErrorsLib.Anon_Formatter): js.Array[apolloDashServerDashErrorsLib.apolloDashServerDashErrorsMod.ApolloError] = js.native
  def resolveGraphqlOptions(
    options: apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[
      (js.Function0[
        (stdLib.Promise[stdLib.Record[java.lang.String, _]]) | (stdLib.Record[java.lang.String, _])
      ]) | (stdLib.Record[java.lang.String, _])
    ],
    args: js.Any*
  ): stdLib.Promise[
    apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[
      (js.Function0[
        (stdLib.Promise[stdLib.Record[java.lang.String, _]]) | (stdLib.Record[java.lang.String, _])
      ]) | (stdLib.Record[java.lang.String, _])
    ]
  ] = js.native
  def resolveGraphqlOptions(
    options: js.Function1[
      /* repeated */js.Any, 
      (stdLib.Promise[
        apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[
          (js.Function0[
            (stdLib.Promise[stdLib.Record[java.lang.String, _]]) | (stdLib.Record[java.lang.String, _])
          ]) | (stdLib.Record[java.lang.String, _])
        ]
      ]) | (apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[
        (js.Function0[
          (stdLib.Promise[stdLib.Record[java.lang.String, _]]) | (stdLib.Record[java.lang.String, _])
        ]) | (stdLib.Record[java.lang.String, _])
      ])
    ],
    args: js.Any*
  ): stdLib.Promise[
    apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[
      (js.Function0[
        (stdLib.Promise[stdLib.Record[java.lang.String, _]]) | (stdLib.Record[java.lang.String, _])
      ]) | (stdLib.Record[java.lang.String, _])
    ]
  ] = js.native
  def runHttpQuery(
    handlerArguments: js.Array[_],
    request: apolloDashServerDashCoreLib.distRunHttpQueryMod.HttpQueryRequest
  ): stdLib.Promise[apolloDashServerDashCoreLib.distRunHttpQueryMod.HttpQueryResponse] = js.native
  def runQuery(options: apolloDashServerDashCoreLib.distRunQueryMod.QueryOptions): stdLib.Promise[apolloDashServerDashCoreLib.distRunQueryMod.GraphQLResponse] = js.native
  def toApolloError(error: stdLib.Error with apolloDashServerDashErrorsLib.Anon_Extensions): stdLib.Error with apolloDashServerDashErrorsLib.Anon_ExtensionsRecord = js.native
  def toApolloError(error: stdLib.Error with apolloDashServerDashErrorsLib.Anon_Extensions, code: java.lang.String): stdLib.Error with apolloDashServerDashErrorsLib.Anon_ExtensionsRecord = js.native
}

