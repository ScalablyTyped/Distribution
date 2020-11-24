package typings.algoliaCacheInMemory.mod

import typings.algoliaCacheCommon.mod.Cache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/cache-in-memory", "createInMemoryCache")
@js.native
object createInMemoryCache extends js.Object {
  
  def apply(): Cache = js.native
  def apply(options: InMemoryCacheOptions): Cache = js.native
}
