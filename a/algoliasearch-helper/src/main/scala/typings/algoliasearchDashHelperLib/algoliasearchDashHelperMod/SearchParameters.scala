package typings
package algoliasearchDashHelperLib.algoliasearchDashHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("algoliasearch-helper", "SearchParameters")
@js.native
class SearchParameters ()
  extends algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.SearchParameters {
  def this(newParameters: algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.QueryParameters) = this()
}

/* static members */
@JSImport("algoliasearch-helper", "SearchParameters")
@js.native
object SearchParameters extends js.Object {
  def make(
    newParameters: algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.QueryParameters
  ): algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.SearchParameters = js.native
  def validate(
    currentState: algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.SearchParameters,
    parameters: algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.QueryParameters
  ): scala.Null | stdLib.Error = js.native
}

