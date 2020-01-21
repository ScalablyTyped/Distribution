package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object graphqlMod {
  type GraphQLFormatErrorFunction = js.Function1[
    /* error */ typings.graphql.graphQLErrorMod.GraphQLError, 
    typings.graphql.formatErrorMod.GraphQLFormattedError[typings.std.Record[java.lang.String, js.Any]]
  ]
  type GraphQLModule = js.Object
}
