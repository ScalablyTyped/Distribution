package typings.atApollographqlApolloDashTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollographql/apollo-tools/lib/schema/resolverMap", JSImport.Namespace)
@js.native
object libSchemaResolverMapMod extends js.Object {
  type GraphQLResolverMap[TContext] = StringDictionary[
    StringDictionary[
      (GraphQLFieldResolver[js.Any, TContext, StringDictionary[js.Any]]) | Anon_ArgName[TContext] | Anon_ArgNameRequires[TContext] | Anon_ArgNameRequiresResolve[TContext]
    ]
  ]
}

