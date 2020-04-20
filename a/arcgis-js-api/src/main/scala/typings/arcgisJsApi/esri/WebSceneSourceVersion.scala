package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebSceneSourceVersion extends Object {
  /**
    * The major version of the WebScene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#sourceVersion)
    */
  var major: Double
  /**
    * The minor version of the WebScene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#sourceVersion)
    */
  var minor: Double
}

object WebSceneSourceVersion {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    major: Double,
    minor: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): WebSceneSourceVersion = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[WebSceneSourceVersion]
  }
}

