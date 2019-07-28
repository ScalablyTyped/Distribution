package typings.arangodb

import typings.graphql.errorFormatErrorMod.GraphQLFormattedError
import typings.graphql.errorGraphQLErrorMod.GraphQLError
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atArangodbFoxxGraphqlMod {
  type GraphQLFormatErrorFunction = js.Function1[/* error */ GraphQLError, GraphQLFormattedError[Record[String, js.Any]]]
  type GraphQLModule = js.Object
}
