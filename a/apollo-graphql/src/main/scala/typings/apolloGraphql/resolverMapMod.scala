package typings.apolloGraphql

import org.scalablytyped.runtime.StringDictionary
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
      AnonArgName[TContext] | Double | (GraphQLFieldResolver[js.Any, TContext, StringDictionary[js.Any]]) | String
    ]) | GraphQLScalarType
  ]
}

