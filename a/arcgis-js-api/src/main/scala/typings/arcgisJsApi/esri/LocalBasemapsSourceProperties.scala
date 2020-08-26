package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalBasemapsSourceProperties extends js.Object {
  /**
    * A collection of [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-LocalBasemapsSource.html#basemaps)
    */
  var basemaps: js.UndefOr[CollectionProperties[BasemapProperties]] = js.native
}

object LocalBasemapsSourceProperties {
  @scala.inline
  def apply(): LocalBasemapsSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalBasemapsSourceProperties]
  }
  @scala.inline
  implicit class LocalBasemapsSourcePropertiesOps[Self <: LocalBasemapsSourceProperties] (val x: Self) extends AnyVal {
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
    def setBasemapsVarargs(value: BasemapProperties*): Self = this.set("basemaps", js.Array(value :_*))
    @scala.inline
    def setBasemaps(value: CollectionProperties[BasemapProperties]): Self = this.set("basemaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasemaps: Self = this.set("basemaps", js.undefined)
  }
  
}

