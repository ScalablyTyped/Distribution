package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewingProperties extends js.Object {
  /**
    * An object specifying the search parameters set within the web scene or web map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-Viewing.html#search)
    */
  var search: js.UndefOr[SearchProperties] = js.native
}

object ViewingProperties {
  @scala.inline
  def apply(): ViewingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewingProperties]
  }
  @scala.inline
  implicit class ViewingPropertiesOps[Self <: ViewingProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSearch(value: SearchProperties): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
  }
  
}

