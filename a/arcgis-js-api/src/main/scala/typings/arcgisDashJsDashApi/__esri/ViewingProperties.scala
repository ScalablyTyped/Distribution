package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewingProperties extends js.Object {
  /**
    * An object specifying the search parameters set within the web scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-Viewing.html#search)
    */
  var search: js.UndefOr[SearchProperties] = js.undefined
}

object ViewingProperties {
  @scala.inline
  def apply(search: SearchProperties = null): ViewingProperties = {
    val __obj = js.Dynamic.literal()
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewingProperties]
  }
}

