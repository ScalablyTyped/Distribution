package typings.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureSet extends HasZM {
   // optional
  var displayFieldName: js.UndefOr[String] = js.native
  var features: js.Array[Feature] = js.native
   // for feature layers only.
  var fields: js.UndefOr[js.Array[Field]] = js.native
   // optional
  var geometryType: js.UndefOr[esriGeometryType] = js.native
   // optional
  var globalIdFieldName: js.UndefOr[String] = js.native
  var objectIdFieldName: js.UndefOr[String] = js.native
   // for feature layers only
  var spatialReference: js.UndefOr[SpatialReference] = js.native
}

object FeatureSet {
  @scala.inline
  def apply(features: js.Array[Feature]): FeatureSet = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureSet]
  }
  @scala.inline
  implicit class FeatureSetOps[Self <: FeatureSet] (val x: Self) extends AnyVal {
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
    def setFeaturesVarargs(value: Feature*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: js.Array[Feature]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayFieldName(value: String): Self = this.set("displayFieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayFieldName: Self = this.set("displayFieldName", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: Field*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[Field]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setGeometryType(value: esriGeometryType): Self = this.set("geometryType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometryType: Self = this.set("geometryType", js.undefined)
    @scala.inline
    def setGlobalIdFieldName(value: String): Self = this.set("globalIdFieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalIdFieldName: Self = this.set("globalIdFieldName", js.undefined)
    @scala.inline
    def setObjectIdFieldName(value: String): Self = this.set("objectIdFieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectIdFieldName: Self = this.set("objectIdFieldName", js.undefined)
    @scala.inline
    def setSpatialReference(value: SpatialReference): Self = this.set("spatialReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpatialReference: Self = this.set("spatialReference", js.undefined)
  }
  
}

