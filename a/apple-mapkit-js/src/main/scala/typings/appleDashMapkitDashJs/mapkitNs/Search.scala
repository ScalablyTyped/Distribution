package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.Search")
@js.native
class Search () extends js.Object {
  def this(options: SearchConstructorOptions) = this()
  def autocomplete(query: String, callback: AutoCompleteCallback): Double = js.native
  def autocomplete(query: String, callback: AutoCompleteCallback, options: SearchOptions): Double = js.native
  def autocomplete(query: String, callback: SearchDelegate): Double = js.native
  def autocomplete(query: String, callback: SearchDelegate, options: SearchOptions): Double = js.native
  def cancel(id: Double): Boolean = js.native
  def search(query: String, callback: SearchCallback): Double = js.native
  def search(query: String, callback: SearchCallback, options: SearchOptions): Double = js.native
  def search(query: String, callback: SearchDelegate): Double = js.native
  def search(query: String, callback: SearchDelegate, options: SearchOptions): Double = js.native
  def search(query: SearchAutocompleteResult, callback: SearchCallback): Double = js.native
  def search(query: SearchAutocompleteResult, callback: SearchCallback, options: SearchOptions): Double = js.native
  def search(query: SearchAutocompleteResult, callback: SearchDelegate): Double = js.native
  def search(query: SearchAutocompleteResult, callback: SearchDelegate, options: SearchOptions): Double = js.native
}

