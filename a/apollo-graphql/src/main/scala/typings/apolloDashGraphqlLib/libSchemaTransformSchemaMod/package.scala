package typings
package apolloDashGraphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSchemaTransformSchemaMod {
  type TypeTransformer = js.Function1[
    /* type */ graphqlLib.typeDefinitionMod.GraphQLNamedType, 
    js.UndefOr[graphqlLib.typeDefinitionMod.GraphQLNamedType | scala.Null]
  ]
}
