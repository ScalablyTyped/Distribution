package typings
package angularLib.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * $location - $locationProvider - service in module ng
  * see https://docs.angularjs.org/api/ng/service/$location
  */
@js.native
trait ILocationService extends js.Object {
  def absUrl(): java.lang.String = js.native
  def hash(): ILocationService = js.native
  /**
    * Changes the hash fragment and returns `$location`
    */
  def hash(newHash: java.lang.String): ILocationService = js.native
  /**
    * Returns the hash fragment
    */
  @JSName("hash")
  def hash_String(): java.lang.String = js.native
  def host(): java.lang.String = js.native
  /**
    * Return path of current url
    */
  def path(): java.lang.String = js.native
  /**
    * Change path when called with parameter and return $location.
    * Note: Path should always begin with forward slash (/), this method will add the forward slash if it is missing.
    *
    * @param path New path
    */
  def path(path: java.lang.String): ILocationService = js.native
  def port(): scala.Double = js.native
  def protocol(): java.lang.String = js.native
  def replace(): ILocationService = js.native
  /**
    * Return search part (as object) of current url
    */
  def search(): js.Any = js.native
  def search(search: java.lang.String): ILocationService = js.native
  /**
    * Change search part when called with parameter and return $location.
    *
    * @param search New search params
    * @param paramValue If search is a string or a Number, then paramValue will override only a single search property. If paramValue is null, the property specified via the first argument will be deleted. If paramValue is an array, it will override the property of the search component of $location specified via the first argument. If paramValue is true, the property specified via the first argument will be added with no value nor trailing equal sign.
    */
  def search(search: java.lang.String, paramValue: java.lang.String): ILocationService = js.native
  def search(search: java.lang.String, paramValue: js.Array[java.lang.String]): ILocationService = js.native
  def search(search: java.lang.String, paramValue: scala.Boolean): ILocationService = js.native
  def search(search: java.lang.String, paramValue: scala.Double): ILocationService = js.native
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
  def url(): java.lang.String = js.native
  def url(url: java.lang.String): ILocationService = js.native
}

