package typings
package algoliasearchLib.algoliasearchMod.PlacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaceInterface extends js.Object {
  /**
    * Reverse geocoding means converting a location (latitude and longitude) to a readable address.
    * https://community.algolia.com/places/api-clients.html#endpoints
    */
  def reverse(e: QueryReverseInterface): js.Promise[ResultSearchInterface] = js.native
  // search(e: LocalizedQueryInterface): Promise<LocalizedResultSearchInterface>;
  /**
    * Reverse geocoding means converting a location (latitude and longitude) to a readable address.
    * https://community.algolia.com/places/api-clients.html#endpoints
    */
  def reverse(
    e: QueryReverseInterface,
    cb: js.Function2[/* err */ stdLib.Error, /* response */ ResultSearchInterface, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Endpoint to search.
    * https://community.algolia.com/places/api-clients.html#endpoints
    */
  def search(e: QueryInterface): js.Promise[ResultSearchInterface] = js.native
  /**
    * Endpoint to search.
    * https://community.algolia.com/places/api-clients.html#endpoints
    */
  def search(
    e: QueryInterface,
    cb: js.Function2[/* err */ stdLib.Error, /* response */ ResultSearchInterface, scala.Unit]
  ): scala.Unit = js.native
}

