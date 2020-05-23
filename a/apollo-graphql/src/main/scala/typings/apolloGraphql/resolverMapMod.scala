package typings.apolloGraphql

import org.scalablytyped.runtime.StringDictionary
import typings.apolloGraphql.anon.Requires
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.mod.GraphQLScalarType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql/lib/schema/resolverMap", JSImport.Namespace)
@js.native
object resolverMapMod extends js.Object {
  type GraphQLResolverMap[TContext] = StringDictionary[
    (StringDictionary[
      Double | (GraphQLFieldResolver[js.Any, TContext, StringDictionary[js.Any]]) | Requires[TContext] | String
    ]) | GraphQLScalarType
  ]
}

