package typings.apolloDashClient.coreWatchQueryOptionsMod

import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionOptions[TVariables] extends js.Object {
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
  var query: DocumentNode
  var variables: js.UndefOr[TVariables] = js.undefined
}

object SubscriptionOptions {
  @scala.inline
  def apply[TVariables](query: DocumentNode, fetchPolicy: FetchPolicy = null, variables: TVariables = null): SubscriptionOptions[TVariables] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionOptions[TVariables]]
  }
}

