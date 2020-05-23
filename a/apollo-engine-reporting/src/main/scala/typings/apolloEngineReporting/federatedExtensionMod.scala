package typings.apolloEngineReporting

import org.scalablytyped.runtime.StringDictionary
import typings.apolloEngineReporting.anon.RequestContext
import typings.apolloEngineReporting.anon.RewriteError
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.mod.GraphQLError
import typings.graphqlExtensions.mod.GraphQLExtension
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting/dist/federatedExtension", JSImport.Namespace)
@js.native
object federatedExtensionMod extends js.Object {
  @js.native
  class EngineFederatedTracingExtension[TContext] protected () extends GraphQLExtension[TContext] {
    def this(options: RewriteError) = this()
    var done: js.Any = js.native
    var enabled: js.Any = js.native
    var treeBuilder: js.Any = js.native
    @JSName("didEncounterErrors")
    def didEncounterErrors_MEngineFederatedTracingExtension(errors: js.Array[GraphQLError]): Unit = js.native
    @JSName("format")
    def format_MEngineFederatedTracingExtension(): js.UndefOr[js.Tuple2[String, String]] = js.native
    @JSName("requestDidStart")
    def requestDidStart_MEngineFederatedTracingExtension(o: RequestContext[TContext]): Unit = js.native
    @JSName("willResolveField")
    def willResolveField_MEngineFederatedTracingExtension(_source: js.Any, _args: StringDictionary[js.Any], _context: TContext, info: GraphQLResolveInfo): (js.Function2[/* error */ Error | Null, /* result */ js.Any, Unit]) | Unit = js.native
  }
  
}

