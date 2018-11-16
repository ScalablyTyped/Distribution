package typings
package apolloDashClientLib.dataStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QueryWithUpdater extends js.Object {
  var query: apolloDashClientLib.dataQueriesMod.QueryStoreValue
  var updater: apolloDashClientLib.coreTypesMod.MutationQueryReducer[js.Object]
}

