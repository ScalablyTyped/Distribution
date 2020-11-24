package typings.algoliaRequesterNodeHttp.mod

import typings.algoliaRequesterCommon.mod.Destroyable
import typings.algoliaRequesterCommon.mod.Requester
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/requester-node-http", "createNodeHttpRequester")
@js.native
object createNodeHttpRequester extends js.Object {
  
  def apply(): Requester with Destroyable = js.native
  def apply(hasAgentHttpAgentHttpsAgentRequesterOptions: NodeHttpRequesterOptions): Requester with Destroyable = js.native
}
