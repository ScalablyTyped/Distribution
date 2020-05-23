package typings.arcgisJsApi.global.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.GeographicTransformationStep")
@js.native
class GeographicTransformationStepCls ()
  extends typings.arcgisJsApi.esri.GeographicTransformationStep {
  def this(properties: js.Any) = this()
  /**
    * Indicates with the geographic transformation is inverted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformationStep.html#isInverse)
    *
    * @default false
    */
  /* CompleteClass */
  override var isInverse: Boolean = js.native
  /**
    * The well-known id (wkid) hat represents a known geographic transformation. See [Geographic datum transformations](https://developers.arcgis.com/java/10-2/guide/datum-transformations.htm#ESRI_SECTION1_7635FE2A60E6449898D5AD0ADE2CA0C3) for the list of supported equation-based geographic transformations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformationStep.html#wkid)
    */
  /* CompleteClass */
  override var wkid: Double = js.native
  /**
    * The well-known text (wkt) that represents a known geographic transformation. See [Geographic datum transformations](https://developers.arcgis.com/java/10-2/guide/datum-transformations.htm#ESRI_SECTION1_7635FE2A60E6449898D5AD0ADE2CA0C3) for the list of supported equation-based geographic transformations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformationStep.html#wkt)
    */
  /* CompleteClass */
  override var wkt: String = js.native
  /**
    * Gets the inverse of the geographic transformation step used to call this method or `null` if the transformation step is not invertible. The inverse of a transformation converts coordinates using the same method and parameters, but in the opposite direction of the original object. For example if the original object represents the `NAD_1983_HARN_To_NAD_1983_NSRS2007_1` transformation, then the inverse will transform from `NAD 83 (NSRS 2007)` to `NAD 83 (HARN)`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformationStep.html#getInverse)
    *
    *
    */
  /* CompleteClass */
  override def getInverse(): typings.arcgisJsApi.esri.GeographicTransformationStep = js.native
}

