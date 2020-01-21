package typings.apolloClient.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PureQueryOptions extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var query: DocumentNode
  var variables: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object PureQueryOptions {
  @scala.inline
  def apply(query: DocumentNode, context: js.Any = null, variables: StringDictionary[js.Any] = null): PureQueryOptions = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[PureQueryOptions]
  }
}

