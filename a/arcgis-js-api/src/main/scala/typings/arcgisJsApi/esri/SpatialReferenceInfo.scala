package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialReferenceInfo extends Object {
  /**
    * The XY tolerance of the spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#SpatialReferenceInfo)
    */
  var tolerance: Double = js.native
  /**
    * Base factor.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#SpatialReferenceInfo)
    */
  var unitBaseFactor: Double = js.native
  /**
    * Unit ID.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#SpatialReferenceInfo)
    */
  var unitID: Double = js.native
  /**
    * Square derivative.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#SpatialReferenceInfo)
    */
  var unitSquareDerivative: Double = js.native
  /**
    * Unit type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#SpatialReferenceInfo)
    */
  var unitType: Double = js.native
}

object SpatialReferenceInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    tolerance: Double,
    unitBaseFactor: Double,
    unitID: Double,
    unitSquareDerivative: Double,
    unitType: Double
  ): SpatialReferenceInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tolerance = tolerance.asInstanceOf[js.Any], unitBaseFactor = unitBaseFactor.asInstanceOf[js.Any], unitID = unitID.asInstanceOf[js.Any], unitSquareDerivative = unitSquareDerivative.asInstanceOf[js.Any], unitType = unitType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialReferenceInfo]
  }
  @scala.inline
  implicit class SpatialReferenceInfoOps[Self <: SpatialReferenceInfo] (val x: Self) extends AnyVal {
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
    def setTolerance(value: Double): Self = this.set("tolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnitBaseFactor(value: Double): Self = this.set("unitBaseFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnitID(value: Double): Self = this.set("unitID", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnitSquareDerivative(value: Double): Self = this.set("unitSquareDerivative", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnitType(value: Double): Self = this.set("unitType", value.asInstanceOf[js.Any])
  }
  
}

