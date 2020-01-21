package typings.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureSet extends HasZM {
   // optional
  var displayFieldName: js.UndefOr[String] = js.undefined
  var features: js.Array[Feature]
   // for feature layers only.
  var fields: js.UndefOr[js.Array[Field]] = js.undefined
   // optional
  var geometryType: js.UndefOr[esriGeometryType] = js.undefined
   // optional
  var globalIdFieldName: js.UndefOr[String] = js.undefined
  var objectIdFieldName: js.UndefOr[String] = js.undefined
   // for feature layers only
  var spatialReference: js.UndefOr[SpatialReference] = js.undefined
}

object FeatureSet {
  @scala.inline
  def apply(
    features: js.Array[Feature],
    displayFieldName: String = null,
    fields: js.Array[Field] = null,
    geometryType: esriGeometryType = null,
    globalIdFieldName: String = null,
    hasM: js.UndefOr[Boolean] = js.undefined,
    hasZ: js.UndefOr[Boolean] = js.undefined,
    objectIdFieldName: String = null,
    spatialReference: SpatialReference = null
  ): FeatureSet = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    if (displayFieldName != null) __obj.updateDynamic("displayFieldName")(displayFieldName.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (geometryType != null) __obj.updateDynamic("geometryType")(geometryType.asInstanceOf[js.Any])
    if (globalIdFieldName != null) __obj.updateDynamic("globalIdFieldName")(globalIdFieldName.asInstanceOf[js.Any])
    if (!js.isUndefined(hasM)) __obj.updateDynamic("hasM")(hasM.asInstanceOf[js.Any])
    if (!js.isUndefined(hasZ)) __obj.updateDynamic("hasZ")(hasZ.asInstanceOf[js.Any])
    if (objectIdFieldName != null) __obj.updateDynamic("objectIdFieldName")(objectIdFieldName.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureSet]
  }
}

