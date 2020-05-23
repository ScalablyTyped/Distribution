package typings.angular.mod

import typings.angular.anon.Capacity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * $cacheFactory - service in module ng
  *
  * Factory that constructs Cache objects and gives access to them.
  *
  * see https://docs.angularjs.org/api/ng/service/$cacheFactory
  */
@js.native
trait ICacheFactoryService extends js.Object {
  /**
    * Factory that constructs Cache objects and gives access to them.
    *
    * @param cacheId Name or id of the newly created cache.
    * @param optionsMap Options object that specifies the cache behavior. Properties:
    *
    * capacity — turns the cache into LRU cache.
    */
  def apply(cacheId: String): ICacheObject = js.native
  def apply(cacheId: String, optionsMap: Capacity): ICacheObject = js.native
  /**
    * Get access to a cache object by the cacheId used when it was created.
    *
    * @param cacheId Name or id of a cache to access.
    */
  def get(cacheId: String): ICacheObject = js.native
  /**
    * Get information about all the caches that have been created.
    * @returns key-value map of cacheId to the result of calling cache#info
    */
  def info(): js.Any = js.native
}

