package typings.apolloServerErrors.anon

import typings.graphql.formatErrorMod.GraphQLFormattedError
import typings.graphql.mod.GraphQLError
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Debug extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var formatter: js.UndefOr[js.Function1[/* error */ GraphQLError, GraphQLFormattedError[Record[String, _]]]] = js.undefined
}

object Debug {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    formatter: /* error */ GraphQLError => GraphQLFormattedError[Record[String, _]] = null
  ): Debug = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    __obj.asInstanceOf[Debug]
  }
}

