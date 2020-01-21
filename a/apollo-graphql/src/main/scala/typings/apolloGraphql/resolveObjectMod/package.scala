package typings.apolloGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object resolveObjectMod {
  type GraphQLObjectResolver[TSource, TContext] = js.Function4[
    /* source */ TSource, 
    /* fields */ typings.std.Record[java.lang.String, js.Array[typings.graphql.astMod.FieldNode]], 
    /* context */ TContext, 
    /* info */ typings.graphql.definitionMod.GraphQLResolveInfo, 
    js.Any
  ]
}
