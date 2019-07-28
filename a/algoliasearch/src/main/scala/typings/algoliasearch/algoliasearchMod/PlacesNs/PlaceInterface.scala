package typings.algoliasearch.algoliasearchMod.PlacesNs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaceInterface extends js.Object {
  /**
    * Reverse geocoding means converting a location (latitude and longitude) to a readable address.
    * https://community.algolia.com/places/api-clients.html#endpoints
    */
  def reverse(e: (QueryReverseInterface with LanguageInterface) | QueryReverseInterface): js.Promise[ResultSearchInterface[HitInterface]] = js.native
  /**
    * Reverse geocoding means converting a location (latitude and longitude) to a readable address.
    * https://community.algolia.com/places/api-clients.html#endpoints
    */
  def reverse(
    e: (QueryReverseInterface with LanguageInterface) | QueryReverseInterface,
    cb: js.Function2[
      /* err */ Error, 
      /* response */ ResultSearchInterface[HitInterface | LocalizedHitInterface], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Endpoint to search.
    * https://community.algolia.com/places/api-clients.html#endpoints
    */
  def search(e: (QueryInterface with LanguageInterface) | QueryInterface): js.Promise[ResultSearchInterface[HitInterface]] = js.native
  /**
    * Endpoint to search.
    * https://community.algolia.com/places/api-clients.html#endpoints
    */
  /**
    * If specified, restrict the search results to a single language. You can pass two letters country codes (ISO 639-1).
    * Warning: language parameter is case sensitive and should be lowercase otherwise it will fallback to default language.
    * https://community.algolia.com/places/api-clients.html#api-options-language
    */
  def search(
    e: (QueryInterface with LanguageInterface) | QueryInterface,
    cb: js.Function2[
      /* err */ Error, 
      /* response */ ResultSearchInterface[HitInterface | LocalizedHitInterface], 
      Unit
    ]
  ): Unit = js.native
}

