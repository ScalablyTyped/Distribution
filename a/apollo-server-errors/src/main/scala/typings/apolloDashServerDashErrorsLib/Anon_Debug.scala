package typings
package apolloDashServerDashErrorsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends js.Object {
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var formatter: js.UndefOr[
    js.Function1[
      /* error */ graphqlLib.graphqlMod.GraphQLError, 
      graphqlLib.errorFormatErrorMod.GraphQLFormattedError[stdLib.Record[java.lang.String, _]]
    ]
  ] = js.undefined
}

object Anon_Debug {
  @scala.inline
  def apply(
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    formatter: /* error */ graphqlLib.graphqlMod.GraphQLError => graphqlLib.errorFormatErrorMod.GraphQLFormattedError[stdLib.Record[java.lang.String, _]] = null
  ): Anon_Debug = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    __obj.asInstanceOf[Anon_Debug]
  }
}

