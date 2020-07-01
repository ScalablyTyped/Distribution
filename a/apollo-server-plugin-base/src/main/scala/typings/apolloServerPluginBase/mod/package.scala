package typings.apolloServerPluginBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GraphQLRequestListenerDidResolveField = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* result */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type GraphQLRequestListenerExecutionDidEnd = js.Function1[/* err */ js.UndefOr[typings.std.Error], scala.Unit]
  type GraphQLRequestListenerParsingDidEnd = js.Function1[/* err */ js.UndefOr[typings.std.Error], scala.Unit]
  type GraphQLRequestListenerValidationDidEnd = js.Function1[/* err */ js.UndefOr[js.Array[typings.std.Error]], scala.Unit]
}
