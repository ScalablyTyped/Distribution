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

