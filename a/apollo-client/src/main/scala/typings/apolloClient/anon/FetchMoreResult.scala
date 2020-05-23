package typings.apolloClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchMoreResult[TData, TVariables] extends js.Object {
  var fetchMoreResult: js.UndefOr[TData] = js.undefined
  var variables: js.UndefOr[TVariables] = js.undefined
}

object FetchMoreResult {
  @scala.inline
  def apply[TData, TVariables](fetchMoreResult: TData = null, variables: TVariables = null): FetchMoreResult[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    if (fetchMoreResult != null) __obj.updateDynamic("fetchMoreResult")(fetchMoreResult.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchMoreResult[TData, TVariables]]
  }
}

