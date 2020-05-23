package typings.apollographqlApolloTools

import org.scalablytyped.runtime.StringDictionary
import typings.apollographqlApolloTools.anon.Requires
import typings.apollographqlApolloTools.anon.Resolve
import typings.apollographqlApolloTools.anon.Subscribe
import typings.graphql.definitionMod.GraphQLFieldResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollographql/apollo-tools/lib/schema/resolverMap", JSImport.Namespace)
@js.native
object resolverMapMod extends js.Object {
  type GraphQLResolverMap[TContext] = StringDictionary[
    StringDictionary[
      (GraphQLFieldResolver[js.Any, TContext, StringDictionary[js.Any]]) | Requires[TContext] | Resolve[TContext] | Subscribe[TContext]
    ]
  ]
}

