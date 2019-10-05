package typings.apolloDashClient.coreObservableQueryMod

import typings.apolloDashClient.coreWatchQueryOptionsMod.ErrorPolicy
import typings.apolloDashClient.dataQueriesMod.QueryStoreValue
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/core/ObservableQuery", "hasError")
@js.native
object hasError extends js.Object {
  def apply(storeValue: QueryStoreValue): Boolean | Error = js.native
  def apply(storeValue: QueryStoreValue, policy: ErrorPolicy): Boolean | Error = js.native
}

