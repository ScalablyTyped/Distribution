package typings.apolloDashClient.dataStoreMod

import typings.apolloDashClient.Anon_MutationResult
import typings.apolloDashClient.coreTypesMod.MutationQueryReducer
import typings.apolloDashClient.dataQueriesMod.QueryStoreValue
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryWithUpdater extends js.Object {
  var query: QueryStoreValue = js.native
  @JSName("updater")
  var updater_Original: MutationQueryReducer[js.Object] = js.native
  def updater(previousResult: Record[String, _], options: Anon_MutationResult[js.Object]): Record[String, _] = js.native
}

