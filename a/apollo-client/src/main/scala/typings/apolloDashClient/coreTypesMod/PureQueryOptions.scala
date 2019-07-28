package typings.apolloDashClient.coreTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.DocumentNode
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
    val __obj = js.Dynamic.literal(query = query)
    if (context != null) __obj.updateDynamic("context")(context)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[PureQueryOptions]
  }
}

