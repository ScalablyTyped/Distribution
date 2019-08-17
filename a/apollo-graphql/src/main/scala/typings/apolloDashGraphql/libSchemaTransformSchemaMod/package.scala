package typings.apolloDashGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSchemaTransformSchemaMod {
  import typings.graphql.typeDefinitionMod.GraphQLNamedType

  type TypeTransformer = js.Function1[/* type */ GraphQLNamedType, js.UndefOr[GraphQLNamedType | Null]]
}
