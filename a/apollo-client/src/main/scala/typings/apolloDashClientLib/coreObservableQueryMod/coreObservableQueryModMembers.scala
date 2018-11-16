package typings
package apolloDashClientLib.coreObservableQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/core/ObservableQuery", JSImport.Namespace)
@js.native
object coreObservableQueryModMembers extends js.Object {
  val hasError: js.Function2[
    /* storeValue */ apolloDashClientLib.dataQueriesMod.QueryStoreValue, 
    /* policy */ js.UndefOr[apolloDashClientLib.coreWatchQueryOptionsMod.ErrorPolicy], 
    js.UndefOr[
      apolloDashClientLib.apolloDashClientLibNumbers.`true` | stdLib.Error | scala.Null
    ]
  ] = js.native
}

