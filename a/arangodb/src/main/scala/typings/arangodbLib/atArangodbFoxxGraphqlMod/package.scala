package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atArangodbFoxxGraphqlMod {
  type GraphQLFormatErrorFunction = js.Function1[
    /* error */ graphqlLib.errorGraphQLErrorMod.GraphQLError, 
    graphqlLib.errorFormatErrorMod.GraphQLFormattedError
  ]
  type GraphQLModule = js.Object
}
