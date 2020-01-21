package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that retrieves map-based search results for a user-entered query.
  */
@JSGlobal("mapkit.Search")
@js.native
/**
  * Creates a search object with optional initial values that you provide.
  *
  * @param options Options that you may provide when creating a search object.
  */
class Search () extends js.Object {
  def this(options: SearchConstructorOptions) = this()
  def autocomplete(query: String, callback: AutocompleteSearchCallback): Unit = js.native
  def autocomplete(query: String, callback: AutocompleteSearchCallback, options: SearchOptions): Unit = js.native
  /**
    * Retrieves a list of autocomplete results for the specified search query.
    *
    * @param query A string that represents the user's search term in progress.
    * @param callback A callback function or delegate object.
    * @param options Autocomplete takes the same options hash as search
    */
  def autocomplete(query: String, callback: SearchDelegate): Unit = js.native
  def autocomplete(query: String, callback: SearchDelegate, options: SearchOptions): Unit = js.native
  /**
    * Cancels a search request using its request ID.
    *
    * @param id The integer ID returned by a call to Search.search
    * @return true if the server canceled the pending search request.
    */
  def cancel(id: Double): Boolean = js.native
  def search(query: String, callback: SearchCallback[String]): Double = js.native
  def search(query: String, callback: SearchCallback[String], options: SearchOptions): Double = js.native
  /**
    * Retrieves the results of a search query.
    *
    * @param query A String or a SearchAutocompleteResult.
    * @param callback A callback function or delegate object.
    * @param options With the options hash, you can constrain the search to a
    * desired area using the coordinate or region properties. If set, this
    * option overrides the language provided to the search constructor.
    * @returns a request ID (integer) that can be passed to cancel to abort a
    * pending request.
    */
  def search(query: String, callback: SearchDelegate): Double = js.native
  def search(query: String, callback: SearchDelegate, options: SearchOptions): Double = js.native
  def search(query: SearchAutocompleteResult, callback: SearchCallback[SearchAutocompleteResult]): Double = js.native
  def search(
    query: SearchAutocompleteResult,
    callback: SearchCallback[SearchAutocompleteResult],
    options: SearchOptions
  ): Double = js.native
  def search(query: SearchAutocompleteResult, callback: SearchDelegate): Double = js.native
  def search(query: SearchAutocompleteResult, callback: SearchDelegate, options: SearchOptions): Double = js.native
}

