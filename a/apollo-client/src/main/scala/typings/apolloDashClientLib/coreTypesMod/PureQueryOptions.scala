package typings
package apolloDashClientLib.coreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PureQueryOptions extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var query: graphqlLib.languageAstMod.DocumentNode
  var variables: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object PureQueryOptions {
  @scala.inline
  def apply(
    query: graphqlLib.languageAstMod.DocumentNode,
    context: js.Any = null,
    variables: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): PureQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(query)
    if (context != null) __obj.updateDynamic("context")(context)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[PureQueryOptions]
  }
}

