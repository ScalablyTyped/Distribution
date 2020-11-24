package typings.algoliaClientCommon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-common", "createRetryablePromise")
@js.native
object createRetryablePromise extends js.Object {
  
  def apply[TResponse](callback: js.Function1[/* retry */ js.Function0[js.Promise[TResponse]], js.Promise[TResponse]]): js.Promise[TResponse] = js.native
}
