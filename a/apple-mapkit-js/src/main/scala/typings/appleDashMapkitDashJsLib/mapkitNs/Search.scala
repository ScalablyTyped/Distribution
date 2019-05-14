package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.Search")
@js.native
class Search () extends js.Object {
  def this(options: SearchConstructorOptions) = this()
  def autocomplete(query: java.lang.String, callback: AutoCompleteCallback): scala.Double = js.native
  def autocomplete(query: java.lang.String, callback: AutoCompleteCallback, options: SearchOptions): scala.Double = js.native
  def autocomplete(query: java.lang.String, callback: SearchDelegate): scala.Double = js.native
  def autocomplete(query: java.lang.String, callback: SearchDelegate, options: SearchOptions): scala.Double = js.native
  def cancel(id: scala.Double): scala.Boolean = js.native
  def search(query: SearchAutocompleteResult, callback: SearchCallback): scala.Double = js.native
  def search(query: SearchAutocompleteResult, callback: SearchCallback, options: SearchOptions): scala.Double = js.native
  def search(query: SearchAutocompleteResult, callback: SearchDelegate): scala.Double = js.native
  def search(query: SearchAutocompleteResult, callback: SearchDelegate, options: SearchOptions): scala.Double = js.native
  def search(query: java.lang.String, callback: SearchCallback): scala.Double = js.native
  def search(query: java.lang.String, callback: SearchCallback, options: SearchOptions): scala.Double = js.native
  def search(query: java.lang.String, callback: SearchDelegate): scala.Double = js.native
  def search(query: java.lang.String, callback: SearchDelegate, options: SearchOptions): scala.Double = js.native
}

