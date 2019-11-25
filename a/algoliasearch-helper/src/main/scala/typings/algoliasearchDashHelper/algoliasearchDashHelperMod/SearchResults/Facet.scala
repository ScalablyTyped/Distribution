package typings.algoliasearchDashHelper.algoliasearchDashHelperMod.SearchResults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Facet extends js.Object {
  var data: js.Object
  var name: String
  var stats: js.Object
}

object Facet {
  @scala.inline
  def apply(data: js.Object, name: String, stats: js.Object): Facet = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Facet]
  }
}

