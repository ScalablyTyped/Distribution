package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreationInfo
  extends stdLib.Object {
  /**
    * The associated feature layer where the new feature is created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#CreationInfo)
    */
  var layer: FeatureLayer
  /**
    * The associated feature template used to create the new feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#CreationInfo)
    */
  var template: FeatureTemplate
}

object CreationInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    layer: FeatureLayer,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    template: FeatureTemplate
  ): CreationInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), template = template)
  
    __obj.asInstanceOf[CreationInfo]
  }
}

