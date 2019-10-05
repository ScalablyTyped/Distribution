package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewToMapOptions extends Object {
  /**
    * A list of layers and graphics to include for intersection testing. No layers or graphics will be excluded if exclude is not specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#toMap)
    */
  var exclude: js.UndefOr[
    (js.Array[IntersectItem | Collection[IntersectItem] | js.Array[IntersectItem] | Ground]) | Collection[IntersectItem] | IntersectItem
  ] = js.undefined
  /**
    * A list of layers and graphics to include for intersection testing. All layers and graphics will be included if include is not specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#toMap)
    */
  var include: js.UndefOr[
    (js.Array[IntersectItem | Collection[IntersectItem] | js.Array[IntersectItem] | Ground]) | Collection[IntersectItem] | IntersectItem
  ] = js.undefined
}

object SceneViewToMapOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    exclude: (js.Array[IntersectItem | Collection[IntersectItem] | js.Array[IntersectItem] | Ground]) | Collection[IntersectItem] | IntersectItem = null,
    include: (js.Array[IntersectItem | Collection[IntersectItem] | js.Array[IntersectItem] | Ground]) | Collection[IntersectItem] | IntersectItem = null
  ): SceneViewToMapOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewToMapOptions]
  }
}

