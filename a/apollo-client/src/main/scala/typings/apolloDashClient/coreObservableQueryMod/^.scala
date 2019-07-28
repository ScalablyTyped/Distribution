package typings.apolloDashClient.coreObservableQueryMod

import typings.apolloDashClient.coreWatchQueryOptionsMod.ErrorPolicy
import typings.apolloDashClient.dataQueriesMod.QueryStoreValue
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/core/ObservableQuery", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def hasError(storeValue: QueryStoreValue): Boolean | Error = js.native
  def hasError(storeValue: QueryStoreValue, policy: ErrorPolicy): Boolean | Error = js.native
}

