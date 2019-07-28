package typings.apolloDashGraphql

import typings.graphql.typeDefinitionMod.GraphQLNamedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSchemaTransformSchemaMod {
  type TypeTransformer = js.Function1[/* type */ GraphQLNamedType, js.UndefOr[GraphQLNamedType | Null]]
}
