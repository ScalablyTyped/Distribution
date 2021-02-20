package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * $location - $locationProvider - service in module ng
  * see https://docs.angularjs.org/api/ng/service/$location
  */
@js.native
trait ILocationService extends StObject {
  
  def absUrl(): String = js.native
  
  /**
    * Returns the hash fragment
    */
  def hash(): String = js.native
  def hash(newHash: String): ILocationService = js.native
  /**
    * Changes the hash fragment and returns `$location`
    */
  @JSName("hash")
  def hash_ILocationService(): ILocationService = js.native
  
  def host(): String = js.native
  
  /**
    * Return path of current url
    */
  def path(): String = js.native
  /**
    * Change path when called with parameter and return $location.
    * Note: Path should always begin with forward slash (/), this method will add the forward slash if it is missing.
    *
    * @param path New path
    */
  def path(path: String): ILocationService = js.native
  
  def port(): Double = js.native
  
  def protocol(): String = js.native
  
  def replace(): ILocationService = js.native
  
  /**
    * Return search part (as object) of current url
    */
  def search(): js.Any = js.native
  /**
    * Change search part when called with parameter and return $location.
    *
    * @param search New search params
    * @param paramValue If search is a string or a Number, then paramValue will override only a single search property. If paramValue is null, the property specified via the first argument will be deleted. If paramValue is an array, it will override the property of the search component of $location specified via the first argument. If paramValue is true, the property specified via the first argument will be added with no value nor trailing equal sign.
    */
  def search(search: String): ILocationService = js.native
  def search(search: String, paramValue: String): ILocationService = js.native
  def search(search: String, paramValue: js.Array[String]): ILocationService = js.native
  def search(search: String, paramValue: Boolean): ILocationService = js.native
  def search(search: String, paramValue: Double): ILocationService = js.native
  /**
    * Change search part when called with parameter and return $location.
    *
    * @param search When called with a single argument the method acts as a setter, setting the search component of $location to the specified value.
    *
    * If the argument is a hash object containing an array of values, these values will be encoded as duplicate search parameters in the url.
    */
  def search(search: js.Any): ILocationService = js.native
  
  def state(): js.Any = js.native
  def state(state: js.Any): ILocationService = js.native
  
  def url(): String = js.native
  def url(url: String): ILocationService = js.native
}
