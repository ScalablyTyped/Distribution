package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebMapSourceVersion extends Object {
  /**
    * The major version of the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#sourceVersion)
    */
  var major: Double = js.native
  /**
    * The minor version of the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#sourceVersion)
    */
  var minor: Double = js.native
}

object WebMapSourceVersion {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    major: Double,
    minor: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): WebMapSourceVersion = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[WebMapSourceVersion]
  }
  @scala.inline
  implicit class WebMapSourceVersionOps[Self <: WebMapSourceVersion] (val x: Self) extends AnyVal {
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
    def setMajor(value: Double): Self = this.set("major", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinor(value: Double): Self = this.set("minor", value.asInstanceOf[js.Any])
  }
  
}

