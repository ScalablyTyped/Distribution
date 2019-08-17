package typings.apolloDashGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSchemaResolverMapMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.apolloDashGraphql.Anon_ArgName
  import typings.graphql.graphqlMod.GraphQLScalarType
  import typings.graphql.typeDefinitionMod.GraphQLFieldResolver

  type GraphQLResolverMap[TContext] = StringDictionary[
    (StringDictionary[
      Anon_ArgName[TContext] | Double | (GraphQLFieldResolver[js.Any, TContext, StringDictionary[js.Any]]) | String
    ]) | GraphQLScalarType
  ]
}
