package typings.atApollographqlApolloDashTools

import org.scalablytyped.runtime.StringDictionary
import typings.atApollographqlApolloDashTools.Anon_ArgName
import typings.atApollographqlApolloDashTools.Anon_ArgNameRequires
import typings.atApollographqlApolloDashTools.Anon_ArgNameRequiresResolve
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSchemaResolverMapMod {
  type GraphQLResolverMap[TContext] = StringDictionary[
    StringDictionary[
      (GraphQLFieldResolver[js.Any, TContext, StringDictionary[js.Any]]) | Anon_ArgName[TContext] | Anon_ArgNameRequires[TContext] | Anon_ArgNameRequiresResolve[TContext]
    ]
  ]
}
