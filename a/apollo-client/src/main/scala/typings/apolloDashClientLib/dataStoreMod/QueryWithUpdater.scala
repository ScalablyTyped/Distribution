package typings
package apolloDashClientLib.dataStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryWithUpdater extends js.Object {
  var query: apolloDashClientLib.dataQueriesMod.QueryStoreValue = js.native
  @JSName("updater")
  var updater_Original: apolloDashClientLib.coreTypesMod.MutationQueryReducer[js.Object] = js.native
  def updater(
    previousResult: stdLib.Record[java.lang.String, _],
    options: apolloDashClientLib.Anon_MutationResult[js.Object]
  ): stdLib.Record[java.lang.String, _] = js.native
}

