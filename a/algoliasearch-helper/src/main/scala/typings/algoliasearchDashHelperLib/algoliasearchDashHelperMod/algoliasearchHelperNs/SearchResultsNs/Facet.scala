package typings
package algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.SearchResultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Facet extends js.Object {
  var data: js.Object
  var name: java.lang.String
  var stats: js.Object
}

object Facet {
  @scala.inline
  def apply(data: js.Object, name: java.lang.String, stats: js.Object): Facet = {
    val __obj = js.Dynamic.literal(data = data, name = name, stats = stats)
  
    __obj.asInstanceOf[Facet]
  }
}

