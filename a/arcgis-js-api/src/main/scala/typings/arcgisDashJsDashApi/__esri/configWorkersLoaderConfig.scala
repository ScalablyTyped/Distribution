package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait configWorkersLoaderConfig extends Object {
  /**
    * The AMD loader loads all code relative to the baseUrl.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var baseUrl: js.UndefOr[String] = js.undefined
  /**
    * Determines if the specified feature capabilities are supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var has: js.UndefOr[js.Any] = js.undefined
  /**
    * Map paths in module identifiers to different paths.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var map: js.UndefOr[js.Any] = js.undefined
  /**
    * An array of objects which provide the package name and its location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var packages: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Map of module id fragments to file paths.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var paths: js.UndefOr[js.Any] = js.undefined
}

object configWorkersLoaderConfig {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    baseUrl: String = null,
    has: js.Any = null,
    map: js.Any = null,
    packages: js.Array[_] = null,
    paths: js.Any = null
  ): configWorkersLoaderConfig = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (has != null) __obj.updateDynamic("has")(has)
    if (map != null) __obj.updateDynamic("map")(map)
    if (packages != null) __obj.updateDynamic("packages")(packages)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    __obj.asInstanceOf[configWorkersLoaderConfig]
  }
}

