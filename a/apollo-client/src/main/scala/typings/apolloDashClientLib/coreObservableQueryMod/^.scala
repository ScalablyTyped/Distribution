package typings
package apolloDashClientLib.coreObservableQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/core/ObservableQuery", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def hasError(storeValue: apolloDashClientLib.dataQueriesMod.QueryStoreValue): scala.Boolean | stdLib.Error = js.native
  def hasError(
    storeValue: apolloDashClientLib.dataQueriesMod.QueryStoreValue,
    policy: apolloDashClientLib.coreWatchQueryOptionsMod.ErrorPolicy
  ): scala.Boolean | stdLib.Error = js.native
}

