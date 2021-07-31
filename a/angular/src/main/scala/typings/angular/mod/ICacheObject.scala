package typings.angular.mod

import typings.angular.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * $cacheFactory.Cache - type in module ng
  *
  * A cache object used to store and retrieve data, primarily used by $http and the script directive to cache templates and other data.
  *
  * see https://docs.angularjs.org/api/ng/type/$cacheFactory.Cache
  */
@js.native
trait ICacheObject extends StObject {
  
  /**
    * Destroys the Cache object entirely, removing it from the $cacheFactory set.
    */
  def destroy(): Unit = js.native
  
  /**
    * Retrieves named data stored in the Cache object.
    *
    * @param key the key of the data to be retrieved
    */
  def get[T](key: String): js.UndefOr[T] = js.native
  
  /**
    * Retrieve information regarding a particular Cache.
    */
  def info(): Id = js.native
  
  /**
    * Inserts a named entry into the Cache object to be retrieved later, and incrementing the size of the cache if the key was not already present in the cache. If behaving like an LRU cache, it will also remove stale entries from the set.
    *
    * It will not insert undefined values into the cache.
    *
    * @param key the key under which the cached data is stored.
    * @param value the value to store alongside the key. If it is undefined, the key will not be stored.
    */
  def put[T](key: String): T = js.native
  def put[T](key: String, value: T): T = js.native
  
  /**
    * Removes an entry from the Cache object.
    *
    * @param key the key of the entry to be removed
    */
  def remove(key: String): Unit = js.native
  
  /**
    * Clears the cache object of any entries.
    */
  def removeAll(): Unit = js.native
}
