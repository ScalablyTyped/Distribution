package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PresencePromise extends js.Object {
  
  def get(): js.Promise[PaginatedResult[PresenceMessage]] = js.native
  def get(params: RestPresenceParams): js.Promise[PaginatedResult[PresenceMessage]] = js.native
  
  def history(): js.Promise[PaginatedResult[PresenceMessage]] = js.native
  def history(params: RestHistoryParams): js.Promise[PaginatedResult[PresenceMessage]] = js.native
}
