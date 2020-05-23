package typings.apollographqlApolloTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Requires[TContext] extends js.Object {
    var requires: js.UndefOr[String] = js.native
    @JSName("resolve")
    var resolve_Original: GraphQLFieldResolver[_, TContext, StringDictionary[_]] = js.native
    var subscribe: js.UndefOr[scala.Nothing] = js.native
    def resolve(source: js.Any, args: StringDictionary[js.Any], context: TContext, info: GraphQLResolveInfo): js.Any = js.native
  }
  
  @js.native
  trait Resolve[TContext] extends js.Object {
    var requires: js.UndefOr[String] = js.native
    var resolve: js.UndefOr[scala.Nothing] = js.native
    @JSName("subscribe")
    var subscribe_Original: GraphQLFieldResolver[_, TContext, StringDictionary[_]] = js.native
    def subscribe(source: js.Any, args: StringDictionary[js.Any], context: TContext, info: GraphQLResolveInfo): js.Any = js.native
  }
  
  @js.native
  trait Subscribe[TContext] extends js.Object {
    var requires: js.UndefOr[String] = js.native
    @JSName("resolve")
    var resolve_Original: GraphQLFieldResolver[_, TContext, StringDictionary[_]] = js.native
    @JSName("subscribe")
    var subscribe_Original: GraphQLFieldResolver[_, TContext, StringDictionary[_]] = js.native
    def resolve(source: js.Any, args: StringDictionary[js.Any], context: TContext, info: GraphQLResolveInfo): js.Any = js.native
    def subscribe(source: js.Any, args: StringDictionary[js.Any], context: TContext, info: GraphQLResolveInfo): js.Any = js.native
  }
  
}

