package typings.algoliaRequesterNodeHttp

import typings.algoliaRequesterCommon.mod.Destroyable
import typings.algoliaRequesterCommon.mod.Requester
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/requester-node-http", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createNodeHttpRequester(): Requester with Destroyable = js.native
}

