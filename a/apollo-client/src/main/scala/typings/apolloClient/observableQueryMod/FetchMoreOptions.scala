package typings.apolloClient.observableQueryMod

import typings.apolloClient.AnonFetchMoreResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchMoreOptions[TData, TVariables] extends js.Object {
  def updateQuery(previousQueryResult: TData, options: AnonFetchMoreResult[TData, TVariables]): TData
}

object FetchMoreOptions {
  @scala.inline
  def apply[TData, TVariables](updateQuery: (TData, AnonFetchMoreResult[TData, TVariables]) => TData): FetchMoreOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(updateQuery = js.Any.fromFunction2(updateQuery))
  
    __obj.asInstanceOf[FetchMoreOptions[TData, TVariables]]
  }
}

