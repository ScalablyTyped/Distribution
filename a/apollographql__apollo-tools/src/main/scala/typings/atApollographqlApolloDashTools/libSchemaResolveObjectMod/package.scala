package typings.atApollographqlApolloDashTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSchemaResolveObjectMod {
  import typings.graphql.languageAstMod.FieldNode
  import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
  import typings.std.Record

  type GraphQLObjectResolver[TSource, TContext] = js.Function4[
    /* source */ TSource, 
    /* fields */ Record[String, js.Array[FieldNode]], 
    /* context */ TContext, 
    /* info */ GraphQLResolveInfo, 
    js.Any
  ]
}
