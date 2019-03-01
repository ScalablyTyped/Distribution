package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureSet extends HasZM {
   // optional
  var displayFieldName: js.UndefOr[java.lang.String] = js.undefined
  var features: js.Array[Feature]
   // for feature layers only.
  var fields: js.UndefOr[js.Array[Field]] = js.undefined
   // optional
  var geometryType: js.UndefOr[esriGeometryType] = js.undefined
   // optional
  var globalIdFieldName: js.UndefOr[java.lang.String] = js.undefined
  var objectIdFieldName: js.UndefOr[java.lang.String] = js.undefined
   // for feature layers only
  var spatialReference: js.UndefOr[SpatialReference] = js.undefined
}

object FeatureSet {
  @scala.inline
  def apply(
    features: js.Array[Feature],
    displayFieldName: java.lang.String = null,
    fields: js.Array[Field] = null,
    geometryType: esriGeometryType = null,
    globalIdFieldName: java.lang.String = null,
    hasM: js.UndefOr[scala.Boolean] = js.undefined,
    hasZ: js.UndefOr[scala.Boolean] = js.undefined,
    objectIdFieldName: java.lang.String = null,
    spatialReference: SpatialReference = null
  ): FeatureSet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("features")(features)
    if (displayFieldName != null) __obj.updateDynamic("displayFieldName")(displayFieldName)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (geometryType != null) __obj.updateDynamic("geometryType")(geometryType)
    if (globalIdFieldName != null) __obj.updateDynamic("globalIdFieldName")(globalIdFieldName)
    if (!js.isUndefined(hasM)) __obj.updateDynamic("hasM")(hasM)
    if (!js.isUndefined(hasZ)) __obj.updateDynamic("hasZ")(hasZ)
    if (objectIdFieldName != null) __obj.updateDynamic("objectIdFieldName")(objectIdFieldName)
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    __obj.asInstanceOf[FeatureSet]
  }
}

