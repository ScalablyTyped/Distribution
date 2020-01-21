package typings.appBuilderLib.cacheManagerMod

import typings.node.cryptoMod.Hash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/util/cacheManager", "digest")
@js.native
object digest extends js.Object {
  def apply(hash: Hash, files: js.Array[String]): js.Promise[String] = js.native
}

