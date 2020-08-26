package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theme extends Object {
  /**
    * The Esri basemaps that pair well with the given theme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#Theme)
    */
  var basemaps: js.Array[String] = js.native
  /**
    * Text describing the theme in the UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#Theme)
    */
  var description: String = js.native
  /**
    * The label identifying the theme in UI elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#Theme)
    */
  var label: String = js.native
  /**
    * The name of the theme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#Theme)
    */
  var name: String = js.native
}

object Theme {
  @scala.inline
  def apply(
    basemaps: js.Array[String],
    constructor: js.Function,
    description: String,
    hasOwnProperty: PropertyKey => Boolean,
    label: String,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean
  ): Theme = {
    val __obj = js.Dynamic.literal(basemaps = basemaps.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[Theme]
  }
  @scala.inline
  implicit class ThemeOps[Self <: Theme] (val x: Self) extends AnyVal {
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
    def setBasemapsVarargs(value: String*): Self = this.set("basemaps", js.Array(value :_*))
    @scala.inline
    def setBasemaps(value: js.Array[String]): Self = this.set("basemaps", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

