package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureTableSelectionChangeEventRemoved extends Object {
  var attachments: js.Array[AttachmentInfo]
  var feature: Graphic
  var relatedRecords: js.Array[Graphic]
}

object FeatureTableSelectionChangeEventRemoved {
  @scala.inline
  def apply(
    attachments: js.Array[AttachmentInfo],
    constructor: js.Function,
    feature: Graphic,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    relatedRecords: js.Array[Graphic]
  ): FeatureTableSelectionChangeEventRemoved = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), relatedRecords = relatedRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureTableSelectionChangeEventRemoved]
  }
}

