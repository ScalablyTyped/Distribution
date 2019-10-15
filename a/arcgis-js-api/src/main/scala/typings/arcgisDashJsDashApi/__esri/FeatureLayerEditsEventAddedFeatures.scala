package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerEditsEventAddedFeatures extends Object {
  var objectId: Double
}

object FeatureLayerEditsEventAddedFeatures {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    objectId: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): FeatureLayerEditsEventAddedFeatures = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), objectId = objectId, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[FeatureLayerEditsEventAddedFeatures]
  }
}

