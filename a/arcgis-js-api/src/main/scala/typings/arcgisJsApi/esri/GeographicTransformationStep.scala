package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeographicTransformationStep extends js.Object {
  /**
    * Indicates with the geographic transformation is inverted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformationStep.html#isInverse)
    *
    * @default false
    */
  var isInverse: Boolean = js.native
  /**
    * The well-known id (wkid) hat represents a known geographic transformation. See [Geographic datum transformations](https://developers.arcgis.com/java/10-2/guide/datum-transformations.htm#ESRI_SECTION1_7635FE2A60E6449898D5AD0ADE2CA0C3) for the list of supported equation-based geographic transformations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformationStep.html#wkid)
    */
  var wkid: Double = js.native
  /**
    * The well-known text (wkt) that represents a known geographic transformation. See [Geographic datum transformations](https://developers.arcgis.com/java/10-2/guide/datum-transformations.htm#ESRI_SECTION1_7635FE2A60E6449898D5AD0ADE2CA0C3) for the list of supported equation-based geographic transformations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformationStep.html#wkt)
    */
  var wkt: String = js.native
  /**
    * Gets the inverse of the geographic transformation step used to call this method or `null` if the transformation step is not invertible. The inverse of a transformation converts coordinates using the same method and parameters, but in the opposite direction of the original object. For example if the original object represents the `NAD_1983_HARN_To_NAD_1983_NSRS2007_1` transformation, then the inverse will transform from `NAD 83 (NSRS 2007)` to `NAD 83 (HARN)`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformationStep.html#getInverse)
    *
    *
    */
  def getInverse(): GeographicTransformationStep = js.native
}

object GeographicTransformationStep {
  @scala.inline
  def apply(getInverse: () => GeographicTransformationStep, isInverse: Boolean, wkid: Double, wkt: String): GeographicTransformationStep = {
    val __obj = js.Dynamic.literal(getInverse = js.Any.fromFunction0(getInverse), isInverse = isInverse.asInstanceOf[js.Any], wkid = wkid.asInstanceOf[js.Any], wkt = wkt.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeographicTransformationStep]
  }
  @scala.inline
  implicit class GeographicTransformationStepOps[Self <: GeographicTransformationStep] (val x: Self) extends AnyVal {
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
    def setGetInverse(value: () => GeographicTransformationStep): Self = this.set("getInverse", js.Any.fromFunction0(value))
    @scala.inline
    def setIsInverse(value: Boolean): Self = this.set("isInverse", value.asInstanceOf[js.Any])
    @scala.inline
    def setWkid(value: Double): Self = this.set("wkid", value.asInstanceOf[js.Any])
    @scala.inline
    def setWkt(value: String): Self = this.set("wkt", value.asInstanceOf[js.Any])
  }
  
}

